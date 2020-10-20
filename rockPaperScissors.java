 /* 
       Created By: Jacob Sunia
 Time : 13:03    Date     : Tuesday July 28, 2020
 Class: CS-21    Professor: Kimberly Davis
 CLNo.: 50963    Project  : RockPaperScissors
 */
import java.util.*;
import java.io.*;

public class rockPaperScissors{
    public static void main(String[] args){
        loop();
    }
    public static void loop() {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int input; 
        int n = 1;
        int count = 0, win = 0, loss = 0, tied = 0;
        
        
        System.out.println("Welcome to The Rock Paper Scissors Game");
        
        System.out.println("Please Pick From the following Option:");
        System.out.println("1: Rock; 2: Paper; 3: Scissors");
        
        while (n != 0) {
            int ro = 1, pa = 2, si = 3; // ro for rock; pa paper; si for scissors
            int rock = 1, paper = 2, scis = 3;
            
            input = sc.nextInt();
            int rand = ran.nextInt(3) + 1; //generating a number 1-3; +1 releasing the integer 0
            
            if (rand == rock) {
                if (input == ro){
                    System.out.println("Rock v. Rock - Game Tied");
                    tied++;
                }
                else if (input == pa){
                    System.out.println("Paper v. Rock - You Win");
                    win++;
                }
                else if (input == si){
                    System.out.println("Scissors v. Rock - You Lose");
                    loss++;
                }
            }
            else if (rand == paper) {
                if (input == ro) {
                    System.out.println("Rock v. Paper - You Lose");
                    loss++;
                }
                else if (input == pa) {
                    System.out.println("Paper v. Paper - Game Tied");
                    tied++;
                }
                else if (input == si) {
                    System.out.println("Scissors v. Paper - You Win");
                    win++;
                }
            }
            else if (rand == scis) {
            if (input == ro) {
                    System.out.println("Rock v. Scissors - You Win");
                    win++;
                }
                else if (input == pa) {
                    System.out.println("Paper v. Scissors - You Lose");
                    loss++;
                }
                else if (input == si) {
                    System.out.println("Scissors v. Scissors - Game Tied");
                    tied++;
                }
            }
            count++;
            String ch;
            System.out.println("Play Again(Y/N)");
            ch = sc.next();
            
            if (ch.equalsIgnoreCase("Y")){
                n = 1;
                System.out.println("1: Rock; 2: Paper; 3: Scissor");
            }
            else if (ch.equalsIgnoreCase("N")) {
                System.out.println("Thank You For Playing! ");
                System.out.println("Total Times Played: " +count);
                System.out.println("Total Wins: " +win);
                System.out.println("Total Losses: " +loss);
                System.out.println("Total Ties: " +tied);
                break;
            }
         }
     }
}
