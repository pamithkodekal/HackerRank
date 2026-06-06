import java.util.Scanner;


public class StaticInitializationBlocks {

    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);

        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();

        try {
            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
                
            }
        } catch (Exception e) {
            System.out.println(e);
            flag = false;
        }

        //sc.close();
    }

    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
