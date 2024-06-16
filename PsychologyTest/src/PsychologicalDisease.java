public class PsychologicalDisease {
    String disease_name;
    LinkedList diseases=new LinkedList();
    public PsychologicalDisease(String disease_name, LinkedList diseases) {
        this.disease_name = disease_name;
        this.diseases = diseases;
    }


    public String getDisease_name() {
        return disease_name;
    }

    public void setDisease_name(String disease_name) {
        this.disease_name = disease_name;
    }

    public LinkedList getDiseases() {
        return diseases;
    }

    public void setDiseases(LinkedList diseases) {
        this.diseases = diseases;
    }
    public void fill_diseases() {
        diseases.addToStart("Anxiety",0);
        diseases.addToStart("Panic Attack",1);
        diseases.addToStart("Social Phobia",2);
    }

}
