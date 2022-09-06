import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("nhap so bat ky: ");
        a= sc.nextInt();
        if (a>=10) {
            System.out.println("thoa dieu kien");

        }
        else {
            System.out.println("khong thoa dieu kien");
        }
    

    }
}