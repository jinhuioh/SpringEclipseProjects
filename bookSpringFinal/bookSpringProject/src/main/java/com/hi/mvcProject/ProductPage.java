package com.hi.mvcProject;


public class ProductPage {

	private int rowPerPage; 
	private int beginRow; 
	public int getRowPerPage() {
		return rowPerPage;
	}
	public void setRowPerPage(int rowPerPage) {
		this.rowPerPage = rowPerPage;
	}
	public int getBeginRow() {
		return beginRow;
	}
	public void setBeginRow(int beginRow) {
		this.beginRow = beginRow;
	}
	@Override
	public String toString() {
		return "ProductPage [rowPerPage=" + rowPerPage + ", beginRow=" + beginRow + "]";
	}
	
}
