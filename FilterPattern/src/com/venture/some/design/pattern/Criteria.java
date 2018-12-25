package com.venture.some.design.pattern;

import java.util.List;

import com.venture.some.design.pattern.main.Person;

public interface Criteria {

	List<Person> meetCriteria(List<Person> persons);
}
