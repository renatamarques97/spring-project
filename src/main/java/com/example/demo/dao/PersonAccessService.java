package com.example.demo.dao;

import com.example.demo.model.Person;
import java.util.UUID;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository("fakeDAO")
public class PersonAccessService implements PersonDAO{
	
	private static List<Person> DB = new ArrayList<>();
	
	@Override
	public int insertPerson(UUID id, Person person) {
		DB.add(new Person(id, person.getName()));
		return 1;
	}
	
	@Override
	public List<Person> selectAllPeople(){
		return DB;
	}
}
