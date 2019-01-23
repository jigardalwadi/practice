import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ArrayList;


public class SortArrayListObject{
  public static void main(String args[]){
    Student s1  = new Student("jigar", "dalwadi",3);
  
    

        ArrayList<Student> studList = new ArrayList<Student>();
        studList.add(s1);
        studList.add(new Student("yash", "Bhatt",5));
        studList.add(new Student("raj","vora",1));
        
        
        Iterator<Student> it = studList.iterator();
        
        
        while(it.hasNext()) {
        	Student newstud = it.next();
        	System.out.println(newstud.getFirstName() + " " + newstud.getLastName() + " " + newstud.getId());
        	
        }
        		
        		
         
        System.out.println("after");
        // Collections.sort with an object comparision
        //According to first name
        
        //if there are getter and setters then use this
        Collections.sort(studList,new Comparator<Student>(){
        	public int compare(Student s1, Student s2) {
        		return ((String)s1.getFirstName()).compareTo((String)(s2.getFirstName()));
        	}
        });
        
        // if it's in the same class then
       /* Collections.sort(studList, new Comparator<Student>(){
             public int compare(Student s1, Student s2) {
               return s1.var1-s2.var2;
            }
        });*/
        studList.listIterator();
        
        System.out.println(studList);
  }
}