package edu.stanford.protege.webprotege.forms.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.google.auto.value.AutoValue;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLPrimitive;

import javax.annotation.Nonnull;
import java.util.Optional;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2020-01-07
 */
@AutoValue
public abstract class IriFormControlData implements PrimitiveFormControlData {

    public static IriFormControlData get(@Nonnull IRI iri) {
        return new AutoValue_IriFormControlData(iri);
    }

    @Nonnull
    public abstract IRI getIri();

    @Nonnull
    @Override
    public Optional<OWLEntity> asEntity() {
        return Optional.empty();
    }

    @Nonnull
    @Override
    public Optional<IRI> asIri() {
        return Optional.of(getIri());
    }

    @Nonnull
    @Override
    public Optional<OWLLiteral> asLiteral() {
        return Optional.empty();
    }

    @Nonnull
    @Override
    public OWLPrimitive getPrimitive() {
        return getIri();
    }

    @Override
    public PrimitiveFormControlDataProxy toPrimitiveFormControlDataProxy() {
        return new PrimitiveFormControlDataProxy(getIri().toString(), null, null, null, null);
    }
}
