import java.util.ArrayList;
import java.util.List;

public class Variables {
    private List<Holiday> holidays = new ArrayList<>();

    public Variables() {
        Holiday confMundial = new Holiday("01/01/2023", "Confraternização mundial");
        Holiday carnaval = new Holiday("21/02/2023", "Carnaval");
        Holiday pascoa = new Holiday("17/04/2023", "Páscoa");
        Holiday tiradentes = new Holiday("21/04/2023", "Tiradentes");
        Holiday diaDoTrabalho = new Holiday("01/05/2023", "Dia do trabalho");
        Holiday corpusChristi = new Holiday("08/06/2023", "Corpus Christi");
        Holiday indepDoBrasil = new Holiday("07/09/2023", "Independência do Brasil");
        Holiday nossaSenhora = new Holiday("12/10/2023", "Nossa Senhora Aparecida");
        Holiday finados = new Holiday("02/11/2023", "Finados");
        Holiday procDaRep = new Holiday("15/11/2023", "Proclamação da República");
        Holiday natal = new Holiday("25/12/2023", "Natal");

        this.holidays.add(confMundial);
        this.holidays.add(carnaval);
        this.holidays.add(pascoa);
        this.holidays.add(tiradentes);
        this.holidays.add(diaDoTrabalho);
        this.holidays.add(corpusChristi);
        this.holidays.add(indepDoBrasil);
        this.holidays.add(nossaSenhora);
        this.holidays.add(finados);
        this.holidays.add(procDaRep);
        this.holidays.add(natal);
    }

    List<Holiday> getHolidays() {
        return this.holidays;
    }
}
