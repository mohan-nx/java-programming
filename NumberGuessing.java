public class NumberGuessing {
    public static void main(String[] args) {
        int numberToGuess = 7;
        int userGuess = 0;

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 10.");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
            }
        }

        scanner.close();
    }
}