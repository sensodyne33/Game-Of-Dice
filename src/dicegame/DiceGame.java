
package dicegame;
  
public class DiceGame {
    private int dice1;
    private int dice2;
    
    public DiceGame (int dice1, int dice2){
        this.dice1 = dice1;
        this.dice2= dice2;
    }
    
    private void rollDice (int dice1, int dice2) {
        int sum = dice1 + dice2;
        if (sum == 7 || sum == 11){
            System.out.println(" dice1 is " + dice1 + " and "+ "dice2 is " + dice2 + ".The sum is " + sum + " .You Won");
        }
        
        else if (sum == 4 || sum == 5 || sum == 12 ) {
            System.out.println(" dice1 is " + dice1 + " and "+ "dice2 is " + dice2 + ".The sum is " + sum + " .You Lost");
        }
        
        else if (sum == 2 ||sum == 3 ||sum == 6 ||sum == 8 ||sum == 9 || sum == 10) {
            pointNumber(sum);
        }
    }
    
    private void pointNumber (int sum){
        int pointdice1 = (int)(Math.random() * (5) + 1) + 1;
        int pointdice2 = (int)(Math.random() * (5) + 1) + 1;
        
        int newSum = pointdice1 + pointdice2;
        if (sum == newSum) {
            System.out.println(" dice1 is " + pointdice1 + " and "+ " dice2 is " + pointdice2 + " .The pointsum is " + newSum + " .You Won");
        }
        
        else if (newSum == 7){
            System.out.println(" dice1 is " + pointdice1 + " and "+ " dice2 is " + pointdice2 + ".The pointsum is " + newSum + " .You Won");
        }
    
    }
    
    public static void main (String [] args) {
        int dice1 = (int)(Math.random() * (5) + 1) + 1;
        int dice2 = (int)(Math.random() * (5) + 1) + 1;
        
        DiceGame game1 = new DiceGame(dice1, dice2);
        game1.rollDice(dice1, dice2);
    }
}
    

