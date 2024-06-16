public class BinarySearchTree {
    private TreeNode root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    private TreeNode createNewNode(String fname,String lname,int weight,double height,int age,int weekly_workout,double element) {
        return new TreeNode(fname,lname,weight,height,age,weekly_workout,element);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean insert(String fname,String lname,int weight,double height,int age,int weekly_workout,double element) {
        if (root == null)
            root = createNewNode(fname,lname,weight,height,age,weekly_workout,element);
        else {
            TreeNode parent = null;
            TreeNode current = root;
            while (current != null) {
                if (element < current.getElement()) {
                    parent = current;
                    current = current.getLeft();
                } else if (element > current.getElement()) {
                    parent = current;
                    current = current.getRight();
                } else
                    return false;
            }
            if (element < parent.getElement())
                parent.setLeft(createNewNode(fname,lname,weight,height,age,weekly_workout,element));
            else
                parent.setRight(createNewNode(fname,lname,weight,height,age,weekly_workout,element));
        }
        size++;
        return true;
    }


    public void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.getLeft());
        System.out.print(root.getElement() + " ");
        inorder(root.getRight());
    }

    public void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.print(root.getElement() + " ");
    }

    public void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.getElement() + " ");
        preorder(root.getLeft());
        preorder(root.getRight());
    }

    public boolean delete(double e) {
        TreeNode parent = null;
        TreeNode current = root;
        while (current != null) {
            if (e < current.getElement()) {
                parent = current;
                current = current.getLeft();
            } else if (e > current.getElement()) {
                parent = current;
                current = current.getRight();
            } else break;
        }
        if (current == null)
            return false;
        if (current.getLeft() == null) {
            if (parent == null) {
                root = current.getRight();
            } else {
                if (e < parent.getElement())
                    parent.setLeft(current.getRight());
                else
                    parent.setRight(current.getRight());
            }
        } else {
            TreeNode parentOfRightMost = current;
            TreeNode rightMost = current.getLeft();
            while (rightMost.getRight() != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.getRight();
            }
            current.setElement(rightMost.getElement());
            if (parentOfRightMost.getRight() == rightMost)
                parentOfRightMost.setRight(rightMost.getLeft());
            else
                parentOfRightMost.setLeft(rightMost.getLeft());
        }
        size--;
        return true;
    }

    public boolean search(double e,UserInfo u) {
        TreeNode current = root;
        while(current != null) {
            if (e < current.getElement())
                current = current.getLeft();

            else if (e > current.getElement())
                current = current.getRight();
            else {
                if (current.getFirst_name()==u.getFirst_name() && current.getLast_name()==u.getLast_name())
                    System.out.println("First Name:"+u.getFirst_name()+ " Last Name:" + u.getLast_name()+ " Age:" + u.getAge() + " Height:"+ u.getHeight() + " Weekly Workout:" + u.getWeekly_workout() + " Weight:"+ u.getWeight()+ " Result:"+e);
                return true;
            }
        }
        return false;

    }
}


















