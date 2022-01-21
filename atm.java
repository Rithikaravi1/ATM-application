import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.println("3.Admin");
		System.out.println("4.User");
		System.out.println("5.Exit");
		System.out.print("Press any option 3,4,5:");
		int a=sc.nextInt();
		if(a==1){
			System.out.println("Welcome to Admin page");
			System.out.println("  Login");
			System.out.print("Enter Username");
			String Username=sc.next();
            System.out.print("Enter Password");
			int Password=sc.nextInt();
			if(Username.equals("Admin")&& Password==3456){
				System.out.println("Welcome Admin!");
				System.out.print("Enter no.of.100:");
				int noOf100=sc.nextInt();
				System.out.print("Enter noOf.500:");
				int noOf500=sc.nextInt();
				System.out.print("Enter no.of.1000:");
				int noOf1000=sc.nextInt();
				System.out.print("Enter no.of.2000:");
				int noOf2000=sc.nextInt();
			}
		}
		else if(a==2){
			System.out.println("Login");
			System.out.println("Name:");
			String name1=sc.next();
			System.out.print("Password:");
			int pass=sc.nextInt();
			int u=9833;
			if(name1.equals("rithi")&&pass==u){
				System.out.println("Welcome"+name1);
			System.out.println("1.Cash Withdraw");
			    System.out.println("2.Balance enquiry");
				System.out.println("3.change card setting");
				System.out.println("4.Deposit");
				System.out.println("5.Transfer");
				System.out.print("Press 1,2,3,4,5:");
				int us=sc.nextInt();
				int balance=50000;
				if(us==1||us==2||us==3||us==4||us==5){
					if(us==1){
						System.out.print("Please enter the amount!!");

					}
					if(us==2){
						System.out.println("Check your balance enquiry,press2.");
						int en=sc.nextInt();
						if(en==2){
							System.out.println("Current balance is"+balance);
						}
						else{
							System.out.print("Press valid number");
						}
						if(us==3){
							System.out.println("To change card setting,press 3");
							int pi=sc.nextInt();
							if(pi==3){
								System.out.print("if you know pin press1");
								int p=sc.nextInt();
                                if(p==1){

					System.out.print("Enter the old pin:");
					             int newpass=sc.nextInt();
								}
							}
						}
					}
				}
				else{
					System.out.println("Press options.");
				}
			}
			else if(name1.equals("rithi")&&pass!=9833){
				System.out.println("Wrong Password.please check your password.");
			}
			else{
				System.out.println("Invalid Username");
			}
		}
		else if(a==3){
			System.out.println("Logout successful");
			sc.close();
		}
	}
}	