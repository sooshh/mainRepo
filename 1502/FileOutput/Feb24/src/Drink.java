public class Drink {
    private static final double BASE_PRICE = 0.99;
    private static final double PRICE_MULTIPLIER = 0.20;

    private String name;
    private int size;
    private double basePrice;

    //
    // constructors
    //
    public Drink(String name) {
        this.name = name;
        this.size = 6;
        this.basePrice = Drink.BASE_PRICE;
    }

    public Drink(String name, int size) {
        this.name = name;
        this.size = size;
        this.basePrice = Drink.BASE_PRICE;
    } 

    public Drink(String name, int size, double basePrice) {       
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
    }

    //
    // getters and setters
    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    //
    // method overrides
    //
    @Override
    public String toString() {
        String strRet = "";
        strRet += getName() + ", ";
        strRet += getSize() + " oz, "; 
        strRet += String.format("$%4.2f", calculatePrice());

        return strRet;
    }
 
    //
    // class methods
    //
    public double calculatePrice() {
        double price = getSize() * getBasePrice() * Drink.PRICE_MULTIPLIER;
        return price;
    }   
}