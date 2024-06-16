import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList anxiety_questions = new LinkedList();
        LinkedList socialphobia_questions = new LinkedList();
        LinkedList panicattack_questions = new LinkedList();
        anxiety_questions.fill_anxiety_questions(anxiety_questions);
        socialphobia_questions.fill_socialphobia_questions(socialphobia_questions);
        panicattack_questions.fill_panicattack_questions(panicattack_questions);
        BinarySearchTree users=new BinarySearchTree();
        TestImplication anxiety_test = new TestImplication();
        TestImplication socialphobia_test = new TestImplication();
        TestImplication panicattack_test = new TestImplication();



        Scanner scanner = new Scanner(System.in);

        UserInfo user_info = new UserInfo();
        System.out.println("Welcome to the MindCheck!!");



        System.out.println("Firstly, We need your demographic information");

        System.out.println("Can you share your first name with MindCheck please?");
        String first_name = scanner.nextLine();
        user_info.setFirst_name(first_name);

        System.out.println("Can you share your last name with MindCheck please?");
        String last_name = scanner.nextLine();
        user_info.setLast_name(last_name);

        System.out.println("Can you share your age with MindCheck please?");
        int age = scanner.nextInt();
        user_info.setAge(age);

        System.out.println("Can you share your weight with MindCheck please?");
        int weight = scanner.nextInt();;
        user_info.setWeight(weight);

        System.out.println("Can you share your height with MindCheck please?");
        double height = scanner.nextDouble();
        user_info.setHeight(height);

        System.out.println("Can you share your weekly workout scale with MindCheck please?(1 to 5)");
        int weekly_workout = scanner.nextInt();
        user_info.setWeekly_workout(weekly_workout);




        while (true) {
            System.out.println("\nPlease select the test you want to take:");

            System.out.println("1. Anxiety Test");
            System.out.println("2. Social Phobia Test");
            System.out.println("3. Panic Attack Test");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    anxiety_test.test_result(anxiety_questions,0.95,users,user_info);
                    users.search(user_info.getResult(),user_info);
                    break;
                case 2:
                    socialphobia_test.test_result(socialphobia_questions,0.95,users,user_info);
                    users.search(user_info.getResult(),user_info);
                    break;
                case 3:
                    panicattack_test.test_result(panicattack_questions,1.8,users,user_info);
                    users.search(user_info.getResult(),user_info);
                    break;
                case 4:
                    System.out.println("Thank you for choosing MindCheck! Have a nice day!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }





    }

    }


