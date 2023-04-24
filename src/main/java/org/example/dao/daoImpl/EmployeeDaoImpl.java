package org.example.dao.daoImpl;

import org.example.config.Configuration;
import org.example.dao.EmployeeDao;
import org.example.model.Employee;
import org.example.model.Job;
import org.example.service.EmployeeService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void createEmployee() {
        String sqlQuery="create table if not exists employees(" +
                "id serial primary key," +
                "first_name varchar," +
                "last_name varchar," +
                "age int," +
                "email varchar," +
                "jobId int references jobs(id));";
        try(Connection connection= Configuration.getConnectionToDatabase();
            Statement statement=connection.createStatement()){
            statement.executeUpdate(sqlQuery);
            System.out.println("table employees created successfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void addEmployee(Employee employee) {
        String sqlQuery="insert into employees(first_name,last_name,age,email,jobId)values(?,?,?,?,?);";
        try(Connection connection=Configuration.getConnectionToDatabase();
            PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery)){
            preparedStatement.setString(1,employee.getFirstName());
            preparedStatement.setString(2,employee.getLastName());
            preparedStatement.setInt(3,employee.getAge());
            preparedStatement.setString(4,employee.getEmail());
            preparedStatement.setInt(5,employee.getJobId());
            preparedStatement.executeUpdate();
            System.out.println("Employee successfully added....");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
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
