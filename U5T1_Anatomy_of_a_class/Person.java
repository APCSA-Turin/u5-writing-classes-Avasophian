public class Person 
{
    private String firstName;
    private String lastName;
    private int totalMeetings = 0;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public int getMeetings()
    {
        return totalMeetings;
    }
    
    public void addMeeting()
    {
        totalMeetings ++;
    }

    public void meet(Person person1)
    {
        System.out.println("Hello, my name is " + getFirstName());
        System.out.println("Hi, my name is " + person1.getFirstName());
        totalMeetings += 1;
        person1.addMeeting();
    }
}
