package H_Packages.my.you;

import H_Packages.com.in.AnotherDemo;   

import static H_Packages.com.in.MyDemo.*; //By this convension we imported all static methods from MyDemo class

public class YourDemo {

	public static void main(String[] args) {
		AnotherDemo d = new AnotherDemo();
		d.m1();
		d.m2();

// ----------------------------------//
		name();
		name1();
		name2();
		name3();

	}

}

// userdefined packages
// default packages

//sample package naming convention is company-name.project-name.module-name
//package wizskills.weather.rain
//package wizskills.weather.reports

//If the classes in different packages we need to import
//If we have classes in the same package then no need of importing