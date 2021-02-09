package repository;
import domain.*;

public class DataRepository {
	   Course c1 = new Course("English Grammar");
	   Course c2 = new Course("Mathematics");
	   Course c3 = new Course("Physics");
	   Course c4 = new Course("Chemistry");
	   Course c5 = new Course("Biology");
	   
	   Teacher t1 = new Teacher("John Smith", c1);
	   Teacher t2 = new Teacher("Lara Gilbert", c2);
	   Teacher t3 = new Teacher("Johanna Kabir", c3);
	   Teacher t4 = new Teacher("Danniel Robertson", c4);
	   Teacher t5 = new Teacher("Larry Cooper", c5);
	                            
	   private Course [] courses = {c1,c2,c3,c4,c5};
	   private Teacher [] teachers = {t1,t2,t3,t4,t5};
	   
	   
	   public Course [] getCourses () {
		   return courses;
	   }
	   
	   public Teacher [] getTeachers () {
		   return teachers;
	   }
	   
}
