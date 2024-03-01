import java.util.ArrayList;
import java.util.List;

class Course {
    private String CourseCode;
    private String title;
    private String description;
    private int capacity;
    private String schedule;
    private List<student> enrollstud;

     public Course(String courseCode, String title, String description, int capacity, String schedule) {
        this.CourseCode = courseCode;
         this.title = title;
         this.description = description;
         this.capacity = capacity;
         this.schedule = schedule;
         this.enrollstud = new ArrayList<>();
     }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public List<student> getEnrollstud() {
        return enrollstud;
    }

    public void setEnrollstud(List<student> enrollstud) {
        this.enrollstud = enrollstud;
    }

    public int getAvaliableSlots(){
         return capacity-enrollstud.size();
     }
     public boolean enrollStudent(student stud){
         if(enrollstud.size()<capacity){
             enrollstud.add(stud);
             return true;
         }
         return false;


     }
     public void removeStudent(student stud){
         enrollstud.remove(stud);
     }
 }