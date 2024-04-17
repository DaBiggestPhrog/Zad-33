import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Wczytanie znaku
    System.out.print("Podaj znak do narysowania lustrzanego trójkąta: ");
    char znak = scanner.next().charAt(0);

    // Wczytanie liczby wierszy
    System.out.print("Podaj liczbę wierszy lustrzanego trójkąta: ");
    int liczbaWierszy = scanner.nextInt();

    // Rysowanie trójkąta
    for (int i = 1; i <= liczbaWierszy; i++) {
      for (int j = 1; j <= liczbaWierszy - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(znak);
      }
      System.out.println();
    }
  }
}
