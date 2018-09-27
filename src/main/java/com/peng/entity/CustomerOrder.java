package com.peng.entity;

public class CustomerOrder {
	/** 编号 */
	private Integer id;

	/** 客户编号 */
	private Integer cusId;

	/** 客户名称 */
	private String orderNo;

	/** 客户地区 */
	private String orderDate;

	/** 客户经理 */
	private String address;

	/** 客户信用度 */
	private Integer state;
	
	public CustomerOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CustomerOrder(Integer id, Integer cusId, String orderNo, String orderDate, String address, Integer state) {
		super();
		this.id = id;
		this.cusId = cusId;
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.address = address;
		this.state = state;
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

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "CustomerOrder [id=" + id + ", cusId=" + cusId + ", orderNo=" + orderNo + ", orderDate=" + orderDate
				+ ", address=" + address + ", state=" + state + "]";
	}

	
}
