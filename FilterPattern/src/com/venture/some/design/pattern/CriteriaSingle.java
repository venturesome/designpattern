package com.venture.some.design.pattern;

import java.util.List;
import java.util.stream.Collectors;

import com.venture.some.design.pattern.main.Person;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		return persons.stream().filter(person -> "single".equalsIgnoreCase(person.getMaritalStatus())).collect(Collectors.toList());
//		persons.stream().filter(person -> "single".equalsIgnoreCase(person.getMaritalStatus())).toArray(Person[]::new);		
	}

}
