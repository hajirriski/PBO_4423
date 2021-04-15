import java.util.Scanner;
import java.util.Stack;

public class Gameku {
    Stack<String> daftarGame;
    Gameku(){
        daftarGame = new Stack<String>();
    }
    public String tambahGame() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama game (isikan x jika selesai) = ");
        String namaGame = input.nextLine();
        if(namaGame.equals("x")) {
            return namaGame;
        }
        this.daftarGame.push(namaGame);
        return  namaGame;
    }
    public void hapusGame() {
        String gameTerhapus = this.daftarGame.pop();
        System.out.println(gameTerhapus + " dihapus dari daftar Game karena ga seru (POP)");
    }
    public void gameTerkini() {
        String gameBaru = this.daftarGame.peek();
        System.out.println(gameBaru + " ditambahkan dari daftar Game karena kayanya seru (PEEK)");
    }
    public void cariGame(String namaGame) {
        Integer pos = (Integer) daftarGame.search(namaGame);
        if(pos == -1) {
            System.out.println(namaGame + " tidak ada dalam daftar Game (SEARCH)");
            return;
        }
        System.out.println(namaGame + " ada dalam daftar Game (SEARCH)");
    }
    public boolean cekGame() {
        if(this.daftarGame.empty()) {
            System.out.println("kosong nih (EMPTY)");
            return false;
        }
        System.out.println("Ada " + this.daftarGame.size() + " game dalam daftar game kamu (EMPTY)");
        return true;
    }
    public void cetakGame() {
        System.out.print(daftarGame);
    }
}
