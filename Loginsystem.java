import java.util.Random;
import java.util.Scanner;
public class Loginsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "prasansha";
        String Pass = "mayara";
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();
        if (username.equals(user) && password.equals(Pass)) {
            System.out.println("Login Success");
            System.out.println("1. Calculator");
            System.out.println("2. Guessing Game");
            System.out.println("3. Result Generator");
            System.out.println("4. Greatest Number");
            int toolnumber=sc.nextInt();

            switch (toolnumber){
                case 1 :
                    System.out.print ("Enter Operation (+,-,*,/): ");
                    String operation=sc.next();
                    System.out.print("First Number: ");
                    double firstn=sc.nextDouble();
                    System.out.print("Second Number: ");
                    double secondn=sc.nextDouble();
                    switch (operation) {
                        case "+" :
                            System.out.println("The sum is:" + (firstn + secondn));
                            break;
                        case "-" :
                            System.out.println("The difference is:" + (firstn - secondn));
                            break;
                        case "*" :
                            System.out.println("The result is:" + (firstn * secondn));
                        break;
                        case "/" :
                            System.out.println("The division is:" + (firstn / secondn));
                            break;
                        default :
                            System.out.println("Operation Not Found");
                            break;
                    }
                    break;
                case 2:
                    Random random = new Random();// to generate random number. one step below choosen nummber
                    int targetNumber = random.nextInt(6);
                    System.out.println("Guessing Game!");
                    while (true) {
                        System.out.print("Enter your guess (1-5): ");
                        int guess = sc.nextInt();
                        if (guess == targetNumber) {
                            System.out.println("Your Guess is Correct");
                            break;
                        } else if (guess < targetNumber) {
                            System.out.println("Try High.");
                        } else {
                            System.out.println("Try Low.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("result generator");
                    System.out.println("first subject marks");
                    double firstsub =sc.nextDouble();
                    System.out.println("second subject marks");
                    double secondsub =sc.nextDouble();
                    System.out.println("third subject marks");
                    double thirdsub =sc.nextDouble();
                    double percentage=((firstsub+secondsub+thirdsub)/300)*100;
                    System.out.println("the percentage is: "+percentage);



                    break;

                case 4:
                    System.out.println("greatest of three number");
                    System.out.println("first number");
                    double firstnum=sc.nextDouble();
                    System.out.println("second number");
                    double secondnum =sc.nextDouble();
                    System.out.println("third number");
                    double thirdnum =sc.nextDouble();
                    double greatfirst=Math.max(firstnum,secondnum);
                    double greatsecond=Math.max(greatfirst,thirdnum);
                    System.out.println("Greatest Number is "+greatsecond);
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        } else {
            System.out.println("Invalid Login!");
        }
    }
}