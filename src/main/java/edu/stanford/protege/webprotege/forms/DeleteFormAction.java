package edu.stanford.protege.webprotege.forms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.common.ProjectRequest;
import edu.stanford.protege.webprotege.common.Request;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-04-15
 */


@JsonTypeName("webprotege.forms.DeleteForm")
public record DeleteFormAction(@JsonProperty("projectId") @Nonnull ProjectId projectId,
                               @JsonProperty("formId") @Nonnull FormId formId) implements ProjectRequest<DeleteFormResult> {

    public static final String CHANNEL = "webprotege.forms.DeleteForm";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}
