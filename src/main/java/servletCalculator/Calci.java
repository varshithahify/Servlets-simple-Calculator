package servletCalculator;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/add")
public class Calci extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {

		int x = Integer.parseInt(arg0.getParameter("x"));
		int y = Integer.parseInt(arg0.getParameter("y"));

		int result = x + y;

		arg1.getWriter().println(result);
	}
}

