package com.qa.coordsgame;

import java.util.concurrent.ThreadLocalRandom;

import java.util.Scanner;

public class Game {
	int goalPositionX, goalPositionY, playerPositionX, playerPositionY;
	boolean isRunning;
    
	public Game() {
		this.playerPositionX = 0;
		this.playerPositionY = 0;
		this.goalPositionX = ThreadLocalRandom.current().nextInt(0,20);
		this.goalPositionY = ThreadLocalRandom.current().nextInt(0,20);
		isRunning = true;
		startGame();
	}
	
	public void outputNewPlayerPosition() {
		System.out.println("Your new position is: ("
                + this.playerPositionX + ", "  
                + this.playerPositionY + ")");
	}
	
	public void startGame() {
		System.out.println("Welcome to our Coordinate game!");
		System.out.println("Your starting position is (0,0");
		System.out.println("The goal can be found at position (" + this.goalPositionX + ", "
				+ this.goalPositionY + ")");
		System.out.println("You can move arround by using the commands LEFT, RIGHT, UP, DOWN.");
        System.out.println("You can terminate the game by typing EXIT.");
        System.out.println();
		
		do {
			//UserInput = new UserInput()
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			switch(input.toLowerCase()) {
				case "left":
					this.playerPositionX--;
					outputNewPlayerPosition();
			    
				break;
				case "right":
					this.playerPositionX++;
					outputNewPlayerPosition();
			    break;
			    
				case "down":
					this.playerPositionY--;
					outputNewPlayerPosition();
				break;
				
				case "up":
					this.playerPositionY++;
					outputNewPlayerPosition();
			    break;
			    
				case "exit":
					this.isRunning = false;
					break;
				
				default:
					System.out.println("Invalid command.");
			}
			
		} while (isRunning);
	}
	
	public static void main (String[] args) {
		Game game = new Game();
	}
}
