public class Min {
        public static int min(int[] data) {
            int minn = data[0];
            for (int i = 1; i < data.length; i++) {
                if (data[i] < minn) {
                    minn = data[i];
                }
            }
            return minn;
        }
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 5};
        int x = min(array);
        System.out.println(x);
}
}
