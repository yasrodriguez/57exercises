package ex52CurrentTime;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Contains configuration required for the web service server.
 * 
 * @author Yasmin
 *
 */
@ApplicationPath("/rest")
public class RestService extends ResourceConfig {

	public RestService() {
		packages("com.fasterxml.jackson.jaxrs.json");
		packages("ex52CurrentTime");
	}
}
