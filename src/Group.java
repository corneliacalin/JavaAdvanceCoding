import java.util.List;

public class Group {
    private Trainer trainer;
    private List<Student> studentList;


    public Group(Trainer trainer, List<Student> studentList) {
        this.trainer = trainer;
        this.studentList = studentList;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Group{" +
                "trainer=" + trainer +
                ", studentList=" + studentList +
                '}';
    }
}
