package edu.stanford.protege.webprotege.forms;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.common.PageRequest;
import edu.stanford.protege.webprotege.forms.data.FormSubject;
import edu.stanford.protege.webprotege.forms.field.FormRegionId;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-04-22
 */
@JsonTypeName("FormPageRequest")
public record FormPageRequest(FormId formId,
                              FormSubject subject,
                              FormRegionId regionId,
                              SourceType sourceType,
                              PageRequest pageRequest) {

    public static final int DEFAULT_PAGE_SIZE = 10;

    @JsonCreator
    @Nonnull
    public static FormPageRequest get(@JsonProperty("formId") @Nonnull FormId formId,
                                      @JsonProperty("subject") @Nonnull FormSubject subject,
                                      @JsonProperty("regionId") @Nonnull FormRegionId formFieldId,
                                      @JsonProperty("sourceType") @Nonnull SourceType sourceType,
                                      @JsonProperty("pageRequest") @Nonnull PageRequest pageRequest) {
        return new FormPageRequest(formId, subject, formFieldId, sourceType, pageRequest);
    }

    public enum SourceType {
        CONTROL_STACK, GRID_CONTROL
    }
}
