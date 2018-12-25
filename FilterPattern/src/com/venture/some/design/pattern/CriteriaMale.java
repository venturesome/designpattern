package com.venture.some.design.pattern;

import java.util.List;
import java.util.stream.Collectors;

import com.venture.some.design.pattern.main.Person;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		return persons.stream().filter(person -> "male".equalsIgnoreCase(person.getGender())).collect(Collectors.toList());
//		persons.stream().filter(person -> "male".equalsIgnoreCase(person.getGender())).toArray(Person[]::new);		
	}

}
