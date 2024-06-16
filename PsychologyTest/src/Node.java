public class Node {
    private String item;
    private double count;
    private Node link;
    public Node(){
        link=null;item=null;count=0;
    }
    public Node(String newItem,double newCount,Node linkValue){
        setData(newItem,newCount);
        link=linkValue;
    }
    public void setData(String newItem, double newCount){
        item = newItem;
        count=newCount;
    }
    public void setLink(Node newLink){
        link=newLink;
    }
    public String getItem(){
        return item;
    }
    public double getCount(){
        return count;
    }
    public Node getLink(){
        return link;
    }



}
