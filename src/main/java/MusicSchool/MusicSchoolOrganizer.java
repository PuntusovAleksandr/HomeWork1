package MusicSchool;

import java.util.List;

/**
 * Created by Aleksandr on 27.02.2015.
 */
public interface MusicSchoolOrganizer {
    void  addNewStudent(Student student, SchoolClass schoolClass);
    void  deleteStudentFromClass(Student student, SchoolClass schoolClass);
    List<Student> getAllStudents();
    List<Student> getStudentsFromClass(SchoolClass schoolClass);
    void shedulePerfomance(Performance performance);
}
