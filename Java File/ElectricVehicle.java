package com.nit.interf;

public class ElectricVehicle 
{

	public static void main(String[] args) 
	{  
		CarElectrics E = new CarElectrics(" EV 205 ");
		E.ShowStatus();
		E.Drive(40);
		E.Drive(100);
		E.ChargeBattary(30);
		E.performMaintance();
		E.ChargeBattary(80);
		
	
	

	}

}
interface Drivable
{
    void Drive(int Distance);	
}
interface Charging
{
	void ChargeBattary(int amount);
}
interface Maintanbale
{
	void performMaintance();
	void ShowStatus();
}
class CarElectrics implements Drivable,Charging,Maintanbale
{
	private String Carid;
	private int distancedriven;
	private int Chargelevel;
	private boolean Maintancedone;
	public CarElectrics(String Carid)
	{
		this.Carid = Carid;
		this.distancedriven = 150;
		this.Chargelevel = 50;
		this.Maintancedone = true;
	}
     
	public void ShowStatus() 
	{
		System.out.println("===============================");
		System.out.println(" car id      :" +Carid);
		System.out.println(" Distance    :" +distancedriven);
		System.out.println(" Chargelevel :" +Chargelevel);
		System.out.println(" Maintance    :" +Maintancedone);
		System.out.println("=================================");
	}
	public void ChargeBattary(int amount) 
	{
		Chargelevel += amount;
		if (Chargelevel > 100) Chargelevel =100;
		System.out.println(" Car id :"+Carid+" Charged Current Charge : "+Chargelevel+" %");
	
		
	}
	public void Drive(int Distance) 
	{
		if (Chargelevel >= Distance/2)
		{
			distancedriven+= Distance;
			Chargelevel -= Distance/2;
			System.out.println(" Car "+Carid+ " drove "+Distance+" KM total Distance "+distancedriven+" Km charge left "+Chargelevel+" %");
			
			
		}
		
	}
	public void performMaintance() 
	{

		Maintancedone = true;
        System.out.println("Car " + Carid + " maintenance completed.");

				
	}



}
