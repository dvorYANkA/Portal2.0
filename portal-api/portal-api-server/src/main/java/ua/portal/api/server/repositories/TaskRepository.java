package ua.portal.api.server.repositories;
import ua.portal.db.model.GeneralTask;
import org.springframework.data.repository.CrudRepository;


public interface TaskRepository extends CrudRepository<GeneralTask, Long> {
}
