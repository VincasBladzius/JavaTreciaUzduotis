package players;

public class Player<T> implements Comparable<Player>{
    private String firstName;
    private String lastName;
    protected String nationality;
    private double totalPoints;
    private int matchPoints;
    DataFaker faker = new DataFaker();

    public Player() {
      setFirstName();
       setLastName();
    }//ctor

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        this.firstName = faker.GenerateName()[0];;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = faker.GenerateName()[1];;
    }

    public double getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(double matchPoints) {
        this.totalPoints += matchPoints;
    }

    public int getMatchPoints() {
        return matchPoints;
    }

    public void setMatchPoints() {
        this.matchPoints = faker.GeneratePoints();;
    }
    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return getFirstName() + ' ' + " " + getLastName() + ' ' + getNationality() + " Points: " + String.format("%.2f", getTotalPoints()/8);
    }

    @Override
    public int compareTo(Player o) {
        if(this.getTotalPoints() < o.getTotalPoints()){
            return 1;
        }else{
            return -1;
        }
    }
}
