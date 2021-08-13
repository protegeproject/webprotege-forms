package edu.stanford.protege.webprotege.forms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.common.Request;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-01-16
 */
@JsonTypeName("GetEntityFormDescriptor")
public record GetEntityFormDescriptorAction(@JsonProperty("projectId") ProjectId projectId,
                                            @JsonProperty("formId") FormId formId) implements Request<GetEntityFormDescriptorResult> {

    @Override
    public String getChannel() {
        return "forms.GetEntityFormDescriptor";
    }
}
