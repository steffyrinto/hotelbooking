package facefolks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	  static int register=0;	

		
		public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			String name;
			String address;
			String contactNumber;
			String email;
			String proofType;
			String proofID; 
			
			 String type;
			 String cot;
			 String cable;
			 String wifi;
			 String laundry;
						
			 boolean i=true;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		Customer a1=new Customer();
			do {
			System.out.println("Enter your name");
			name=br.readLine();
			System.out.println("Enter your address");
			address=br.readLine();
			System.out.println("Contact Number");
			contactNumber=br.readLine();
			System.out.println("E-Mail ID");
			email=br.readLine();
			System.out.println("Enter proof type");
			proofType=br.readLine();
			System.out.println("Enter proof id");
			proofID=br.readLine();
			/*Main mn=new Main(name,address,contactNumber,email,proofType,proofID);
			mn.register(name,address,contactNumber,email,proofType,proofID);*/		
	

		
		a1.setName(name);
		a1.setAddress(address);
		a1.setContactNumber(contactNumber);
		a1.setEmail(email);
		a1.setProofType(proofType);
		a1.setProofID(proofID);
		a1.registered();
		System.out.println("Thanks for registration and your Registration ID is "+ ++register);

		System.out.println("Do you want to continue?"+"\n"+"y/n");
		char y=br.readLine().charAt(0);
		
		if(y=='y')
		{
			i=true;
		}
		else
		{
			//System.out.println("Do you want to continue");
			i=false;
		}
		}while(i);
		
		System.out.println("Do you want to update the email id?(y/n)");
		char y1=br.readLine().charAt(0);
		if(y1=='y')
		{
			i=true;
			System.out.println("Update Email:");
			System.out.println("Enter new Email id");
			email=br.readLine();
			a1.setEmail(email);
			System.out.println("Email updated");
			a1.registered();
		}
		else
		{
			//System.out.println("Do you want to continue");
			i=false;
		
		}
		
		
		Roombooking r1=new Roombooking();
		boolean d=true;
		while(d)
		{
		System.out.println("\n\nMenu");
		System.out.println("1.Book \n2.Check Status \n3.Exit");
		System.out.println("Enter your choice");
		int choice=Integer.parseInt(br.readLine());
		
		
		switch(choice) 
		{
		case 1:
		{
			
		
		System.out.println("\n\nBooking:");
		do
		{
		System.out.println("Please choose the services required.");
		System.out.println("AC/non-AC(AC/nAC)");
		type=br.readLine();
		r1.setType(type);
		System.out.println("Cot(Single/Double)");
		cot=br.readLine();
		r1.setCot(cot);
		System.out.println("With cable connection/without cable connection(C/nC)");
		cable=br.readLine();
		r1.setCable(cable);
		System.out.println("Wi-Fi needed or not(W/nW)");
		wifi=br.readLine();
		r1.setCable(cable);
		System.out.println("Laundry service needed or not(L/nL)");
		laundry=br.readLine();
		r1.setLaundry(laundry);
		r1.Book(type, cot, cable,  wifi,  laundry);
		
		
		System.out.println("\n\nDo you want to proceed?(yes/no)");
		char y2=br.readLine().charAt(0);
		if(y2=='y')
		{
		i=false;
		System.out.println("\n\nThank you for booking. Your room number is "+r1.roomnum()+".");
		}
		else
		{
			i=true;
		}		
		}while(i);
		}
		case 2:
		{
			System.out.println("\n\nCheck Status:");
			System.out.println("Enter room number");
			int a=Integer.parseInt(br.readLine());
			Roombooking r2=new Roombooking();
			boolean check=r2.CheckStatus(a);
			if(check)
			{
			System.out.println("Room number "+a+" is booked.");
			}
			else
			{
				System.out.println("Room number "+a+" is not booked.");
			}
		}
		case 3:
		{
			System.out.println("\n\nThanks for service");
			d=false;
			
		}
		}
		}
}
}






