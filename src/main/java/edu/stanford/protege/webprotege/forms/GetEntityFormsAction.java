package edu.stanford.protege.webprotege.forms;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.common.collect.ImmutableSet;
import edu.stanford.protege.webprotege.common.LangTagFilter;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.common.Request;
import edu.stanford.protege.webprotege.forms.data.FormRegionFilter;
import edu.stanford.protege.webprotege.forms.field.FormRegionOrdering;
import org.semanticweb.owlapi.model.OWLEntity;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2019-11-01
 */

/**
 * Get the forms for an term
 *
 * @param projectId        The project id
 * @param entity           The term
 * @param filters          A list of {@link FormId}s.  If the list is empty then all forms that are applicable
 *                         to the term will be retrieved.  If the list is non-empty then the only the applicable
 *                         forms that have form Ids in the list will be retrieved.
 * @param formPageRequests A list of page requests pertaining to various regions on the form.
 * @param langTagFilter    A language tag filter that can be used to filter data in a specific language.
 * @param orderings        A set of region orderings that can be used to specify the ordering of specific regions of
 * @param filters          A set of region filters that can be used to filter values
 */
@JsonTypeName("GetEntityForms")
public record GetEntityFormsAction(@Nonnull ProjectId projectId,
                                   @Nonnull OWLEntity entity,
                                   @Nonnull ImmutableSet<FormPageRequest> formPageRequests,
                                   @Nonnull LangTagFilter langTagFilter,
                                   @Nonnull ImmutableSet<FormRegionOrdering> orderings,
                                   @Nonnull ImmutableSet<FormId> filters,
                                   ImmutableSet<FormRegionFilter> formRegionFilters) implements Request<GetEntityFormsResult> {

    public static final String CHANNEL = "webprotege.forms.GetEntityForms";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}

