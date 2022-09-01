package ua.portal.api.server.services.map;

import ua.portal.api.server.services.CrudService;
import ua.portal.db.model.GeneralTask;

import java.util.Set;

public class GeneralTaskServiceMap extends AbstractMapService<GeneralTask, Long> implements CrudService<GeneralTask, Long> {
    @Override
    public Set<GeneralTask> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(GeneralTask object) {
        super.delete(object);
    }

    @Override
    public GeneralTask findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public GeneralTask save(GeneralTask object) {
        return super.save(object.getId(), object);
    }
}
