package edu.stanford.protege.webprotege.forms.field;

import com.google.common.collect.ImmutableList;
import edu.stanford.protege.webprotege.forms.data.LiteralFormControlData;
import edu.stanford.protege.webprotege.common.LanguageMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-01-08
 */
public class MultiChoiceControlDescriptor_Serialization_TestCase {

    private ImmutableList<ChoiceDescriptor> choices;

    @BeforeEach
    public void setUp() {
        choices = ImmutableList.of(
//                ChoiceDescriptor.choice(LanguageMap.empty(),
//                                        LiteralFormControlData.get(DataFactory.getOWLLiteral("A"))),
//                ChoiceDescriptor.choice(LanguageMap.empty(),
//                                        LiteralFormControlData.get(DataFactory.getOWLLiteral("B")))
        );
    }

    @Test
    public void shouldSerialize_AnnotationComponentCriteria() throws IOException {
        testSerialization(
                MultiChoiceControlDescriptor.get(FixedChoiceListSourceDescriptor.get(choices), ImmutableList.of())
        );
    }

    private static <V extends MultiChoiceControlDescriptor> void testSerialization(V value) throws IOException {
//        JsonSerializationTestUtil.testSerialization(value, MultiChoiceControlDescriptor.class);
    }
}
