import java.util.*;

public class tester{
  public static void main(String arg[]){
    /*StudentDetails obj=new StudentDetails();
    obj.setDetails();
    ArrayList<StudentDetails> al=new ArrayList<StudentDetails>();
    al.add(obj);
    StudentDetails.put(al);
    */
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Roll No. : ");
    DisplayCourses dc = new DisplayCourses(s.next());
    dc.run();
  }
}
