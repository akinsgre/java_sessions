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
	logger.info("Getting the home page");
	res.sendRedirect(res.encodeRedirectURL("home.jsp"));

    }

    public void doPost( HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {

	req.getSession().invalidate();
	logger.info("Logging in");
	String name = req.getParameter("name");
	String color = req.getParameter("color");
	req.getSession().setAttribute("name", name);
	req.getSession().setAttribute("color", color);
	req.getSession().setAttribute("sessionId", req.getSession().getId());
	String id = req.getSession().getId();
	req.getSession().setAttribute("sessionId", id);

	res.sendRedirect(res.encodeRedirectURL("home.jsp"));
    }
}