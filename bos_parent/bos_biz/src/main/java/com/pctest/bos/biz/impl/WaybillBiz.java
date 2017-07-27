package com.pctest.bos.biz.impl;
import com.pctest.bos.biz.IWaybillBiz;
import com.pctest.bos.dao.IWaybillDao;
import com.pctest.bos.entity.Waybill;
/**
 * 业务逻辑类
 * @author Administrator
 *
 */
public class WaybillBiz extends BaseBiz<Waybill> implements IWaybillBiz {

	private IWaybillDao waybillDao;
	
	public void setWaybillDao(IWaybillDao waybillDao) {
		this.waybillDao = waybillDao;
		super.setBaseDao(this.waybillDao);
	}
	
}
