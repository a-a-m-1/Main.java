public class Student {
    private String name;
    private String surname;
    private double score;

    public Student(String name, String surname, double score){
        this.name = name;
        this.surname = surname;
        this.score = score;
    }
    public String getName() {return name;}
    public void getName(String name) {this.name = name;}


    public double getScore() {return score;}
    public void getScore(double score) {this.score = score;}

    public boolean isNerd() { return this.score == 5;}
    @Override
    public String toString() {
        return "student{" +
                "name=" + name + '\'' +
                "surname=" + surname + '\'' +
                "score=" + score +
                '}';
    }
}
