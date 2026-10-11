import java.util.*;

public class ToleranceDatabase {

    private final Map<String, List<ToleranceInterval>> database = new HashMap<>();


    public ToleranceDatabase(){

        List<ToleranceInterval> h7Intervals = new ArrayList<>();
        h7Intervals.add(new ToleranceInterval(0.0,3.0,0.010,0.0));
        h7Intervals.add(new ToleranceInterval(3.0,6.0,0.012,0.0));
        h7Intervals.add(new ToleranceInterval(6.0,10.0,0.015,0.0));
        h7Intervals.add(new ToleranceInterval(10.0,18.0,0.018,0.0));
        h7Intervals.add(new ToleranceInterval(18.0,30.0,0.021,0.0));
        h7Intervals.add(new ToleranceInterval(30.0, 50.0, 0.025, 0.0));
        database.put("H7", h7Intervals);
    }

    public Optional <ToleranceInterval> findInterval(double size, String qualitet) {
        List<ToleranceInterval> intervals = database.get(qualitet);
        if (intervals == null) {
            System.out.println("Ошибка: Квалитет [" + qualitet + "] отсутствует в базе данных");
            return Optional.empty();
        }

        Optional<ToleranceInterval> foundInterval = intervals.stream()
                .filter(interval -> interval.isSizeInterval(size))
                .findFirst();
        if (foundInterval.isPresent()) {
            ToleranceInterval interval = foundInterval.get();
            System.out.println("Допуск размера " + size + " мм. Верхнее отклонение: " + interval.getUpperDeviation() + " мм. Нижнее отклонение: " + interval.getLowerDeviation() + " мм.");
        } else {
            System.out.println("Квалитет [" + qualitet + "] найдет, но размер " + size + " мм не входит в стандартные интервалы ГОСТа!");

        }


        return foundInterval;

    }





}
