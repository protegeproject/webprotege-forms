package edu.stanford.protege.webprotege.forms;

import org.semanticweb.owlapi.model.OWLDataFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryImpl;

@SpringBootApplication
public class WebprotegeFormsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebprotegeFormsApiApplication.class, args);
    }

    @Bean
    @ConditionalOnMissingBean
    OWLDataFactory dataFactory() {
        return new OWLDataFactoryImpl();
    }
}
