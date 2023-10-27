import java.util.ArrayList;

public class Teacher extends Person
{
    ArrayList<String> canTeach;
    ArrayList<String> currentCourses;
    public Teacher(String name,ArrayList<String>canTeach, ArrayList<String>currentCourses)
    {
        super(name);
        this.currentCourses = currentCourses;
        this.canTeach = canTeach;
    }
    @Override
    public boolean addCourse(String course)
    {
        if(canTeach.contains(course))
        {
            return false;
        }else
        {
            currentCourses.add(course);
        }
        return true;
    }
    public String toString()
    {
        return "Course: " + canTeach;
    }

}