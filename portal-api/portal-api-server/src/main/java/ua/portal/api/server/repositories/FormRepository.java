package ua.portal.api.server.repositories;
import ua.portal.db.model.Form;
import org.springframework.data.repository.CrudRepository;

public interface FormRepository extends CrudRepository<Form, Long> {
}
