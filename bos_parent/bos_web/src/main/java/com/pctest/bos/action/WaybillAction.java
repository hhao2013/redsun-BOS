package com.pctest.bos.action;
import com.pctest.bos.biz.IWaybillBiz;
import com.pctest.bos.entity.Waybill;

/**
 * Action 
 * @author Administrator
 *
 */
public class WaybillAction extends BaseAction<Waybill> {

	private IWaybillBiz waybillBiz;

	public void setWaybillBiz(IWaybillBiz waybillBiz) {
		this.waybillBiz = waybillBiz;
		super.setBaseBiz(this.waybillBiz);
	}

}
