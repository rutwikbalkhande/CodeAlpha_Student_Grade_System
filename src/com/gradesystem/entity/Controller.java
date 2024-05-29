package com.gradesystem.entity;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Controller {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		StudentService studentService = new StudentService();
		
		int ch;
		do {
			System.out.println("*choose option*");
			System.out.println("1:insert student details");
			System.out.println("2:update record");
			System.out.println("3:delete record");
			System.out.println("4:display All Record");
			System.out.println("5:search record");
			
		
			
			try {
				ch=sc.nextInt();
				switch(ch) {
				case 1:
					studentService.addData();
			     	break;
				
				case 2: studentService.update();
					break;
				
				case 3:
					studentService.delete();
					break;
				
				case 4:
					 studentService.display();
					break;
				
				case 5:
					 studentService.search();
					break;
				}
			}
			catch(InputMismatchException e) {
				e.printStackTrace();
			}
			System.out.println("Enrter Continue=0 /, Exit=5");
			 ch=sc.nextInt();
			}
			while(ch==0);
		}
		}
			
			
			