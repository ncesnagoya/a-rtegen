/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2016 by Center for Embedded Computing Systems
 *              Graduate School of Information Science, Nagoya Univ., JAPAN
 *  Copyright (C) 2014-2016 by AISIN COMCRUISE Co., Ltd., JAPAN
 *  Copyright (C) 2014-2016 by eSOL Co.,Ltd., JAPAN
 *  Copyright (C) 2013-2016 by FUJI SOFT INCORPORATED, JAPAN
 *  Copyright (C) 2014-2016 by NEC Communication Systems, Ltd., JAPAN
 *  Copyright (C) 2013-2016 by Panasonic Advanced Technology Development Co., Ltd., JAPAN
 *  Copyright (C) 2013-2014 by Renesas Electronics Corporation, JAPAN
 *  Copyright (C) 2014-2016 by SCSK Corporation, JAPAN
 *  Copyright (C) 2013-2016 by Sunny Giken Inc., JAPAN
 *  Copyright (C) 2015-2016 by SUZUKI MOTOR CORPORATION
 *  Copyright (C) 2013-2016 by TOSHIBA CORPORATION, JAPAN
 *  Copyright (C) 2013-2016 by Witz Corporation
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
 *
 *  $Id$
 */

#include "Os.h"
#include "prc_sil.h"
#include "Rte_CddWiperSwitch.h"

/* ワイパースイッチ状態取得に必要なHWはスイッチのみ */
#define SW_BASE	0x08000410
#define SW_AUTO	0x00002000
#define SW_SP4	0x00004000
#define SW_SP3	0x00008000
#define SW_SP2	0x00010000
#define SW_SP1	0x00020000

void
GetWiperSwitchState(SwitchState *state)
{
	uint32 sw_state;

	/* 現在のワイパースイッチの値を取得 */
	sw_state = sil_rew_iop((void *) SW_BASE);

	/* SW13:AUTO */
	if ((sw_state & SW_AUTO) != 0) {
		*state = 5U;
	}
	/* SW14:スピード4 */
	else if ((sw_state & SW_SP4) != 0) {
		*state = 4U;
	}
	/* SW15:スピード3 */
	else if ((sw_state & SW_SP3) != 0) {
		*state = 3U;
	}
	/* SW16:スピード2 */
	else if ((sw_state & SW_SP2) != 0) {
		*state = 2U;
	}
	/* SW17:スピード1 */
	else if ((sw_state & SW_SP1) != 0) {
		*state = 1U;
	}
	else {
		*state = 0U;
	}
}
