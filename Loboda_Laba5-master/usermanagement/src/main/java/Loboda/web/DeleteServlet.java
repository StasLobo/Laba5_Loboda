package Loboda.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.ValidationException;

import Loboda.User;
import Loboda.db.DaoFactory;
import Loboda.db.DatabaseExeption;
import javax.servlet.http.HttpServlet;

public class DeleteServlet extends HttpServlet {


	protected void showPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/delete.jsp").forward(req, resp);
	}

	protected void processUser(User user) throws DatabaseExeption {
		DaoFactory.getInstance().getUserDao().delete(user);
	}

	protected User getUser(HttpServletRequest req) throws ValidationException {
		User user = new User();
		String idStr = req.getParameter("id");
		if (idStr != null) {
			user.setId(new Long(idStr));
		} else {
			throw new ValidationException("You have to select user");
		}
		return user;
	}
}
