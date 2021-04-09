package Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak data siswa yang ingin dimasukan: ");
        int dataCount = input.nextInt();

        ArrayList<Student> students = new ArrayList<Student>();
        for(int i = 0; i < dataCount; i++){
            System.out.print("Nim     : ");
            String nim = input.next();
            System.out.print("Nama    : ");
            String name = input.next();
            System.out.print("Nilai Teori   : ");
            Integer theoryScore = input.nextInt();
            System.out.print("Nilai Praktek : ");
            Integer practiceScore = input.nextInt();
            System.out.println();
            Student student = new Student(nim, name, practiceScore, theoryScore);
            students.add(student);
        }

        System.out.println();
        System.out.println("\nDaftar Nilai Siswa");
        students.forEach((student -> {
            System.out.println();
            System.out.println("Daftar Nilai " + student.getName() + "-" + student.getNim());
            System.out.println("Nilai Teori = " + student.getTheoryScore());
            System.out.println("Nilai Praktek = " + student.getPracticeScore());
            System.out.println("Nilai Rata-rata = " + student.getRata());
            System.out.println();
        }));
    }
}
