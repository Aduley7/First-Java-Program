import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the unit price: ");
        double unitPrice = scanner.nextDouble();

        double totalPrice = quantity * unitPrice;

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        // Calculate the discount amount
        double discountAmount = (discountPercentage / 100) * totalPrice;

        // Calculate the final price after discount
        double finalPrice = totalPrice - discountAmount;

        // Output the details
        System.out.printf("Total Price before discount: %.2f%n", totalPrice);
        System.out.printf("Discount: %.2f%%%n", discountPercentage);
        System.out.printf("Discount Amount: %.2f%n", discountAmount);
        System.out.printf("Final Price after discount: %.2f%n", finalPrice);

        // Close the scanner
        scanner.close();
    


    }
}
