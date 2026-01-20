package SeccondTutorial;
import java.util.Date;
public class Player {
    private int jerseyNum;
    private String name;
    private double height;
    private double weight;
    private Date dateOfBirth;
    private String team;

    public Player() {
        this.jerseyNum = 67;
        this.name = "Nelson";
    }
    //public Player(int jersey, String name) {
        //this.jerseyNum = jersey;
        //this.name = name;
    //}



    public void setJerseyNum(int jersey) {
        this.jerseyNum = jersey;
    }
    public int getJerseyNum() {
        return this.jerseyNum;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public Double getHeight() {
        return this.height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return this.weight;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    public String getTeam() {
        return this.team;
    }

}
