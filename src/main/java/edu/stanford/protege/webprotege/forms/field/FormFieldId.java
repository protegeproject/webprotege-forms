package edu.stanford.protege.webprotege.forms.field;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.common.UUIDUtil;
import edu.stanford.protege.webprotege.forms.PropertyNames;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 30/03/16
 */

@AutoValue
@JsonTypeName("FormFieldId")
public abstract class FormFieldId implements FormRegionId {

    @JsonCreator
    @Nonnull
    public static FormFieldId get(@JsonProperty(PropertyNames.ID) @Nonnull String id) {
        checkFormat(id);
        return new AutoValue_FormFieldId(id);
    }

    public static FormFieldId valueOf(String id) {
        return get(id);
    }

    private static void checkFormat(@Nonnull String id) {
        if (!UUIDUtil.isWellFormed(id)) {
            throw new IllegalArgumentException("Malformed FormFieldId: " + id);
        }
    }

    @Override
    public String value() {
        return getId();
    }


    @JsonProperty(PropertyNames.ID)
    @Override
    public abstract String getId();
}
