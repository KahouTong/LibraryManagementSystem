package com.libraryManagementSystem.LibraryManagementSystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	int bookid;
	String bookname;
	int bookprice;
	int totalpages;
	int isbannumber;
	String authorname;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	public int getTotalpages() {
		return totalpages;
	}
	public void setTotalpages(int totalpages) {
		this.totalpages = totalpages;
	}
	public int getIsbannumber() {
		return isbannumber;
	}
	public void setIsbannumber(int isbannumber) {
		this.isbannumber = isbannumber;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
}
