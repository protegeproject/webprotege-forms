package edu.stanford.protege.webprotege.forms.field;

import com.google.common.collect.ImmutableList;
import edu.stanford.protege.webprotege.common.LanguageMap;
import edu.stanford.protege.webprotege.jackson.WebProtegeJacksonApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.*;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.context.annotation.Import;


import java.io.IOException;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-05-05
 */
@JsonTest
@AutoConfigureJsonTesters
@Import(WebProtegeJacksonApplication.class)
public class GridControlDescriptor_Serialization_TestCase {

    @Autowired
    private JacksonTester<GridControlDescriptor> tester;

    @Test
    void shouldSerialize() throws IOException {
        var written = tester.write(GridControlDescriptor.get(ImmutableList.of(), null));
        System.out.println(written.getJson());
        assertThat(written).hasJsonPathArrayValue("columns");
        assertThat(written).hasJsonPathMapValue("subjectFactory");
    }
}
