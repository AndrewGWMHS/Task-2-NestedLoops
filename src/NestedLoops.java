public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 5; i >= 1; i--) {
            for(int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j <= 4;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}