package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ems.model.Employee;
import com.ems.util.DBConnection;

public class EmployeeDAO {

    public boolean addEmployee(Employee emp) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String query =
            "INSERT INTO employees(name,email,department,salary) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());

            int row = ps.executeUpdate();

            if(row > 0) {
                status = true;
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    public List<Employee> getAllEmployees() {

        List<Employee> list = new ArrayList<>();

        try {

            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM employees";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                Employee emp = new Employee();

                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setEmail(rs.getString("email"));
                emp.setDepartment(rs.getString("department"));
                emp.setSalary(rs.getDouble("salary"));

                list.add(emp);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public boolean updateEmployee(Employee emp) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String query =
            "UPDATE employees SET name=?, email=?, department=?, salary=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());
            ps.setInt(5, emp.getId());

            int row = ps.executeUpdate();

            if(row > 0) {
                status = true;
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    public boolean deleteEmployee(int id) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String query =
            "DELETE FROM employees WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int row = ps.executeUpdate();

            if(row > 0) {
                status = true;
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    public List<Employee> getEmployeesSorted() {

        List<Employee> list = new ArrayList<>();

        try {

            Connection con = DBConnection.getConnection();

            String query =
            "SELECT * FROM employees ORDER BY salary DESC";

            PreparedStatement ps =
            con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                Employee emp = new Employee();

                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setEmail(rs.getString("email"));
                emp.setDepartment(rs.getString("department"));
                emp.setSalary(rs.getDouble("salary"));

                list.add(emp);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public int getEmployeeCount() {

        int count = 0;

        try {

            Connection con = DBConnection.getConnection();

            String query =
            "SELECT COUNT(*) FROM employees";

            PreparedStatement ps =
            con.prepareStatement(query);

            ResultSet rs =
            ps.executeQuery();

            if(rs.next()) {

                count = rs.getInt(1);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    public int getDepartmentCount() {

        int count = 0;

        try {

            Connection con = DBConnection.getConnection();

            String query =
            "SELECT COUNT(DISTINCT department) FROM employees";

            PreparedStatement ps =
            con.prepareStatement(query);

            ResultSet rs =
            ps.executeQuery();

            if(rs.next()) {

                count = rs.getInt(1);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    public int getNewEmployeeCount() {

        int count = 0;

        try {

            Connection con = DBConnection.getConnection();

            String query =
            "SELECT COUNT(*) FROM employees";

            PreparedStatement ps =
            con.prepareStatement(query);

            ResultSet rs =
            ps.executeQuery();

            if(rs.next()) {

                count = rs.getInt(1);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return count;
    }
}