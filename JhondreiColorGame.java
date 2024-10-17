
import java.util.Random;
import java.util.Scanner;

public class JhondreiColorGame {
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] colors = {"GREEN", "BLUE", "YELLOW", "PINK", "RED", "GRAY"};
        int balance = 200;
        while (balance >= 50){
            System.out.println(ANSI_PURPLE + "Do you want to participate on the Color Game? (Yes/No)" + ANSI_RESET);
            String cont = scanner.nextLine();
            String con = cont.toLowerCase();
                if (con.equals("no")){
                    System.out.println("Your final balance is: " + balance);
                    System.out.println("Exiting...");
                    break;
                } else if (!con.equals("yes")){
                    System.out.println("Please either input Yes or No");
                }
            System.out.println("Welcome to the Color Game!");
            System.out.println( ANSI_GREEN + "Your current balance is: " + balance  + ANSI_RESET );
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                
            }
            System.out.println("Pick a color! (50 PHP will be deducted)");
            System.out.println("Available colors: Green, Blue, Yellow, Pink, Red, Gray");
            String lockedcolor = scanner.nextLine().toUpperCase();
            System.out.println("The color you locked in is: "+ lockedcolor);
            Random rand = new Random();
            int randindex1 = rand.nextInt(colors.length);
            int randindex2 = rand.nextInt(colors.length);
            int randindex3 = rand.nextInt(colors.length);
            String winone = colors[randindex1];
            String wintwo = colors[randindex2];
            String wintres = colors[randindex3];
            String win1 = winone.toUpperCase();
            String win2 = wintwo.toUpperCase();
            String win3 = wintres.toUpperCase();
            int win = 0;
            System.out.println("Loading winning colors...");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                
            }
            System.out.println("The winning colors are...");
            System.out.println("-------------------------");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                
            }
            System.out.println(win1);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                
            }
            System.out.println(win2);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                
            }
            System.out.println("AND...");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                
            }
            System.out.println(win3 + "!!!");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                
            }
                if (lockedcolor.equals(win1)){
                    win++;
                }
                if (lockedcolor.equals(win2)){
                    win++;
                }
                if (lockedcolor.equals(win3)){
                    win++;
                }
                if (win > 0){
                    System.out.println("You successfully won " + win + " times!");
                    balance += 50 * win;
                    System.out.println("Your new balance is: "+ balance);
                }
                else{
                    System.out.println("You lose :( ");
                    balance -= 50;
                    System.out.println("Your new balance is: "+ balance);
                }   
            }               
    }
}
