package domain;

public class Teacher {
	private String teacherName = "";
	private Course course;
	
	public Teacher(String name, Course c){
	    teacherName = name;
	    this.course=c;
	}
	
	public String getTeacherName() {
		return teacherName;
	}
	
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	public String getCourseName() {
		return course.getCourseName();
	}
	
}
