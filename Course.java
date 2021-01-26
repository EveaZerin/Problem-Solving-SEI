public class Course{
  private String course_name = "";
  private String teacher_name = "";
  
  public Course(String c, String n){
    course_name=c;
    teacher_name=n;
  }
  
  public String getCourse(){
    return course_name;
  }
  public String getTeacher(){
    return teacher_name;
  }
}