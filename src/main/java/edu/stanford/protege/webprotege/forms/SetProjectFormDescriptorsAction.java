package edu.stanford.protege.webprotege.forms;

import com.google.common.collect.ImmutableList;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.common.Request;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2019-11-23
 */
public record SetProjectFormDescriptorsAction(ProjectId projectId,
                                              ImmutableList<FormDescriptor> formDescriptors) implements Request<SetProjectFormDescriptorsResult> {

    public static final String CHANNEL = "webprotege.forms.SetProjectFormDescriptors";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}
