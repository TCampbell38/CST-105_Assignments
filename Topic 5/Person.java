//Exercise 11.2
import java.time.LocalDate;

//Person
public class Person {
	String name;
	String address;
	int pNumber;
	String email;

}

//Student
class Student extends Person {
	final String freshman = "freshman";
	final String sophomore = "sophomore";
	final String junior = "junior";
	final String senior = "senior";
	
}


//Employee
class Employee extends Person {
	Account eAccount = new Account();
	String office;
	Double salary;
	LocalDate dateHired = eAccount.getDate();
}

//Faculty
class Faculty extends Employee {
	int officeHours;
	String rank;
}

//Staff
class Staff extends Employee {
	String title;
}