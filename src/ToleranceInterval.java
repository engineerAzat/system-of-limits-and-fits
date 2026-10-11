public class ToleranceInterval {

    private final double minSize;          //Нижняя граница диапазона
    private final double maxSize;          //Верхняя граница диапазона
    private final double upperDeviation;   //Верхнее отклонение
    private final double lowerDeviation;   //Нижнее отклонение.

    public ToleranceInterval(double minSize,
                             double maxSize,
                             double upperDeviation,
                             double lowerDeviation) {
        this.minSize = minSize;
        this.maxSize = maxSize;
        this.upperDeviation = upperDeviation;
        this.lowerDeviation = lowerDeviation;
    }

    public double getMinSize() {
        return minSize;
    }

    public double getMaxSize() {
        return maxSize;
    }

    public double getUpperDeviation() {
        return upperDeviation;
    }

    public double getLowerDeviation() {
        return lowerDeviation;
    }

    public boolean isSizeInterval(double size) {
        return size > minSize && size <= maxSize;
    }
}


