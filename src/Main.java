public class Main {
    public static void main(String[] args) {
        task4();
        task5();
    }

    public static void task4() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " ping pong ");
            } else if (i % 3 == 0) {
                System.out.println(i + " ping ");
            } else if (i % 5 == 0) {
                System.out.println(i + " pong ");
            } else {
                System.out.println(i + " ");
            }
        }
    }

    public static void task5() {
        int a = 0;
        int b = 1;
        int с;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < 8; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
}





