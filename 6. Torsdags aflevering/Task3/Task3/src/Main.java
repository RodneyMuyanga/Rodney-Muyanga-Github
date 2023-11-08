import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> passedCourses1 = new ArrayList<String>();
        ArrayList<String> currentCourses1 = new ArrayList<String>();
        ArrayList<String> canTeach = new ArrayList<String>();

        currentCourses1.add("current: " + "Math");
        currentCourses1.add("current: "+ "Danish");
        currentCourses1.add("current: "+"geography");
        currentCourses1.add("current: "+"Economics");

        passedCourses1.add("Passed: "+"biology");
        passedCourses1.add("Passed: "+"Chemistry");
        passedCourses1.add("Passed: "+"Design");
        passedCourses1.add("Passed: "+"Music");

        canTeach.add("Math");
        canTeach.add("Danish");
        canTeach.add("geography");
        canTeach.add("Economics");
        canTeach.add("biology");
        canTeach.add("Chemistry");
        canTeach.add("Design");
        canTeach.add("Music");
        /*-----------------------------------------------------------------------------------------*/
        Person teacher = new Teacher("John",canTeach,currentCourses1);
        //Person teacher2 = new Teacher("Judith",canTeach,currentCourses);
        //Person teacher3 = new Teacher("Sophia",canTeach,currentCourses);

        /*-----------------------------------------------------------------------------------------*/
        Person student = new Student("Poul",passedCourses1,currentCourses1);
        //Person student2 = new Student("Kim",passedCourses,currentCourses);
        //Person student3 = new Student("Hanna",passedCourses,currentCourses);
        /*-----------------------------------------------------------------------------------------*/
        student.addCourse("German");
        teacher.canTeach("German");
        //student2.addCourse("French");
        //student3.addCourse("biology" + "Math" + "Design");
        System.out.println(student + teacher);
    }

}