public class TreeNode {
    private String first_name;
    private String last_name;
    private int weight;
    private double height;
    private int age;
    private int weekly_workout;
    private double element;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(String first_name, String last_name, int weight, double height, int age, int weekly_workout, double element) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.weekly_workout = weekly_workout;
        this.element = element;

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

    public double getElement() {
        return element;
    }

    public void setElement(double element) {
        this.element = element;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
