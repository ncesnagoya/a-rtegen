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

#include "measure.h"

static uint32 histarea[MAX_TIME + 1];

extern Std_ReturnType    Rte_Write_SWC1_PPort_time(IDT_TimeCount data);

#ifdef CHECK_TIMER
static void check_timer(void);
#endif /* CHECK_TIMER */

/*
 *  SW-C1用性能評価関数
 */
void
measure_swc1(void)
{
	volatile uint32			i;
	static IDT_TimeCount	cnt = 0;
	cnt++;

	WrapperCancelAlarm1();

	WrapperSuspendAllInterruptsWithoutOS();

#ifdef CHECK_TIMER
	check_timer();
#endif /* CHECK_TIMER */

	syslog(LOG_NOTICE, "== measure overhead ==");
	init_hist(1U, MAX_TIME, histarea);
	for (i = 0U; i < LOOP_COUNT; i++) {
		begin_measure(1U);
		end_measure(1U);
	}
	print_hist(1U);

	syslog(LOG_NOTICE, "== Rte_Write_SWC1_PPort_time  ==");
	init_hist(1U, MAX_TIME, histarea);
	for (i = 0U; i < LOOP_COUNT; i++) {
		begin_measure(1U);
		Rte_Write_SWC1_PPort_time(cnt);
		end_measure(1U);
	}
	print_hist(1U);

	WrapperResumeAllInterruptsWithoutOS();

/* ECU間の場合はSW-C1でも終了する */
#ifdef TOPPERS_USE_COMSTACK
	WrapperShutdownOS();
#endif /* TOPPERS_USE_COMSTACK */
}

/*
 *  タイマ動作確認用関数
 */
#ifdef CHECK_TIMER
void
check_timer(void)
{
	volatile uint32 i, j, loop;

	syslog(LOG_NOTICE, "== 100us test ==");
	init_hist(1U, MAX_TIME, histarea);
	loop = LOOP_FOR_100US;
	for (i = 0U; i < LOOP_COUNT; i++) {
		begin_measure(1U);
		for (j = 0U; j < loop; j++) {
		}
		end_measure(1U);
	}
	print_hist(1U);

	loop = LOOP_FOR_100US * 100000U;
	syslog(LOG_NOTICE, "== 10s test start ==");
	for (j = 0U; j < loop; j++) {
	}
	syslog(LOG_NOTICE, "== 10s test end ==");

	WrapperShutdownOS();
}
#endif /* CHECK_TIMER */
