package TTS;
import java.util.Scanner;

public class Main {
    
    private Integer pil, nyawa, lvlStart = 0, lvl = 1, skor, count = 0;
    private String inJawaban, jawaban, keterangan;
    private String[] jwbSalah = new String[3];
    private String[] soalSalah = new String[3];
    private final Scanner scn = new Scanner(System.in);
    private final DB arr = new DB();
    
    private void initMain() {
        try {
            System.out.println("");
            System.out.println("###############################################");
            System.out.println("###                                         ###");
            System.out.println("### WELCOME TO GAME TTS (TEKA TEKI SANTAI)  ###");
            System.out.println("###                                         ###");
            System.out.println("###############################################");
            System.out.println("\nPilihan : \n");
            System.out.println("1. Main Game.");
            System.out.println("2. Pilih Level.");
            System.out.println("3. Keluar");
            System.out.println("\n=====================================");
            ulang(3);
            switch(pil) {
                case 1 :
                    pilihan1();
                    break;
                case 2 :
                    pilihan2();
                    break;
                case 3 :
                    penutupan();
                    System.exit(0);
                    break;
            }
        } catch (Exception e) {
            error(e);
        }
    }
    
    private void pilihan1() {
        try {
            System.out.println("\n");
            System.out.println("Level   : " + lvl);
            System.out.println("");
            nyawa = 3; skor = 0; count = 0;
            for(int i = lvlStart; i < (lvlStart + 5) ; ++i) {
                jawaban = arr.getJawaban(i);
                System.out.println("Pertanyaan  : " + arr.getPertanyaan(i) + " (Hint : " + jawaban.length() + " huruf)");
                System.out.print  ("Jawab       : "); inJawaban = scn.next().toUpperCase();
                
                if(inJawaban.equals(jawaban)) {
                    keterangan = "Jawaban anda benar";
                    skor += 20;
                } else {
                    keterangan = "Jawaban anda salah";
                    jwbSalah[count] = jawaban;
                    soalSalah[count] = arr.getPertanyaan(i);
                    nyawa--; count++;
                }
                
                System.out.println("\n" + keterangan + "\n");
                
                if(nyawa == 0) {
                    System.out.println("Kesempatan bermain anda habis, anda sudah salah 3 kali!\n");
                    break;
                }
            }
            System.out.println("=====================================");
            System.out.println("Skor                : " + skor);
            System.out.println("Pertanyaan benar    : " + (skor / 20));
            System.out.println("=====================================");
            
            if(count > 0) {
                System.out.println("\nKOREKSI JAWABAN!..\n");
                for(int i = 0; i < count; i++) {
                    System.out.println((i + 1) + ". " + soalSalah[i] + " = " + jwbSalah[i] + "\n");
                }
            }
            System.out.println("=====================================");
            initMain();
        } catch (Exception e) {
            error(e);
        }
    }
    
    private void pilihan2() {
        try {
            System.out.println("\n=> Pilihan level <=\n");
            System.out.println("1. Mudah");
            System.out.println("2. Gampang");
            System.out.println("3. Easy");
            ulang(3);
            switch (pil) {
                case 1:
                    lvlStart = 0; lvl = 1;
                    break;
                case 2:
                    lvlStart = 5; lvl = 2;
                    break;
                default:
                    lvlStart = 10; lvl = 3;
                    break;
            }
            initMain();
        } catch (Exception e) {
            error(e);
        }
    }
    
    private void ulang(int max) {
        System.out.print("\nMasukkan Pilihan  : "); pil = scn.nextInt();
        if(max < pil) {
            ulang(max);
        }
    }
    
    private void penutupan() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(" ******************************************************************************");
        System.out.println();
        System.out.println(" -----########-------------------------##-----########-------------------------");
        System.out.println(" ---##---------------------------------##-----##------##-----------------------");
        System.out.println(" -##-------------######---######---######-----##------##--##------##----####---");
        System.out.println(" -##----######-##----##-##----##-##----##-----########------##--##----##----##-");
        System.out.println(" -##--------##-##----##-##----##-##----##-----##------##----##--##----########-");
        System.out.println(" -####------##-##----##-##----##-##----##-----##------##----####------##-------");
        System.out.println(" -----########-########-########---######-----########--------##--------######-");
        System.out.println(" -------------------------------------------------------------##---------------");
        System.out.println(" -----------------------------------------------------------##-----------------");
        System.out.println();
        System.out.println(" ******************************************************************************");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    private void error(Exception e) {
        System.err.println("Error : " + e.getMessage());
    }
    
    public static void main(String[] args) {
        new Main().initMain();
    }
    
}
