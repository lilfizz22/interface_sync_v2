public class Program {
  public static void main(String[] args) {
    SyncEngine syncEng = new SyncEngine();

    System.out.println("** Adding to SyncEngine...");

    // add contact
    syncEng.add(new Contact("Jeremy", "90111222", "jeremy@door.com"));
    syncEng.add(new Task("Do Homework", 1, 8, 2024));

    Task task = new Task("Call Girlfriend", 1, 8, 2024);
    task.setDone(true);
    syncEng.add(task);

    // add event
    syncEng.add(new Event("OOPJ Exam", "Room 101", 15, 8, 2024, 9, 0));

    // add note
    syncEng.add(new Note("Shopping List", "Eggs, Milk, Bread"));

    // sync test
    System.out.println("\n** SyncEngine test...");
    syncEng.testSync();
  }
}