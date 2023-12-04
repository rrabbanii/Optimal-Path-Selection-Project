import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.printf("\n%104s\n\n","Welcome to Hong Kong's Mass Transit Railway Guidance System.");
    System.out.printf("%106s\n\n","We will help you find the ideal route to reach your destination.");
    
    do{
      dijsktra MTR = new dijsktra(98);

      System.out.println();
      for(int i=0; i<=140;i++){
        System.out.print("-");
      }
      System.out.printf("\n\n%85s\n\n","-=[ LIST OF STATIONS ]=-");
      
      for(int i = 0; i < 98; i++){
        if((i + 1) % 4 == 0){
          System.out.println("\t["+(i+1)+"]"+ " " + MTR.Station[i]);
        } else if((i + 1) % 3 == 0){
          System.out.printf("%15s%-20s", "["+(i + 1)+"]"+ " ", MTR.Station[i]); 
        } else if((i + 1) % 2 == 0){
          System.out.printf("%15s%-20s", "["+(i + 1)+"]"+ " ", MTR.Station[i]);
        } else{ 
          System.out.printf("%15s%-20s", "["+(i + 1)+"]"+ " ", MTR.Station[i]);
        }
      }

      System.out.println("\n");
      for(int i=0; i<=140;i++){
        System.out.print("-");
      }
      
      System.out.println();
      System.out.printf("\n%85s","Choose Starting Station: ");
      int src = scan.nextInt();
      while(src < 1 || src > 98){
        System.out.printf("\n%89s\n","Please enter a valid input.");
        System.out.printf("\n%85s","Choose Starting Station: ");
        src = scan.nextInt();
      }
      System.out.printf("\n%88s","Choose Destination Station: ");
      int dst = scan.nextInt();
      while(dst < 1 || dst > 98){
        System.out.printf("\n%89s\n","Please enter a valid input.");
        System.out.printf("\n%88s","Choose Destination point: ");
        dst = scan.nextInt();
      }

      System.out.println();
      for(int i=0; i<=140;i++){
        System.out.print("-");
      }
      
      System.out.println();
      System.out.printf("\n\n%78s\n\n","[ MAIN PATH ]");
      MTR.dijsktraAlg(src - 1, dst - 1);

      System.out.printf("\n\n%89s\n","Would you like to continue?");
      System.out.printf("\n%68s","[1] Yes");
      System.out.printf("\n%67s","[2] No");
      System.out.printf("\n\n%77s","Insert Number: ");
      int i = scan.nextInt();
      if(i != 1)
        break;
    }while(true);

    System.out.printf("\n\n\n%107s\n\n","Thank You for using the Mass Transit Railway Guidance System.");
    for(int i=0; i<=140;i++){
      System.out.print("-");
    }
    scan.close();
  }
}