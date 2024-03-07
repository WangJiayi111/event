import java.time.LocalDate;
import java.util.ArrayList;

public class event {
        private String eventID;
        private String eventName;
        private String eventVenue;
        private LocalDate eventDate;
        private ArrayList<String> eventAttendees;

        public event(String eventID,String eventName,String eventVenun,LocalDate eventDate){
            this.eventID=eventID;
            this.eventName=eventName;
            this.eventVenue=eventVenun;
            this.eventDate=eventDate;
      
            this.eventAttendees = new ArrayList<>();
        }
        

        public String getEventID() {
            return eventID;
        }

        public void setEventID(String eventID) {
            this.eventID = eventID;
        }

        public String getEventName() {
            return eventName;
        }

        public void setEventName(String eventName) {
            this.eventName = eventName;
        }

        public String getEventVenue() {
            return eventVenue;
        }

        public void setEventVenue(String eventVenue) {
            this.eventVenue = eventVenue;
        }

        public LocalDate getEventDate() {
            return eventDate;
        }

        public void setEventDate(LocalDate eventDate) {
            this.eventDate = eventDate;
        }


        public ArrayList<String> getEventAttendees() {
            return eventAttendees;
        }


        public void setEventAttendees(ArrayList<String> eventAttendees) {
            this.eventAttendees = eventAttendees;
        }



        public void addAttendee(String attendeeName) {
            eventAttendees.add(attendeeName);
        }
    
        public void removeAttendee(String attendee) {
            eventAttendees.remove(attendee);
        }
    
        public void updateAttendee(String attendee_old, String attendee_new) {
            if (eventAttendees.contains(attendee_old)) {
                int index = eventAttendees.indexOf(attendee_old);
                eventAttendees.set(index, attendee_new);
            }
        }
    
        public boolean findAttendee(String attendee_find) {
            return eventAttendees.contains(attendee_find);
        }
    
        public int getTotalAttendees() {
           return eventAttendees.size();
        }
         

    @Override
    public String toString() {
        return "The details of event:"+
        "\nEvent ID: " + eventID +
        "\nEvent Name: " + eventName +
        "\nEvent Venue: " + eventVenue +
        "\nEvent Date: " + eventDate +
        "\nEvent Attendees: " + eventAttendees;
    }
}



