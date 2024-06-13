public class P9 {
    public static void main(String[] args) {
        int a[] = {5,4,-1,7,8};
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += a[k];
                }
                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}