import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
 public static void main (String[] args) throws java.lang.Exception
 {
   //courses and teachers info
   
   Course c1 = new Course("English Grammar", "John Smith");
   Course c2 = new Course("Mathematics", "Lara Gilbert");
   Course c3 = new Course("Physics", "Johanna Kabir");
   Course c4 = new Course("Chemistry", "Danniel Robertson");
   Course c5 = new Course("Biology", "Larry Cooper");
                            
   Course [] courses = {c1,c2,c3,c4,c5};
                          
  
  // user interface 
  Scanner sc = new Scanner(System.in);
  String routine = "";
  
  while(true){
    System.out.println("Enter your required option:");
    System.out.println("A. Create Routine\nB. Show Routine\nC. List Courses with Teachers Name");
    String inp = sc.nextLine();
    
    if(inp.equals("A")){
      System.out.println(listCourses(courses));
      System.out.println("Please provide the required dayIndex(0 - 4) hourIndex(0 - 3) courseIndex");
      
      int count = 1;
      while(count<=4){
        count++;
      
        String secondInput=sc.nextLine();
     
        String [] line = secondInput.split(" ");       
        routine = routine +line[0]+" "+line[1]+" "+courses[Integer.parseInt(line[2])].getCourse()+"\n";  
      }
      
    }else if(inp.equals("B")){
      System.out.println("The full class plan is:");
      if(routine.equals("")){
        System.out.println("No routine! Go to option A.");
      }else{
        System.out.println(routine);
      }
     
    }else if(inp.equals("C")){
      System.out.println(listDetails(courses));
      break;
    }
  }
 }
 
 public static String listCourses(Course [] courses){
   String info = "";
   for(int i=0; i<courses.length;i++){
     info=info+(i+1)+". "+courses[i].getCourse()+"\n";
   }
   return info;
 }
 
  public static String listDetails(Course [] courses){
   String info = "";
   for(int i=0; i<courses.length;i++){
     info=info+courses[i].getCourse()+", "+courses[i].getTeacher()+"\n";
   }
   return info;
 }
}

