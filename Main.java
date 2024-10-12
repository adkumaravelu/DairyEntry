package com;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DairyManage dairymanager=new DairyManage();
		boolean exit=true;
		
		while(exit) {
			
			System.out.println("   ");
			System.out.println("Dairy menu:");
			System.out.println("1.Add Entry.");
			System.out.println("2.Edit Entry.");
			System.out.println("3.Delete Entry.");
			System.out.println("4.View Entry.");
			System.out.println("5.Entry Count.");
			System.out.println("6.Exit.");
			System.out.println("Choose anyone Option:");
			int option = sc.nextInt();
			sc.nextLine();
			
			switch (option) {
				case 1:
					
					System.out.println("Enter Dairy Entry:");
					String content=sc.nextLine();
					dairymanager.addEntry(content);
					break;
					
				case 2:
					
					System.out.println("Enter Dairy Entry Number To Edit:");
					int editIndex=sc.nextInt()-1;
					sc.nextLine();
					System.out.println("Enter New Entry:");
					String newContent=sc.nextLine();
					dairymanager.editEntry(editIndex, newContent);
					break;
					
				case 3:
					
					System.out.println("Enter Dairy Entry Number To Delete:");
					int deleteIndex=sc.nextInt()-1;
					dairymanager.deleteEntry(deleteIndex);
					break;
					
				case 4:
					
					dairymanager.viewEntry();
					break;
					
				case 5:
					
					dairymanager.getEntriescount();
					break;
					
				case 6:
					
					exit=false;
					System.out.println("Bye!!!");
					break;
					
							
			default:
				System.out.println("Invalid Option, try again" );
			}
		}
		
		sc.close();
	}
}
