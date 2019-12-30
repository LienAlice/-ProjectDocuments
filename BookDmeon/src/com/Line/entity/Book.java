package com.Line.entity;

import java.io.Serializable;

public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer BookId  ;
	private String BookName;
	private Double BookPrice;
	private String BookImg;
	public Book(Integer bookId, String bookName, Double bookPrice, String bookImg) {
		super();
		BookId = bookId;
		BookName = bookName;
		BookPrice = bookPrice;
		BookImg = bookImg;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", BookName=" + BookName + ", BookPrice=" + BookPrice + ", BookImg=" + BookImg
				+ "]";
	}
	public Integer getBookId() {
		return BookId;
	}
	public void setBookId(Integer bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public Double getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		BookPrice = bookPrice;
	}
	public String getBookImg() {
		return BookImg;
	}
	public void setBookImg(String bookImg) {
		BookImg = bookImg;
	}
	
	
}
