import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Guessing number game");
        System.out.println("Warning: Enter '1' for existing account  and '3' for a new account");

        int n = scanner.nextInt();
        if (n == 1) {
            String id;
            do {
                System.out.print("Enter your mail id: ");
                id = scanner.next();
                if (!id.equals("venom325@gmail.com")) {
                    System.out.println("Wrong id. Try again!");
                } else {
                    System.out.println("Email id is correct!");
                    break;
                }
            } while (true);

            String pass3;
            do {
                System.out.println("Enter your password:");
                pass3 = scanner.next();
                if (!pass3.equals("idiot143@")) {
                    System.out.println("Wrong password. Try again!");
                } else {
                    System.out.println("Venom welcome back to Game!");
                    break;
                }
            } while (true);

            System.out.println("'venom  420' your Full name: venom idiot");
            System.out.println("Your E-mail id: ven******5@gmail.com");
            System.out.println("Your nick name: 'Venom  420'");
            System.out.println("Welcome back 'Venom  420' to Guessing number game");
            System.out.println("Let's have some Fun!");

            System.out.println("Enter '2' to start the game:");
            int start = scanner.nextInt();
            if (start == 2) {
                System.out.print("Enter the size: ");
                int size = scanner.nextInt();
                Random random = new Random();
                int randNumber = random.nextInt(size) + 1;
                int userGuess;
                int guesses = 0;
                System.out.println("Enter a number up to " + size);

                while (true) {
                    userGuess = scanner.nextInt();
                    guesses++;
                    if (userGuess == randNumber) {
                        System.out.println("'Venom  420' You guessed it right!");
                        break;
                    } else {
                        if (userGuess > randNumber) {
                            System.out.println("'Venom  420' You guessed it wrong! Enter a smaller number");
                        } else {
                            System.out.println("'Venom 420' You guessed it wrong! Enter a larger number");
                        }
                    }
                }

                System.out.println("'Venom  420' You guessed the number in " + guesses + " guesses");
                System.out.println("Done!");
            }
        } else if (n == 3) {
            System.out.print("Enter your First name: ");
            String first_name = scanner.next();
            System.out.print("Enter your second name: ");
            String sec_name = scanner.next();
            System.out.print("Enter phone number: ");
            int num = scanner.nextInt();
            System.out.print("Enter your date of birth (D/M/Y): ");
            String date_of_birth = scanner.next();
            System.out.print("Create a nick name: ");
            String nick_name = scanner.next();
            System.out.println("Enter e-mail id without spaces and without uppercase");
            System.out.print("Enter your mail-id: ");
            String mail_id = scanner.next();
            System.out.println("Note: Create a password with (one uppercase), lowercase, numeric, and one or more symbols");
            System.out.print("Enter password by following the note: ");
            String pass1 = scanner.next();
            System.out.print("Enter the same password again: ");
            String pass2 = scanner.next();
            if (pass1.equals(pass2)) {
                System.out.println("Successfully saved!");
            } else {
                System.out.println("No match password. Please enter the correct password.");
                System.out.print("Enter password by following the note: ");
                pass1 = scanner.next();
                System.out.print("Enter the same password again: ");
                pass2 = scanner.next();
            }

            System.out.println(nick_name + " your Full name: " + first_name + " " + sec_name);
            System.out.println("Your E-mail id: " + mail_id);
            System.out.println("Date of birth: " + date_of_birth);
            System.out.println("Phone number: " + num);
            System.out.println("Welcome " + nick_name + " to Guessing number Game");
            System.out.println("Let's have some Fun");
            System.out.print("Enter 1 to start the game: ");
            int enter = scanner.nextInt();
            if (enter == 1) {
                System.out.print("Enter guessing range: ");
                int size1 = scanner.nextInt();
                Random random = new Random();
                int randNumber = random.nextInt(size1) + 1;
                int userGuess;
                int guesses = 0;

                while (true) {
                    System.out.print("Enter your guess: ");
                    userGuess = scanner.nextInt();
                    guesses++;
                    if (userGuess == randNumber) {
                        System.out.println(nick_name + " You guessed it right!");
                        break;
                    } else {
                        if (userGuess > randNumber) {
                            System.out.println(nick_name + " You guessed it wrong! Enter a smaller number");
                        } else {
                            System.out.println(nick_name + " You guessed it wrong! Enter a larger number");
                        }
                    }
                }

                System.out.println(nick_name + " You guessed the number in " + guesses + " guesses");
                System.out.println("Thank you for playing!");
            }
        }
        scanner.close();
    }
}
