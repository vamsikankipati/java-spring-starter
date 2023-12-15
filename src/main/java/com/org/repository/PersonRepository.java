package com.org.repository;

import com.org.service.Person;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class PersonRepository implements CassandraRepository<Person, String> {
}
