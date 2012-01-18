package insomnia.example;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class LogoutServlet extends HttpServlet {

    public void doGet( HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException {
	if (req.getSession() != null) req.getSession().invalidate();

	res.sendRedirect(res.encodeRedirectURL("home.jsp"));

    }
}