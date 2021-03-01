package org.srsh.kundargi;

public class MyMainClass {

	public static void main(String[] args) {
		
		
		//create object for MyCal Class
		MyCal cal = new MyCal();
		
	Integer x=	cal.addNumber(10,5);// call MyClass methode 
		
	
	System.out.println("here"+x);
		System.out.println("end ");
		
		
		//craete object of mycl2 
		MyCl2 cl2 = new MyCl2();
		
		Integer lnumber = cl2.mul(10, 2);
		
		System.out.println(lnumber);// call a methode from mycl2
		
		
	}

}
