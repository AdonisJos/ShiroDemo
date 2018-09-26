package com.peng.form;

public class PageFORM {

	/** 第几页  */
	private String page;
	/** 行数 */
	private String rows;
	
	public PageFORM() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PageFORM(String page, String rows) {
		super();
		this.page = page;
		this.rows = rows;
	}

	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getRows() {
		return rows;
	}
	public void setRows(String rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageFORM [page=" + page + ", rows=" + rows + "]";
	}

	
	
	
	
	
}
