import java.util.HashMap;
import java.util.Map;
public class Seques {



        private int[] values;

        public Seques(int size) {
            values = new int[size];
        }

        public void set(int i, int n) {
            values[i] = n;
        }

        public int get(int i) {
            return values[i];
        }

        public int size() {
            return values.length;
        }

        public boolean isPermutationOf(Seques other) {
            if (other == null || this.size() != other.size()) {
                return false;
            }

            Map<Integer, Integer> thisCount = countValues();
            Map<Integer, Integer> otherCount = other.countValues();

            return thisCount.equals(otherCount);
        }

        private Map<Integer, Integer> countValues() {
            Map<Integer, Integer> countMap = new HashMap<>();

            for (int value : values) {
                countMap.put(value, countMap.getOrDefault(value, 0) + 1);
            }

            return countMap;
        }

        public static void main(String[] args) {
            Seques seq1 = new Seques(9);
            seq1.set(0, 1);
            seq1.set(1, 4);
            seq1.set(2, 9);
            seq1.set(3, 16);
            seq1.set(4, 9);
            seq1.set(5, 7);
            seq1.set(6, 4);
            seq1.set(7, 9);
            seq1.set(8, 11);

            Seques seq2 = new Seques(9);
            seq2.set(0, 11);
            seq2.set(1, 1);
            seq2.set(2, 4);
            seq2.set(3, 9);
            seq2.set(4, 16);
            seq2.set(5, 9);
            seq2.set(6, 7);
            seq2.set(7, 4);
            seq2.set(8, 9);

            System.out.println("seq1 is a permutation of seq2: " + seq1.isPermutationOf(seq2)); // true
        }
    }


