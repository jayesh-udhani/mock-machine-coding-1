package models;

import java.util.*;
import java.io.*;
import services.*;

public class BoardEntity {
	public int numberOfCells;
	public Map<Integer,Integer> snakes;
	public Map<Integer,Integer> ladders;
	public List<Player> players;
	public Dice dice;
	public Map<Player,Integer> positions;
	public BoardEntity(int numberOfCells,Dice dice,List<Snake> snakes,List<Ladder> ladders,List<Player> players)
	{
		int index;
		this.numberOfCells=numberOfCells;
		this.dice=dice;
		this.snakes=new HashMap<>();
		for(index=0;index<snakes.size();index++)
			this.snakes.put(snakes.get(index).start, snakes.get(index).end);
		this.ladders=new HashMap<>();
		for(index=0;index<ladders.size();index++)
			this.ladders.put(ladders.get(index).start, ladders.get(index).end);
		this.players=players;
		positions=new HashMap<>();
		for(index=0;index<players.size();index++)
			positions.put(players.get(index), 0);
	}
}
