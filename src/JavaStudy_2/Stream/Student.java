package JavaStudy_2.Stream;

public class Student implements Comparable<Student>{
    public enum Sex{MALE,FEMALE};
    public enum City{SEOUL,PUSAN};
    private String name;
    private int score;
    private Sex sex;
    private City city;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student(String name, int score, Sex sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public Student(String name, int score, Sex sex, City city) {
        this.name = name;
        this.score = score;
        this.sex = sex;
        this.city = city;
    }

    public Sex getSex() {
        return sex;
    }

    public City getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score<o.score)
        return -1;
        else if(this.score==o.score)
                return 0;
        else return 1;

    }
}
