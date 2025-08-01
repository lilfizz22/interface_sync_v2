public class Program {
  public static void main(String[] args) {
    SyncEngine syncEng = new SyncEngine();

    System.out.println("** Adding to SyncEngine...");

    syncEng.add(new Contact("Jeremy", "90111222", "jeremy@door.com"));
    syncEng.add(new Task("Do Homework", 1, 8, 2024));

    Task task = new Task("Call Girlfriend", 1, 8, 2024);
    task.setDone(true);
    syncEng.add(task);

    syncEng.add(new Event("OOPJ Exam", "Room 101", 15, 8, 2024, 9, 0));

    syncEng.add(new Note("Shopping List", "Eggs, Milk, Bread"));

    System.out.println("\n** SyncEngine test...");
    syncEng.testSync();
  }
}
