import java.util.Arrays;

public class ArrayMethods {
    private int[] values;

    public ArrayMethods(int[] initialValues) {
        values = initialValues;
    }

    // Method to swap the first and last elements
    public void swapFirstAndLast() {
        if (values.length >= 2) {
            int temp = values[0];
            values[0] = values[values.length - 1];
            values[values.length - 1] = temp;
        }
    }

    // Method to shift all elements to the right by one and move the last element into the first position
    public void shiftRight() {
        if (values.length >= 2) {
            int last = values[values.length - 1];
            for (int i = values.length - 1; i > 0; i--) {
                values[i] = values[i - 1];
            }
            values[0] = last;
        }
    }

    // Method to replace all even elements with 0
    public void replaceEvenWithZero() {
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                values[i] = 0;
            }
        }
    }

    // Method to replace each element except the first and last by the larger of its two neighbors
    public void replaceWithLargerNeighbor() {
        for (int i = 1; i < values.length - 1; i++) {
            int largerNeighbor = Math.max(values[i - 1], values[i + 1]);
            values[i] = largerNeighbor;
        }
    }

    // Method to remove the middle element(s)
    public void removeMiddleElement() {
        if (values.length % 2 == 0) { // If the array length is even
            int mid = values.length / 2;
            for (int i = mid; i < values.length - 2; i++) {
                values[i] = values[i + 2];
            }
            values = Arrays.copyOf(values, values.length - 2);
        } else { // If the array length is odd
            int mid = values.length / 2;
            for (int i = mid; i < values.length - 1; i++) {
                values[i] = values[i + 1];
            }
            values = Arrays.copyOf(values, values.length - 1);
        }
    }

    // Method to move all even elements to the front
    public void moveEvenToFront() {
        int insertIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                int temp = values[i];
                for (int j = i; j > insertIndex; j--) {
                    values[j] = values[j - 1];
                }
                values[insertIndex] = temp;
                insertIndex++;
            }
        }
    }

    // Method to return the second-largest element in the array
    public int secondLargest() {
        Arrays.sort(values);
        return values[values.length - 2];
    }

    // Method to check if the array is sorted in increasing order
    public boolean isSorted() {
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the array contains two adjacent duplicate elements
    public boolean containsAdjacentDuplicates() {
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the array contains duplicate elements (not necessarily adjacent)
    public boolean containsDuplicates() {
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == values[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Test program
    public static void main(String[] args) {
        int[] initialValues = {1, 2, 3, 4, 5};
        ArrayMethods arrayMethods = new ArrayMethods(initialValues);

        // Testing each method
        arrayMethods.swapFirstAndLast();
        System.out.println("After swapping first and last: " + Arrays.toString(arrayMethods.values));

        arrayMethods.shiftRight();
        System.out.println("After shifting right: " + Arrays.toString(arrayMethods.values));

        arrayMethods.replaceEvenWithZero();
        System.out.println("After replacing even elements with zero: " + Arrays.toString(arrayMethods.values));

        arrayMethods.replaceWithLargerNeighbor();
        System.out.println("After replacing with larger neighbor: " + Arrays.toString(arrayMethods.values));

        arrayMethods.removeMiddleElement();
        System.out.println("After removing middle element: " + Arrays.toString(arrayMethods.values));

        arrayMethods.moveEvenToFront();
        System.out.println("After moving even elements to the front: " + Arrays.toString(arrayMethods.values));

        System.out.println("Second largest element: " + arrayMethods.secondLargest());

        System.out.println("Is the array sorted? " + arrayMethods.isSorted());

        System.out.println("Contains adjacent duplicates? " + arrayMethods.containsAdjacentDuplicates());

        System.out.println("Contains duplicates? " + arrayMethods.containsDuplicates());
    }
}

