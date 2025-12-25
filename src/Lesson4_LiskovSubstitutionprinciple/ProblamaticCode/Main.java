package Lesson4_LiskovSubstitutionprinciple.ProblamaticCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CreditCard> cards = new ArrayList<>();
        for(CreditCard card : cards) {
            if(card instanceof RuPayCard) {
                card.upiPayment();
            }
        }
    }
}


//All the card have general behaviour that's okay, but few of the cards have specific behaviour
// that other cards might not process, hence in the main class we have to explicitely tell about the instance of each card
//The concept is that, the main class should not know about every object but since we have to tell about every card it is violating the principle of LISKOV SUBSTITUTION PRINCIPLE
//LISKOV SUBSTITUTION PRINCIPLE:- The subclasses should be substitutable for their base classes without altering the correctness of the program

//It suggested some points:--
  //1. Inheritance might not be the best way always for reusability.
  //2. Do Inheritance if and only if there is a strict is-a relationship.

//LSP says that subtypes must be substitutable for base type.
//Objects of a child class should be as it is substitutable in variable of parent class.
//No change should be required in the codebase to accomodate a specific child class, or we can say child classes should not need any special treatment.
//Child classes should do exactly what the parent class expects.