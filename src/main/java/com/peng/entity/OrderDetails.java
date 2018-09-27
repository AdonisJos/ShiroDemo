package com.peng.entity;

public class OrderDetails {

	/** 编号 */
	private Integer id;

	/**  */
	private Integer orderId;

	/**  */
	private String goodsName;

	/**  */
	private Integer goodsNum;
	
	/**  */
	private String unit;

	/**  */
	private Float price;

	/**  */
	private Float sum;
	
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(Integer id, Integer orderId, String goodsName, Integer goodsNum, String unit, Float price,
			Float sum) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.goodsName = goodsName;
		this.goodsNum = goodsNum;
		this.unit = unit;
		this.price = price;
		this.sum = sum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
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

	public Float getSum() {
		return sum;
	}

	public void setSum(Float sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", orderId=" + orderId + ", goodsName=" + goodsName + ", goodsNum=" + goodsNum
				+ ", unit=" + unit + ", price=" + price + ", sum=" + sum + "]";
	}
	
	
	
}
