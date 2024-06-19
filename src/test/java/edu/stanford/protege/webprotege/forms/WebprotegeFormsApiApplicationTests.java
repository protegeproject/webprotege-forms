package edu.stanford.protege.webprotege.forms;

import edu.stanford.protege.webprotege.jackson.WebProtegeJacksonApplication;
import org.junit.jupiter.api.Test;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.*;
import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryImpl;

@SpringBootTest
@Import(WebProtegeJacksonApplication.class)
class WebprotegeFormsApiApplicationTests {

	@Test
	void contextLoads() {
	}
}
