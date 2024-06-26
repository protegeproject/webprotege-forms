package edu.stanford.protege.webprotege.forms;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.common.ProjectId;

import javax.annotation.Nonnull;
import java.util.Comparator;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2019-11-04
 */
@AutoValue
public abstract class FormDescriptorRecord implements Comparable<FormDescriptorRecord> {

    private static final Comparator<FormDescriptorRecord> comparingByOrdinal = Comparator.comparing(FormDescriptorRecord::getOrdinal);

    @JsonCreator
    public static FormDescriptorRecord get(@JsonProperty(PropertyNames.PROJECT_ID) @Nonnull ProjectId projectId,
                                           @JsonProperty(PropertyNames.FORM) FormDescriptor formDescriptor,
                                           @JsonProperty(PropertyNames.ORDINAL) Integer ordinal) {
        return new AutoValue_FormDescriptorRecord(projectId,
                                                  formDescriptor == null ? FormDescriptor.empty(FormId.generate()) : formDescriptor,
                                                  ordinal == null ? 0 : ordinal);
    }

    @JsonProperty(PropertyNames.PROJECT_ID)
    @Nonnull
    public abstract ProjectId getProjectId();

    @JsonProperty(PropertyNames.FORM)
    @Nonnull
    public abstract FormDescriptor getFormDescriptor();

    @JsonProperty(PropertyNames.ORDINAL)
    @Nonnull
    public abstract Integer getOrdinal();

    @Override
    public int compareTo(@Nonnull FormDescriptorRecord o) {
        return comparingByOrdinal.compare(this, o);
    }
}
