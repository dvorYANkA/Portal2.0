package ua.portal.api.server.services;

import ua.portal.db.model.Teacher;

public interface TeacherService extends CrudService<Teacher, Long>
{
    Teacher findByLastName(String lastName);
}
