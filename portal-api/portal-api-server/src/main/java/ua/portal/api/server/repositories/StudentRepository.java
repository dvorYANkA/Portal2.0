package ua.portal.api.server.repositories;
import ua.portal.db.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
