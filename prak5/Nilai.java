import java.util.ArrayList;
import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyak nilai yang ingin inputan : ");
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int scoreCount = input.nextInt();
        for(int i = 0; i < scoreCount; i++){
            System.out.print("Masukan nilai : ");
            scores.add(input.nextInt());
        }
        printScore(scores, scoreCount);
    }
    static String convertScore(Integer score) {
        String scoreHuruf = new String();
        if(score >= 85){
            scoreHuruf = "A";
        }else if((score>=70) && (score<85)){
            scoreHuruf = "B";
        }else if((score>=60) && (score<70)){
            scoreHuruf = "C";
        }else if((score>=50) && (score<60)){
            scoreHuruf = "D";
        }else if(score<50){
            scoreHuruf = "E";
        }
        return scoreHuruf;
    }
    static void printScore(ArrayList<Integer> scores, int count){
        System.out.println();
        System.out.println("Daftar Nilai");
        for(int j = 0; j < count; j++){
            System.out.printf("Nilai %d, nilai hurufnya adalah %s", scores.get(j), convertScore(scores.get(j)));
            System.out.println();
        }
    }
}
