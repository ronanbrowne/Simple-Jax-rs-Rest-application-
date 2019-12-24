package JAX.RS.Application;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/person")
public class PersonResource {

	// This method is called if XML is requested
    @GET
    @Produces({MediaType.APPLICATION_XML})
    public Person getXML() {
        Person person = new Person();
        person.setAge(31);
        person.setCity("Galway");
        person.setName("MR APP XML");
        return person;
    }

    // This method is called if JSON is requested
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Person getJSON() {
        Person person = new Person();
        person.setAge(31);
        person.setCity("Galway");
        person.setName("MR JSON");
        return person;
    }

    // This can be used to test the integration with the browser
    @GET
    @Produces({ MediaType.TEXT_XML })
    public Person getHTML() {
        Person person = new Person();
        person.setAge(31);
        person.setCity("Galway");
        person.setName("Mr XML");
        return person;
    }
}
