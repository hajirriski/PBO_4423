import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Gameku gameku = new Gameku();
        while (true) {
            String namaGame = gameku.tambahGame();
            if(namaGame.equals("x")) {
                break;
            }
        }
        if(!gameku.cekGame()){
            return;
        }
        gameku.gameTerkini();
        gameku.hapusGame();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan game yang dicari (isikan x saat selesai) = ");
            String namaGame = input.nextLine();
            if(namaGame.equals("x")) {
                break;
            }
            gameku.cariGame(namaGame);
        }
        System.out.println("List game kamu : ");
        gameku.cetakGame();
    }
}
