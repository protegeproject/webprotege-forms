package edu.stanford.protege.webprotege.forms.field;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 25 Jun 2017
 */
public enum NumberControlType {

    @JsonProperty("Plain") PLAIN,

    @JsonProperty("Stepper") STEPPER,

    @JsonProperty("Slider") SLIDER
}
