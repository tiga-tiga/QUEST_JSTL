package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GithubersServlet", urlPatterns = "/githubers")
public class GithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Githuber> list = new ArrayList<Githuber>();
        list.add(new Githuber("tiga", "georges.tigasr@gmail.com", "tiga-tiga", "1", "url"));
        list.add(new Githuber("Hedi", "hedi@gmail.com", "hedi-hedi", "2", "url"));
        list.add(new Githuber("Valentin", "valentin@gmail.com", "ben-ben", "3", "url"));

        request.setAttribute("listValue", list);
        this.getServletContext().getRequestDispatcher("/githubers.jsp").forward(request, response);
    }
}
