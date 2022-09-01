package ua.portal.api.server.services.map;

import ua.portal.api.server.services.CrudService;
import ua.portal.db.model.ConcreteTask;

import java.util.Set;

public class ConcreteTaskServiceMap extends AbstractMapService<ConcreteTask, Long> implements CrudService<ConcreteTask, Long> {
    @Override
    public Set<ConcreteTask> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(ConcreteTask object) {
        super.delete(object);
    }

    @Override
    public ConcreteTask findById(Long id) {
      return   super.findByID(id);
    }

    @Override
    public ConcreteTask save(ConcreteTask object) {
        return super.save(object.getId(), object);
    }
}
