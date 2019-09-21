package facefolks;

public class Roombooking extends Main{
	 String type;
	 String cot;
	 String cable;
	 String wifi;
	 String laundry;
	 boolean a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
	private String ac;
	 public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLaundry() {
		return laundry;
	}
	public void setLaundry(String laundry) {
		this.laundry = laundry;
	}
	void Book(String type, String cot, String cable, String wifi, String laundry)
	{
		int amount=0;
	String string1=type;
	String string2="ac";
	String string3="nac";
	if(string1.equalsIgnoreCase(string2))
	{
		amount=amount+1000;
		//System.out.println(amount);
		a1=true;
		
	}
	if(string1.equalsIgnoreCase(string3))
	{
		amount=amount+750;
		//System.out.println(amount);
		a2=true;
	}
		 if(cot.equalsIgnoreCase("single"))
	 {
	amount= amount+0;
	a3=true;
	 }
	 if(cot.equalsIgnoreCase("Double"))
	 {
		 amount=amount+350;
		 a4=true;
	 }
	 if(cable.equalsIgnoreCase("C"))
	 {
		 amount=amount+50;
		 a5=true;
	 }
	 if(cable.equalsIgnoreCase("NC"))
	 {
		 amount=amount+0;
		 a6=true;
	 }
	 if(wifi.equalsIgnoreCase("w"))
	 {
		 amount=amount+200;
		 a7=true;
	 }
	 if(wifi.equalsIgnoreCase("NW"))
	 {
		 amount=amount+0;
		 a8=true;
	 }
	 if(laundry.equalsIgnoreCase("L"))
	 {
		 amount=amount+100;
		 a9=true;
	 }
	 if(laundry.equalsIgnoreCase("NL"))
	 {
		 amount=amount+0;
		 a10=true;
	 }
	
			System.out.println("The total charge is Rs."+amount);
			System.out.println("The services chosen are");
						if(a3)
				{
				 System.out.print("Single cot ");
				}
			if(a4)
			{
				 System.out.print("Double cot ");

			}
			if(a1)
			{
				 System.out.println("AC room");
	
			}
			if(a2)
			{
				System.out.println("Non-AC room");
			}
			if(a5)
			{
				System.out.println("Cable connection enabled");
			}
			if(a6)
			{
				System.out.println("No Cable connection enabled");
			}
			if(a7)
			{
				System.out.println("Wi-Fi enabled");
			}
			if(a8)
			{
				System.out.println("No Wi-Fi is enabled");
			}
			if(a9)
			{
				System.out.println("with laundry service");
			}
			if(a10)
			{
				System.out.println("with  no laundry service");
			}
			}
	static int roomnum=0;
	 static int booked[]=new int[25];

	int roomnum()
	{
		roomnum++;
		booked[roomnum]=1;
		return roomnum;
	}
	boolean CheckStatus(int room)
	{
		if(booked[room]==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

			