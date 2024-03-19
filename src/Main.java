import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception{
        Scanner reader = new Scanner(System.in);
    
        event event =new event(null, null, null, null, null, null);
    
    
        int choice=0;
    
        do{
            System.out.println("\n" + "Here is what you can do in the program" + "\n");
            System.out.println("Type 1 to enter event details:");
            System.out.println("Type 2 to enter attendee names that are coming to the event:\"");
            System.out.println("Type 3 to remove attendee");
            System.out.println("Type 4 to update attendee");
            System.out.println("Type 5 to find a single attendee");
            System.out.println("Type 6 to display all the attendees from the event ");
            System.out.println("Type 7 Handle complementary passes");
            System.out.println("Type 8 Handle performances");
            System.out.println("Type 9 Get seat details");
            System.out.println(" Type 10 to QUIT:"+"\n");
        
            choice=reader.nextInt();
            event.organizeEvent(choice);
        
    
        
    }while(choice!=10);
   

    reader.close();
}
     

    
    
    
    

}
   