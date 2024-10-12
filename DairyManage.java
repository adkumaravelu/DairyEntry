package com;

import java.util.ArrayList;

public class DairyManage {
	
	private ArrayList<DairyEntries>entries;
	
//	constructor
	
	public DairyManage() {
		this.entries=new ArrayList<>();
	}
	
//	 Add a new diary entry
	
	public void addEntry(String content) {
		
		DairyEntries entry=new DairyEntries(content);
		entries.add(entry);
		System.out.println("Entry added.");
	}

//	Edit existing entries
	
	public void editEntry(int index,String newcontent) {
		
		if(index>=0 && index <entries.size()) {
			DairyEntries entry=new DairyEntries(newcontent);
			entry.setcontent(newcontent);
			System.out.println("Entry Updated");
		}
		else {
			System.out.println("Invalid entry index");
		}
	}
	
//	Delete entries
	
	public void deleteEntry(int index) {
		
		if(index>=0 && index<entries.size()) {
			entries.remove(index);
			System.out.println("Entry deleted.");
		}
		else {
			System.out.println("Invalid entry index");
		}
	}
	
//	view all entries
	
	public void viewEntry() {
		
		if(entries.isEmpty()) {
			System.out.println("Dairy is Empty.");
		}
		else {
			for(int i=0;i<entries.size();i++) {
				System.out.println("Entry "+(i+1)+" :");
				System.out.println(entries.get(i));
				
			}
		}
	}
	
//	get number of entries in dairy
	
	public void getEntriescount() {
		System.out.println(entries.size());
	}

	
}
