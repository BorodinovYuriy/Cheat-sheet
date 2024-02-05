package patterns.youtube_pattern.proxy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        prepare(new ProxyDailyReport(new DailyReport()), LocalDate.now());
    }
    public static void prepare(Report report, LocalDate localDate){
        System.out.println(report.prepareReport(localDate));
    }
}
