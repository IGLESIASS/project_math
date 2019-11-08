import service.Impl.SqlServiceImpl;
import utils.SqlQueries;

import java.sql.SQLException;

public class Application {

    private static final SqlServiceImpl sqlService = new SqlServiceImpl();
    //private final UserService userService = new UserService();

    public static void main(String[] args) {

        createAllTables();

    }

    private static void createAllTables() {
        try{
            sqlService.processSqlQuery(SqlQueries.CREATE_USER_T.getValue());
            /*sqlService.processSqlQuery("sql2");
            sqlService.processSqlQuery("sql3");
            sqlService.processSqlQuery("sql4");
            sqlService.processSqlQuery("sql5");*/
        } catch(SQLException ex){
            //todo add something
        }
    }




    /*public static void main(String[] args) {

        boolean flag;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println(Phrases.INIT_PHRASE.getValue());
            String name = in.nextLine();
            name = name.toLowerCase();
            boolean correctName = name.equals(Phrases.USER_NAME.getValue());
            if (!correctName) {
                System.out.println(Phrases.USER_ERROR.getValue());
            } else {
                start(name, in);
            }
            flag = false;
        } while (flag);
    }

    public static void start(String s, Scanner in) {

        int i = 0;
        boolean flag = false;
        int number1 = 0;
        int number2 = 0;
        double percent = 0;

        while (i < 5) {
            if (i == 0 || flag) {
                number1 = (int) ((Math.random() * 9) + 1);
                number2 = (int) ((Math.random() * 9) + 1);
            }
            System.out.println("СОСЧИТАЙТЕ" + "\n" + number1 + " x " + number2 + " =");
            String composition = Integer.toString(number1 * number2);
            String answer = in.nextLine();
            boolean correctAnswer = answer.equals(composition);
            boolean correctHelpAnswer = answer.equals("h") || answer.equals("р");
            flag = false;
            if (correctHelpAnswer) {
                Table t = new Table();
                t.table(number1);
            } else {
                if (!correctAnswer) {
                    System.out.println(Phrases.INCORRECT_ANSWER.getValue());
                    System.out.println(Phrases.HELP_MESSAGE.getValue());
                    percent = percent - 0.5;
                } else {
                    flag = true;
                }
            }
            percent++;
            System.out.println(percent);
            if (i == 0 || flag) {
                i++;
            }
        }
    }*/
}
