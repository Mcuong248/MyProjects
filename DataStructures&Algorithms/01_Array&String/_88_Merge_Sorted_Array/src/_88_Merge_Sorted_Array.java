public class _88_Merge_Sorted_Array {
    public void merge(int[] n1, int m, int[] n2, int n) {
        for (int ai : n2){
            insert(ai, n1, m);
            m++;
        }

    }

    private void insert(int x, int[] a, int m) {

    }

    public static void main(String[] args) {

    }
}
