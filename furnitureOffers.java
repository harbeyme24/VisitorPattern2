import java.util.Scanner;

class FurnitureType {
    private String name;

    public FurnitureType(String name) {
        this.name = name;
    }

    public void accept(FurnitureShippingCost visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }
}

class FurnitureShippingCost {
    public void visit(FurnitureType furniture) {
        System.out.println("Calculating shipping cost for " + furniture.getName());
    }
}

public class FurnitureOffers {
    public static void main(String[] args) {
        FurnitureType chairs = new FurnitureType("Chairs");
        FurnitureType tables = new FurnitureType("Tables");
        FurnitureType sofas = new FurnitureType("Sofas");

        FurnitureShippingCost flashDeal = new FurnitureShippingCost();
        Scanner sc = new Scanner(System.in);

        int pick;
        do {
            displayMenu();
            pick = sc.nextInt();

            switch (pick) {
                case 1:
                    chairs.accept(flashDeal);
                    break;
                case 2:
                    tables.accept(flashDeal);
                    break;
                case 3:
                    sofas.accept(flashDeal);
                    break;
                case 4:
                    displayName();
                    break;
                case 5:
                    end();
                    break;
                default:
                    System.out.println("Oops, you selected an incorrect number. Kindly try again.");
            }
        } while (pick != 5);
    }

    public static void displayMenu() {
        System.out.println("Welcome to IKEA:");
        System.out.println("1. Buy Chairs");
        System.out.println("2. Buy Tables");
        System.out.println("3. Buy Sofas");
        System.out.println("4. Display Name");
        System.out.println("5. Terminate Program");
        System.out.print("Please select what would you like to do: ");
    }

    public static void displayName() {
        System.out.println("Harbey Edroso");
        System.out.println("Software Engineering II Visitor Pattern");
    }

    public static void end() {
        System.out.println("Stopping...");
        System.out.println("Terminating...");
        System.out.println("Ended...");
        System.out.println("Terminated by the Programmer - Harbey Edroso (3BSCS2)");
    }
}
