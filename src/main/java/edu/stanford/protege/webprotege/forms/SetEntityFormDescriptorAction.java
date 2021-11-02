package edu.stanford.protege.webprotege.forms;


import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.common.ProjectRequest;
import edu.stanford.protege.webprotege.common.Request;
import edu.stanford.protege.webprotege.criteria.CompositeRootCriteria;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-01-16
 */
@JsonTypeName("webprotege.forms.SetEntityFormDescriptor")
public record SetEntityFormDescriptorAction(@Nonnull ProjectId projectId,
                                            @Nonnull FormDescriptor formDescriptor,
                                            @Nonnull FormPurpose purpose,
                                            @Nullable CompositeRootCriteria selectorCriteria) implements ProjectRequest<SetEntityFormDescriptorResult> {

    public static final String CHANNEL = "webprotege.forms.SetEntityFormDescriptor";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}
