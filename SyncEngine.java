import java.util.ArrayList;

public class SyncEngine {
  private ArrayList<String> syncList = new ArrayList<String>();

  public void add(ISyncable item) {
    syncList.add(item.getCode() + ":" + item.encode());
  }

  // test to see if each item can decode itself
  public void testSync() {
    for (String str : syncList) {
      String[] parts = str.split(":");

      // ...existing code...
      if (parts[0].equals("C")) {
        Contact contact = new Contact();
        contact.decode(parts[1]);
      }
      else if (parts[0].equals("T")) {
        Task task = new Task();
        task.decode(parts[1]);
      }
      else if (parts[0].equals("E")) {
        Event event = new Event();
        event.decode(parts[1]);
      }
      else if (parts[0].equals("N")) {
        Note note = new Note();
        note.decode(parts[1]);
      }
      else {
        System.out.println("Unknown item. TestSync() failed.");
      }
// ...existing code...
    }
  }
}
