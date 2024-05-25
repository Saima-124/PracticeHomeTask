
    import java.util.Arrays;
import java.util.Random;

    public class RandomPermutations {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                int[] permutation = generateRandomPermutation();
                System.out.println("Permutation " + (i + 1) + ": " + Arrays.toString(permutation));
            }
        }

        public static int[] generateRandomPermutation() {
            int[] permutation = new int[10];
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            Random rand = new Random();

            for (int i = 0; i < 10; i++) {
                int index = rand.nextInt(10 - i);
                permutation[i] = numbers[index];

                for (int j = index; j < 9 - i; j++) {
                    numbers[j] = numbers[j + 1];
                }
            }

            return permutation;
        }
    }

