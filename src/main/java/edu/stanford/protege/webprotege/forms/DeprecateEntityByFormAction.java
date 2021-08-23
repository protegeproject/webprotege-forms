package edu.stanford.protege.webprotege.forms;


import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.common.Request;
import edu.stanford.protege.webprotege.forms.data.FormData;
import org.semanticweb.owlapi.model.OWLEntity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-10-22
 */
public class DeprecateEntityByFormAction implements Request<DeprecateEntityByFormResult> {

    public static final String CHANNEL = "webprotege.forms.DeprecateEntityByFormAction";

    private final OWLEntity entity;

    @Nullable
    private final FormData deprecationFormData;

    private final OWLEntity replacementEntity;

    private final ProjectId projectId;

    public DeprecateEntityByFormAction(OWLEntity entity,
                                       Optional<FormData> deprecationFormData,
                                       Optional<OWLEntity> replacementEntity,
                                       ProjectId projectId) {
        this.entity = checkNotNull(entity);
        this.deprecationFormData = checkNotNull(deprecationFormData).orElse(null);
        this.replacementEntity = checkNotNull(replacementEntity).orElse(null);
        this.projectId = checkNotNull(projectId);
        if (replacementEntity.isPresent()) {
            boolean entityTypesAreTheSame = replacementEntity.get().getEntityType().equals(entity.getEntityType());
            if (!entityTypesAreTheSame) {
                throw new IllegalArgumentException(
                        "Entity types for the term being deprecated and the replacement term must be the same");
            }
        }
    }

    @Override
    public String getChannel() {
        return CHANNEL;
    }

    @Nonnull
    public ProjectId projectId() {
        return projectId;
    }

    /**
     * Gets the term to be deprecated
     */
    @Nonnull
    public OWLEntity getEntity() {
        return entity;
    }

    /**
     * Gets the form data for the deprecated term
     */
    public Optional<FormData> getDeprecationFormData() {
        return Optional.ofNullable(deprecationFormData);
    }

    /**
     * Gets the optional replacement term
     */
    public Optional<OWLEntity> getReplacementEntity() {
        return Optional.ofNullable(replacementEntity);
    }

}
