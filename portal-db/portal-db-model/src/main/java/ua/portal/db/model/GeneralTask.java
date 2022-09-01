package ua.portal.db.model;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class GeneralTask extends BaseEntity {
    private String description;

    private String title;

    @ManyToOne
    private Form taskForm;

    @Override
    public String toString() {
        return "GeneralTask{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeneralTask generalTask = (GeneralTask) o;

        return id == generalTask.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
