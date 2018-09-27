package com.peng.entity;

public class CustomerContact {

	/** 编号 */
	private Integer id;

	/**  */
	private Integer cusId;

	/**  */
	private String contactTime;

	/**  */
	private String address;
	
	/**  */
	private String overView;
	
	public CustomerContact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerContact(Integer id, Integer cusId, String contactTime, String address, String overView) {
		super();
		this.id = id;
		this.cusId = cusId;
		this.contactTime = contactTime;
		this.address = address;
		this.overView = overView;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCusId() {
		return cusId;
	}

	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}

	public String getContactTime() {
		return contactTime;
	}

	public void setContactTime(String contactTime) {
		this.contactTime = contactTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOverView() {
		return overView;
	}

	public void setOverView(String overView) {
		this.overView = overView;
	}

	@Override
	public String toString() {
		return "CustomerContact [id=" + id + ", cusId=" + cusId + ", contactTime=" + contactTime + ", address="
				+ address + ", overView=" + overView + "]";
	}
	
	
}
