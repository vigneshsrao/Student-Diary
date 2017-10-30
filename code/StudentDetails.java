import java.io.*;
import java.util.*;

public class StudentDetails extends StudentDetailsfh implements Serializable{
  String rollno;
  String name;
  int sem;

  StudentDetails(){
    rollno="";
    name="";
    sem=0;
  }

  StudentDetails(String rno){
    rollno=rno;
    name="";
    sem=0;
  }

  StudentDetails(String rno,String nm,int s){
    rollno=rno;
    name=nm;
    sem=s;
  }

  public boolean equals(StudentDetails obj){
    return this.rollno.equals(obj.getRollno());
  }

  public void setRollno(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Roll no. : ");
    rollno=s.next();
  }

  public String getRollno(){
    return rollno;
  }

  public void setDetails(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Roll no. : ");
    rollno=s.next();
    System.out.print("Enter Name : ");
    name=s.next();
    System.out.print("Enter sem : ");
    sem=s.nextInt();
    System.out.println();
  }

  public String toString(){
    return rollno;
  }

}
