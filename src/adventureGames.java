import java.util.Scanner;


public class adventureGames {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\n\n You are on an island surrounded by water.\nThere is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
    String command = scan.nextLine();
    if (command.equals("n")) 
    {
      System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
    }
    else if (command.equals("e"))
    {
      System.out.println("You enter the beach shack and make some food. \nThe food may have been spoiled, and you may have food poisoning.");
    }
    else if (command.equals("w"))
    {
      System.out.println("You enter a volcano, but you arent stupid, so you leave. \nHowever, now where will you go (n,e,s)?");
      command = scan.nextLine();
      if (command.equals("n")) 
      {
        System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
      }
      else if (command.equals("e"))
      {
        System.out.println("You enter the beach shack and make some food. \nThe food may have been spoiled, and you may have food poisoning.");
      }
      else
      {
        System.out.print("You enter a boat and go to sea. \nThis boat has a hole in it and you drown. :(");
      }
    }
    else if (command.equals("s"))
    {
      System.out.print("You enter a boat and go to sea. \nThis boat has a hole in it and you drown. :(");
    }
    
    System.out.println("End of adventure!");   
    scan.close();
  }
}