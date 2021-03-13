import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SimulateClass {
    public static void main(String[] args) {
        createClass();
    }
        private static void createClass() {
            Student student1 = new Student("Cornelia", "Calin", LocalDate.of(1974, Month.AUGUST, 28), false);
            System.out.println(student1);
            Student student2 = new Student("Ana", "Popa", LocalDate.of(1974, Month.AUGUST, 28), false);
            Student student3 = new Student("Andreea", "Breaz", LocalDate.of(1974, Month.AUGUST, 28), false);
            Student student4 = new Student("Maria", "Popescu", LocalDate.of(1974, Month.AUGUST, 28), false);
            Student student5 = new Student("Bianca", "Ionescu", LocalDate.of(1974, Month.AUGUST, 28), false);
            Student student6 = new Student("Vasile", "Petrescu", LocalDate.of(1974, Month.AUGUST, 28), false);
            Student student7 = new Student("Gheorghe", "Iliescu", LocalDate.of(1974, Month.AUGUST, 28), false);
            Student student8 = new Student("Ioan", "Rotar", LocalDate.of(1974, Month.AUGUST, 28), false);
            Student student9 = new Student("Emil", "Radu", LocalDate.of(1974, Month.AUGUST, 28), false);
            Student student10 = new Student("Marius", "Muntean", LocalDate.of(1974, Month.AUGUST, 28), false);

            List<Student> studentList1 = Arrays.asList(student1, student2, student3);
            List<Student> studentList2 = Arrays.asList(student4, student5, student6);
            List<Student> studentList3 = Arrays.asList(student7, student8, student9);
            List<Student> studentList4 = Arrays.asList(student10);

            Trainer trainer1 = new Trainer("Popa", "Ilie", LocalDate.of(1974, Month.AUGUST, 28), true);
            Trainer trainer2 = new Trainer("Gheorghe", "Vasile", LocalDate.of(1974, Month.AUGUST, 28), true);
            Trainer trainer3 = new Trainer("Vasile", "Viorel", LocalDate.of(1974, Month.AUGUST, 28), true);


            Group JavaRo16 = new Group(trainer1, studentList1);
            Group JavaRo17 = new Group(trainer2, studentList2);
            Group JavaRo18 = new Group(trainer3, studentList3);
            Group JavaRo19 = new Group(null, studentList4);
            System.out.println(JavaRo16);
            System.out.println(JavaRo17);
            System.out.println(JavaRo18);
            System.out.println(JavaRo19);
            JavaRo19.setTrainer(trainer1);


        }

    }

