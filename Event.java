public class Event implements ISyncable {
    private String name;
    private String location;
    private int day, month, year;
    private int hour, minute;

    public Event() {}

    public Event(String name, String location, int day, int month, int year, int hour, int minute) {
        this.name = name;
        this.location = location;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }

    public String getCode() {
        return "E";
    }

    public String encode() {
        String str = String.format("%s|%s|%d|%d|%d|%d|%d", name, location, day, month, year, hour, minute);
        System.out.println("Event encoded successfully.");
        return str;
    }

    public void decode(String str) {
        String[] parts = str.split("\\|");
        if (parts.length != 7) {
            System.out.println("Incorrect Event format. Decode unsuccessful.");
            return;
        }
        name = parts[0];
        location = parts[1];
        day = Integer.parseInt(parts[2]);
        month = Integer.parseInt(parts[3]);
        year = Integer.parseInt(parts[4]);
        hour = Integer.parseInt(parts[5]);
        minute = Integer.parseInt(parts[6]);
        System.out.println("Event decoded successfully.");
    }
}
