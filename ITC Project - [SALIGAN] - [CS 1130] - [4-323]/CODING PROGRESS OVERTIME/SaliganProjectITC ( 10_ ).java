package javafunda;

import java.util.Scanner;
import java.util.Random;

public class SaliganProjectITC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Limiter = 0;
		int RoundNumber = 0;
		int UserAttackDmg = 10;
		
		int FirstEnemyAttackDmg;
		int SecondEnemyAttackDmg;
		int ThirdEnemyAttackDmg;
		
		int FirstOrder;
		int SecondOrder;
		int ThirdOrder;
		
		int FirstReveal = 0;
		int SecondReveal = 0;
		int ThirdReveal = 0;
		
		System.out.print("| +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n");
		System.out.print("| Welcome to the Game of Imperium!\n");
		System.out.print("| +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n");
		
		System.out.print("|\n");
		Scanner input = new Scanner(System.in);
		System.out.print("| >>> Please enter your name: ");
		String name = input.nextLine();
		System.out.print("|\n");
		System.out.print("| -------------------------------------------------------------------------------\n");
		System.out.print("| Greetings, "+name+"! I am Kirbot, and I am here to guide you as you play the game!\n");
		System.out.print("| -------------------------------------------------------------------------------\n");
				
		System.out.print("|\n");
		System.out.print("| >>> Please select a number of rounds (1-5): ");
		String Rounds = input.nextLine();
		System.out.print("|\n");
		
		if (Rounds.equalsIgnoreCase("5")) 
			Limiter = 5;
		
		if (Rounds.equalsIgnoreCase("4")) 
			Limiter = 4;
		
		if (Rounds.equalsIgnoreCase("3")) 
			Limiter = 3;
		
		if (Rounds.equalsIgnoreCase("2")) 
			Limiter = 2;
		
		if (Rounds.equalsIgnoreCase("1")) 
			Limiter = 1;
		
		for (RoundNumber=1;RoundNumber<=Limiter;RoundNumber++) { 
			
			FirstEnemyAttackDmg = (randomSpecificDamageRange(5,10));
			SecondEnemyAttackDmg = (randomSpecificDamageRange(11,15));
			ThirdEnemyAttackDmg = (randomSpecificDamageRange(16,20));
			
			
			System.out.print("| +-+-+-+-+\n");
			System.out.print("| Round: "+RoundNumber+"\n");
			System.out.print("| +-+-+-+-+\n");
									
			System.out.print("|\n");
			System.out.print("| "+name+"'s Attack Damage: "+UserAttackDmg+"\n");
			System.out.print("|\n");
			System.out.print("| Enemy #1: "+FirstEnemyAttackDmg+" Attack Dmg\n");
			System.out.print("| Enemy #2: "+SecondEnemyAttackDmg+" Attack Dmg\n");
			System.out.print("| Enemy #3: "+ThirdEnemyAttackDmg+" Attack Dmg\n");
			System.out.print("|\n");
			
			
			
			}
			
		}
			
		static int randomSpecificDamageRange(int min,int max) {
			Random EnemyAttackDmg = new Random();
			
			return EnemyAttackDmg.nextInt(max-min)+min; 
				
			}
			
		static int randomOrderEnemyAttackDamageReveal(int min,int max) {
				Random RevealAttackDmg = new Random();
				
				return RevealAttackDmg.nextInt(max-min)+min;
		
		

	}

		}
