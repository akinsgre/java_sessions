package insomnia.example;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloServlet extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(HelloServlet.class);	

    public void doGet( HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException {

	res.sendRedirect(res.encodeRedirectURL("home.jsp"));

    }

    public void doPost( HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {

	req.getSession().invalidate();
	req.getSession().setAttribute("name", "Greg");
	String id = req.getSession().getId();
	req.getSession().setAttribute("sessionId", id);

	res.sendRedirect(res.encodeRedirectURL("home.jsp"));
    }
}