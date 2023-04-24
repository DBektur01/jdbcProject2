package org.example.dao.daoImpl;

import jakarta.persistence.Column;
import org.example.config.Configuration;
import org.example.dao.JobDao;
import org.example.model.Job;

import java.sql.*;
import java.util.List;



public class JobDaoImpl implements JobDao {
    @Override
    public void createJobTable() {
        String sqlQuery = "create table if not exists jobs(" +
                "id serial primary key," +
                "position varchar," +
                "profession varchar," +
                "description varchar," +
                "experience int);";
        try (Connection connection = Configuration.getConnectionToDatabase();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(sqlQuery);
            System.out.println("table  jobs created successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void addJob(Job job) {
        String sqlQuery="insert into jobs(position,profession,description,experience)values(?,?,?,?);";
        try(Connection connection = Configuration.getConnectionToDatabase();
            PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery)){
            preparedStatement.setString(1, job.getPosition());
            preparedStatement.setString(2, job.getProfession());
            preparedStatement.setString(3,job.getDescription());
            preparedStatement.setInt(4,job.getExperiences() );
            preparedStatement.executeUpdate();
            System.out.println("Successfully added...");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public Job getJobById(Long jobId) {
        try (Connection connection=Configuration.getConnectionToDatabase();
                PreparedStatement statement = connection.prepareStatement(
                "select*from jobs where id = ?")) {
            statement.setLong(1, jobId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Job(
                        resultSet.getLong("id"),
                        resultSet.getString("position"),
                        resultSet.getString("profession"),
                        resultSet.getString("description"),
                        resultSet.getInt("experience"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Job> sortByExperience(String ascOrDesc) {
        return null;
    }

    @Override
    public Job getJobByEmployeeId(Long employeeId) {
        return null;
    }

    @Override
    public void deleteDescriptionColumn() {

    }
}
