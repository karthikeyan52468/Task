package thymeleafTest;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.templateresolver.WebApplicationTemplateResolver;
import org.thymeleaf.web.IWebExchange;
import org.thymeleaf.web.servlet.JavaxServletWebApplication;

public class Controller extends HttpServlet{
	
	JavaxServletWebApplication app;
	WebApplicationTemplateResolver web;
	TemplateEngine templateEngine;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		app=JavaxServletWebApplication.buildApplication(getServletContext());
		
		templateEngine = new TemplateEngine();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 IWebExchange exchange= app.buildExchange(req, resp);
	 web=new WebApplicationTemplateResolver(app);
	 web.setPrefix("/templates/");
	 web.setSuffix(".html");
	 WebContext content = new WebContext(exchange);
	 content.setVariable("name", "abc");
	 content.setVariable("age", 18);
	 content.setVariable("car",List.of("bmw","audi"));
	 templateEngine.setTemplateResolver(web);
	 templateEngine.process("home",content,resp.getWriter());
	}

}
