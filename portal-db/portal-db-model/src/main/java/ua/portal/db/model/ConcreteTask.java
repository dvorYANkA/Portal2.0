package ua.portal.db.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ConcreteTask extends GeneralTask
{
    @ManyToOne
    private Student studentOwner;
    private boolean isDone;

    public ConcreteTask(String description, String title, Form taskForm, Student studentOwner, boolean isDone) {
        super(description, title, taskForm);
        this.studentOwner = studentOwner;
        this.isDone = isDone;
    }
}
