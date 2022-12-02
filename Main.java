import java.util.Scanner;
import java.util.Random;


class Main {

  public static void main(String[] args) {
    menu();
  }
  public static void menu(){
    Random n = new Random();
    Scanner kb = new Scanner(System.in);
    int j=0;
    int c=0;
    int e=0;
    int hum;
    System.out.println("********************");
    System.out.println("Escreva seu nome: ");
    System.out.println("********************");
    String Nm = kb.nextLine();
    do{

    System.out.print("************************\n");
    System.out.print("  Escolha uma opção    *\n");
    System.out.print("  0. Para sair         *\n");
    System.out.print("  1 para pedra         *\n");
    System.out.print("  2 para papel         *\n");
    System.out.print("  3 para tesoura       *\n");
    System.out.print("************************\n");
    System.out.print("  Placar       Placar  *\n");
    System.out.print("  "+Nm+"         PC    *\n");
    System.out.print("     "+j+"            "+c+"    \n");
    System.out.print("************************\n");
    System.out.print("  Empates:             *\n");
    System.out.print("  "+e+"                    *\n");
    System.out.print("************************\n");
    hum = kb.nextInt();
    int maq = n.nextInt(4-1) + 1;
    System.out.println(maq);
      if(hum==1 && maq==2){
        c = c + 1;
      }
      else if(hum==2 && maq==3){
        c= c + 1;
      }
      else if(hum==3 && maq==3){
        e = e + 1;
      }
      else if(hum==2 && maq==1){
        j = j+1;
      }
      else if(hum==3 && maq==2){
        j=j+1;
      }
      else if(hum==2 && maq==2){
        e=e+1;
      }
      else if(hum==1 && maq==1){
        e=e+1;
      }
      else if(hum==3 && maq==1){
        c=c+1;
      }
      else if(hum==1 && maq==3){
        j=j+1;
      }
    }
    while(hum!=0);
    System.out.print("************************\n");
  }
}