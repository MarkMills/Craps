//////////////////////////////////////////////////////////////////////////////
//MarkAlan Mills
// CSC 160 Computer Science I, section 680
// Mar 22, 2022
// Homework 4 - Programming Exercise 6.3 (page 243) Craps
//////////////////////////////////////////////////////////////////////////////
public class Craps {
    public static void main(String[] args) {
        int die1 = roll1();
        int die2 = roll2();
        int die3 = die1 + die2;
        int points = 0;
        if (die3 == 2 || die3 == 3 || die3 == 12) {
            System.out.println("You rolled "+ die1 +" + "+ die2 +" = "+ (die3) +"\nYou lose");
        }else if (die3 == 7 || die3 == 11) {
            System.out.println("You rolled "+ die1 +" + "+ die2 +" = "+ (die3) +"\nYou win");
        }else {
            System.out.println("You rolled "+ die1 +" + "+ die2 +" = "+ (die3) +"\nPoint is "+ die3);
            points += die3;
            while (true) {
                die1 = roll1();
                die2 = roll2();
                die3 = die1 + die2;
                if (die3 == points) {
                    System.out.println("You rolled "+ die1 +" + "+ die2 +" = "+ (die3) +"\nYou win");
                    break;
                }else if (die3 == 7) {
                    System.out.println("You rolled "+ die1 +" + "+ die2 +" = "+ (die3) +"\nYou lose");
                    break;
                }else {
                    System.out.println("You rolled "+ die1 +" + "+ die2 +" = "+ (die3) +"\nRoll again");
                }
            }
        }
    }
    public static int roll1() {
        int die1 = (int)(Math.random() * 6 + 1);
        return die1;
    }
    public static int roll2() {
        int die2 = (int)(Math.random() * 6 + 1);
        return die2;
    }
}
