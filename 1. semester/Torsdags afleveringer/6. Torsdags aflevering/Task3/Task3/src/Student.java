import java.util.ArrayList;

public class Student extends Person
{
    ArrayList<String> passedCourse;
    ArrayList<String> currentCourses;
    public Student(String name,ArrayList<String>passedCourse, ArrayList<String>currentCourses)
    {
        super(name);
        this.currentCourses = currentCourses;
        this.passedCourse = passedCourse;
    }
    @Override
    public boolean addCourse(String course)
    {
        if(passedCourse.contains(course))
        {
            return false;
        }else
        {
            currentCourses.add(course);
            return true;
        }
    }
    public String toString()

    {
        return "Course: " + passedCourse + currentCourses;
    }

}