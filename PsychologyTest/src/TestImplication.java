import java.util.Scanner;
public class TestImplication {




    public void test_result(LinkedList l, double boundary, BinarySearchTree b, UserInfo u) {
    Scanner sc=new Scanner(System.in);
    Node position=new Node();
    position=l.getHead();
    double result=0;
    while (position!=null) {
        System.out.println(position.getItem());
        int answer=sc.nextInt();
        double temporary_result=answer*boundary;
        result +=temporary_result;
        position=position.getLink();
    }
    u.setResult(result);
    u.insert_users(b,u,result);
    if (result >=19 && result <=39){
        System.out.println("No Stress and Worry");
    } else if (result>=40 && result<=49) {
        System.out.println("Very Mild Symptoms of Stress and Anxiety");
    } else if (result>=50 && result <=59) {
        System.out.println("Mild Symptoms of Stress and Anxiety");
    } else if (result>=60 && result <=69) {
        System.out.println("Moderate Stress and Anxiety Symptoms");
    } else if (result>=70 && result <=79) {
        System.out.println("Signs of Serious Stress and Anxiety");
    } else if (result>=80 && result<=100) {
        System.out.println("Obvious Signs of Stress and Anxiety");
    }



}

        }




