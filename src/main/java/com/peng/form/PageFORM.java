package com.peng.form;

public class PageFORM {

	/** 第几页 */
	private Integer page;
	/** 行数 */
	private Integer rows;

	public PageFORM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PageFORM(Integer page, Integer rows) {
		super();
		this.page = page;
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageFORM [page=" + page + ", rows=" + rows + "]";
	}

}
