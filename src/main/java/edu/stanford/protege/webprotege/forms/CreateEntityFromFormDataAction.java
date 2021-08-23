package edu.stanford.protege.webprotege.forms;

import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.common.Request;
import edu.stanford.protege.webprotege.entity.FreshEntityIri;
import edu.stanford.protege.webprotege.forms.data.FormData;
import org.semanticweb.owlapi.model.EntityType;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-09-30
 */
@JsonTypeName("CreateEntityFromFormData")
public record CreateEntityFromFormDataAction(@Nonnull ProjectId projectId,
                                             @Nonnull EntityType<?> entityType,
                                             @Nonnull FreshEntityIri freshEntityIri,
                                             @Nonnull FormData formData) implements Request<CreateEntityFromFormDataResult> {

    public static final String CHANNEL = "webprotege.forms.CreateEntityFromFormData";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}
