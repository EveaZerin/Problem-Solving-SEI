import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Task_2
{
 public static void main (String[] args) throws java.lang.Exception
 {
  // your code goes here
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter total number of bags");
  int num_of_bags=sc.nextInt();
  float arr [] = new float [num_of_bags];
  
  for(int i=0; i<num_of_bags;i++){
   arr[i] = sc.nextFloat();
  }
  
  Arrays.sort(arr);
  
  
  System.out.println(efficientJanitor(arr));
  
  sc.close();
  
 }
 
 public static int efficientJanitor(float arr[]){
   float sum=0;
   int count=0;
   for(int i=arr.length-1; i>=0;i--){
     if(arr[i]>1.99f){
       count++;
     }
   }
   
   for(int c=0; c<=(arr.length-count)/2; c++){
     if((arr[c]+arr[arr.length-count-c-1])<=3.0f){
       count++;
     } 
    }
   return count;
 }
}


  