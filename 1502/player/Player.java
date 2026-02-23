import java.time.LocalDate;

/**
 * This is what the class-level JavaDoc could look like
 * 
 * @author Apoorve Chokshi
 */
public class Player {
    private int jerseyNum;
    private String name;
    private double height;
    private double weight;
    private LocalDate dateOfBirth;
    private String team;

    /**
     * JavaDoc for the 0-parameter constructor
     */
    public Player() {
        this.jerseyNum = 22;
        this.name = "Apoorve Chokshi";
        // by default set the date of birth to 'now'
        dateOfBirth = LocalDate.now();
    }

    public Player(int jerseyNum, String name) {
        this.jerseyNum = jerseyNum;
        this.name = name;

        dateOfBirth = LocalDate.now();
    }

    public Player(String name, int jerseyNum) {
        this.jerseyNum = jerseyNum;
        this.name = name;

        dateOfBirth = LocalDate.now();
    }

    public Player(int jerseyNum, String name, double height, double weight) {
        this.jerseyNum = jerseyNum;
        this.name = name;
        this.height = height;
        this.weight = weight;

        dateOfBirth = LocalDate.now();
    }

    public Player(int jerseyNum, String name, double height, double weight, LocalDate dateOfBirth) {
        this.jerseyNum = jerseyNum;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }

    public Player(int jerseyNum, String name, double height, double weight, LocalDate dateofBirth, String team) {
        this.jerseyNum = jerseyNum;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.dateOfBirth = dateofBirth;
        this.team = team;
    }

    public int getJerseyNum() {
        return jerseyNum;
    }

    public void setJerseyNum(int jerseyNum) {
        this.jerseyNum = jerseyNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getDateofBirth() {
        return dateOfBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateOfBirth = dateofBirth;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * Using the information already in the class, namely the date of birth
     * this method will calculate and return the Player's age based on the formula
     * of current year minus the Player's date of birth year
     * */
    public int getAge() {
        // get today's year from LocalDate.now()
        int todayYear = LocalDate.now().getYear();

        // retrieve the year from the Player's date of birth
        int birthYear = this.getDateofBirth().getYear();

        int yearsOld = todayYear - birthYear;

        // return -1;       // this was the placeholder value when I didn't have the formula in place
        return yearsOld;
    }

    @Override
    /**
     * This JavaDoc should indicate what will be printed when an object of this class is printed
     */
    public String toString() {
        String formattedOutput = "";

        formattedOutput += getName() + ", #:" + getJerseyNum() + ", age: " + getAge() + ", team: " + getTeam();

        return formattedOutput;
    }
}