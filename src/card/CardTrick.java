/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card;

/**A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Srinivsi
 * @modifier Devanshi Sharma
 * student id: 991711768
 */
import java.util.Scanner;

public class CardTrick {   
    for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(generateRandomNumber());
            c.setSuit(Card.SUITS[generateRandomNumber(0, 3)]);
            magicHand[i] = c;
        }
        
    //  luckyCard is added 
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit(Card.SUITS[1]);
    
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card: ");
        int value = scanner.nextInt();
        System.out.print("Enter the suit of your card (0-3): ");
        int suit = scanner.nextInt();
    
    Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit]);
    
    boolean found = false;
        for(Card card : magicHand) {
            if(card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
    

    if(found) {
            System.out.println("Hurray! Your card is in the magic hand.");
        } 
    else {
            System.out.println("Alas! Your card is not in the magic hand.");
        }
   if(luckyCard.getValue() == userCard.getValue() && luckyCard.getSuit().equals(userCard.getSuit())) {
            System.out.println("You have also found the lucky card!");
        }
   else {
            System.out.println("You have NOT found the lucky card!");
        }
    }
    
private static int generateRandomNumber() {
        return (int) (Math.random() * 13 + 1);
    }
       
private static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    
}
