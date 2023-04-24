package org.example;

import org.example.config.Configuration;
import org.example.model.Employee;
import org.example.model.Job;
import org.example.service.EmployeeService;
import org.example.service.JobService;
import org.example.service.serviceImpl.EmployeeServiceImpl;
import org.example.service.serviceImpl.JobServiceImpl;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        JobService jobService = new JobServiceImpl();
//        jobService.createJobTable();
//        jobService.addJob(new Job("Mentor","Java","Backend developer",2));
        System.out.println(jobService.getJobById(1L));


        EmployeeService employeeService = new EmployeeServiceImpl();
//        employeeService.createEmployee();
//        employeeService.addEmployee(new Employee("Bektur","Duyshenbekov",23,"bek@gmail.com",2));

    }
}
