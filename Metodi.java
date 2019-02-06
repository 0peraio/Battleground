public class Metodi {
  public static char[][] creaBattleGround() {
    char[][] battleground = new char[25][25];
    for (int i=1; i<battleground.length;i++) {
      for (int j=1; j<battleground[i].length; j++) {
        battleground[i][j] = ' ';
      }
    }
    return battleground;
  }

  public static char[][] creaBattleGroundVisivo() {
    char[][] battlegroundVisivo = new char[25][25];
    for (int i=1; i<battlegroundVisivo.length;i++) {
      for (int j=1; j<battlegroundVisivo[i].length; j++) {
        battlegroundVisivo[i][j] = ' ';
      }
    }
    return battlegroundVisivo;
  }


  public static void aggiungiAbitazioniCivili(char[][] battleground) {
    int n = 0;
    int r1;
    int r2;
    while (n < 25) {
      r1 = (int)(Math.random()*24+1);
      r2 = (int)(Math.random()*24+1);
      if (battleground[r1][r2] == ' ') {
        battleground[r1][r2] = '$';
        n++;
      }
    }
  }

  public static void aggiungiAlleatiPlayer1(char[][] battleground) {
    int n = 0;
    int r1;
    int r2;
    while (n < 25) {
      r1 = (int)(Math.random()*24+1);
      r2 = (int)(Math.random()*24+1);
      if (battleground[r1][r2] == ' ') {
        battleground[r1][r2] = '1';
        n++;
      }
    }
  }

  public static void aggiungiAlleatiPlayer2(char[][] battleground) {
    int n = 0;
    int r1;
    int r2;
    while (n < 25) {
      r1 = (int)(Math.random()*24+1);
      r2 = (int)(Math.random()*24+1);
      if (battleground[r1][r2] == ' ') {
        battleground[r1][r2] = '2';
        n++;
      }
    }
  }
  
  public static String indizio1Player1(int rigaObb1, int colonnaObb1) {
  	if (rigaObb1 > 0 && rigaObb1 < 12) return "tra la riga 0 e la riga 12.";
  	else return "tra la riga 12 e la riga 24.";
  	
  }
  
  public static String indizio2Player1(int rigaObb1, int colonnaObb1) {
  	if (colonnaObb1 > 0 && colonnaObb1 < 12) return "tra la colonna 0 e la colonna 12.";
  	else return "tra la colonna 12 e la colonna 24.";
  	
  } 
 
  public static String indizio1Player2(int rigaObb2, int colonnaObb2) {
  	if (rigaObb2 > 0 && rigaObb2 < 12) return "tra la riga 0 e la riga 12.";
  	else return "tra la riga 12 e la riga 24.";
  	
  }    

  public static String indizio2Player2(int rigaObb2, int colonnaObb2) {
  	if (colonnaObb2 > 0 && colonnaObb2 < 12) return "tra la colonna 0 e la colonna 12.";
  	else return "tra la colonna 12 e la colonna 24.";
  	
  }
  public static void stampaBattlegroundVisivo(char[][] battlegroundVisivo) {
    System.out.println("");
    //System.out.println("   1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24  ");
    //System.out.println("");
    System.out.println("  * * * * * * * * * * * * * * * * * * * * * * * *  ");
    //System.out.println("");
    for (int i=1; i<battlegroundVisivo.length; i++) {
      System.out.print("* ");
      //System.out.print("");
      for (int j=1; j<battlegroundVisivo[i].length; j++) {
      	System.out.print("");
        System.out.print(battlegroundVisivo[i][j] + " ");
        if (j == 24) System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("  * * * * * * * * * * * * * * * * * * * * * * * *  ");
  }
  
  public static void stampaBattleground(char[][] battleground) {
    System.out.println("");
    //System.out.println("   1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24  ");
    //System.out.println("");
    System.out.println("  * * * * * * * * * * * * * * * * * * * * * * * *  ");
    //System.out.println("");
    for (int i=1; i<battleground.length; i++) {
      System.out.print("* ");
      //System.out.print("");
      for (int j=1; j<battleground[i].length; j++) {
      	System.out.print("");
        System.out.print(battleground[i][j] + " ");
        if (j == 24) System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("  * * * * * * * * * * * * * * * * * * * * * * * *  ");
  }  
}
