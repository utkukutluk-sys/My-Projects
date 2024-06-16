
public class UserInfo {
    private String first_name;
    private String last_name;
    private int weight;
    private double height;
    private int age;
   private  int weekly_workout;
    private double result;

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeekly_workout() {
        return weekly_workout;
    }

    public void setWeekly_workout(int weekly_workout) {
        this.weekly_workout = weekly_workout;
    }



    public void insert_users(BinarySearchTree b, UserInfo u, double result) {
        b.insert(u.first_name,u.last_name,u.weight,u.height,u.age,u.weekly_workout,result);
    }
}
