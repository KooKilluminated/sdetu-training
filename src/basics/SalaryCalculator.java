package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//declare variable to define career
		String Career;//declare
		System.out.println("program is starting");
		Career="Software Engineer";//define
		System.out.println("My career is: " + Career);
		
		//declare n define
		int hoursPerWeek =40;
		int weeksPerYear= 50;
		double rate= 42.50;
		//compute annual salary
		double salary =hoursPerWeek*weeksPerYear*rate;
		System.out.println("Annual Salary: " + salary);
		//rate*hoursPerWeek*weeksPerYear
		
	}

}
