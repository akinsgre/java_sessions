package insomnia.example;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoodByeServlet extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(HelloServlet.class);	

    public void doGet( HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException {
	logger.info("Getting the GoodBye");
	RequestDispatcher dispatcher = req.getRequestDispatcher("goodbye.jsp");
	dispatcher.forward(req, res);

    }

}