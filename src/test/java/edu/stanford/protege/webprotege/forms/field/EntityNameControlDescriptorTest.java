package edu.stanford.protege.webprotege.forms.field;

import edu.stanford.protege.webprotege.common.LanguageMap;
import edu.stanford.protege.webprotege.criteria.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.*;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@JsonTest
@AutoConfigureJsonTesters
class EntityNameControlDescriptorTest {

    @Autowired
    private JacksonTester<EntityNameControlDescriptor> tester;

    @Test
    public void shouldSerialize() throws IOException {
        var descriptor = EntityNameControlDescriptor.get(LanguageMap.empty(),
                                                         CompositeRootCriteria.get(List.of(), MultiMatchType.ALL));
        var written = tester.write(descriptor);
        System.out.println(written.getJson());
        assertThat(written).hasJsonPathValue("placeholder");
        assertThat(written).hasJsonPathValue("criteria");
    }
}