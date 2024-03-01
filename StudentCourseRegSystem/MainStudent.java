public class MainStudent {
    public static void main(String[] args) {
        Course c=new Course("101","cs","BE",50,"10:00-11:00");

        Course c2=new Course("103","PG-DACA","DIPLOMA",20,"10:00-11:00");
        student s=new student(1,"Akhilesh");
        student s1=new student(2,"pooja");
        //registration
        s.RegristeredCourses(c);
        s1.RegristeredCourses(c2);

        //drop course
        s.droucourse(c);

        //display course
        System.out.println("courses");
        System.out.println(c.getCourseCode() +"\t"+ c.getTitle() +"\t"+c.getDescription() +"\t"+c.getCapacity() +"\t"+c.getAvaliableSlots());
        System.out.println(c2.getCourseCode()+"\t"+c2.getTitle() +"\t"+c2.getDescription() +"\t"+c2.getCapacity() +"\t"+c2.getAvaliableSlots());


    }
}