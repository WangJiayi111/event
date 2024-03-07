import java.util.Scanner;
import java.time.LocalDate;


public class Main {
     public static void main(String[] args) throws Exception{
    System.out.println("Enter the total number of people attending the event:");
    Scanner reader = new Scanner(System.in);
    int count = reader.nextInt();
    reader.nextLine();
 
    System.out.println("Enter event ID:");
    String eventID = reader.nextLine();
    System.out.println("Enter event Name:");
    String eventName = reader.nextLine();
    System.out.println("Enter event Venue:");
    String eventVenue = reader.nextLine();
    System.out.println("Enter event date(YYYY-MM-DD):");
    String eventDateInput = reader.nextLine();
    LocalDate eventDate = LocalDate.parse(eventDateInput);

    event event = new event(eventID,eventName,eventVenue,eventDate);

    for(int i=0;i<count;i++){
        System.out.println("Enter attendee name" + (i+1) + ":");
        String attendeeName = reader.nextLine();
        event.addAttendee(attendeeName);
    }
    
    organizeEvent(event);
    System.out.println(event);
    reader.close();
}


    public static void organizeEvent(event event) {
        System.out.println("Now you can do the following:");
        System.out.println("1.Add attendee");
        System.out.println("2.Remove attendee");
        System.out.println("3.Update attendee");
        System.out.println("4.Find a single attendee");
        System.out.println("5.Get total number of attendees");
        System.out.println("6.Do nothing");
        System.out.println("Enter the choice what you want to do(1-6):");
        Scanner reader=new Scanner(System.in);
        int choice=reader.nextInt();

        switch (choice) {
            case 1:
            System.out.println("Enter the name of the attendee you want to add:");
            Scanner name_add=new Scanner(System.in);
            String attendeeName=name_add.nextLine();
            event.addAttendee(attendeeName);
            break;
        
            case 2:
            System.out.println("Enter the name of the attendee you want to remove:");
            Scanner name_remove=new Scanner(System.in);
            String attendee=name_remove.nextLine();
            event.removeAttendee(attendee);
            break;

           
            case 3:
            System.out.println("Enter the name of the attendee you want to update:");
            Scanner name_old=new Scanner(System.in);
            String attendee_old=name_old.nextLine();

            System.out.println("Enter a new attendee name:");
            Scanner name_new=new Scanner(System.in);
            String attendee_new=name_new.nextLine();
            event.updateAttendee(attendee_old,attendee_new);
            break;
            
            
            case 4:
            System.out.println("Enter the name of the attendee you want to find:");
            String attendee_find=reader.next();
            if(event.findAttendee(attendee_find)){
                System.out.println("Found it.");
            }else{
                System.out.println("Did not find.");
            }
            break;

            case 5:
            int totalAttendees=event. getTotalAttendees();
            System.out.println("The total number of attendees is"+totalAttendees);
            break;

            case 6:
            System.out.println("EXIT.");
            break;
        }

        reader.close();

    }
    
}
