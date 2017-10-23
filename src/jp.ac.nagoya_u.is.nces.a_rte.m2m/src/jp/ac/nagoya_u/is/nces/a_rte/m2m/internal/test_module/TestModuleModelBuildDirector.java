/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2016 by Eiwa System Management, Inc., JAPAN
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
 *  $Id $
 */
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.test_module;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_REFERRABLE;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.M2MException;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.test_module.builder.RteTestFileModelBuilder;
import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.test_module.builder.TestModuleModelBuildContext;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleReferrable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.util.ModuleModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestRoot;


public class TestModuleModelBuildDirector implements ITestModuleModelBuildDirector {

	/* (non-Javadoc)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.m2m.ITestModuleModelBuildDirector#build(jp.ac.nagoya_u.is.nces.a_rte.m2m.TestModuleModelBuildContext)
	 */
	@Override
	public void build(TestModuleModelBuildContext context) throws M2MException {
		RteTestRoot rteTestRoot = RteTestFactory.eINSTANCE.createRteTestRoot();
		context.eResource.getContents().add(rteTestRoot);
		context.cache.rteTestRoot = rteTestRoot;

		try {
			RteTestFileModelBuilder fileBuilder = new RteTestFileModelBuilder(context);
			fileBuilder.build();

			// モデルにIDを割り振る
			buildModelIds(context);
		} catch (ModelException e) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			throw new M2MException("Internal error occurred while building RTE code structures.", e);
		}
	}

	private void buildModelIds(TestModuleModelBuildContext context) {
		int idIndex = 1;
		for (ModuleReferrable referrable : context.query.<ModuleReferrable> findByKind(MODULE_REFERRABLE)) {
			referrable.setId(ModuleModelUtils.ID_PREFIX + referrable.eClass().getName() + idIndex);
			idIndex++;
		}
	}
}
