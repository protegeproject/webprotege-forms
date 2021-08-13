package edu.stanford.protege.webprotege.forms.data;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Optional;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2019-11-30
 */
@AutoValue

public abstract class GridRowData implements Comparable<GridRowData> {

    public static GridRowData get(@Nullable FormEntitySubject subject,
                                  @Nonnull ImmutableList<GridCellData> cellData) {
        return new AutoValue_GridRowData(subject, cellData);
    }


    @Nullable
    protected abstract FormEntitySubject getSubjectInternal();

    @Nonnull
    public Optional<FormEntitySubject> getSubject() {
        return Optional.ofNullable(getSubjectInternal());
    }

    @Nonnull
    public abstract ImmutableList<GridCellData> getCells();

    @Override
    public int compareTo(GridRowData o) {
        ImmutableList<GridCellData> cells = getCells();
        ImmutableList<GridCellData> otherCells = o.getCells();
        for(int i = 0; i < cells.size() && i < otherCells.size(); i++) {
            GridCellData cellData = cells.get(i);
            GridCellData otherCellData = otherCells.get(i);
            int diff = cellData.compareTo(otherCellData);
            if(diff != 0) {
                return diff;
            }
        }
        return 0;
    }
}
