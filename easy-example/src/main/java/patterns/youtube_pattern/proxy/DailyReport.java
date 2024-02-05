package patterns.youtube_pattern.proxy;

import java.time.LocalDate;

public class DailyReport implements Report{

    @Override
    public String prepareReport(LocalDate localDate) {
        //получение данных
        //подготовка
        return "Ежедневный отсчет за " + localDate;
    }
}
