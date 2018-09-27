package com.peng.entity;

public class CustomerService {
	/** 编号 */
	private Integer id;

	/** 机会来源 */
	private String serveType;

	/** 客户名称 */
	private String overView;

	/** 成功几率 */
	private String customer;

	/** 概要 */
	private String state;

	/** 联系人 */
	private String servicerequest;

	/** 联系电话 */
	private String createPeople;

	/** 机会描述 */
	private String createTime;

	/** 创建人 */
	private String assigner;

	/** 创建时间 */
	private String assignTime;

	/** 指派人 */
	private String serviceProce;

	/** 指派时间 */
	private String serviceProcePeople;

	/** 状态 */
	private String serviceProceTime;

	/** 客户开发状态 */
	private String serviceProceResult;
	
	private String myd;
 
	public CustomerService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerService(Integer id, String serveType, String overView, String customer, String state,
			String servicerequest, String createPeople, String createTime, String assigner, String assignTime,
			String serviceProce, String serviceProcePeople, String serviceProceTime, String serviceProceResult,
			String myd) {
		super();
		this.id = id;
		this.serveType = serveType;
		this.overView = overView;
		this.customer = customer;
		this.state = state;
		this.servicerequest = servicerequest;
		this.createPeople = createPeople;
		this.createTime = createTime;
		this.assigner = assigner;
		this.assignTime = assignTime;
		this.serviceProce = serviceProce;
		this.serviceProcePeople = serviceProcePeople;
		this.serviceProceTime = serviceProceTime;
		this.serviceProceResult = serviceProceResult;
		this.myd = myd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getServeType() {
		return serveType;
	}

	public void setServeType(String serveType) {
		this.serveType = serveType;
	}

	public String getOverView() {
		return overView;
	}

	public void setOverView(String overView) {
		this.overView = overView;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getServicerequest() {
		return servicerequest;
	}

	public void setServicerequest(String servicerequest) {
		this.servicerequest = servicerequest;
	}

	public String getCreatePeople() {
		return createPeople;
	}

	public void setCreatePeople(String createPeople) {
		this.createPeople = createPeople;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getAssigner() {
		return assigner;
	}

	public void setAssigner(String assigner) {
		this.assigner = assigner;
	}

	public String getAssignTime() {
		return assignTime;
	}

	public void setAssignTime(String assignTime) {
		this.assignTime = assignTime;
	}

	public String getServiceProce() {
		return serviceProce;
	}

	public void setServiceProce(String serviceProce) {
		this.serviceProce = serviceProce;
	}

	public String getServiceProcePeople() {
		return serviceProcePeople;
	}

	public void setServiceProcePeople(String serviceProcePeople) {
		this.serviceProcePeople = serviceProcePeople;
	}

	public String getServiceProceTime() {
		return serviceProceTime;
	}

	public void setServiceProceTime(String serviceProceTime) {
		this.serviceProceTime = serviceProceTime;
	}

	public String getServiceProceResult() {
		return serviceProceResult;
	}

	public void setServiceProceResult(String serviceProceResult) {
		this.serviceProceResult = serviceProceResult;
	}

	public String getMyd() {
		return myd;
	}

	public void setMyd(String myd) {
		this.myd = myd;
	}

	@Override
	public String toString() {
		return "CustomerService [id=" + id + ", serveType=" + serveType + ", overView=" + overView + ", customer="
				+ customer + ", state=" + state + ", servicerequest=" + servicerequest + ", createPeople="
				+ createPeople + ", createTime=" + createTime + ", assigner=" + assigner + ", assignTime=" + assignTime
				+ ", serviceProce=" + serviceProce + ", serviceProcePeople=" + serviceProcePeople
				+ ", serviceProceTime=" + serviceProceTime + ", serviceProceResult=" + serviceProceResult + ", myd="
				+ myd + "]";
	}
	
}
