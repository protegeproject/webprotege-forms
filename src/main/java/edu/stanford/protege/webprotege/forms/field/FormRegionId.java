package edu.stanford.protege.webprotege.forms.field;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import edu.stanford.protege.webprotege.common.ValueObject;
import edu.stanford.protege.webprotege.forms.PropertyNames;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-04-22
 */
@JsonSubTypes({@Type(FormFieldId.class), @Type(GridColumnId.class)})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
public interface FormRegionId extends ValueObject {


    @JsonProperty(PropertyNames.ID)
    String getId();
}
