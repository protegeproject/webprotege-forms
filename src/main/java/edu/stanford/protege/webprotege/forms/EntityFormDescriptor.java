package edu.stanford.protege.webprotege.forms;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.criteria.RootCriteria;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-08-22
 */
@AutoValue
public abstract class EntityFormDescriptor {


    public static final String PROJECT_ID = "projectId";

    public static final String FORM_ID = "formId";

    public static final String FORM_DESCRIPTOR = "formDescriptor";

    public static final String SELECTOR_CRITERIA = "formSelectorCriteria";

    public static final String PURPOSE = "purpose";


    @JsonCreator
    public static EntityFormDescriptor valueOf(@JsonProperty(PROJECT_ID) @Nonnull ProjectId projectId,
                                               @JsonProperty(FORM_ID) @Nonnull FormId formId,
                                               @JsonProperty(FORM_DESCRIPTOR) @Nonnull FormDescriptor newDescriptor,
                                               @JsonProperty(PURPOSE) @Nonnull FormPurpose purpose,
                                               @JsonProperty(SELECTOR_CRITERIA) @Nonnull RootCriteria newSelectorCriteria) {
        return new AutoValue_EntityFormDescriptor(projectId, formId, newDescriptor, purpose, newSelectorCriteria);
    }

    @Nonnull
    @JsonProperty(PROJECT_ID)
    public abstract ProjectId getProjectId();

    @Nonnull
    @JsonProperty(FORM_ID)
    public abstract FormId getFormId();

    @Nonnull
    @JsonProperty(FORM_DESCRIPTOR)
    public abstract FormDescriptor getDescriptor();

    @Nonnull
    @JsonProperty(PURPOSE)
    public abstract FormPurpose getPurpose();

    @Nonnull
    @JsonProperty(SELECTOR_CRITERIA)
    public abstract RootCriteria getSelectorCriteria();
}
