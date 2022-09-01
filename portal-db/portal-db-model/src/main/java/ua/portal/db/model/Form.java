package ua.portal.db.model;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Form extends BaseEntity{
    @OneToMany
    @JoinColumn(name = "Form_id")
    private Set<GeneralTask> listOfGeneralTasks = new HashSet<>();

    private boolean algOrGeom;

    public Form(boolean algOrGeom) {
        this.algOrGeom = algOrGeom;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", listOfTaskGenerals=" + listOfGeneralTasks +
                ", algOrGeom=" + algOrGeom +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Form form = (Form) o;

        return id == form.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
