package com.peng.entity;

public class CusDevPlan {
	/** 编号 */
	private Integer id;

	/** 客户编号 */
	private Integer saleChanceId;

	/** 客户名称 */
	private String planItem;

	/** 客户地区 */
	private String planDate;

	/** 客户经理 */
	private String exeAffect;

	public CusDevPlan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CusDevPlan(Integer id, Integer saleChanceId, String planItem, String planDate, String exeAffect) {
		super();
		this.id = id;
		this.saleChanceId = saleChanceId;
		this.planItem = planItem;
		this.planDate = planDate;
		this.exeAffect = exeAffect;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSaleChanceId() {
		return saleChanceId;
	}

	public void setSaleChanceId(Integer saleChanceId) {
		this.saleChanceId = saleChanceId;
	}

	public String getPlanItem() {
		return planItem;
	}

	public void setPlanItem(String planItem) {
		this.planItem = planItem;
	}

	public String getPlanDate() {
		return planDate;
	}

	public void setPlanDate(String planDate) {
		this.planDate = planDate;
	}

	public String getExeAffect() {
		return exeAffect;
	}

	public void setExeAffect(String exeAffect) {
		this.exeAffect = exeAffect;
	}

	@Override
	public String toString() {
		return "CusDevPlan [id=" + id + ", saleChanceId=" + saleChanceId + ", planItem=" + planItem + ", planDate="
				+ planDate + ", exeAffect=" + exeAffect + "]";
	}
	
	
}
