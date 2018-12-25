package com.venture.some.design.pattern;

import java.util.ArrayList;
import java.util.List;

import com.venture.some.design.pattern.main.Person;

public class CriteriaAdd implements Criteria {

	private List<Criteria> criterias = new ArrayList<Criteria>();
	
	public void addCriteria(Criteria criteria) {
		
		criterias.add(criteria);
	}
	
	public void addCriterias(List<Criteria> criterias) {
		
		this.criterias.addAll(criterias);
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
//		List<Person> newPersons = criterias.stream().map(criteria ->{
//			List<Person> newPersons = new ArrayList<Person>();
//			
//			return newPersons; 
//		}).collect(Collectors.toList());
		
		for(Criteria criteria: criterias) {
			persons = criteria.meetCriteria(persons);
		}
		return persons;
	}

}
