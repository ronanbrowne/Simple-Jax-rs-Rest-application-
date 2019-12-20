package JAX.RS.Application;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldRest {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlaintextHello() {
		return "Hello Jersy rest Service";
	}
	
	
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHello() {
	    return "<html> " + "<title>" + "Hello Jersey Restfull App" + "</title>"
	        + "<body><h1>" + "Hello Jersey Rest App" + "</body></h1>" + "</html> ";
	  }

}
