package com.gradesystem.entity;



import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class StudentService<e> {

    Scanner sc = new Scanner(System.in);
    static ArrayList<Student> al = new ArrayList<>();
 
    int total ;
    int noSubject = 3 * 100;
    
    void addData() {
    	try {
    		System.out.println("Enter name, rollno");
            String name = sc.next();
            int rollNo = sc.nextInt();

            System.out.println("Enter Marks m1, m2, m3");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            int total = m1 + m2 + m3;
            
            int perc = (int) ((float) total / noSubject * 100);

            al.add(new Student(name, rollNo, m1, m2, m3, perc));

            System.out.println("Record Add Sucessfully");
            System.out.println("___________");
            
        }
        catch( InputMismatchException e) {
        	e.printStackTrace();
        }
        
    }
 void update() {
	 try {
		 System.out.println("enter roll no");
			int rollno=sc.nextInt();
			boolean found=false;
			
			for(Student stud:al)
			{
				if(stud.getRollNo()==rollno) 
				{
					found = true;
					
					System.out.println("enter new name,m1,m2,m3");
					String name=sc.next();
					int m1=sc.nextInt();
					int m2=sc.nextInt();
					int m3=sc.nextInt();
				    total=m1+m2+m3;
					
					 int perc = (int) ((float) total / noSubject * 100);
		          stud.setName(name);
		          stud.setM1(m1);
		          stud.setM2(m2);
		          stud.setM3(m3);
		          stud.setPerc(perc);
				 
					System.out.println("Data Updated");
					System.out.println("___________");
				}
			}
				

		        if (!found) {
		            System.out.println("Student with rollno " + rollno + " not found.");
		        }
	 }
	 catch(InputMismatchException e)
	 {
		 e.printStackTrace();
	 }
	
    }

    void delete() {
    	try {
    		System.out.println("Enter rollno to remove");
            int rollNo = sc.nextInt();
            Iterator<Student> it = al.iterator();
            boolean found = false;

            while (it.hasNext()) {
                if (it.next().getRollNo() == rollNo) {
                    it.remove();
                    found = true;
                    System.out.println("Student removed successfully.");
                    break;
                }
            }

            if (!found) {
                System.out.println("Student with rollno: " + rollNo + " not found.");
            }
   	 }
   	 catch(InputMismatchException e )
   	 {
   		 e.printStackTrace();
   	 }
        
    }

    void display() {
        System.out.println("Display Data");
        for(Student stud: al)
        {
        	System.out.println(stud);
        }
        }
    void search() {
    	try {
    		System.out.println("enter Rollno");
        	int rollno=sc.nextInt();
        	
        	boolean found=false;
        	for(Student stud:al)
        	{
        		found=true;
        		if(stud.getRollNo()==rollno)
        		{
        			System.out.println("*Recod found*");
        			System.out.println(stud);
        		}
        		if(found=false) {
        			System.out.println("Recod not Found");
        		}
        	}
   	 }
   	 catch(InputMismatchException e)
   	 {
   		 e.printStackTrace();
   	 }
    	
    	}
    }
   


