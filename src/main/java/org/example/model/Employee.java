package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table
public class Employee {
    @Id
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column
    private int age;
    @Column
    private String email;
    @Column
    private int jobId;
public Employee(String firstName,String lastName,int age,String email,int jobId){
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    this.email=email;
    this.jobId=jobId;
}
}
