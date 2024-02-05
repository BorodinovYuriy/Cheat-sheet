package patterns.youtube_pattern.proxy;

import java.time.LocalDate;
import java.util.HashMap;

public class ProxyDailyReport implements Report {
    private DailyReport dailyReport;
    private static HashMap<LocalDate,String> cache = new HashMap<>();

    public ProxyDailyReport(DailyReport dailyReport) {
        this.dailyReport = dailyReport;
    }

    @Override
    public String prepareReport(LocalDate localDate) {
        /**
         * -кэштрование.
         * -отложенная/ленивая инициализация.
         * -логирование запросов.
         * -промежуточные проверки доступа и данных.
         * -запуск параллельных потоков.
         */
        if(cache.get(localDate) == null){
            String report = dailyReport.prepareReport(localDate);
            cache.put(localDate, report);
            System.out.println("cache is working_");
            return report;
        }
        return cache.get(localDate);
    }
}
