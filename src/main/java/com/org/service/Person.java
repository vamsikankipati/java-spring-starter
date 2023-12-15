package com.org.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Person {
    String firstName;
    String lastname;
    Integer Salary;
}
