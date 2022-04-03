public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double coffeePrice = 4.0;
        double lattePrice = 4.5;
        double cappuccinoPrice = 5.0;

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer4 = "Jimmy";
        String customer3 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        //  Cindhuri
        System.out.println(customer1 + pendingMessage);

        // Noah
        if(isReadyOrder3) {
            System.out.println(customer3 + readyMessage + " and " + displayTotalMessage + cappuccinoPrice);
        }
        else {
            System.out.println(customer3 + pendingMessage);
        }

        // Sam
        System.out.println(customer2 + ", " + displayTotalMessage + mochaPrice *2);
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer3 + pendingMessage);
        }
        // Jimmy
        System.out.println(customer4 +  displayTotalMessage+ " back that we owe you is " + (lattePrice-coffeePrice));
    }
}




