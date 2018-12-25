package com.venture.some.design.pattern.main;

import java.util.ArrayList;
import java.util.List;

import com.venture.some.design.pattern.Criteria;
import com.venture.some.design.pattern.CriteriaAdd;
import com.venture.some.design.pattern.CriteriaFemale;
import com.venture.some.design.pattern.CriteriaMale;
import com.venture.some.design.pattern.CriteriaOr;
import com.venture.some.design.pattern.CriteriaSingle;

public class CriteriaPatternDemo {

	public static void main(String[] args) {
		 List<Person> persons = new ArrayList<Person>();
		 
	      persons.add(new Person("Robert","Male", "Single"));
	      persons.add(new Person("John","Male", "Married"));
	      persons.add(new Person("Laura","Female", "Married"));
	      persons.add(new Person("Diana","Female", "Single"));
	      persons.add(new Person("Mike","Male", "Single"));
	      persons.add(new Person("Bobby","Male", "Single"));
	 
	      Criteria male = new CriteriaMale();
	      Criteria female = new CriteriaFemale();
	      Criteria single = new CriteriaSingle();
	      CriteriaAdd singleMale = new CriteriaAdd();
	      singleMale.addCriteria(single);
	      singleMale.addCriteria(male);
	      CriteriaOr singleOrFemale = new CriteriaOr();
	      singleOrFemale.AddORCriteria(single);
	      singleOrFemale.AddORCriteria(female);
	      System.out.println("Males: ");
	      printPersons(male.meetCriteria(persons));
	 
	      System.out.println("\nFemales: ");
	      printPersons(female.meetCriteria(persons));
	 
	      System.out.println("\nSingle Males: ");
	      printPersons(singleMale.meetCriteria(persons));
	 
	      System.out.println("\nSingle Or Females: ");
	      printPersons(singleOrFemale.meetCriteria(persons));
	   }
	 
	   public static void printPersons(List<Person> persons){
	      for (Person person : persons) {
	         System.out.println("Person : [ Name : " + person.getName() 
	            +", Gender : " + person.getGender() 
	            +", Marital Status : " + person.getMaritalStatus()
	            +" ]");
	      }
	   }     
}
