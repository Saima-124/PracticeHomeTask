public class Sequence {
    private int[] values;

    public Sequence(int size) {
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

    public boolean equals(Sequence other) {
        if (other == null || this.size() != other.size()) {
            return false;
        }

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i) != other.get(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Sequence seq1 = new Sequence(5);
        seq1.set(0, 1);
        seq1.set(1, 2);
        seq1.set(2, 3);
        seq1.set(3, 4);
        seq1.set(4, 5);

        Sequence seq2 = new Sequence(5);
        seq2.set(0, 1);
        seq2.set(1, 2);
        seq2.set(2, 3);
        seq2.set(3, 4);
        seq2.set(4, 5);

        Sequence seq3 = new Sequence(5);
        seq3.set(0, 1);
        seq3.set(1, 2);
        seq3.set(2, 3);
        seq3.set(3, 4);
        seq3.set(4, 6);

        System.out.println("seq1 equals seq2: " + seq1.equals(seq2)); // true
        System.out.println("seq1 equals seq3: " + seq1.equals(seq3)); // false
    }
}

