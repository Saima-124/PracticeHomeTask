
public class DataSet {
    private double[] values;
    private int count;
    private int maximumNumberOfValues;


    public DataSet(int maximumNumberOfValues) {
        this.maximumNumberOfValues = maximumNumberOfValues;
        this.values = new double[maximumNumberOfValues];
        this.count = 0;
    }


    public void add(double value) {
        if (count < maximumNumberOfValues) {
            values[count] = value;
            count++;
        } else {
            System.out.println("DataSet is full. Cannot add more values.");
        }
    }


    public double sum() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += values[i];
        }
        return sum;
    }


    public double average() {
        if (count == 0) {
            return 0;
        }
        return sum() / count;
    }


    public double maximum() {
        if (count == 0) {
            return Double.NaN;
        }
        double max = values[0];
        for (int i = 1; i < count; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    // Method to compute the minimum value
    public double minimum() {
        if (count == 0) {
            return Double.NaN;
        }
        double min = values[0];
        for (int i = 1; i < count; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    // Example usage
    public static void main(String[] args) {
        DataSet dataSet = new DataSet(5);
        dataSet.add(10);
        dataSet.add(20);
        dataSet.add(30);
        dataSet.add(40);
        dataSet.add(50);

        System.out.println("Sum: " + dataSet.sum());
        System.out.println("Average: " + dataSet.average());
        System.out.println("Maximum: " + dataSet.maximum());
        System.out.println("Minimum: " + dataSet.minimum());
    }
}
