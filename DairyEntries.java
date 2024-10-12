package com;

import java.time.LocalDateTime;

public class DairyEntries {
	
//	Attributes
	private String content;
	private LocalDateTime time;
	
//	constructor
	public DairyEntries(String content) {
		this.content=content;
		this.time=LocalDateTime.now();//Automatically set current date and time
	}
	
//	getter and setter method for content
	
	public String getcontent() {
		return content;
	}
	
	public void setcontent(String ncontent) {
		content=ncontent;
	}
	
//	getter and setter method for time
	
	public LocalDateTime getTime() {
		return time;
	}
	
	public void setTime(LocalDateTime ntime) {
		time=ntime;
	}
	
	
	public String toString() {
		return "Date:"+time.toLocalDate()+"\nTime:"+time.toLocalTime()+"\nContent:"+content;
	}
}
