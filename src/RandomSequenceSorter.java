
    import java.util.Arrays;
import java.util.Random;

    public class RandomSequenceSorter {
        public static void main(String[] args) {
            // Generate random sequence of 20 values between 0 and 99
            int[] sequence = generateRandomSequence(20);

            // Print original sequence
            System.out.println("Original Sequence:");
            printSequence(sequence);

            // Sort the sequence
            Arrays.sort(sequence);

            // Print sorted sequence
            System.out.println("\nSorted Sequence:");
            printSequence(sequence);
        }

        public static int[] generateRandomSequence(int length) {
            int[] sequence = new int[length];
            Random random = new Random();
            for (int i = 0; i < length; i++) {
                sequence[i] = random.nextInt(100); // Generates random numbers between 0 and 99
            }
            return sequence;
        }

        public static void printSequence(int[] sequence) {
            for (int i = 0; i < sequence.length; i++) {
                System.out.print(sequence[i] + " ");
            }
            System.out.println();
        }
    }


