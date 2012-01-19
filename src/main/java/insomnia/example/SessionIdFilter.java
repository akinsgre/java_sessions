package insomnia.example;
 
import javax.servlet.*;
import javax.servlet.http.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
public class SessionIdFilter implements javax.servlet.Filter
{
    private FilterConfig filterConfig;
    Logger logger = LoggerFactory.getLogger(SessionIdFilter.class); 
    public void doFilter(ServletRequest request, ServletResponse response,
           FilterChain chain) 
           throws java.io.IOException, javax.servlet.ServletException
    {

	HttpServletRequest httpReq = (HttpServletRequest)request;
	String id = httpReq.getSession().getId();
	logger.info("Current session is " + id);
	chain.doFilter(request, response);
	
    }
 
    public void init(final FilterConfig filterConfig)
    {
        this.filterConfig = filterConfig;
    }
 
    public void destroy()
    {
        filterConfig = null;
    }
}