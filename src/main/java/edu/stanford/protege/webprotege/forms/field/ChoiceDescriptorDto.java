package edu.stanford.protege.webprotege.forms.field;

import com.google.auto.value.AutoValue;
import edu.stanford.protege.webprotege.common.LanguageMap;
import edu.stanford.protege.webprotege.forms.data.PrimitiveFormControlDataDto;

import javax.annotation.Nonnull;

@AutoValue

public abstract class ChoiceDescriptorDto {

    @Nonnull
    public static ChoiceDescriptorDto get(@Nonnull PrimitiveFormControlDataDto value, @Nonnull LanguageMap label) {
        return new AutoValue_ChoiceDescriptorDto(label, value);
    }

    @Nonnull
    public abstract LanguageMap getLabel();

    @Nonnull
    public abstract PrimitiveFormControlDataDto getValue();
}
