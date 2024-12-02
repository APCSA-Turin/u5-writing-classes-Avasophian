
public class Main {
  public static void main(String[] args) {
    Student alan = new Student("Alan Turing", 11, "Brooklyn Tech");
    Student geena = new Student("Geena Davis", 7, "Academy Middle School");
    Student paul = new Student("Paul Rudd", 2, "Bright Elementary School");
    Student ada = new Student("Ada Lovelace", 5);
    Student mary = new Student("Mary Truman", 6);
    Student cindy = new Student("Cindy Long", 10);
    Student martha = new Student("Martha Stewart", 0);
    Student rod = new Student("Rod Stewart", 13);

    System.out.println(alan.studentInfo());
    System.out.println(geena.studentInfo());
    System.out.println(paul.studentInfo());
    System.out.println(ada.studentInfo());
    System.out.println(mary.studentInfo());
    System.out.println(cindy.studentInfo());
    System.out.println(martha.studentInfo());
    System.out.println(rod.studentInfo());
  }
}
