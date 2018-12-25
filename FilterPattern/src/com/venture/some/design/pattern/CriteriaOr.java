package com.venture.some.design.pattern;

import java.util.ArrayList;
import java.util.List;

import com.venture.some.design.pattern.main.Person;

public class CriteriaOr implements Criteria {

	private List<Criteria> criterias = new ArrayList<Criteria>();
	
	public void AddORCriteria(Criteria criteria) {
		
		criterias.add(criteria);
	}
	
	public void addORCriterias(List<Criteria> criterias) {
		
		this.criterias.addAll(criterias);
	}

	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> newPersons = new ArrayList<Person>();
		
		criterias.stream().forEach(criteria -> {
			
			criteria.meetCriteria(persons).forEach(person->{
				
				if(!newPersons.contains(person)) {
					newPersons.add(person);
				}
			});;
		});
		
		return newPersons;
		
	}

}
