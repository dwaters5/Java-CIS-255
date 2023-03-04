import java.util.Scanner;



 class HW_LeapYear {
    public static void main(String[] args){

     
     
     int Year;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a year :");
      Year = sc.nextInt();
    
      if(Year % 400 == 0) {
         System.out.println("Given year is a leap year!");
      }
      
      else 
      {
         if(Year % 100 == 0){
            System.out.println("Given year is not a leap year!");
         }
         
         else
         {
            if(Year % 4 == 0){
               System.out.println("Given year is a leap year!");
            }
         
            else
            {
               System.out.println("Given year is not a leap year!");
            
            }
         
         
         }
      
      
      
      }
  
      
   
   
   }

    
    

}