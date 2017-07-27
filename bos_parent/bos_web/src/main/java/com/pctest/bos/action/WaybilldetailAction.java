package com.pctest.bos.action;
import com.pctest.bos.biz.IWaybilldetailBiz;
import com.pctest.bos.entity.Waybilldetail;

/**
 * Action 
 * @author Administrator
 *
 */
public class WaybilldetailAction extends BaseAction<Waybilldetail> {

	private IWaybilldetailBiz waybilldetailBiz;

	public void setWaybilldetailBiz(IWaybilldetailBiz waybilldetailBiz) {
		this.waybilldetailBiz = waybilldetailBiz;
		super.setBaseBiz(this.waybilldetailBiz);
	}

}
