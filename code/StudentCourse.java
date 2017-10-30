import java.io.*;
import java.util.*;

public class StudentCourse extends StudentCoursefh implements Serializable{
  private Course course;
  private char grade;
  private char status;
  private int totcredits;
  private int credits;


  StudentCourse(){
    course = new Course();
    grade='\0';
    status='\0';
    credits=0;
    totcredits=0;
  }

  StudentCourse(Course c,char g,char st,int cred,int totcreds){
    course = c;
    grade=g;
    status=st;
    credits=cred;
    totcredits=totcreds;
  }

  public void getDetails(){
    course.setCourseCode();
    course.map();
    getTotcredits();
    getStatus();
    if(status!='T'){
      getCredits();
      getGrade();
    }
  }

  public void getGrade(){
    Scanner s=new Scanner(System.in);
    while(true){
      System.out.print("Enter grade : ");
      String str = s.next();
      str=str.toUpperCase();
      grade=str.charAt(0);
      if(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='P'||grade=='F'||grade=='\n')
        break;
      else
        System.out.println("Grade must be in range A-D or P or F !");
    }
  }

  public void getStatus(){
    Scanner s=new Scanner(System.in);
    while(true){
      System.out.print("Enter Status of course : Passed(P),Failed(F),Taking(T) :");
      String str = s.next();
      str=str.toUpperCase();
      status=str.charAt(0);
      if(status=='P'||status=='F'||status=='T')
        break;
      else
        System.out.println("Invalid Status !");
    }
  }

  public void getTotcredits(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the Total Credits of this course : ");
    totcredits=s.nextInt();
  }

  public void getCredits(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the credits gained from this course : ");
    credits=s.nextInt();
  }

  public boolean equals(StudentCourse obj){
    return this.course.equals(obj);
  }

  public String toString(){
    String st=null;
    switch(status){
      case 'T':st="Taking";
               break;
      case 'P':st="Passed";
               break;
      case 'F':st="Failed";
               break;
    }
    return course+"\t\t"+totcredits+"\t\t"+st+"\t"+credits+"\t\t"+grade;
  }
}
