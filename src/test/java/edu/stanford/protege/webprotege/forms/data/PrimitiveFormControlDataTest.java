package edu.stanford.protege.webprotege.forms.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.*;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest
@AutoConfigureJsonTesters
class PrimitiveFormControlDataTest {

    @Autowired
    private JacksonTester<PrimitiveFormControlData> tester;

    @BeforeEach
    void setUp() {
        JacksonTester.initFields(this, new ObjectMapper());
    }

    @Test
    void shouldSerializeBooleanLiteral() throws IOException {
        var data = PrimitiveFormControlData.get(true);
        var written = tester.write(data);
        assertThat(written).hasJsonPathStringValue("value", "true");
        System.out.println(written.getJson());
    }
}