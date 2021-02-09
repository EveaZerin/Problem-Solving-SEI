package domain;

public class Course {
	private String courseName = "";
	
	public Course(String course){
	    courseName = course;
	  }
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
