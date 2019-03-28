package model;
public class HistorialDate {
	private int day;
	private int month;
	private int year;
	public HistorialDate (int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay(){
		return day;
	}	
	public void setDay(int day){
		this.day = day;
	}
	public int getMonth(){
		return month;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
	public int frecuencyOfMedicament(int actualDay , int actualMonth, int actualYear){

		int day1 = 0;
		int actualDay1 = 0;
		int passedDays = 0;
		int exactedDays = 0;

		day1 = (actualMonth - month)*30;
		actualDay1 = actualDay - day;
		passedDays = (actualYear - year)*360;
		exactedDays = day1 + actualDay1 + passedDays;

		return exactedDays;
	}
}