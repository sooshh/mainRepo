public class Driver {
    public static void main(String [] args) {
        String triggerWord = "sixseven";
        PeevishPeter pete = new PeevishPeter(triggerWord);
        int response = pete.openingStatement();
        System.out.println("[PETE]: " + response);
    }
}
