import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getHoliday("21/04/2023"));
        System.out.println(getAllHolidays()); 
    }

    public static String getHoliday(String date) {
        Variables variables = new Variables();
        List<Holiday> holidays = variables.getHolidays();

        for (int i = 0; i < holidays.size(); i++) {
            String holidayDate = holidays.get(i).getDate();
            if (holidayDate == date) {
                return holidays.get(i).getName();
            }
        }

        return "Não existe feriado nesta data";
    }

    public static String getAllHolidays() {
        Variables variables = new Variables();
        List<Holiday> holidays = variables.getHolidays();

        String allHolidays = "";

        for (int i = 0; i < holidays.size(); i++) {
            String holidayDate = holidays.get(i).getDate();
            String holidayName = holidays.get(i).getName();

            allHolidays += holidayDate + " => " + holidayName + "\n";
        }

        return allHolidays;
    }
}

