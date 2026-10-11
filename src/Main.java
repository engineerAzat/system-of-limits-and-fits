
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ToleranceDatabase db = new ToleranceDatabase();

        Optional<ToleranceInterval> resultBox = db.findInterval(25.0, "H7");
        Optional<ToleranceInterval> resultBox1 = db.findInterval(26.0, "H7");





    }
}