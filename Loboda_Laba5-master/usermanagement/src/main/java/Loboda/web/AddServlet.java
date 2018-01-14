package Loboda.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Loboda.User;
import Loboda.db.DaoFactory;
import Loboda.db.DatabaseExeption;

public class AddServlet extends EditServlet {

	@Override
	protected void showPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/add.jsp").forward(req, resp);
	}

	@Override
	protected void processUser(User user) throws DatabaseExeption {
		DaoFactory.getInstance().getUserDao().create(user);
	}

	
}
