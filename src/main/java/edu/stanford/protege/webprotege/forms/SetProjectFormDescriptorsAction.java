package edu.stanford.protege.webprotege.forms;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.common.collect.ImmutableList;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.common.ProjectRequest;
import edu.stanford.protege.webprotege.common.Request;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2019-11-23
 */
@JsonTypeName("webprotege.forms.SetProjectFormDescriptors")
public record SetProjectFormDescriptorsAction(ProjectId projectId,
                                              ImmutableList<FormDescriptor> formDescriptors) implements ProjectRequest<SetProjectFormDescriptorsResult> {

    public static final String CHANNEL = "webprotege.forms.SetProjectFormDescriptors";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}
