package org.example.service.serviceImpl;

import org.example.dao.EmployeeDao;
import org.example.dao.daoImpl.EmployeeDaoImpl;
import org.example.model.Employee;
import org.example.model.Job;
import org.example.service.EmployeeService;

import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeDao employeeDao = new EmployeeDaoImpl();
    @Override
    public void createEmployee() {
        employeeDao.createEmployee();

    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);

    }

    @Override
    public void dropTable() {

    }

    @Override
    public void cleanTable() {

    }

    @Override
    public void updateEmployee(Long id, Employee employee) {

    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee findByEmail(String email) {
        return null;
    }

    @Override
    public Map<Employee, Job> getEmployeeById(Long employeeId) {
        return null;
    }

    @Override
    public List<Employee> getEmployeeByPosition(String position) {
        return null;
    }
}
