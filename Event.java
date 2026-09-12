public class Event {

    String name;
    String location;
    String date;
    String time;
    int tickets;

    public Event(String name, String location, String date,
                 String time, int tickets) {

        this.name = name;
        this.location = location;
        this.date = date;
        this.time = time;
        this.tickets = tickets;
    }

    public String getDetails() {

        return "Event: " + name +
               "\nLocation: " + location +
               "\nDate: " + date +
               "\nTime: " + time +
               "\nAvailable Tickets: " + tickets;
    }
}
