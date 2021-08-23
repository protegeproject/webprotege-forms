package edu.stanford.protege.webprotege.forms;

import com.google.common.collect.ImmutableMap;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.common.Request;
import edu.stanford.protege.webprotege.forms.data.FormData;
import org.semanticweb.owlapi.model.OWLEntity;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2019-11-01
 */
public record SetEntityFormsDataAction(@Nonnull ProjectId projectId,
                                       @Nonnull OWLEntity entity,
                                       @Nonnull ImmutableMap<FormId, FormData> pristineFormsData,
                                       @Nonnull FormDataByFormId editedFormsData) implements Request<SetEntityFormDataResult> {

    public static final String CHANNEL = "webprotege.forms.SetEntityFormsData";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}

