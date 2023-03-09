import java.util.Scanner;

public class batrei {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan baterai anda saat ini : ");
        int batrei = input.nextInt();

        if (batrei >= 75 && batrei == 100) {
            System.out.println( batrei + "%"+ "Baterai penuh " );
        } else if (batrei >= 50) {
            System.out.println(batrei + "%" +"Baterai cukup "  );
        } else if (batrei >= 25) {
            System.out.println( batrei + "%"+ "Baterai sedang " );
        } else {
            System.out.println( batrei + "%" +"Baterai lemah "  );
        }
    }
}


