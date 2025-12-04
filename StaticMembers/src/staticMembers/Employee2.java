// Fig. 8.12: Employee2.java
// static variable used to maintain a count of the number of 
// Employee objects in memory.
package staticMembers;


public class Employee2 {
   private static int count = 0; // number of Employees created
   private String firstName;
   private String lastName;
   public static final int COMP_FOUNDATION_YEAR = 1990;

   // initialize Employee, add 1 to static count and 
   // output String indicating that constructor was called
   public Employee2(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;

      ++count;  // increment static count of employees
      System.out.printf("Employee constructor: %s %s; count = %d%n",
         firstName, lastName, count);
   } 

   // get first name
   public String getFirstName() {
      return firstName; 
   } 

   // get last name
   public String getLastName() {
      return lastName; 
   } 

   // static method to get static count value
   public static int getCount() {            
      return count;                          
   } 
} 