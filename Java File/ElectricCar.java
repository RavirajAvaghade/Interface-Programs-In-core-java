package com.nit.interf;

public class ElectricCar 
{

	public static void main(String[] args) 
	{
		Car C1 = new Car("Tesla");
		C1.PlayMusic(" sanam teri kasam ");
		C1.charge(100);
		C1.Stopmusic();
		C1.startEngine();
		C1.StopEngine();

	}

}
interface Chargable
{
	void charge(double amount);
}
interface Playable
{
	void PlayMusic(String SongName);
	void Stopmusic();
	
}
class Car implements Chargable,Playable
{
	private String Model;
	private double battrylevel = 100 ;
	private boolean enginon = true;
	public Car(String Model)
	{
		this.Model = Model;
		this.battrylevel = 100;
		this.enginon = true;
		
	}
	public void charge(double amount) 
	{
		battrylevel += amount;
        if (battrylevel > 100) battrylevel = 100;
        System.out.println(Model + " Car charging... Battery now at " + battrylevel + "%");
	}
	public void PlayMusic(String SongName) 
	{
		System.out.println(Model+" Car have Play "+SongName+" Song");
		
	}
	public void Stopmusic(String Song) 
	{
		System.out.println(Model+" Car have Stop "+Song+" Song");
	}
	@Override
	public void Stopmusic() 
	{
	
		System.out.println(Model+" Car have Stop Song");

	}
	public void startEngine() {
	    if (!enginon) {
	    	enginon = true;
	        System.out.println(Model + " Car started engine.");
	    } else {
	        System.out.println(Model + " Car engine is already running.");
	    }
	}
	public void StopEngine()
	{
		System.out.println(Model+" Car Stop Enginee");
	}
}
