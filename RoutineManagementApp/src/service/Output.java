package service;
import repository.*;

public class Output {

	DataRepository repo;
	
	public Output() {
		repo = new DataRepository();
	}
	
	
	public void listCourses() {
		String info = "";
		for (int i = 0; i < repo.getCourses().length; i++) {
			info = info + (i + 1) + ". " + repo.getCourses()[i].getCourseName() + "\n";
		}
		System.out.println(info);
	}

	public void listDetails() {
		String info = "";
		for (int i = 0; i < repo.getTeachers().length; i++) {
			info = info + repo.getTeachers()[i].getCourseName() + ", " + repo.getTeachers()[i].getTeacherName() + "\n";
		}
		System.out.println(info);
	}
	
	public String routineGenerator(String routine) {
		String newRoutine = "";
		int count = 0;
		String [] lines = routine.split("\n");
		
		while (count < lines.length) {
			

			String[] line = lines[count].split(" ");
			newRoutine = newRoutine + line[0] + " " + line[1] + " "
					+ repo.getCourses()[Integer.parseInt(line[2])].getCourseName() + "\n";
			count++;

		}
		
		return newRoutine;
	
	}
	

}
