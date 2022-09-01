package ua.portal.db.model;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class User extends BaseEntity
{
    String firstName = "";
    String lastName = "";

    //TODO: link to teacher, form;
}