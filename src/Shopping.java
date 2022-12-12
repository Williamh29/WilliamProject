import java.util.Scanner;

public class Shopping {
    private Shopper shopper1;
    private Shopper shopper2;
    private Scanner scan;
    private double milk;
    private double cheese;
    private double yogurt;
    private double butter;
    private double sourcream;
    private double spinach;
    private double asparagus;
    private double artichokes;
    private double carrots;
    private double broccoli;
    private double oranges;
    private double apples;
    private double bananas;
    private double kiwi;
    private double strawberries;
    private double bread;
    private double pasta;
    private double rice;
    private double cereal;
    private double peanuts;
    private double meat;
    private double chicken;
    private double fish;
    private double pork;
    private double eggs;
    private double totalPrice;



    public Shopping() {
        shopper1 = null;
        shopper2 = null;
        scan = new Scanner(System.in);
        milk = 5.99;
        cheese = 5.00;
        yogurt = 3.00;
        butter = 3.75;
        sourcream = 4.00;
        spinach = 4.75;
        asparagus = 5.00;
        artichokes = 4.00;
        carrots = 5.00;
        broccoli = 2.50;
        oranges = 2.00;
        apples = 5.00;
        bananas = 4.75;
        kiwi = 3.00;
        strawberries = 3.00;
        bread = 3.00;
        pasta = 2.00;
        rice = 25.00;
        cereal = 5.00;
        peanuts = 4.00;
        meat = 30.00;
        chicken = 10.00;
        fish = 20.00;
        pork = 15.00;
        eggs = 4.75;
    }
    public void welcome() {
        System.out.println("Hello what are you guys looking for today?");
        System.out.println("We have a list of items in every food category so feel free to ask me anything.");
        System.out.println("May I get both of your names?");
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        if (name1.equals("no")) {
            shopper1 = new Shopper();
            shopper2 = new Shopper(name1);
        } else if (name2.equals("no")) {
            shopper1 = new Shopper(name1);
            shopper2 = new Shopper();
        } else {
            shopper1 = new Shopper(name1);
            shopper2 = new Shopper(name2);
        }
        if ((name1.length()) >= (int) (Math.random() * 9) + 1) {
            System.out.println("That's a long name");
        } else {
            System.out.println("That's a short name");
        }
        System.out.println("What would you like to buy today? Here is our current Menu.");

        printMenu();
        Shopping();
        System.out.println("Would you guys like to split the price? y/n");
        String answer = scan.nextLine();
        if (answer.equals("y")) {
            double newTotal = totalPrice / 2;
            System.out.println("Your new total is $ " + newTotal);
        } else {
            System.out.println("Your total is $ " + totalPrice);

        }
    }

    private void printMenu() {
        System.out.println("-----Dairy-----\n$5.99 Milk(1 Gallon)\n$5.00 Cheese(2lbs)\n$3.00 Yogurt(1 pint)\n$3.75 Butter(1 pint)\n$4.00 SourCream(1/2 pint)");
        System.out.println("-----Vegetable-----\n$4.75 Spinach(1 lb)\n$5.00 Asparagus(1lb)\n$4.00 Artichokes(1lb)\n$5.00 Carrots(2lbs)\n$2.50 Broccoli(1lb)");
        System.out.println("-----Fruits-----\n$2.00 Oranges(5)\n$5.00 Apples(6)\n$4.75 Bananas(8)\n$3.00 Kiwi(3)\n$3.00 Strawberries(2 lbs)");
        System.out.println("-----Grain-----\n$3.00 Bread(8)\n$2.00 Pasta(2lbs)\n$25.00 Rice(25 lbs)\n$5.00 Cereal(1lb)\n$4.00 Peanuts(2lbs)");
        System.out.println("-----Protein-----\n$30.00 Meat(3lbs)\n$10.00 Chicken(1.5lbs)\n$20.00 Fish(2lbs)\n$15.00 Pork(2lbs)\n$4.75 Eggs(1 dozen)");
    }
    public String Shopping() {
        int i =0;
        Scanner scan = new Scanner (System.in);
        while (i < 1000000) {
            i++;

            System.out.println("What item do you want?");
            String item = scan.nextLine();

            if (item.equals("milk")) {
                totalPrice += 5.99;
            }
            if (item.equals("cheese")) {
                totalPrice += 5.00;
            }

            if (item.equals("yogurt")) {
                totalPrice += 3.00;
            }
            if (item.equals("butter")) {
                totalPrice += 3.75;
            }
            if (item.equals("sourcream")) {
                totalPrice += 4.00;
            }
            if (item.equals("spinach")) {
                totalPrice += 4.75;
            }

            if (item.equals("asparagus")) {
                totalPrice += 5.00;
            }

            if (item.equals("artichokes")) {
                totalPrice += 4.00;
            }

            if (item.equals("carrots")) {
                totalPrice += 5.00;
            }

            if (item.equals("broccoli")) {
                totalPrice += 2.50;
            }

            if (item.equals("oranges")) {
                totalPrice += 2.00;
            }

            if (item.equals("apples")) {
                totalPrice += 5.00;
            }

            if (item.equals("bananas")) {
                totalPrice += 4.75;
            }

            if (item.equals("kiwi")) {
                totalPrice += 3.00;
            }

            if (item.equals("strawberries")) {
                totalPrice += 3.00;
            }

            if (item.equals("bread")) {
                totalPrice += 3.00;
            }

            if (item.equals("pasta")) {
                totalPrice += 2.00;
            }

            if (item.equals("rice")) {
                totalPrice += 25.00;
            }

            if (item.equals("cereal")) {
                totalPrice += 5.00;
            }

            if (item.equals("peanuts")) {
                totalPrice += 4.00;
            }

            if (item.equals("meat")) {
                totalPrice += 30.00;
            }

            if (item.equals("chicken")) {
                totalPrice += 10.00;
            }

            if (item.equals("fish")) {
                totalPrice += 20.00;
            }

            if (item.equals("pork")) {
                totalPrice += 15.00;
            }

            if (item.equals("eggs")) {
                totalPrice += 4.75;

            }
            System.out.println("Are you finished buying? y/n");
            String done = scan.nextLine();
            if (done.equals("y")) {
                i += 1000000000;
            }
            System.out.println("$" + totalPrice);
            System.out.println("You bought " + item);
        }
        return "" + totalPrice + "";
    }

    }




// welcome method:
// welcome the shoppers, and ask each shopper their name
// initialize shopper1 and shopper2 to new Shopper with their names



// gives directions; print out informtaion, return a string



// prints out options for the user





