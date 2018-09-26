package com.peng.entity;

import java.io.Serializable;
import java.util.Date;

public class SaleChance implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;

	/** 编号 */
	private Integer id;

	/** 机会来源 */
	private String chanceSource;

	/** 客户名称 */
	private String customerName;

	/** 成功几率 */
	private Integer cgjl;

	/** 概要 */
	private String overView;

	/** 联系人 */
	private String linkMan;

	/** 联系电话 */
	private String linkPhone;

	/** 机会描述 */
	private String description;

	/** 创建人 */
	private String createMan;

	/** 创建时间 */
	private Date createTime;

	/** 指派人 */
	private String assignMan;

	/** 指派时间 */
	private Date assignTime;

	/** 状态 */
	private Integer state;

	/** 客户开发状态 */
	private Integer devResult;

	public SaleChance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SaleChance(String customerName, String overView, String createMan, Integer state) {
		super();
		this.customerName = customerName;
		this.overView = overView;
		this.createMan = createMan;
		this.state = state;
	}

	public SaleChance(Integer id, String chanceSource, String customerName, Integer cgjl, String overView,
			String linkMan, String linkPhone, String description, String createMan, Date createTime, String assignMan,
			Date assignTime) {
		super();
		this.id = id;
		this.chanceSource = chanceSource;
		this.customerName = customerName;
		this.cgjl = cgjl;
		this.overView = overView;
		this.linkMan = linkMan;
		this.linkPhone = linkPhone;
		this.description = description;
		this.createMan = createMan;
		this.createTime = createTime;
		this.assignMan = assignMan;
		this.assignTime = assignTime;
	}

	public SaleChance(Integer id, String chanceSource, String customerName, Integer cgjl, String overView,
			String linkMan, String linkPhone, String description, String createMan, Date createTime, String assignMan,
			Date assignTime, Integer state, Integer devResult) {
		super();
		this.id = id;
		this.chanceSource = chanceSource;
		this.customerName = customerName;
		this.cgjl = cgjl;
		this.overView = overView;
		this.linkMan = linkMan;
		this.linkPhone = linkPhone;
		this.description = description;
		this.createMan = createMan;
		this.createTime = createTime;
		this.assignMan = assignMan;
		this.assignTime = assignTime;
		this.state = state;
		this.devResult = devResult;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChanceSource() {
		return chanceSource;
	}

	public void setChanceSource(String chanceSource) {
		this.chanceSource = chanceSource;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getCgjl() {
		return cgjl;
	}

	public void setCgjl(Integer cgjl) {
		this.cgjl = cgjl;
	}

	public String getOverview() {
		return overView;
	}

	public void setOverview(String overView) {
		this.overView = overView;
	}

	public String getLinkMan() {
		return linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	public String getLinkPhone() {
		return linkPhone;
	}

	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreateMan() {
		return createMan;
	}

	public void setCreateMan(String createMan) {
		this.createMan = createMan;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAssignMan() {
		return assignMan;
	}

	public void setAssignMan(String assignMan) {
		this.assignMan = assignMan;
	}

	public Date getAssignTime() {
		return assignTime;
	}

	public void setAssignTime(Date assignTime) {
		this.assignTime = assignTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getDevResult() {
		return devResult;
	}

	public void setDevResult(Integer devResult) {
		this.devResult = devResult;
	}

	@Override
	public String toString() {
		return "SaleChance [id=" + id + ", chanceSource=" + chanceSource + ", customerName=" + customerName + ", cgjl="
				+ cgjl + ", overView=" + overView + ", linkMan=" + linkMan + ", linkPhone=" + linkPhone
				+ ", description=" + description + ", createMan=" + createMan + ", createTime=" + createTime
				+ ", assignMan=" + assignMan + ", assignTime=" + assignTime + ", state=" + state + ", devResult="
				+ devResult + ", getId()=" + getId() + ", getChanceSource()=" + getChanceSource()
				+ ", getCustomerName()=" + getCustomerName() + ", getCgjl()=" + getCgjl() + ", getOverview()="
				+ getOverview() + ", getLinkMan()=" + getLinkMan() + ", getLinkPhone()=" + getLinkPhone()
				+ ", getDescription()=" + getDescription() + ", getCreateMan()=" + getCreateMan() + ", getCreateTime()="
				+ getCreateTime() + ", getAssignMan()=" + getAssignMan() + ", getAssignTime()=" + getAssignTime()
				+ ", getState()=" + getState() + ", getDevResult()=" + getDevResult() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
