/*Develop a java application with Employee class with Emp_name, Emp_id, Address, Mail_id, Mobile_no as members. Inherit the classes, Programmer, Assistant Professor, Associate Professor and Professor from employee class. Add Basic Pay(BP) as the member of all the inherited classes with 97% of BP as DA, 10% of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross and net salary.
*/

import  java.io.*;
import  java.util.*;
class Employee{
	String  Emp_name;
	int  Emp_id;
	String  Address;
	String  Mail_id;
	Long  Mobile_no;
	Scanner sc=new Scanner(System.in);
	void  getdata(){
		System.out.println("Enter  name of the employee");
		Emp_name=sc.next();
		System.out.println("Enter  mail id  of the employee");
		Mail_id=sc.next();
		System.out.println("Enter  address of the employee");
		Address=sc.next();
		System.out.println("Enter  employee   id");
		Emp_id=sc.nextInt();
		System.out.println("Enter  mobile number of the employee");
		Mobile_no=sc.nextLong();
	}
	void  display(){
		System.out.println("Employee name: "+Emp_name);
		System.out.println("Employee  Mail id: "+Mail_id);
		System.out.println("Employee  Address: "+Address);
		System.out.println("Employee  id: "+Emp_id);
		System.out.println("Employee  Mobile number: "+Mobile_no);
	}
}
class Programmer  extends  Employee{
	double  BP, DA, HRA, PF, club_fund, net_salary, gross;
	void  getProgrammer(){
		System.out.println("Enter basic pay");
		BP=sc.nextDouble();
	}
	void  calculateprog(){
		DA=(0.97*BP);
		HRA=(0.10*BP);
		PF=(0.12*BP);
		club_fund=(0.1*BP);
		gross=(BP+DA+HRA);
		net_salary=(gross-PF-club_fund);
		System.out.println("PAY  SLIP  FOR  PROGRAMMER");
		System.out.println("Basic  pay:  Rs."+BP);
		System.out.println("DA:  Rs."+DA);
		System.out.println("HRA:  Rs."+HRA);
		System.out.println("PF:  Rs."+PF);
		System.out.println("club_fund:  Rs."+club_fund);
		System.out.println("gross  pay:  Rs."+gross);
		System.out.println("net_salary:  Rs."+net_salary);
	}
}
class  Asstprofessor  extends  Employee{
	double  BP, DA, HRA, PF, club_fund, net_salary, gross;
	void  getasst(){
		System.out.println("Enter basic pay");
		BP=sc.nextDouble();
	}
	void  calculateasst(){
		DA=(0.97*BP);
		HRA=(0.10*BP);
		PF=(0.12*BP);
		club_fund=(0.1*BP);
		gross=(BP+DA+HRA);
		net_salary=(gross-PF-club_fund);
		System.out.println("PAY  SLIP  FOR  ASSISTANT   PROFESSOR");
		System.out.println("Basic  pay:  Rs."+BP);
		System.out.println("DA:  Rs."+DA);
		System.out.println("HRA:  Rs."+HRA);
		System.out.println("PF:  Rs."+PF);
		System.out.println("club_fund:  Rs."+club_fund);
		System.out.println("gross  pay:  Rs."+gross);
		System.out.println("net_salary:  Rs."+net_salary);
	}
}
class   Associateprofessor   extends   Employee{
	double  BP, DA, HRA, PF, club_fund, net_salary, gross;
	void  getassociate(){
		System.out.println("Enter basic pay");
		BP=sc.nextDouble();
	}
	void  calculateassociate(){
		DA=(0.97*BP);
		HRA=(0.10*BP);
		PF=(0.12*BP);
		club_fund=(0.1*BP);
		gross=(BP+DA+HRA);
		net_salary=(gross-PF-club_fund);
		System.out.println("PAY  SLIP  FOR  ASSOCIATE   PROFESSOR");
		System.out.println("Basic  pay:  Rs."+BP);
		System.out.println("DA:  Rs."+DA);
		System.out.println("HRA:  Rs."+HRA);
		System.out.println("PF:  Rs."+PF);
		System.out.println("club_fund:  Rs."+club_fund);
		System.out.println("gross  pay:  Rs."+gross);
		System.out.println("net_salary:  Rs."+net_salary);
	}  
}
class  Professor   extends   Employee{
	double  BP, DA, HRA, PF, club_fund, net_salary, gross;
	void  getprofessor(){
		System.out.println("Enter basic pay");
		BP=sc.nextDouble();
	}
	void  calculateprofessor(){
		DA=(0.97*BP);
		HRA=(0.10*BP);
		PF=(0.12*BP);
		club_fund=(0.1*BP);
		gross=(BP+DA+HRA);
		net_salary=(gross-PF-club_fund);
		System.out.println("PAY  SLIP  FOR  PROFESSOR");
		System.out.println("Basic  pay:  Rs."+BP);
		System.out.println("DA:  Rs."+DA);
		System.out.println("HRA:  Rs."+HRA);
		System.out.println("PF:  Rs."+PF);
		System.out.println("club_fund:  Rs."+club_fund);
		System.out.println("gross  pay:  Rs."+gross);
		System.out.println("net_salary:  Rs."+net_salary);
	}
}
class   Salary{
	public   static   void   main(String   args[]){
		int  choice,count;
		do{
			System.out.println("PAYROLL");
			System.out.println("1.PROGRAMMER\t2.ASSISTANT   PROFESSOR\t3.ASSOCIATE    PROFESSOR\t4.PROFESSOR");
			Scanner  sc=new  Scanner(System.in);
			System.out.println("Enter  your   choice");
			choice=sc.nextInt();
			switch(choice){
				case  1:
				{
					Programmer   p=new   Programmer();
					p.getdata();
					p.getProgrammer();
					p.display();
					p.calculateprog();
					break;
				}
				case   2:
				{
					Asstprofessor   asst=new   Asstprofessor();
					asst.getdata();
					asst.getasst();
					asst.display();
					asst.calculateasst();
					break;
				}
				case   3:
				{
					Associateprofessor   asso=new    Associateprofessor();
					asso.getdata();
					asso.getassociate();
					asso.display();
					asso.calculateassociate();
					break;
				}
				case   4:
				{
					Professor   prof=new   Professor();
					prof.getdata();
					prof.getprofessor();
					prof.display();
					prof.calculateprofessor();
					break;
				}
			}
			System.out.println("Please  enter  0  to  quit  and  1  to  continue:");
			count=sc.nextInt();
		}while(count==1);
	}
}

/*
PAYROLL
1.PROGRAMMER    2.ASSISTANT   PROFESSOR 3.ASSOCIATE    PROFESSOR        4.PROFESSOR
Enter  your   choice
1
Enter  name of the employee
srujana
Enter  mail id  of the employee
psaisrujana2001@gmail.com
Enter  address of the employee
guntur
Enter  employee   id
234
Enter  mobile number of the employee
9949308860
Enter basic pay
32000
Employee name: srujana
Employee  Mail id: psaisrujana2001@gmail.com
Employee  Address: guntur
Employee  id: 234
Employee  Mobile number: 9949308860
PAY  SLIP  FOR  PROGRAMMER
Basic  pay:  Rs.32000.0
DA:  Rs.31040.0
HRA:  Rs.3200.0
PF:  Rs.3840.0
club_fund:  Rs.3200.0
gross  pay:  Rs.66240.0
net_salary:  Rs.59200.0
Please  enter  0  to  quit  and  1  to  continue:
0
*/
