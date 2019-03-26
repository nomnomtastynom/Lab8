package lab8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame
{
 protected   LinkedHashMap<String, GamePiece> playerPieces = new LinkedHashMap<String, GamePiece>();
 protected    LinkedHashMap<String, Location> playerLocation = new LinkedHashMap<String, Location>();
 
 public BoardGame(){
     
 }
 
 public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation){
     if (playerPieces.containsValue(gamePiece)){
         return false;
     }
     else{
         playerPieces.put(playerName, gamePiece);
         playerLocation.put(playerName, initialLocation);
     }
    
    return true;
 }
 public GamePiece getPlayerGamePiece(String playerName){
    
    return playerPieces.get(playerName);
     
 }
public String getPlayerWithGamePiece(GamePiece gamePiece) {
    
   for (String name: playerPieces.keySet()){
       if (gamePiece == playerPieces.get(name)){
           return name;
       }
    }
return null;
}
public Location getPlayersLocation(String player){
    return playerLocation.get(player);
}
public ArrayList<String> getPlayersAtLocation(Location loc){
    
    for (ArrayList<String> name: playerLocation.keySet()){
        if (loc == playerLocation.get(name)){
            return name;
        }
     }
 return null;
}
public void movePlayer(String playerName,Location newLocation){
    playerLocation.put(playerName, newLocation);
}
public String[] moveTwoPlayers(String[] playerName,  Location[] newLocation){
    
}
}
