import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//need to make the rest of run game method

public class city {
    public static void main(String[] args) {
        players player = new players(0, 1, 1);
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Welcome to your Foodtruck. You have 4 customers everyday and it is your responsibility that they stay fed for the next 4 days.");
            System.out.println("One at a time they will ask you to make and serve then an item on the menu. You must cook up that menu item for them or you will lose rating.");
            System.out.println("To make a food item you must first gather the ingredients and possibly wash and or cut them.");
            System.out.println("Once you have gotten and prepared the ingredient you can add it to the special oven that will automatically make it for you.");
            System.out.println("After that you can take it out of the oven and serve it to the customer");
            System.out.println("There will be a tutorial before you start the real thing");
            System.out.println("Are you ready to begin?(Y/N)");
            String answer = sc.nextLine();
            if(answer.toUpperCase().equals("Y")) {
                System.out.println();
                System.out.println("Perfect! You are now ready to begin!");
                System.out.println();
                break;
            } else {
                System.out.println();
                System.out.println("Ok here are the instructions again");
                System.out.println();
            }
        }

        tutorial();
        sc.close();
    }

    public static foodItems[] createRecipes() {
        ingredients lettuce = new ingredients("Lettuce", true, false, true);
        ingredients cheese = new ingredients("Cheese", true, true, false);
        ingredients tomato = new ingredients("Tomato", true, true, true);
        ingredients bun = new ingredients("Bun", false, false, false);
        ingredients meat = new ingredients("Meat", true, false, false);
        //ingredients onions = new ingredients("Onions", true, true, false);

        ingredients bread = new ingredients("Bread", false, false, false);
        ingredients turkey = new ingredients("Turkey", true, false, false);
        ingredients ham = new ingredients("Ham", true, false, false);
        
        ingredients chickenWing = new ingredients("Chicken Wings", true, false, false);

        ingredients fries = new ingredients("French Fries", true, true, true);
        ingredients noodles = new ingredients("Noodles", false, false, false);

        ingredients[] burgerIngredients = {lettuce, cheese, tomato, bun, meat};
        ingredients[] hamSandwhichIngredients = {bread, ham, cheese, lettuce, tomato};
        ingredients[] turkeySandwhichIngredients = {bread, turkey, cheese, lettuce, tomato};
        ingredients[] friesIngredients = {fries};
        ingredients[] chickenWingsIngredients = {chickenWing};
        ingredients[] macAndCheeseIngredients = {noodles, cheese};

        foodItems burger = new foodItems("Burger", 10, burgerIngredients);
        foodItems hamSandwhich = new foodItems("Ham Sandwhich", 6.50, hamSandwhichIngredients);
        foodItems turkeySandwhich = new foodItems("Turkey Sandwhich", 6.50, turkeySandwhichIngredients);
        foodItems frenchFries = new foodItems("French Fries", 3, friesIngredients);
        foodItems chickenWings = new foodItems("Chicken Wings", 9.50, chickenWingsIngredients);
        foodItems macAndCheese = new foodItems("Mac and Cheese", 8.25, macAndCheeseIngredients);

        foodItems[] allRecipes = {burger, hamSandwhich, turkeySandwhich, frenchFries, chickenWings, macAndCheese};
        return allRecipes;

    }

    public static ArrayList<Customers> createCustomers(foodItems[] foodRecipes) {
        Random rnd = new Random();
        Customers customer1 = new Customers("Dave", foodRecipes[rnd.nextInt(foodRecipes.length)], rnd.nextInt(16) + 5, rnd.nextInt(5));
        Customers customer2 = new Customers("Lucas", foodRecipes[rnd.nextInt(foodRecipes.length)], rnd.nextInt(16) + 5, rnd.nextInt(5));
        Customers customer3 = new Customers("Bartholomew", foodRecipes[rnd.nextInt(foodRecipes.length)], rnd.nextInt(16) + 5, rnd.nextInt(5));
        Customers customer4 = new Customers("Andrew", foodRecipes[rnd.nextInt(foodRecipes.length)], rnd.nextInt(16) + 5, rnd.nextInt(5));
        ArrayList<Customers> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);

        return customerList;
    }

    public static void tutorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets start the tutorial");
        players tutorialPlayers = new players(0, 1, 1);
        runGame(tutorialPlayers);
        System.out.println("Congrats you finished the tutorial");
        while(true) {
            System.out.println("Now are you ready for the real thing?(Y/N)");
            String answer = sc.nextLine();
            if(answer.toUpperCase().equals("Y")) {
                System.out.println();
                System.out.println("Amazing! Let it now begin!");
                System.out.println();
                break;
            } 
        }
        sc.close();
    }

    public static void runGame(players player) {
        Scanner sc = new Scanner(System.in);
        foodItems[] recipes = createRecipes();
        ArrayList<Customers> listOfCustomers = createCustomers(recipes);
        System.out.println(listOfCustomers.get(0).toString());
        sc.close();
    }
}
