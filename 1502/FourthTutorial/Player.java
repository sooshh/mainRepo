package FourthTutorial;

import java.time.LocalDate;

public class Player {
    private int jerseyNum;
    private String name;
    private double height;
    private double weight;
    private LocalDate dateOfBirth;
    private String team;

    //Contructors:
    public Player() {
        this.jerseyNum = 67;
        this.name = "Nelson";
        dateOfBirth = LocalDate.now();
    }
    public Player(int jersey, String name) {
        this.jerseyNum = jersey;
        this.name = name;
        dateOfBirth = LocalDate.now();
    }

    public Player(String name, int jersey) {
        this.name = name;
        jerseyNum = jersey;
        dateOfBirth = LocalDate.now();
    }
    public Player(int jersey, String name, double height, double weight) {
        jerseyNum = jersey;
        this.name = name;
        this.height = height;
        this.weight = weight;
        dateOfBirth = LocalDate.now();
    }
    public Player(int jersey, String name, double height, double weight, LocalDate dob) {
        jerseyNum = jersey;
        this.name = name;
        this.height = height;
        this.weight = weight;
        dateOfBirth = dob;
    }
    public Player(int jersey, String name, double height, double weight, LocalDate dob, String team) {
        jerseyNum = jersey;
        this.name = name;
        this.height = height;
        this.weight = weight;
        dateOfBirth = dob;
        this.team = team;
    }
    //public Player(int jerseyNum, String name, double weight, double height) {
        //this.jerseyNum = jerseyNum;
        //this.name = name;
        //this.height = height;
        //this.weight = weight;
    //}


    //Setters and Getters:
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

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    public String getTeam() {
        return this.team;
    }

    //Methods:
    public int getAge() {
        //return -1;
        int currentYr = LocalDate.now().getYear();
        int birthYr = getDateOfBirth().getYear();
        return (currentYr-birthYr);
    }
}
