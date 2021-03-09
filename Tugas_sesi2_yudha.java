package tugas2_java_array;

public class Tugas_sesi2_yudha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String [][] ruangkamar ={
          {"1","2","3","4","X"},
          {"1","2","3","4","5"},
          {"1","2","3","4","5"},
          {"1","2","3","X","5"}
      };
    int totalkamarkosong =0;
    for (int i =0; i < ruangkamar.length; i++) {
        for (int j = 0; j < ruangkamar [i].length; j++) {
            if (ruangkamar[i][j]=="X"){
                System.out.println("tamu berada di lantai: "+(i+1)+"kamar"+(j+1));
            }else {
                totalkamarkosong += 1;
            }
        }
    }System.out.println("Kamar yang tersedia ada = "+total kamar kosong);
    }  
}
