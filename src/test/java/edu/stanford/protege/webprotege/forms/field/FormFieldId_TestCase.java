package edu.stanford.protege.webprotege.forms.field;



import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FormFieldId_TestCase {

    public static final String UUID = "12345678-1234-1234-1234-123456789abc";

    @Test
    public void shouldGetFormFieldIdWithSuppliedUUID() {
        FormFieldId id = FormFieldId.get(UUID);
        assertThat(id.getId()).isEqualTo(UUID);
    }

//    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAcceptMalformedId() {
        FormFieldId.get("NotAUUID");
    }

//    @Test(expected = NullPointerException.class)
    public void shouldNotAcceptNull() {
        FormFieldId.get(null);
    }
}