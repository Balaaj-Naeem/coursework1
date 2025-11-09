import java.util.Scanner;

public class coursework1IceCream {

    private static final String STUDENT_NUMBER = "34029033";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sn = STUDENT_NUMBER;
        if (sn.length() < 6) {
            sn = String.format("%6s", sn).replace(' ', '0');
        }

        String last6 = sn.substring(sn.length() - 6);

        int strawberry = Integer.parseInt(last6.substring(0, 2));
        int chocolate = Integer.parseInt(last6.substring(2, 4));
        int vanilla = Integer.parseInt(last6.substring(4, 6));

        System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
        String flavourInput = sc.nextLine().trim();

        if (flavourInput.isEmpty()) {
            System.out.println("We don't have that flavour.");
            sc.close();
            return;
        }

        char flavour = Character.toLowerCase(flavourInput.charAt(0));

        if (flavour != 'v' && flavour != 'c' && flavour != 's') {
            System.out.println("We don't have that flavour.");
            sc.close();
            return;
        }

        System.out.println("How many scoops would you like?");
        String scoopsInput = sc.nextLine().trim();

        int scoops;
        try {
            scoops = Integer.parseInt(scoopsInput);
        } catch (NumberFormatException e) {
            System.out.println("We don't have that flavour.");
            sc.close();
            return;
        }

        if (scoops < 1) {
            System.out.println("We don't sell just a cone.");
            sc.close();
            return;
        }

        if (scoops > 3) {
            System.out.println("That's too many scoops to fit in a cone.");
            sc.close();
            return;
        }

        int pricePerScoop;

        switch (flavour) {
            case 'v': pricePerScoop = vanilla;   break;
            case 'c': pricePerScoop = chocolate; break;
            default:  pricePerScoop = strawberry;
        }

        int totalPence = 100 + (pricePerScoop * scoops);
        double total = totalPence / 100.0;

        System.out.printf("That will be %.2f please.%n", total);

        sc.close();
    }
}
