public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public boolean isEmpty() {
        if (head == null)
            return true;
        else
            return
                    false;
    }

    public void outputList() {
        Node position = head;
        while (position != null) {
            System.out.println(position.getItem() + "" + position.getCount());
            position = position.getLink();
        }
    }

    public void addToStart(String itemName, double itemCount) {
        head = new Node(itemName, itemCount, head);
    }

    public boolean deleteHeadNode() {
        if (head != null) {
            head = head.getLink();
            return true;
        } else
            return false;
    }

    public int size() {
        int count = 0;
        Node position = head;
        while (position != null) {
            count++;
            position = position.getLink();
        }
        return count;
    }

    private Node find(String target) {
        Node position = head;
        String itemAtPosition;
        while (position != null) {
            itemAtPosition = position.getItem();

            if (itemAtPosition.equals(target))
                return position;
            position = position.getLink();
        }
        return null;//targetwasnotfound}
    }
    public boolean contains(String item){
        return(find(item) !=null);
    }

    public void fill_anxiety_questions(LinkedList l) {

        l.addToStart("On a scale of 1 to 5, how frequently do you experience faintness? (1 being never, 5 being very frequently)",1);
        l.addToStart("On a scale of 1 to 5, how often do you experience indigestion or discomfort in your stomach? (1 being never, 5 being very often)",2);
        l.addToStart("On a scale of 1 to 5, how often do you feel panic? (1 being never, 5 being very often)",3);
        l.addToStart("On a scale of 1 to 5, how much do you fear dying? (1 being not at all, 5 being extremely)",4);
        l.addToStart("On a scale of 1 to 5, how much difficulty do you have breathing? (1 being none at all, 5 being a lot)",5);
        l.addToStart("On a scale of 1 to 5, how much do you fear losing control? (1 being not at all, 5 being extremely)",6);
        l.addToStart("On a scale of 1 to 5, how often do you experience shaking? (1 being never, 5 being very often)",7);
        l.addToStart("On a scale of 1 to 5, how often do you experience trembling in your hands? (1 being never, 5 being very often)",8);
        l.addToStart("On a scale of 1 to 5, how often do you feel irritable? (1 being never, 5 being very often)",9);
        l.addToStart("On a scale of 1 to 5, how frequently do you experience a terrified or scared feeling? (1 being never, 5 being very frequently)",10);
        l.addToStart("On a scale of 1 to 5, how often do you feel like you might pass out? (1 being never, 5 being very often)",11);
        l.addToStart("On a scale of 1 to 5, how frequently do you feel your heart pounding or racing? (1 being never, 5 being very frequently)",12);
        l.addToStart("On a scale of 1 to 5, how often do you experience dizziness or lightheadedness? (1 being never, 5 being very often)",13);
        l.addToStart("On a scale of 1 to 5, how much do you fear something awful happening? (1 being not at all, 5 being extremely)",14);
        l.addToStart("On a scale of 1 to 5, how difficult is it for you to relax? (1 being not difficult at all, 5 being very difficult)",15);
        l.addToStart("On a scale of 1 to 5, how often do you experience weakness or trembling in your legs? (1 being never, 5 being very often)",16);
        l.addToStart("On a scale of 1 to 5, how frequently do you experience hot flashes? (1 being never, 5 being very frequently)",17);
        l.addToStart("On a scale of 1 to 5, how often do you experience numbness or tingling anywhere in your body? (1 being never, 5 being very often)",18);
        l.addToStart("On a scale of 1 to 5, how often do you experience blushing? (1 being never, 5 being very often)",19);
        l.addToStart("On a scale of 1 to 5, how frequently do you sweat (not due to heat)? (1 being never, 5 being very frequently)",20);
        l.addToStart("On a scale of 1 to 5, how often do you feel a sensation of choking? (1 being never, 5 being very often)",21);
    }

    public void fill_panicattack_questions(LinkedList l) {


        l.addToStart("On a scale of 1 to 5, did your panic attacks or agoraphobia last week restrict or impair your performance of responsibilities at work or home? (1 being no restriction, 5 being severe restriction)", 1);
        l.addToStart("On a scale of 1 to 5, did your panic attacks or agoraphobia last week restrict or impair your social life or leisure activities? (1 being no restriction, 5 being severe restriction)", 2);
        l.addToStart("On a scale of 1 to 5, did your panic attacks or agoraphobia last week impair your family relationships? (1 being no impairment, 5 being severe impairment)", 3);
        l.addToStart("On a scale of 1 to 5, how severe was this 'fear of fear'? (1 being very mild, 5 being very severe)", 4);
        l.addToStart("On a scale of 1 to 5, did you have fear of having panic attacks last week? (1 being no fear, 5 being extreme fear)", 5);
        l.addToStart("On a scale of 1 to 5, how much did you avoid certain situations last week due to fear of panic attacks? (1 being no avoidance, 5 being extreme avoidance)", 6);
        l.addToStart("On a scale of 1 to 5, were most of the attacks expected or unexpected? (1 being mostly expected, 5 being mostly unexpected)", 7);
        l.addToStart("On a scale of 1 to 5, how long did each of your panic attacks typically last? (1 being very short, 5 being very long)", 8);
        l.addToStart("On a scale of 1 to 5, how severe were your panic attacks last week? (1 being very mild, 5 being very severe)", 9);
        l.addToStart("On a scale of 1 to 5, how often did you have panic attacks last week? (1 being never, 5 being very frequently)", 10);
        l.addToStart("On a scale of 1 to 5, how significant were the situations you avoided? (1 being not significant, 5 being highly significant)", 11);
    }


    public void fill_socialphobia_questions(LinkedList l) {

        l.addToStart("How comfortable are you with drinking something in public places? (Scale: 1 to 5)",1);
        l.addToStart("How comfortable are you with participating in a small group activity? (Scale: 1 to 5)",2);
        l.addToStart("How comfortable are you with hosting guests at your home? (Scale: 1 to 5)",3);
        l.addToStart("How comfortable are you with eating in public places? (Scale: 1 to 5)",4);
        l.addToStart("How comfortable are you with speaking on the phone with someone you do not know well? (Scale: 1 to 5)",5);
        l.addToStart("How comfortable are you with writing while being observed? (Scale: 1 to 5)",6);
        l.addToStart("How comfortable are you with having your abilities, skills, or knowledge evaluated? (Scale: 1 to 5)",7);
        l.addToStart("How comfortable are you with making direct eye contact with someone you do not know well? (Scale: 1 to 5)",8);
        l.addToStart("How comfortable are you with going to a social gathering or entertainment event? (Scale: 1 to 5)",9);
        l.addToStart("How comfortable are you with speaking face-to-face with someone you do not know well? (Scale: 1 to 5)",10);
        l.addToStart("How comfortable are you with working while being observed? (Scale: 1 to 5)",11);
        l.addToStart("How comfortable are you with expressing disagreement or dissatisfaction to someone not well-known to you? (Scale: 1 to 5)",12);
        l.addToStart("How comfortable are you with returning an item to a store for a refund? (Scale: 1 to 5)",13);
        l.addToStart("How comfortable are you with speaking with someone who has authority over you? (Scale: 1 to 5)",14);
        l.addToStart("How comfortable are you with entering a room while others are already inside? (Scale: 1 to 5)",15);
        l.addToStart("How comfortable are you with giving a prepared verbal report to a group? (Scale: 1 to 5)",16);
        l.addToStart("How comfortable are you with initiating a romantic or sexual relationship with someone new? (Scale: 1 to 5)",17);
        l.addToStart("How comfortable are you with being the center of attention? (Scale: 1 to 5)",18);
        l.addToStart("How comfortable are you with performing in front of an audience (e.g., giving a speech, presentation, or demonstration)? (Scale: 1 to 5)",19);
        l.addToStart("How comfortable are you with speaking up in a meeting without prior preparation? (Scale: 1 to 5)",20);
        l.addToStart("How comfortable are you with using public telephones? (Scale: 1 to 5)",21);
    }

    }
