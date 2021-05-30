
import java.util.Scanner;
/**
 *
 * @author Arzan-PC
 * yudha raga putra
 * TI20E
 */

public class Linearsearch {

    public static void main(String[] args) {
        Scanner scan=new
                Scanner(System.in);
        int[]angka={0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50};
        boolean ketemu = false;
        System.out.println("Masukan Angka berdasarkan Bilangan Genap 0-50 :");
        int key=scan.nextInt();
        System.out.println("cari berdasarkan angka :"+key);
        for(int i=0;i<angka.length;i++){
            if(key==angka[i]){
                System.out.println("Data "+key+" ditemukan pada index ke"+(i)+", Posisi Nomor ke="+(i+1));
                ketemu = true;
                break;
            }
        }
        if(ketemu==false){
            System.out.println("Data tidak ditemukan");
        }        
        System.out.println("\nList Data Angka Genap");
        for(int s=0;s<angka.length;s++){
            System.out.println(angka[s]);
        }
        
    }
}
