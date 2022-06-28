import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        School school = new School("ALex's school");
        Mentor mentor = new Mentor("Alex", localDate, "+40770707077", Module.OOP,999999, Language.JAVA_SE);
        Student student = new Student("Alex2", localDate,"+40770707077", Module.OOP);
        Student student2 = new Student("Alex3", localDate,"+40770707077", Module.PYTHON);
        Student student3= new Student("Alex4", localDate,"+40770707077", Module.ADVANCED);
        Student student4 = new Student("Alex5", localDate,"+40770707077", Module.WEB);
        Student student5 = new Student("Alex6", localDate,"+40770707077", Module.OOP);
        school.hireMentor(mentor);
        school.acceptStudent(student);
        school.acceptStudent(student2);
        school.acceptStudent(student3);
        school.acceptStudent(student4);
        school.acceptStudent(student5);
        school.assignMentor(mentor, Module.OOP);
        school.assignMentor(mentor, Module.PYTHON);
        System.out.println(school.getStudents(Module.OOP));
        System.out.println(student2.getCurrentModule().nextModule());
        System.out.println(student4.getCurrentModule().nextModule());
        System.out.println(student.getCurrentModule().nextModule());
        System.out.println(student3.getCurrentModule().nextModule());
        mentor.learnLanguage(Language.PYTHON);
        school.assignMentor(mentor, Module.PYTHON);
    }
}
