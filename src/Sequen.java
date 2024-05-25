public class Sequen {

        private int[] values;

        public Sequen(int size) {
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

        public Sequen sum(Sequen other) {
            int maxLength = Math.max(this.size(), other.size());
            Sequen result = new Sequen(maxLength);

            for (int i = 0; i < maxLength; i++) {
                int value1 = (i < this.size()) ? this.get(i) : 0;
                int value2 = (i < other.size()) ? other.get(i) : 0;
                result.set(i, value1 + value2);
            }

            return result;
        }

        public static void main(String[] args) {
            Sequen seq1 = new Sequen(9);
            seq1.set(0, 1);
            seq1.set(1, 4);
            seq1.set(2, 9);
            seq1.set(3, 16);
            seq1.set(4, 9);
            seq1.set(5, 7);
            seq1.set(6, 4);
            seq1.set(7, 9);
            seq1.set(8, 11);

            Sequen seq2 = new Sequen(7);
            seq2.set(0, 11);
            seq2.set(1, 11);
            seq2.set(2, 7);
            seq2.set(3, 9);
            seq2.set(4, 16);
            seq2.set(5, 4);
            seq2.set(6, 1);

            Sequen sumSeq = seq1.sum(seq2);
            System.out.println("Sum sequen: " + sumSeqToString(sumSeq)); // Output: 12 15 16 25 25 11 5 9 11
        }

        private static String sumSeqToString(Sequen sequen) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < sequen.size(); i++) {
                sb.append(sequen.get(i)).append(" ");
            }
            return sb.toString().trim();
        }
    }


