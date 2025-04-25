package javafunda;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class SaliganProjectITC_WIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Limiter = 0;
		int RoundNumber = 1;
		
		int UserAttackDmg = 10;
		int UserHealthPoints = 10;
		
		int RoundTurn;
		int RoundEnd = 3;
		
		int FirstEnemyHealthPoints;
		int SecondEnemyHealthPoints;
		int ThirdEnemyHealthPoints;
		
		int FirstEnemyAttackDmg;
		int SecondEnemyAttackDmg;
		int ThirdEnemyAttackDmg;
		
		int HealthPotionAmt = 0;
		int StrengthPotionAmt = 0;
		int WeaknessPotionAmt = 0;
		
		String FirstEnemyDefeat = "";
		String SecondEnemyDefeat = "";
		String ThirdEnemyDefeat = "";
		String HP_QuestionMarks = "???";
		String Dmg_QuestionMarks = "???";
		String DefeatMsg = "- Defeated";
		
		int N = 0;
		
		ArrayList<String> SelectedEnemies = new ArrayList<>();
				
		System.out.print("| +===================================+\n");
		System.out.print("| |  Welcome to the Game of Imperium! |\n");
		System.out.print("| +===================================+\n");
		
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
		
		HealthPotionAmt = Limiter;
		StrengthPotionAmt = Limiter;
		WeaknessPotionAmt = Limiter;
		
		for (RoundNumber=1;RoundNumber<=Limiter;RoundNumber++) {
			
			FirstEnemyHealthPoints = (randomSpecificHealthPointsRange(5,10));
			SecondEnemyHealthPoints = (randomSpecificHealthPointsRange(10,15));
			ThirdEnemyHealthPoints = (randomSpecificHealthPointsRange(15,20));

			FirstEnemyAttackDmg = (randomSpecificAttackDamageRange(5,10));
			SecondEnemyAttackDmg = (randomSpecificAttackDamageRange(10,15));
			ThirdEnemyAttackDmg = (randomSpecificAttackDamageRange(15,20));
			
			String FirstEnemyHP_Msg = ""+FirstEnemyHealthPoints+" HP"; 
			String FirstEnemyDmg_Msg = ""+FirstEnemyAttackDmg+" Dmg"; 
			
			String SecondEnemyHP_Msg = ""+SecondEnemyHealthPoints+" HP"; 
			String SecondEnemyDmg_Msg = ""+SecondEnemyAttackDmg+" Dmg"; 
			
			String ThirdEnemyHP_Msg = ""+ThirdEnemyHealthPoints+" HP"; 
			String ThirdEnemyDmg_Msg = ""+ThirdEnemyAttackDmg+" Dmg";
			
			FirstEnemyDefeat = "";
			SecondEnemyDefeat = "";
			ThirdEnemyDefeat = "";
			
			SelectedEnemies.clear();
			
			for (RoundTurn=1;RoundTurn<=RoundEnd;RoundTurn++) {
							
			System.out.print("|     +===============+\n");
			System.out.print("|     | Round: "+RoundNumber+" of "+Limiter+" |\n");
			System.out.print("|     +===============+\n");
									
			System.out.print("|\n");
			
			System.out.print("| "+name+"'s Character:\n");
			System.out.print("|    ↪ Health Points: "+UserHealthPoints+" HP\n");
			System.out.print("|    ↪ Attack Damage: "+UserAttackDmg+" Dmg\n");
			
			System.out.print("|\n");
			
			System.out.print("| Enemy Information\n");
			System.out.print("| ❖[1] Enemy #1 "+FirstEnemyDefeat+"\n");
			System.out.print("|    ↪ Health Points: "+FirstEnemyHP_Msg+"\n");
			System.out.print("|    ↪ Attack Damage: "+FirstEnemyDmg_Msg+"\n");
			System.out.print("|\n");
			System.out.print("| ❖[2] Enemy #2 "+SecondEnemyDefeat+"\n");
			System.out.print("|    ↪ Health Points: "+SecondEnemyHP_Msg+"\n");
			System.out.print("|    ↪ Attack Damage: "+SecondEnemyDmg_Msg+"\n");
			System.out.print("|\n");
			System.out.print("| ❖[3] Enemy #3 "+ThirdEnemyDefeat+"\n");
			System.out.print("|    ↪ Health Points: "+ThirdEnemyHP_Msg+"\n");
			System.out.print("|    ↪ Attack Damage: "+ThirdEnemyDmg_Msg+"\n");
			
			System.out.print("|\n");
			
			System.out.print("| Kirby's Backpack:\n");
			System.out.print("| ❖[4] x"+HealthPotionAmt+" Health Potion\n");
			System.out.print("|    ↪ +10 HP\n");
			System.out.print("|\n");
			System.out.print("| ❖[5] x"+StrengthPotionAmt+" Strength Potion\n");
			System.out.print("|    ↪ +10 Dmg\n");
			System.out.print("|\n");
			System.out.print("| ❖[6] x"+WeaknessPotionAmt+" Weakness Potion\n");
			System.out.print("|    ↪ -10 Dmg\n");
			
			System.out.print("|\n");
			
		        System.out.print("| Select: ");
		        
		        boolean UserInputValidation = false;
		        while(!UserInputValidation) {
		        String Selection = input.nextLine();
		        
			        if (SelectedEnemies.contains(Selection)) {
			        	System.out.print("| The ["+Selection+"] Enemy is already defeated. Please try again: "); }
			        
			        else {
				        if (Selection.equalsIgnoreCase("1")) {
				        	SelectedEnemies.add(Selection); 
				        	UserInputValidation = true; 
				        	
				        	if (FirstEnemyHealthPoints<=UserAttackDmg) {
				        		System.out.print("|\n");
								UserAttackDmg += FirstEnemyAttackDmg; 
								FirstEnemyHP_Msg = HP_QuestionMarks;
								FirstEnemyDmg_Msg = Dmg_QuestionMarks;
								FirstEnemyDefeat = DefeatMsg; }
				        	
							if (FirstEnemyHealthPoints>UserAttackDmg) {
								System.out.print("| YOU LOSE!\n"); 
								System.out.print("|\n"); 
								return; }}
				        
						if (Selection.equalsIgnoreCase("2")) {
							SelectedEnemies.add(Selection);
							UserInputValidation = true; 
							
							if (SecondEnemyHealthPoints<=UserAttackDmg) {
								System.out.print("|\n");
								UserAttackDmg += SecondEnemyAttackDmg;
								SecondEnemyHP_Msg = HP_QuestionMarks;
								SecondEnemyDmg_Msg = Dmg_QuestionMarks;
								SecondEnemyDefeat = DefeatMsg; }
							
							if (SecondEnemyHealthPoints>UserAttackDmg) {
								System.out.print("| YOU LOSE!\n"); 
								System.out.print("|\n"); 
								return; }}
						
						if (Selection.equalsIgnoreCase("3")) {
							SelectedEnemies.add(Selection);
							UserInputValidation = true; 
							
							if (ThirdEnemyHealthPoints<=UserAttackDmg) { 
								System.out.print("|\n");
								UserAttackDmg += ThirdEnemyAttackDmg;
								ThirdEnemyHP_Msg = HP_QuestionMarks;
								ThirdEnemyDmg_Msg = Dmg_QuestionMarks;
								ThirdEnemyDefeat = DefeatMsg; }
							
							if (ThirdEnemyHealthPoints>UserAttackDmg) {
								System.out.print("| YOU LOSE!\n"); 
								System.out.print("|\n"); 
								return; }}
						
						if (Selection.equalsIgnoreCase("4")) {
							if (HealthPotionAmt>=1) {
								HealthPotionAmt--;
								UserHealthPoints += 10; 
								RoundTurn--;
								UserInputValidation = true; 
								System.out.print("|\n"); }
							else {
								if (HealthPotionAmt<1) {
								System.out.print("| You don't have any Health Potions left. Please try again: "); }}}
							
						if (Selection.equalsIgnoreCase("5")) { 
							if (StrengthPotionAmt>=1) {
								StrengthPotionAmt--;
								UserAttackDmg += 10; 
								RoundTurn--;
								UserInputValidation = true; 
								System.out.print("|\n"); }
							else {
								if (StrengthPotionAmt<1) {
									System.out.print("| You don't have any Strength Potions left. Please try again: "); }}}
						
						else {
							if (Selection.equalsIgnoreCase("6")) {
								if (WeaknessPotionAmt>=1) {
								
								String MsgforWeaknessPotion = "| Select an Enemy to Weaken [1-3]: ";
								
								boolean SelectedEnemyWeakened = false;
								while(!SelectedEnemyWeakened) {
									
								System.out.print(MsgforWeaknessPotion); 
								String WeakenEnemy = input.nextLine();
								
									if (SelectedEnemies.contains(WeakenEnemy)) {
										MsgforWeaknessPotion = "| The ["+WeakenEnemy+"] Enemy is already defeated. Please try again: "; }
									
									else {
										if (WeakenEnemy.equalsIgnoreCase("1")) { 
											if (WeaknessPotionAmt>=1) {
												WeaknessPotionAmt--;
												FirstEnemyHealthPoints -= 10; // !!! 
												FirstEnemyAttackDmg -= 10; // !!!
												RoundTurn--;
												UserInputValidation = true;
												SelectedEnemyWeakened = true; 
												System.out.print("|\n"); }}
			
										if (WeakenEnemy.equalsIgnoreCase("2")) {
											if (WeaknessPotionAmt>=1) {
												WeaknessPotionAmt--;
												SecondEnemyHealthPoints -= 10; // !!!
												SecondEnemyAttackDmg -= 10; // !!!
												RoundTurn--;
												UserInputValidation = true;
												SelectedEnemyWeakened = true; 
												System.out.print("|\n"); }}
			
										if (WeakenEnemy.equalsIgnoreCase("3")) { 
											if (WeaknessPotionAmt>=1) {
												WeaknessPotionAmt--;
												ThirdEnemyHealthPoints -= 10; // !!!
												ThirdEnemyAttackDmg -= 10; // !!!
												RoundTurn--;
												UserInputValidation = true;
												SelectedEnemyWeakened = true; 
												System.out.print("|\n"); }}
										
										else {
											if (WeakenEnemy.equalsIgnoreCase("Cancel")) {
												System.out.print("| It has been cancelled\n");
												System.out.print("| Select: ");
												SelectedEnemyWeakened = true; }
											
											else {
												if (WeakenEnemy.equalsIgnoreCase("")) {
													MsgforWeaknessPotion = "| You didn't select an Enemy. Please try again: "; }
												
												else {
													if (!WeakenEnemy.equalsIgnoreCase("1")) {
													if (!WeakenEnemy.equalsIgnoreCase("2")) {
													if (!WeakenEnemy.equalsIgnoreCase("3")) {
														MsgforWeaknessPotion = "| Please Select an Enemy from [1-3] to Weaken: "; }}}
													
												}
											}
										}
									}
										
								} // While for the Weakness Potion
								}
								
								else {
									if (WeaknessPotionAmt<1) {
										System.out.print("| You don't have any Weakness Potions left. Please try again: ");}
								}
								
							} // If for the Weakness Potion
		
								else {
									if (Selection.equalsIgnoreCase("")) {
										System.out.print("| You didn't input any number. Please try again: "); }
										
									else {
										if (!Selection.equalsIgnoreCase("1")) {
										if (!Selection.equalsIgnoreCase("2")) {
										if (!Selection.equalsIgnoreCase("3")) {
										if (!Selection.equalsIgnoreCase("4")) {
										if (!Selection.equalsIgnoreCase("5")) {
										if (!Selection.equalsIgnoreCase("6")) {
											System.out.print("| Please Select from [1-6]: "); }}}}}}
									}
								}
								
							}
						}
					}

											
			} // For Loop for the 3 Enemies
		} // For Loop for the Amount of Rounds
		
	} // Public Static Void Main
		
	
	
		//===================================================================
	
		static int randomSpecificHealthPointsRange(int min,int max) {
			Random EnemyHealthPoints = new Random();
			
			return EnemyHealthPoints.nextInt(max-min)+min; }
		
		//===================================================================
			
		static int randomSpecificAttackDamageRange(int min,int max) {
			Random EnemyAttackDmg = new Random();
			
			return EnemyAttackDmg.nextInt(max-min)+min; }
		
		//===================================================================
		
			static int randomOrderEnemyHealthPointsReveal(int min,int max) {
				Random EnemyAttackDmg = new Random();
					
				return EnemyAttackDmg.nextInt(max-min)+min; }
		
		//===================================================================
			
		static int randomOrderEnemyAttackDamageReveal(int min,int max) {
				Random RevealAttackDmg = new Random();
				
				return RevealAttackDmg.nextInt(max-min)+min; }
		
		//===================================================================
		
		

	}

		
