package edu.stanford.protege.webprotege.forms.field;



import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GridColumnId_TestCase {

    public static final String UUID = "12345678-1234-1234-1234-123456789abc";

    @Test
    public void shouldCreateId() {
        GridColumnId id = GridColumnId.get(UUID);
        assertThat(id.getId()).isEqualTo(UUID);
    }

    @Test
    public void shouldThrowExceptionForMalformedId() {
        assertThrows(IllegalArgumentException.class, () -> {
            GridColumnId.get("NotAUuid");
        });
    }
}