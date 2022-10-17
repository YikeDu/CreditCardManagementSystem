package com.example.creditcardmanagementsystem;

import com.example.creditcardmanagementsystem.dao.UserDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "register", value = "/register")
public class Register extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String tel = request.getParameter("tel");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");


        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("email: " + email);
        System.out.println("tel: " + tel);
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);

        UserDAO userDAO = new UserDAO();
        try {
            if (userDAO.insert()){
                request.getRequestDispatcher("/home").forward(request, response);
            }else {
                request.getRequestDispatcher("/fail").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
