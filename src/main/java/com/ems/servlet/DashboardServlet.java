package com.ems.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.dao.EmployeeDAO;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        EmployeeDAO dao = new EmployeeDAO();

        int totalEmployees =
        dao.getEmployeeCount();

        int departments =
        dao.getDepartmentCount();

        int newEmployees =
        dao.getNewEmployeeCount();

        request.setAttribute(
        "totalEmployees",
        totalEmployees);

        request.setAttribute(
        "departments",
        departments);

        request.setAttribute(
        "newEmployees",
        newEmployees);

        request.getRequestDispatcher(
        "dashboard.jsp")
        .forward(request, response);
    }
}