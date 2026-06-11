package com.ems.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;
import com.ems.util.EmailUtility;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name =
        request.getParameter("name");

        String email =
        request.getParameter("email");

        String department =
        request.getParameter("department");

        double salary =
        Double.parseDouble(
        request.getParameter("salary"));

        Employee emp =
        new Employee(name,
        email,
        department,
        salary);

        EmployeeDAO dao =
        new EmployeeDAO();

        boolean status =
        dao.addEmployee(emp);

        EmailUtility.sendEmail(email);

        if(status) {

            response.sendRedirect(
            "success.jsp");

        } else {

            response.sendRedirect(
            "error.jsp");
        }
    }
}