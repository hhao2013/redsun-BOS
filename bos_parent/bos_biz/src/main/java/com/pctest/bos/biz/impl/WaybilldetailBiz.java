package com.pctest.bos.biz.impl;
import com.pctest.bos.biz.IWaybilldetailBiz;
import com.pctest.bos.dao.IWaybilldetailDao;
import com.pctest.bos.entity.Waybilldetail;
/**
 * 业务逻辑类
 * @author Administrator
 *
 */
public class WaybilldetailBiz extends BaseBiz<Waybilldetail> implements IWaybilldetailBiz {

	private IWaybilldetailDao waybilldetailDao;
	
	public void setWaybilldetailDao(IWaybilldetailDao waybilldetailDao) {
		this.waybilldetailDao = waybilldetailDao;
		super.setBaseDao(this.waybilldetailDao);
	}
	
}
