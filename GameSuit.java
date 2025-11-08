package uts_pbo;
import java.util.Random;
import java.util.Scanner;

class SuitGame {
    String[] pilihan = {"batu", "gunting", "kertas"};
    Random random = new Random();

    String pilihanKomputer() {
        return pilihan[random.nextInt(pilihan.length)];
    }

    String tentukanPemenang(String pemain, String komputer) {
        if (pemain.equals(komputer)) {
            return "Seri!";
        } else if (
            (pemain.equals("batu") && komputer.equals("gunting")) ||
            (pemain.equals("gunting") && komputer.equals("kertas")) ||
            (pemain.equals("kertas") && komputer.equals("batu"))
        ) {
            return "Kamu MENANG!";
        } else {
            return "Kamu KALAH!";
        }
    }
}

public class GameSuit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SuitGame game = new SuitGame();

        System.out.println("===  GAME SUIT JAVA  ===");
        System.out.print("Pilih (batu / gunting / kertas): ");
        String pilihanPemain = input.nextLine().toLowerCase();
        
        while (!pilihanPemain.equals("batu") && !pilihanPemain.equals("gunting") && !pilihanPemain.equals("kertas")) {
                System.out.println("Pilihan tidak valid! Coba lagi.");
        System.out.print("Pilih (batu / gunting / kertas): ");
        pilihanPemain = input.nextLine().toLowerCase();
                }
        String pilihanKomputer = game.pilihanKomputer();

        System.out.println("Kamu memilih: " + pilihanPemain);
        System.out.println("Komputer memilih: " + pilihanKomputer);
        System.out.println("--------------------------");
        System.out.println(game.tentukanPemenang(pilihanPemain, pilihanKomputer));
    }
}

