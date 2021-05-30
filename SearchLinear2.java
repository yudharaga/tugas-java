import java.util.Scanner;

/**
 *
 * @author Arzan-PC
 * Yudha raga Putra
 * TI20E
 */

public class SearchLinear2 {
int Nim;
String Nama;
String Alamat;
public SearchLinear2(int Nim, String Nama, String Alamat){
    this.Nim = Nim;
    this.Nama = Nama;
    this.Alamat = Alamat;
}
public int getNIM(){
   return Nim;
}
public String getNAMA(){
    return Nama;
}
public String getALAMAT(){
    return Alamat;
}
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
           int x,y;
           
        String cari;
        SearchLinear2[] Data = new SearchLinear2[6];
        System.out.println("NIM\tNama\t\tAlamat");
        Data[0]=new SearchLinear2(1102021," Andri Hariadi"," Bandung");
        Data[1]=new SearchLinear2(1102022," Dewi Lestari"," Surabaya");
        Data[2]=new SearchLinear2(1102023," Dewi Agustiani"," Malang");
        Data[3]=new SearchLinear2(1102024," Reni Indriani"," Malang");
        Data[4]=new SearchLinear2(1102025," Toni Sukmawan"," Surabaya");
        Data[5]=new SearchLinear2(1102026," Toni Gunawan"," Bandung");
        
        boolean ditemukan=false;
        for(x=0;x<Data.length;x++){
        System.out.println(Data[x].getNIM()+""+Data[x].getNAMA()+""+Data[x].getALAMAT());
        }
        
        System.out.println("Cari berdasarkan Nama  :");
        
        
        cari=scan.next();
        for (x=0; x<Data.length; x++){
            String splitnama[]=Data[x].getNAMA().split("");
            for (y=0; y<splitnama.length; y++){
                if(cari.equalsIgnoreCase(splitnama[y])){
                    System.out.println("\nDATA BERHASIL DITEMUKAN");
                    
                    for(int i=5;i<Data.length;i++){
                    System.out.println("NIM :"+Data[x].getNIM()+"\nNama :"+Data[x].getNAMA()+"\nAlamat:"+Data[x].getALAMAT());
                   
                    ditemukan=true;
                    System.out.println("\nNama"+cari+"Ditemukan di Index ke:"+(x)+"\nPosisi Nomor Ke :"+(x+1));
                    
                    
                }
                }
            }
        }
        
        if(ditemukan == false){
            System.out.println("Nama"+cari+"TIDAK DITEMUKAN!");
        }
        
        
        
    }
}
