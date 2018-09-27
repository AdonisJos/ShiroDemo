package com.peng.entity;

public class CustomerReprieve {

	/** 编号 */
	private Integer id;

	/** 客户编号 */
	private Integer lossId;

	/** 客户名称 */
	private String measure;
	
	public CustomerReprieve(Integer id, Integer lossId, String measure) {
		super();
		this.id = id;
		this.lossId = lossId;
		this.measure = measure;
	}

	public CustomerReprieve() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLossId() {
		return lossId;
	}

	public void setLossId(Integer lossId) {
		this.lossId = lossId;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	@Override
	public String toString() {
		return "CustomerReprieve [id=" + id + ", lossId=" + lossId + ", measure=" + measure + "]";
	}
	
	
}
