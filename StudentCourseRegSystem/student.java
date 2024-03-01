import java.util.ArrayList;
import java.util.List;

public class student {
    private int studentId;
    private String name;
    private List<Course> regristeredCourses;

    public student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.regristeredCourses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getRegristeredCourses() {
        return regristeredCourses;
    }

    public void setRegristeredCourses(List<Course> regristeredCourses) {
        this.regristeredCourses = regristeredCourses;
    }

    public void RegristeredCourses(Course course){
        regristeredCourses.add(course);
        course.enrollStudent(this);

    }
    public void droucourse(Course course){
        regristeredCourses.remove(course);
        course.removeStudent(this);
    }

}