import java.util.ArrayList;

public class Menu{
    public static void main(String[] args) {
        Menus menu = new Menus();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }
}

class Menus {
    private ArrayList<String> meals;

    public Menus(){
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String meal){
        if (!(meals.contains(meal))) {
            this.meals.add(meal);
        }
    }
    
    public void printMeals(){
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu(){
        meals.removeAll(meals);
    }
}
