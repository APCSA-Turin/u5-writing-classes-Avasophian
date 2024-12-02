package U5T6_ObjRef;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("------ Scenario Step 1 ------");
        System.out.println("-----> There's a new bank in town!");
        Bank bank = new Bank();
        System.out.println(bank.bankInfo() + "\n");

        System.out.println("------ Scenario Step 2 ------");
        System.out.println("-----> Ms.Turin is getting a new credit card!");
        CreditCard myCard = new CreditCard("Ms.Turin", "9254");
        System.out.println(myCard.cardInfo() + "\n");

        System.out.println("------ Scenario Step 3 ------");
        System.out.println("-----> Oh nice! A new bagel shop in town!");
        BagelShop jimsBagelShop = new BagelShop("Jim's Bagel Shop", 1000, 2, bank);
        System.out.println(jimsBagelShop.shopInfo() + "\n");

        System.out.println("------ Scenario Step 4 ------");
        System.out.println("-----> Ms.Turin wants to buy 5 bagels using his new credit card");
        boolean buyBagels = jimsBagelShop.payForBagels(myCard, 5, "9254");
        System.out.println(buyBagels + "\n");
        System.out.println(myCard.cardInfo() + "\n");
        System.out.println(jimsBagelShop.shopInfo() + "\n");

        System.out.println("------ Scenario Step 5 ------");
        System.out.println("-----> He tried to buy 10 more, but accidentally entered his PIN wrong");
        buyBagels = jimsBagelShop.payForBagels(myCard, 10, "9354");
        System.out.println(buyBagels + "\n");
        System.out.println(myCard.cardInfo() + "\n");
        System.out.println(jimsBagelShop.shopInfo() + "\n");
        
        System.out.println("------ Scenario Step 6 ------");
        System.out.println("-----> He fixed his typo!  Phew thank goodness");
        buyBagels = jimsBagelShop.payForBagels(myCard, 10, "9254");
        System.out.println(buyBagels + "\n");
        System.out.println(myCard.cardInfo() + "\n");
        System.out.println(jimsBagelShop.shopInfo() + "\n");

        System.out.println("------ Scenario Step 7 ------");
        System.out.println("-----> Three of his bagels are moldy; he returns them for his money back");
        boolean returnBagels = jimsBagelShop.returnBagels(myCard, 3, "9254");
        System.out.println(returnBagels + "\n");
        System.out.println(myCard.cardInfo() + "\n");
        System.out.println(jimsBagelShop.shopInfo() + "\n");

        System.out.println("------ Scenario Step 8 ------");
        System.out.println("-----> Bill time!  Ms.Turin pays $15 of his credit card balance");
        bank.makePayment(myCard, 15);
        System.out.println(myCard.cardInfo() + "\n");
        System.out.println(bank.bankInfo() + "\n");

        System.out.println("------ Scenario Step 9 ------");
        System.out.println("-----> John opens a new Credit Card");
        CreditCard johnsCard = new CreditCard("John", "1022");
        System.out.println(johnsCard.cardInfo() + "\n");
        
        System.out.println("------ Scenario Step 10 ------");
        System.out.println("-----> John is catering a breakfast for his team and buys 300 bagels");
        buyBagels = jimsBagelShop.payForBagels(johnsCard, 300, "1022");
        System.out.println(buyBagels + "\n");
        System.out.println(johnsCard.cardInfo() + "\n");
        System.out.println(jimsBagelShop.shopInfo() + "\n");
        
        System.out.println("------ Scenario Step 11 ------");
        System.out.println("-----> Yikes! That was expensive. John pays off $75 of his credit card balance");
        System.out.println("-----> He gets charged $5 because his balance is still above 500");
        bank.makePayment(johnsCard, 75);
        System.out.println(johnsCard.cardInfo() + "\n");
        System.out.println(bank.bankInfo() + "\n");
        
        System.out.println("------ Scenario Step 12 ------");
        System.out.println("-----> The bagel shop has a lot of money and wants to deposit it into the bank");
        jimsBagelShop.depositProfits();
        System.out.println(jimsBagelShop.shopInfo() + "\n");
        System.out.println(bank.bankInfo() + "\n");
        
        System.out.println("------ Scenario Step 13 ------");
        System.out.println("-----> Let's see whose credit card balance is lower!");
        CreditCard lowestCard = bank.lowerBalance(myCard, johnsCard);
        if (lowestCard != null) {
            System.out.println(lowestCard.getAccountHolder() + " with a $" + lowestCard.getBalanceOwed() + " balance\n");
        } else {
            System.out.println("They have the same balance\n");
        }
        
        System.out.println("------ Scenario Step 14 ------");
        System.out.println("-----> John pays off his credit card in full (so there is a 0 balance)");
        bank.makePayment(johnsCard, johnsCard.getBalanceOwed());
        System.out.println(johnsCard.cardInfo() + "\n");
        System.out.println(bank.bankInfo() + "\n");
        
        System.out.println("------ Scenario Step 15 ------");
        System.out.println("-----> Now let's see who has the lower balance:");
        lowestCard = bank.lowerBalance(myCard, johnsCard);
        if (lowestCard != null) {
            System.out.println(lowestCard.getAccountHolder() + " with a $" + lowestCard.getBalanceOwed() + " balance\n");
        } else {
            System.out.println("They have the same balance\n");
        }
        System.out.println("------ Scenario Step 16 ------");
        System.out.println("-----> Ms.Turin pays off his card in full");
        bank.makePayment(myCard, myCard.getBalanceOwed());
        System.out.println(myCard.cardInfo() + "\n");
        System.out.println(bank.bankInfo() + "\n");


        System.out.println("------ Scenario Step 17 ------");
        System.out.println("-----> Now let's compare one last time:");
        lowestCard = bank.lowerBalance(myCard, johnsCard);
        if (lowestCard != null) {
            System.out.println(lowestCard.getAccountHolder() + " with a $" + lowestCard.getBalanceOwed() + " balance\n");
        } else {
            System.out.println("They have the same balance\n");
        }
        
                                            
    }
}
