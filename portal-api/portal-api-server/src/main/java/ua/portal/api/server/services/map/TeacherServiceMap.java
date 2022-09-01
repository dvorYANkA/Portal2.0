package ua.portal.api.server.services.map;

import ua.portal.api.server.services.CrudService;
import ua.portal.db.model.Teacher;

import java.util.Set;

public class TeacherServiceMap extends AbstractMapService<Teacher, Long> implements CrudService<Teacher,Long> {

    @Override
    public Set<Teacher> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Teacher object) {
        super.delete(object);
    }

    @Override
    public Teacher findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Teacher save(Teacher object) {
        return super.save(object.getId(), object);
    }
}
