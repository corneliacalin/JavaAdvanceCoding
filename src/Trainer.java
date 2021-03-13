import java.time.LocalDate;

public class Trainer extends Person{
    boolean isAuthorized;

    public Trainer(String firstname, String lastname, LocalDate dateOfBirth,boolean isAuthorized) {
        super(firstname, lastname, dateOfBirth);
        this.isAuthorized=isAuthorized ;
    }

    @Override
    public String toString() {
        return super.toString() +
                "isAuthorized=" + isAuthorized +
                "} " ;
    }
}
