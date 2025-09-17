import java.util.Scanner;

public class Btth_Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();

        System.out.println("===== THONG TIN =====");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);

        sc.close();
    }
}
