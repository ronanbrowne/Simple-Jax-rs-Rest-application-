package JAX.RS.Application;

import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class HelloWorldRestTest extends JerseyTest {

	@Test
	public void givenGetHiGreeting_whenCorrectRequest_thenResponseIsOkAndContainsHi() {
		Response response = target("/hello").request().get();
		assertEquals("Http Response should be 200: ", Status.OK.getStatusCode(), response.getStatus());
		assertThat(response.readEntity(String.class), CoreMatchers.containsString("Hello Jersey Rest App"));
	}

	@Override
	protected Application configure() {
		forceSet(TestProperties.CONTAINER_PORT, "0");
		return new ResourceConfig(HelloWorldRest.class);
	}

}
