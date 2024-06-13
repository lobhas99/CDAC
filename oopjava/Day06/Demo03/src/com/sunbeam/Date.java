package com.sunbeam;

import java.util.Objects;

public class Date {
	int day;
	int month;
	int year;
	
	public Date() {
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "[day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // d1.equals(d1)
			return true;
		if (obj == null) //d1.equals(null)
			return false;
		if (!(obj instanceof Date)) //d1.equals(e)
			return false;
		Date other = (Date) obj; //d1.equals(d2)
		return day == other.day && month == other.month && year == other.year;
	}
	
	
	
	
//	@Override
//	public String toString() {
//		return day+"/"+month+"/"+year;
//	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Date) {
//		Date d2 = (Date)obj;
//		if(this.day == d2.day && this.month == d2.month && this.year == d2.year)
//			return true;
//		}
//		return false;
//	}
	
	
	
	
	
}
