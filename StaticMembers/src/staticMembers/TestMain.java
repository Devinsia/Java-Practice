// testing with static count
package staticMembers;

public class TestMain {
   public static void main(String[] args) {
	   
	   // static instance variables or methods can be called or accessed via 
	   		// class or object name (class preferred)
      System.out.printf("Count: %d%n", Employee2.getCount());

      Employee2 e1 = new Employee2("Susan", "Baker");  
    
      System.out.printf("Count: %d%n", e1.getCount());
      
      Employee2 e2 = new Employee2("Bob", "Blue"); 
      System.out.printf("Count: %d%n", e2.getCount());
      
      System.out.printf("Company Foundation year: %d%n", Employee2.COMP_FOUNDATION_YEAR);
      //PackageData packageData = new PackageData(); not in same file , not allowed too use if they dont have specifiers
      
   } 
} 

