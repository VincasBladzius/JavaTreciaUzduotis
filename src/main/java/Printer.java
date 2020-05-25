import javafx.scene.control.TextArea;
import players.Player;

import java.util.ArrayList;
import java.util.HashSet;

public interface Printer{

   ArrayList<String> printAll(HashSet<Player> players);

   default public ArrayList<String> printCertain(HashSet<Player> players, String nation, Games games){
      return games.printCertainPlayers(players, nation);
   }

   static void print(Games games, ArrayList<String> printMatches, String nation, TextArea AllMatches){
      games.printMatches(printMatches, nation, AllMatches);
   }

}
