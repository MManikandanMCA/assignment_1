package Assessment1;

public class question6 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++) {
            int n=5;
            for (int j=0;j<5;j++) {
                if (j<i) {
                    System.out.print(n--);
                } else {
                    System.out.print(n);
                }
            }
            System.out.println();
        }
    }
}
