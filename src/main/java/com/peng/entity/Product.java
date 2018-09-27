package com.peng.entity;

public class Product {
	/** 编号 */
	private Integer id;

	/** 客户编号 */
	private String productName;

	/** 客户名称 */
	private String model;

	/** 客户地区 */
	private String unit;

	/** 客户经理 */
	private Float price;

	/** 客户信用度 */
	private Double store;
	
	private String remark;

	public Integer getId() {
		return id;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer id, String productName, String model, String unit, Float price, Double store,
			String remark) {
		super();
		this.id = id;
		this.productName = productName;
		this.model = model;
		this.unit = unit;
		this.price = price;
		this.store = store;
		this.remark = remark;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Double getStore() {
		return store;
	}

	public void setStore(Double store) {
		this.store = store;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", model=" + model + ", unit=" + unit + ", price="
				+ price + ", store=" + store + ", remark=" + remark + "]";
	}
	
	
}
