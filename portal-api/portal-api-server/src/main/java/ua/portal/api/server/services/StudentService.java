package ua.portal.api.server.services;
import ua.portal.db.model.Student;

public interface StudentService extends CrudService<Student, Long>
{
    Student findByLastName(String lastName);
}
