import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        try {
            Get_Name.main(args);
            Birth_Date.main(args);
            Phone_num.main(args);
            Pol.main(args);
        } catch (Exception e) {
            System.err.println("Что-то пошло не так (-_-). Попробуйте ещё раз.");
        }
    }
}
