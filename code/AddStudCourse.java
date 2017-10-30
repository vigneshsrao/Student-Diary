import java.util.*;
import java.io.*;

public class AddStudCourse extends CourseManip{
  StudentCourse sc;

  AddStudCourse(String roll){
    sc=new StudentCourse();
    studDet=new StudentDetails(roll);
  }

  public void Add(){
    //studDet.setRollno();
    if(getCourses()==false)
        return;
    sc.getDetails();
    studCourseList.add(sc);
    StudentCourse.put(studCourseList,studDet.getRollno());
  }

}
