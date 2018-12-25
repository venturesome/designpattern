package com.venture.some.desing.pattern;

public class CompositePatternDemo {

	public static void main(String[] args) {

		Employee CEO = new Employee("John", "CEO", 100000);
		Employee CSO = new Employee("Robert", "Head Sales", 90000);
		Employee CMO = new Employee("Michel", "Head Marketing", 90000);

		Employee clerk1 = new Employee("Laura", "Marketing", 50000);
		Employee clerk2 = new Employee("Bob", "Marketing", 50000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 50000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 50000);

		CEO.add(CSO);
		CEO.add(CMO);

		CSO.add(salesExecutive1);
		CSO.add(salesExecutive2);

		CMO.add(clerk1);
		CMO.add(clerk2);

		print(CEO);
			
//		System.out.println(CEO);
//		for (Employee headEmployee : CEO.getSubordinates()) {
//			System.out.println(headEmployee);
//			for (Employee employee : headEmployee.getSubordinates()) {
//				System.out.println(employee);
//			}
//		}
	}
	
	private static void print(Employee em) {

		System.out.println(em);
		if (em.getSubordinates() != null && em.getSubordinates().size() > 0) {
			em.getSubordinates().forEach(_em -> {
				print(_em);
			});
		}
	}
}
