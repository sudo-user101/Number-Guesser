import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Do you want to play a game?(y/n)");
        String user_reply = scanner.nextLine();
        String string_convert = user_reply.toLowerCase();

        if (string_convert.equals("y")) {
            System.out.println("Choose Difficulty (Easy/Medium/Hard)");
            String mode_setting = scanner.nextLine();
            String mode_setting_convert = mode_setting.toLowerCase();
            if (mode_setting_convert.equals("easy")) {
                System.out.println("Enter Number From 1-10");
                int number_guesser_easy = scanner.nextInt();
                int random_number_easy = ran.nextInt(10);
                if (number_guesser_easy == random_number_easy) {
                    System.out.println("Congrats Number," + random_number_easy + " is correct");
                } else {
                    System.out.println("Sorry," + number_guesser_easy + " is not the right number, the right one was "+random_number_easy);
                }
            } else if (mode_setting_convert.equals("medium")) {
                System.out.println("Enter Number From 1-15");
                int number_guesser_medium = scanner.nextInt();
                int random_number_medium = ran.nextInt(15);
                if (number_guesser_medium == random_number_medium) {
                    System.out.println("Congrats u hv won!!!!!!!");
                } else {
                    System.out.println("Sorry," + number_guesser_medium + " is not the right number, the right number is "+random_number_medium);
                }
            } else if (mode_setting_convert.equals("hard")) {
                System.out.println("Enter Number 1-20");
                int number_guesser_hard = scanner.nextInt();
                int random_number_hard = ran.nextInt(20);
                if (number_guesser_hard == random_number_hard) {
                    System.out.println("Congarts!!!!!!");
                } else {
                    System.out.println("Sorry," + number_guesser_hard + " is not the right number the right number was "+random_number_hard);
                }
            }
        }
        else if (string_convert.equals("n")) {
            System.out.println("Okay,Bye!");
            }
        else {
            System.out.println("error");
        }
        scanner.close();
        }

        }

