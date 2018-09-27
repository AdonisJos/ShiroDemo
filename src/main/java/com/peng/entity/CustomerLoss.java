package com.peng.entity;

public class CustomerLoss {
	
	/** 编号 */
	private Integer id;

	/**  */
	private String cusNo;

	/**  */
	private String cusName;

	/**  */
	private String cusManager;
	
	/**  */
	private String lastOrderTime;

	/**  */
	private String confirmLossTime;

	/**  */
	private Integer state;
	
	/**  */
	private String lossReason;
	
	public CustomerLoss() {
		super();
	}

	public CustomerLoss(Integer id, String cusNo, String cusName, String cusManager, String lastOrderTime,
			String confirmLossTime, Integer state, String lossReason) {
		super();
		this.id = id;
		this.cusNo = cusNo;
		this.cusName = cusName;
		this.cusManager = cusManager;
		this.lastOrderTime = lastOrderTime;
		this.confirmLossTime = confirmLossTime;
		this.state = state;
		this.lossReason = lossReason;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCusNo() {
		return cusNo;
	}

	public void setCusNo(String cusNo) {
		this.cusNo = cusNo;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusManager() {
		return cusManager;
	}

	public void setCusManager(String cusManager) {
		this.cusManager = cusManager;
	}

	public String getLastOrderTime() {
		return lastOrderTime;
	}

	public void setLastOrderTime(String lastOrderTime) {
		this.lastOrderTime = lastOrderTime;
	}

	public String getConfirmLossTime() {
		return confirmLossTime;
	}

	public void setConfirmLossTime(String confirmLossTime) {
		this.confirmLossTime = confirmLossTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getLossReason() {
		return lossReason;
	}

	public void setLossReason(String lossReason) {
		this.lossReason = lossReason;
	}

	@Override
	public String toString() {
		return "CustomerLoss [id=" + id + ", cusNo=" + cusNo + ", cusName=" + cusName + ", cusManager=" + cusManager
				+ ", lastOrderTime=" + lastOrderTime + ", confirmLossTime=" + confirmLossTime + ", state=" + state
				+ ", lossReason=" + lossReason + "]";
	}
	
	
	
}
