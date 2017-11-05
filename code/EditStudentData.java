public class EditStudentData extends StudentManip{

  EditStudentData(){
    super();
  }

  public void edit(){
    //System.out.print("Enter Rollno of Student to Edit: ");
    studDet.setRollno();
    int idx=search(studDet);
    if(idx!=-1){
      editData(idx);
    }
    else{
      System.out.println("No such entry !!");
    }
  }

  public void editData(int idx){
    System.out.println("Enter new details. Press enter to keep old values :");
    StudentDetails toEdit=studentList.get(idx);
    studentList.remove(idx);
    toEdit.setDetails();
    studentList.add(idx,toEdit);
    StudentDetails.put(studentList);
  }
}
