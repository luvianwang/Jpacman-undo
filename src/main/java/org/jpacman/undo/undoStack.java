package org.jpacman.undo;

import java.util.ArrayList;
import java.util.List;

import org.jpacman.framework.model.*;

class undoStack {
    //UndoableGame Game;
	 Tile playerTile;
	 int points;
	private List<Tile> ghostTile = new ArrayList<Tile>();
	
	public undoStack(){
		playerTile = null;
		points = 0;
		ghostTile = null;
	}
	
	public void pushStack(UndoableGame Game){
		points = Game.getPlayer().getPoints();
		playerTile = Game.getPlayer().getTile();
		for (Ghost ghost : Game.getGhosts()){
		      ghostTile.add(ghost.getTile());
		}
		
	}
	
	
	public Tile getPlayerLocation(){
		return playerTile;
	}
	
	public List<Tile> getGhostLocation(){
		List<Tile> result = new ArrayList<Tile>();
		result.addAll(ghostTile);
		return result;
	}
	
	public int getPoints(){
		return points;
	}
}