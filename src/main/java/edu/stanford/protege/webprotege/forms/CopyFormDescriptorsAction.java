package edu.stanford.protege.webprotege.forms;

import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.common.Request;

import java.util.List;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-04-14
 */


@JsonTypeName("CopyFormDescriptors")
public record CopyFormDescriptorsAction(ProjectId toProject,
                                        ProjectId fromProject,
                                        List<FormId> formIds) implements Request<CopyFormDescriptorsResult> {

    public static final String CHANNEL = "webprotege.forms.CopyFormDescriptors";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}
