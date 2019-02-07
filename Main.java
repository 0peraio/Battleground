import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner tastiera = new Scanner(System.in);

    //Interfaccia

    Menu.Start();

    //Preparazione mondo di gioco

    char [][] battleground = Metodi.creaBattleGround();
    Metodi.aggiungiAbitazioniCivili(battleground);
    Metodi.aggiungiAlleatiPlayer1(battleground);
    Metodi.aggiungiAlleatiPlayer2(battleground);
    char[][] battlegroundVisivo = Metodi.creaBattleGroundVisivo();

    System.out.println("");
    System.out.println("PLAYER 1: inserisci le coordinate della tua base (Il player 2 non deve leggere le coordinate)");
    System.out.println("");
    System.out.print("Riga: ");
    int rigaObb1 = tastiera.nextInt();
    System.out.println("");
    System.out.print("Colonna: ");
    int colonnaObb1 = tastiera.nextInt();
    Menu.Start();
    System.out.println("");
    System.out.println("PLAYER 2: inserisci le coordinate della tua base (Il player 1 non deve leggere le coordinate)");
    System.out.println("");
    System.out.print("Riga: ");
    int rigaObb2 = tastiera.nextInt();
    System.out.println("");
    System.out.print("Colonna: ");
    int colonnaObb2 = tastiera.nextInt();
    System.out.println("");

    battleground[rigaObb1][colonnaObb1] = '%';
    battleground[rigaObb2][colonnaObb2] = '%';

    //Inizio gioco

    Boolean partita = true;
    Boolean player1 = true;
    Boolean player2 = true;
    Metodi.stampaBattlegroundVisivo(battlegroundVisivo);

    while (partita) {

      //Stampa battleground visivo

      //Metodi.stampaBattlegroundVisivo(battlegroundVisivo);

      player1 = true;
      player2 = true;

      //Turno player 1

      while (player1) {
        Metodi.stampaBattlegroundVisivo(battlegroundVisivo);
        System.out.println("");
        System.out.println("TURNO PLAYER 1");
        System.out.println("");
        System.out.println("Inserisci una riga e una colonna da bombardare.");
        System.out.println("");
        System.out.print("Riga: ");
        int riga1 = tastiera.nextInt();
        System.out.println(" ");
        System.out.print("Colonna: ");
        int colonna1 = tastiera.nextInt();
        System.out.println(" ");

        //Rileva obiettivo colpito

        if (battleground[riga1][colonna1] == ' ') {
          System.out.println("Colpo andato a vuoto!");
          battlegroundVisivo[riga1][colonna1] = 'X';
          player1 = false;
        }
        else if (battleground[riga1][colonna1] == '$') {
          System.out.println("Il player 2 ha vinto la partita!");
          battlegroundVisivo[riga1][colonna1] = '$';
          partita = false;
          player1 = false;
          player2 = false;
        }
        else if (battleground[riga1][colonna1] == '1') {
          System.out.println("Hai colpito una tua base alleata!");
          System.out.print("Hai lasciato al tuo avversario il seguente indizio: ");
          System.out.println("La base del player 1 si trova: " + Metodi.indizio2Player1(rigaObb1, colonnaObb1));
          battlegroundVisivo[riga1][colonna1] = '1';
          player1 = false;
        }

        else if (battleground[riga1][colonna1] == '2') {
          System.out.println("Hai colpito una base nemica!");
          System.out.print("Il tuo avversario ha lasciato il seguente indizio: ");
          System.out.println("La base del player 2 si trova: " + Metodi.indizio1Player2(rigaObb2, colonnaObb2));
          battlegroundVisivo[riga1][colonna1] = '2';
          player1 = false;
        }

        else if (battleground[riga1][colonna1] == '%') {
          System.out.println("La base nemica e' stata distrutta! Complimenti, hai vinto la partita!");
          battlegroundVisivo[riga1][colonna1] = '%';
          partita = false;
          player1 = false;
          player2 = false;
        }
        else {
          System.out.println("Il colpo non e' andato a buon fine!");
          player1 = false;
        }
      }

      //Turno player 2

      while (player2) {
        Metodi.stampaBattlegroundVisivo(battlegroundVisivo);
        System.out.println("");
        System.out.println("TURNO PLAYER 2");
        System.out.println("");
        System.out.println("Inserisci una riga e una colonna da bombardare.");
        System.out.println("");
        System.out.print("Riga: ");
        int riga2 = tastiera.nextInt();
        System.out.println(" ");
        System.out.print("Colonna: ");
        int colonna2 = tastiera.nextInt();
        System.out.println(" ");

        //Rileva obiettivo colpito

        if (battleground[riga2][colonna2] == ' ') {
          System.out.println("Colpo andato a vuoto!");
          battlegroundVisivo[riga2][colonna2] = 'X';
          player2 = false;
        }
        else if (battleground[riga2][colonna2] == '$') {
          System.out.println("Il player 1 ha vinto la partita!");
          battlegroundVisivo[riga2][colonna2] = '$';
          partita = false;
          player2 = false;
        }

        else if (battleground[riga2][colonna2] == '2') {
          System.out.println("Hai colpito una tua base alleata!");
          System.out.print("Hai lasciato al tuo avversario il seguente indizio: ");
          System.out.println("La base del player 2 si trova: " + Metodi.indizio2Player2(rigaObb2, colonnaObb2));
          battlegroundVisivo[riga2][colonna2] = '2';
          player2 = false;
        }
        else if (battleground[riga2][colonna2] == '1') {
          System.out.println("Hai colpito una base nemica!");
          System.out.print("Il tuo avversario ha lasciato il seguente indizio: ");
          System.out.println("La base del player 1 si trova: " + Metodi.indizio1Player1(rigaObb1, colonnaObb1));
          battlegroundVisivo[riga2][colonna2] = '1';
          player2 = false;
        }

        else if (battleground[riga2][colonna2] == '%') {
          System.out.println("La base nemica e' stata distrutta! Complimenti, hai vinto la partita!");
          battlegroundVisivo[riga2][colonna2] = '%';
          partita = false;
          player2 = false;
        }
        else {
          System.out.println("Il colpo non è andato a buon fine!");
          player2 = false;
        }
      }



    }

    Metodi.stampaBattleground(battleground);
  }
}
