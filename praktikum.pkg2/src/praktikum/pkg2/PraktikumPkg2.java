package praktikum.pkg2;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PraktikumPkg2 {

    public static void main(String[] args) throws IOException{
        
        ArrayList tembakau = new ArrayList<>();
        
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(isr);
        
        
        while(true){
        System.out.println("Toko Bacco");
        System.out.println("1. Tambah Data ");
        System.out.println("2. Lihat Data");
        System.out.println("3. Update data");
        System.out.println("4. Hapus data");
        System.out.println("5. Exit");
        
        System.out.println("Pilihan Anda : ");
        int pil = Integer.parseInt(br.readLine());
        
        if (pil == 1){
            System.out.println("Masukkan Nama : ");
            String nama = br.readLine();
            System.out.println("Masukkan rasa : ");
            String rasa = br.readLine();
            buat tbk = new buat(nama, rasa);
            tembakau.add(tbk.nama);
            tembakau.add(tbk.rasa);
            tbk.notif();
            
            }else if(pil == 2){
                System.out.println("Daftar nama dan Rasa Bacco");
            for(int i = 0; i<tembakau.size(); i++){
                System.out.println(tembakau.get(i));
                }
            }else if(pil == 3){
                update apd = new update();
                apd.tanyaIdx();
                int idx = Integer.parseInt(br.readLine());
                
                apd.tanyaGanti();
                String gantinya = br.readLine();
                
                tembakau.set(idx, gantinya);
                
                apd.sukses();
                
            }else if(pil == 4){
                hapus hps = new hapus();
                        
                hps.tanyaIdx();
                int idx = Integer.parseInt(br.readLine());
                
                tembakau.remove(idx);
                
                hps.sukses();
        
            }else if(pil == 5){
                break;
            }
        }
    }
    
}
