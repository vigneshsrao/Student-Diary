import java.util.*;
import java.io.*;

public class Course extends Coursefh implements Serializable{
  String code;
  String name;

  Course(){
    code="";
    name="";
  }

  Course(String cd,String nm){
    code=cd;
    name=nm;
  }

  public void setDetails(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Course Code : ");
    code=s.next();
    System.out.print("Enter Course Name : ");
    name=s.next();
    System.out.println();
  }

  public void setCourseCode(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Course Code : ");
    code=s.next();
  }

  public String getCourseName(){
    return name;
  }

  public String getCourseCode(){
    return code;
  }

  public void map(){
    ArrayList<Course> al=Course.get();
    for(Course obj:al){
      if(this.equals(obj)==true){
        this.name=obj.getCourseName();
        break;
      }
    }
  }

  public boolean equals(Course c){
    return this.code.equals(c.code);
  }

  public String toString(){
    return "\t"+code+"\t"+name;
  }

}
