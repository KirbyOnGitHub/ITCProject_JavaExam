package javafunda;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class SaliganProjectITC_Imperium_V1 {

	public static void main(String[] args) {
		
		//===========================================================================
		
		ArrayList<Integer> EnemyHP_List = new ArrayList<Integer>();
		
		ArrayList<String> DefeatedEnemies = new ArrayList<String>();
		
		ArrayList<Integer> CriticalHit_Percentage = new ArrayList<Integer>();
		ArrayList<Integer> LifeSteal_Percentage = new ArrayList<Integer>();
		
		ArrayList<String> StunnedEnemy = new ArrayList<String>();
		ArrayList<Integer> Stun_Percentage = new ArrayList<Integer>();
		
		ArrayList<String> AfterSelectionMsgs = new ArrayList<String>();
		ArrayList<String> CurrentRoundClearedMsgs = new ArrayList<String>();
		
		//==============================================
		
		int UserInput_CriticalHitPercentage = 0;
		int UserInput_CriticalHit_ExtraDmgPercentage = 0;
		
		int UserCriticalHitDmg = 0;
		
		//============
		
		int UserInput_LifeStealPercentage = 0;
		int UserInput_LifeSteal_ExtraHPPercentage = 0;
		
		int UserLifeStealHP = 0;
		
		//============
		
		int UserInput_StunPercentage = 0;
		
		//==============================================
		
		int MinimumInvalidInput = -1;
		int MaximumInvalidInput = 101;
		
		int HalenessPotionQuantity = 0;
		int StrengthPotionQuantity = 0;
		int WeaknessPotionQuantity = 0;
		
		int EnemyHP_Range = 0;
		int EnemyDmg_Range = 0;
		
		boolean PlayerLost = false;
		boolean MenuScreen_DoneWithIt = false;
		boolean GameStarting = false;
		
		try ( Scanner input = new Scanner(System.in)) {
	
		//=========================================================================== v
			
		while (!MenuScreen_DoneWithIt) {	
	
			System.out.print("|\n");
			System.out.print("|\n");
			System.out.print("|               -+-[[[===============================]]]-+-                                           \n");
			System.out.print("|                  🡺🡺🡺          WELCOME TO        🡸🡸🡸                                              \n");
			System.out.print("|                  🡺🡺🡺     THE GAME OF IMPERIUM   🡸🡸🡸                                              \n");
			System.out.print("|               -+-[[[===============================]]]-+-                                           \n");
			System.out.print("|               ___________________________________________                                           \n");
			System.out.print("|\n");
			System.out.print("|                    -+-{   " + "\033[4;2m" + "SELECTED GAME MODE:" + "\033[0m" + "   }-+-            \n");
			System.out.print("|                    -+-{       THE CLASSIC       }-+-                                                \n");
			System.out.print("|\n");
			System.out.print("|\n");
			System.out.print("|            ◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈                                        \n");
			System.out.print("|            |                                               |                                        \n");
			System.out.print("|            |            -+-{ " + "\033[4;2m" + "!!! NOTE !!!" + "\033[0m" + " }-+-             |    \n");
			System.out.print("|            |                                               |                                        \n");
			System.out.print("|            |      Maximize the screen of the console       |                                        \n");
			System.out.print("|            |      to maximize the fun and experience!      |                                        \n");
			System.out.print("|            |   _________________________________________   |                                        \n");
			System.out.print("|            |                                               |                                        \n");
			System.out.print("|            |      Created By: Kirby Adrian P. Saligan      |                                        \n");
			System.out.print("|            |                                               |                                        \n");
			System.out.print("|            ◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈                                        \n");
			System.out.print("|\n");
			System.out.print("|\n");
			System.out.print("|                         ❖[1] Start the Game                                                         \n");
			System.out.print("|                         ❖[2] How to Play?                                                           \n");
			System.out.print("|                         ❖[3] Game Modes                                                             \n");
			System.out.print("|                         ❖[4] Game Modifiers                                                         \n");
			System.out.print("|                         ❖[5] Game Mechanics                                                         \n");
			System.out.print("|\n");
			System.out.print("|               ___________________________________________                                            \n");
			System.out.print("|\n");
			System.out.print("|               ▣ Select from [1-5] for your decision: ");
		
			//=========================================================================== v
		
			boolean MenuSelection_ValidInput = false;
			while (!MenuSelection_ValidInput) {
				
			String MenuSelection = input.nextLine();
			
				//============================================== v
			
				if (MenuSelection.equalsIgnoreCase("1")) {
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|                    -+-{   SELECTED GAME MODE:   }-+-                                    \n");
					System.out.print("|                    -+-{       THE CLASSIC       }-+-                                    \n");
					System.out.print("|\n");
					System.out.print("|               ___________________________________________                               \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|                    -+-{     GAME MODIFIER:      }-+-                                    \n");
					System.out.print("|                    -+-{    PLAYER ATTRIBUTES    }-+-                                    \n");
					System.out.print("|\n");
					System.out.print("|               ❖ " + "\033[4;2m" + "Critical Hit" + "\033[0m" + "                        \n");
					System.out.print("|                  ↪ ("+UserInput_CriticalHitPercentage+"% Chance)                        \n");
					System.out.print("|                  ↪ (+"+UserInput_CriticalHit_ExtraDmgPercentage+"% Player Dmg)          \n");
					System.out.print("|\n");
					System.out.print("|               ❖ " + "\033[4;2m" + "Life Steal" + "\033[0m" + "                          \n");
					System.out.print("|                  ↪ ("+UserInput_LifeStealPercentage+"% Chance)                          \n");
					System.out.print("|                  ↪ (+"+UserInput_LifeSteal_ExtraHPPercentage+"% Player HP)              \n");
					System.out.print("|                  ↪ (-"+UserInput_LifeSteal_ExtraHPPercentage+"% Enemy HP)               \n");
					System.out.print("|\n");
					System.out.print("|               ❖ " + "\033[4;2m" + "Stun Effect" + "\033[0m" + "                         \n");
					System.out.print("|                  ↪ ("+UserInput_StunPercentage+"% Chance)                               \n");
					System.out.print("|\n");
					System.out.print("|               ___________________________________________                               \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|                    -+-{      GAME MODIFIER:     }-+-                                    \n");
					System.out.print("|                    -+-{  PLAYER'S POTION BUNDLE }-+-                                    \n");
					System.out.print("|\n");
					System.out.print("|               ❖ Slot [4] >>> " + "\033[4;2m" + "Haleness Potion (💗)" + "\033[0m" + "   \n");
					System.out.print("|\n");
					System.out.print("|               ❖ Slot [5] >>> " + "\033[4;2m" + "Strength Potion (⚔️)" + "\033[0m" + "	\n");
					System.out.print("|\n");
					System.out.print("|               ❖ Slot [6] >>> " + "\033[4;2m" + "Weakness Potion (🡻)" + "\033[0m" + "   \n");
					System.out.print("|\n");
					System.out.print("|               ___________________________________________                               \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|                    -+-{      GAME MODIFIER:     }-+-                                    \n");
					System.out.print("|                    -+-{    POTION DROP SYSTEM   }-+-                                    \n");
					System.out.print("|\n");
					System.out.print("|               ❖ " + "\033[4;2m" + "Defeated Enemies" + "\033[0m" + "                    \n");
					System.out.print("|                  ↪ (0 Dropped Potions)                                                  \n");
					System.out.print("|                  ↪ (Potions: Can be common)                                             \n");
					System.out.print("|                  ↪ (0% Chance)                                                          \n");
					System.out.print("|\n");
					System.out.print("|               ❖ " + "\033[4;2m" + "Round Cleared" + "\033[0m" + "                       \n");
					System.out.print("|                  ↪ (3 Dropped Potions)                                                  \n");
					System.out.print("|                  ↪ (Potions: Only unique)                                               \n");
					System.out.print("|                  ↪ (100% Chance)                                                        \n");
					System.out.print("|\n");
					System.out.print("|               ___________________________________________                               \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|                    -+-{      GAME MODIFIER:     }-+-                                    \n");
					System.out.print("|                    -+-{    PLAYER PREFERENCES   }-+-                                    \n");
					System.out.print("|\n");
					System.out.print("|               ❖ " + "\033[4;2m" + "'Proceedings' Function" + "\033[0m" + "              \n");
					System.out.print("|                  ↪ { Info Given: Advanced }                                             \n");
					System.out.print("|                  ↪ { Status: Activated }                                                \n");
					System.out.print("|\n");
					System.out.print("|               ❖ " + "\033[4;2m" + "'Verification' Function" + "\033[0m" + "             \n");
					System.out.print("|                  ↪ { Status: Activated }                                                \n");
					System.out.print("|\n");
					System.out.print("|      _______________________________________________________________________            \n");
					System.out.print("|\n");
					System.out.print("|      ▣ Type [Confirm] to confirm the settings. Type [Back] otherwise: ");
		        	
		        	boolean UserConfirmation_ValidInput = false;
		        	while (!UserConfirmation_ValidInput) {
		        	String UserConfirmation_Selection = input.nextLine();
		        	
		        		//----------------------------------------------
		        		
			        	if (UserConfirmation_Selection.equalsIgnoreCase("Back")) {
			        		System.out.print("|\n");
							System.out.print("|\n");
							System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
			        		UserConfirmation_ValidInput = true;
			        		MenuSelection_ValidInput = true; }
			        	
			        	//----------------------------------------------
		        		
			        	if (!UserConfirmation_Selection.equalsIgnoreCase("Back")) {
			        		if (!UserConfirmation_Selection.equalsIgnoreCase("Confirm")) {
			        			System.out.print("|        >> Please type [Confirm] to confirm the settings or type [Back] otherwise: "); }}
			        		
			        	//----------------------------------------------
			        	
			        	if (UserConfirmation_Selection.equalsIgnoreCase("Confirm")) {
			        		System.out.print("|\n");
							System.out.print("|\n");
							System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
			        		UserConfirmation_ValidInput = true;
			        		MenuSelection_ValidInput = true;
			        		MenuScreen_DoneWithIt = true;
			        		GameStarting = true; }
					
					//---------------------------------------------- ^
				
					} // End of the 'While' Loop of the {StartTheGame_BackToMenuScreen}
					
				} // End of the 'If' of Selecting {Start the Game}
				
				//============================================== ^
				
				//============================================== v
				
				if (MenuSelection.equalsIgnoreCase("2")) {
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
					MenuSelection_ValidInput = true;
					
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|                 +=======================================+                          \n");
					System.out.print("|                 🡺🡺🡺  +-+-+-{ HOW TO PLAY? }-+-+-+  🡸🡸🡸                          \n");
					System.out.print("|                 +=======================================+                          \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      {❖} At the start of each round, the Player gets to select on which of the     \n");
					System.out.print("|          3 Enemies [1-3] to attack or which of the 3 Selected Potions [4-6] that   \n");
					System.out.print("|          the Player brought in the battlefield to use.                             \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      {❖} The Player gets to select through typing the number that corresponds      \n");
					System.out.print("|          to their decision and then pressing enter.                                \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      {❖} During the Player's turn, the Player gets to use as much potions as       \n");
					System.out.print("|          they please, but the potions that are being used are only applicable      \n");
					System.out.print("|          in the current round. Meaning, the potion effects that are applied        \n");
					System.out.print("|          will be removed once the current round is cleared, then the remaining     \n");
					System.out.print("|          quantity of the potions will be carried along to the next round.          \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      {❖} After the Player selected an Enemy to attack, a RANDOM Enemy will         \n");
					System.out.print("|          decide to attack the Player. If the Player survives the Enemy's attack,   \n");
					System.out.print("|          it will then proceed to being the Player's turn again. If not, then the   \n");
					System.out.print("|          Player will be pronounced defeated.                                       \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      {❖} Defeat all of the 3 Enemies in the battlefield in order to proceed.       \n");
					System.out.print("|\n");
					System.out.print("|      _______________________________________________________________________       \n");
					System.out.print("|\n");
					System.out.print("|      ▣ Type [Back] to go back to the Menu Screen: ");
				
					boolean HowToPlay_BackToMenuScreen = false;
					while (!HowToPlay_BackToMenuScreen) {
					
					String HowToPlay_Selection = input.nextLine();
					
						//---------------------------------------------- v
						
						if (HowToPlay_Selection.equalsIgnoreCase("Back")) {
							System.out.print("|\n");
							System.out.print("|\n");
							System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
							HowToPlay_BackToMenuScreen = true; }
						
						//---------------------
						
						if (!HowToPlay_Selection.equalsIgnoreCase("Back")) {
							System.out.print("|        >> Please type [Back] to go back to the Menu Screen: "); }
						
						//---------------------------------------------- ^
						
					} // End of the 'While' Loop for the {HowToPlay_BackToMenuScreen}
					
				} // End of the 'If' of Selecting {HowToPlay?}
				
				//============================================== ^
				
				//============================================== v
				
				if (MenuSelection.equalsIgnoreCase("3")) {
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
					MenuSelection_ValidInput = true;
					
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|                  +====================================+                        \n");
					System.out.print("|                  🡺🡺🡺  +-+-+-{ GAMEMODES }-+-+-+  🡸🡸🡸                        \n");
					System.out.print("|                  +====================================+                        \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      ❖[1] " + "\033[4;2m" + "THE CLASSIC" + "\033[0m" + "                      \n");
					System.out.print("|         ↪ Everyone in the battlefield will only have 1 Life.                   \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      +-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+          \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      ❖[2] " + "\033[4;2m" + "THE LIVING DEAD" + "\033[0m" + "                  \n");
					System.out.print("|         ↪ Enemies in the battlefield will have a DESIRED percentage            \n");
					System.out.print("|           of chance of turning into a zombie after being defeated.             \n");
					System.out.print("|\n");
					System.out.print("|           ◈ " + "\033[4;2m" + "Zombified Enemies" + "\033[0m" + "              \n");
					System.out.print("|             >> -50% HP and +50% Dmg to their original HP and Dmg.              \n");
					System.out.print("|             >> Potion effects that are applied before will still be applied.   \n");
					System.out.print("|             >> Haleness Potions can be used to harm them.                      \n");
					System.out.print("|             >> Venomous Potions deceases them further overtime instead.        \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      +-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+          \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      ❖[3] " + "\033[4;2m" + "GHOSTLY VENGEANCE" + "\033[0m" + "                \n");
					System.out.print("|         ↪ Everyone in the battlefield will have a DESIRED percentage           \n");
					System.out.print("|           of chance of turning into a ghost after being defeated.              \n");
					System.out.print("|\n");
					System.out.print("|           ◈ " + "\033[4;2m" + "Ghost Enemies" + "\033[0m" + "                  \n");
					System.out.print("|             >> 100% HP and 100% Dmg of their original HP and Dmg.              \n");
					System.out.print("|             >> Potion effects that are applied before will be removed.         \n");
					System.out.print("|             >> Cannot be attacked by the ALIVE Player.                         \n");
					System.out.print("|             >> Can now only be affected by the Weakness Potion.                \n");
					System.out.print("|             >> Will only be vanquished if it gets to attack one more time      \n");
					System.out.print("|             or defeated by the GHOST Player.                                   \n");
					System.out.print("|\n");
					System.out.print("|           ◈ " + "\033[4;2m" + "Ghost Player" + "\033[0m" + "                   \n");
					System.out.print("|             >> 100% HP and 100% Dmg of their original HP and Dmg.              \n");
					System.out.print("|             >> Potion effects that are applied before will be removed.         \n");
					System.out.print("|             >> Can still use potions.                                          \n");
					System.out.print("|             >> Can attack GHOST Enemies.                                       \n");
					System.out.print("|             >> Will be given one more chance to attack an Enemy.               \n");
					System.out.print("|\n");
					System.out.print("|           ◈ " + "\033[4;2m" + "'Ghostly Player WINS'" + "\033[0m" + "          \n");
					System.out.print("|             >> If the Ghost Player cleared the current round after its         \n");
					System.out.print("|             ghostly attack, it will then be revived. But the Player has        \n");
					System.out.print("|             to sacrifice (x1) potion of their choice.                          \n");
					System.out.print("|\n");
					System.out.print("|      _______________________________________________________________________   \n");
					System.out.print("|\n");
					System.out.print("|      ▣ Select a Game Mode from [1-3]. Type [Back] otherwise: ");
					
					boolean GameModes_BackToMenuScreen = false;
					while (!GameModes_BackToMenuScreen) {
					
					String GameMode_Selection = input.nextLine();
					
						//---------------------------------------------- v
						//---------------------------------------------- v
					
						if (GameMode_Selection.equalsIgnoreCase("1")) {
							System.out.print("|        >> 'THE CLASSIC' - Selected!\n"); 
							System.out.print("|\n");
							System.out.print("|      ▣ Select a Game Mode from [1-3]. Type [Back] otherwise: "); }
						
						//---------------------
					
						if (GameMode_Selection.equalsIgnoreCase("2")) {
							System.out.print("|        >> 'THE LIVING DEAD' - Coming Soon!\n"); 
							System.out.print("|\n");
							System.out.print("|      ▣ Select a Game Mode from [1-3]. Type [Back] otherwise: "); }
						
						//---------------------
						
						if (GameMode_Selection.equalsIgnoreCase("3")) {
							System.out.print("|        >> 'GHOSTLY VENGEANCE' - Coming Soon!\n"); 
							System.out.print("|\n");
							System.out.print("|      ▣ Select a Game Mode from [1-3]. Type [Back] otherwise: "); }
						
						//---------------------
						
						if (GameMode_Selection.equalsIgnoreCase("Back")) {
							System.out.print("|\n");
							System.out.print("|\n");
							System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
							GameModes_BackToMenuScreen = true; }
						
						//---------------------
						
						if (GameMode_Selection.equalsIgnoreCase("")) {
							System.out.print("|        >> You didn't input anything: "); }
						
						//---------------------
						
						if (!GameMode_Selection.equalsIgnoreCase("1")) {
							if (!GameMode_Selection.equalsIgnoreCase("2")) {
								if (!GameMode_Selection.equalsIgnoreCase("3")) {
									if (!GameMode_Selection.equalsIgnoreCase("")) {
										if (!GameMode_Selection.equalsIgnoreCase("Back")) {
											System.out.print("|        >> Please Select a Game Mode from [1-3] or type [Back] otherwise: "); }}}}}
						
						//---------------------------------------------- ^
						//---------------------------------------------- ^
					
					} // End of the 'While' Loop for the {BackToMenu}
						
				} // End of the 'If' of Selecting {Game Modes}
			
				//============================================== ^
				
				//============================================== v
				
				if (MenuSelection.equalsIgnoreCase("4")) {
					MenuSelection_ValidInput = true;
					
					boolean GameModifiers_BackToMenuScreen = false;
					while (!GameModifiers_BackToMenuScreen) {
					
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|                +=========================================+                         \n");
					System.out.print("|                🡺🡺🡺  +-+-+-{ GAME MODIFIERS }-+-+-+  🡸🡸🡸                         \n");
					System.out.print("|                +=========================================+                         \n");
					System.out.print("|\n");
					System.out.print("|                       ❖[1] Player Attributes                                       \n");
					System.out.print("|                       ❖[2] Player's Potion Bundle                                  \n");
					System.out.print("|                       ❖[3] Potion Drop Systems                                     \n");
					System.out.print("|                       ❖[4] Player Preferences                                      \n");
					System.out.print("|\n");
					System.out.print("|      _______________________________________________________________________       \n");
					System.out.print("|\n");
					System.out.print("|      ▣ Select a Game Modifier from [1-4]. Type [Back] otherwise: ");
					
						boolean GameModifiers_DoneModifying = false;
						while (!GameModifiers_DoneModifying) {
						
						String GameModifier_Selection = input.nextLine();
						
							//---------------------------------------------- v
							
							if (GameModifier_Selection.equalsIgnoreCase("1")) {
								
								boolean PlayerAttributes_DoneModifying = false;
								while (!PlayerAttributes_DoneModifying) {
								
								System.out.print("|\n");
								System.out.print("|\n");
								System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
								System.out.print("|\n");
								System.out.print("|\n");
								System.out.print("|              +============================================+                                          \n");
								System.out.print("|              🡺🡺🡺  +-+-+-{ PLAYER ATTRIBUTES }-+-+-+  🡸🡸🡸                                          \n");
								System.out.print("|              +============================================+                                          \n");
								System.out.print("|\n");
								System.out.print("|                          ❖[1] " + "\033[4;2m" + "Critical Hit" + "\033[0m" + "                       \n");
								System.out.print("|                             ↪ ("+UserInput_CriticalHitPercentage+"% Chance)                          \n");
								System.out.print("|                             ↪ (+"+UserInput_CriticalHit_ExtraDmgPercentage+"% Player Dmg)            \n");
								System.out.print("|\n");
								System.out.print("|                          ❖[2] " + "\033[4;2m" + "Life Steal" + "\033[0m" + "                         \n");
								System.out.print("|                             ↪ ("+UserInput_LifeStealPercentage+"% Chance)                            \n");
								System.out.print("|                             ↪ (+"+UserInput_LifeSteal_ExtraHPPercentage+"% Player HP)                \n");
								System.out.print("|                             ↪ (-"+UserInput_LifeSteal_ExtraHPPercentage+"% Enemy HP)                 \n");
								System.out.print("|\n");
								System.out.print("|                          ❖[3] " + "\033[4;2m" + "Stun Effect" + "\033[0m" + "                        \n");
								System.out.print("|                             ↪ ("+UserInput_StunPercentage+"% Chance)                                 \n");
								System.out.print("|\n");
								System.out.print("|      _______________________________________________________________________                         \n");
								System.out.print("|\n");
								System.out.print("|      ▣ Select a Player Attribute from [1-3] to modify. Type [Back] otherwise: ");
									
									boolean PlayerAttributes_ValidInput = false;	
									while (!PlayerAttributes_ValidInput) {
										
									String PlayerAttribute_Selection = input.nextLine();
									
										//---------------------------------------------- v
									
										if (PlayerAttribute_Selection.equalsIgnoreCase("1")) {
											PlayerAttributes_ValidInput = true;
											
											System.out.print("|\n");
											System.out.print("|           ◈ Critical Hit - [0-100]% Chance: ");
											
											UserInput_CriticalHitPercentage = -1;
											
											//---------------------------------------------- v
											
											boolean UserInput_CriticalHitPercentage_RangeChecking = false;
											boolean UserInput_CriticalHitPercentage_ValidInput = false;
											while (!UserInput_CriticalHitPercentage_ValidInput) {
											String UserInput = input.nextLine();
											
												//---------------------
											
												try {
													UserInput_CriticalHitPercentage = Integer.valueOf(UserInput);
													if (UserInput_CriticalHitPercentage == Integer.valueOf(UserInput)) {
														UserInput_CriticalHitPercentage_RangeChecking = true; }}
												catch (NumberFormatException e) {
													UserInput_CriticalHitPercentage_RangeChecking = false;
													System.out.print("|             >> Please enter a valid input: ");   // This msg will also show if the input number is more than 10 digits, which is the limit of the Eclipse
													UserInput_CriticalHitPercentage = -1; }
													
												//---------------------
													
												if (UserInput_CriticalHitPercentage_RangeChecking) {
													if(RandomNumber_RangeChecker(UserInput_CriticalHitPercentage, MinimumInvalidInput, MaximumInvalidInput)) {
														UserInput_CriticalHitPercentage_ValidInput = true; }
														
													else {
														if (UserInput_CriticalHitPercentage == Integer.valueOf(UserInput)) {
														System.out.print("|             >> Please enter a valid input: ");
														UserInput_CriticalHitPercentage = -1; }
													}
												}
												
												//---------------------
												
											} // End of the 'While' Loop of the {UserInput_CriticalHitPercentage_ValidInput}
											
											//---------------------------------------------- ^
											
											//---------------------------------------------- v
											
											System.out.print("|\n");
											System.out.print("|           ◈ Critical Hit - +[0-100]% Player Dmg: ");
											
											UserInput_CriticalHit_ExtraDmgPercentage = -1;
											
											//---------------------
											
											boolean UserInput_CriticalHit_ExtraDmgPercentage_RangeChecking = false;
											boolean UserInput_CriticalHit_ExtraDmgPercentage_ValidInput = false;
											while (!UserInput_CriticalHit_ExtraDmgPercentage_ValidInput) {
											String UserInput = input.nextLine();
											
												//---------------------
											
												try {
													UserInput_CriticalHit_ExtraDmgPercentage = Integer.valueOf(UserInput);
													if (UserInput_CriticalHit_ExtraDmgPercentage == Integer.valueOf(UserInput)) {
														UserInput_CriticalHit_ExtraDmgPercentage_RangeChecking = true; }}
												catch (NumberFormatException e) {
													UserInput_CriticalHit_ExtraDmgPercentage_RangeChecking = false;
													System.out.print("|             >> Please enter a valid input: ");   // This msg will also show if the input number is more than 10 digits, which is the limit of the Eclipse
													UserInput_CriticalHit_ExtraDmgPercentage = -1; }
													
												//---------------------
													
												if (UserInput_CriticalHit_ExtraDmgPercentage_RangeChecking) {
													if(RandomNumber_RangeChecker(UserInput_CriticalHit_ExtraDmgPercentage, MinimumInvalidInput, MaximumInvalidInput)) {
														UserInput_CriticalHit_ExtraDmgPercentage_ValidInput = true; }
														
													else {
														if (UserInput_CriticalHit_ExtraDmgPercentage == Integer.valueOf(UserInput)) {
														System.out.print("|             >> Please enter a valid input: ");
														UserInput_CriticalHit_ExtraDmgPercentage = -1; }
													}
												}
												
												//---------------------
												
											} // End of the 'While' Loop of the {UserInput_CriticalHit_ExtraDmgPercentage_ValidInput}
											
											//---------------------------------------------- ^
											
										} // End of the 'If' of Selecting {Critical Hit}
										
										//---------------------------------------------- ^
										
										//---------------------------------------------- v
										
										if (PlayerAttribute_Selection.equalsIgnoreCase("2")) {
											PlayerAttributes_ValidInput = true;
											
											System.out.print("|\n");
											System.out.print("|           ◈ Life Steal - [0-100]% Chance: ");
											
											UserInput_LifeStealPercentage = -1;
											
											//---------------------------------------------- v
											
											boolean UserInput_LifeStealPercentage_RangeChecking = false;
											boolean UserInput_LifeStealPercentage_ValidInput = false;
											while (!UserInput_LifeStealPercentage_ValidInput) {
											String UserInput = input.nextLine();
											
												//---------------------
											
												try {
													UserInput_LifeStealPercentage = Integer.valueOf(UserInput);
													if (UserInput_LifeStealPercentage == Integer.valueOf(UserInput)) {
														UserInput_LifeStealPercentage_RangeChecking = true; }}
												catch (NumberFormatException e) {
													UserInput_LifeStealPercentage_RangeChecking = false;
													System.out.print("|             >> Please enter a valid input: ");   // This msg will also show if the input number is more than 10 digits, which is the limit of the Eclipse
													UserInput_LifeStealPercentage = -1; }
													
												//---------------------
													
												if (UserInput_LifeStealPercentage_RangeChecking) {
													if(RandomNumber_RangeChecker(UserInput_CriticalHitPercentage, MinimumInvalidInput, MaximumInvalidInput)) {
														UserInput_LifeStealPercentage_ValidInput = true; }
														
													else {
														if (UserInput_LifeStealPercentage == Integer.valueOf(UserInput)) {
														System.out.print("|             >> Please enter a valid input: ");
														UserInput_LifeStealPercentage = -1; }
													}
												}
												
												//---------------------
												
											} // End of the 'While' Loop of the {UserInput_LifeStealPercentage_ValidInput}
											
											//---------------------------------------------- ^
											
											//---------------------------------------------- v
											
											System.out.print("|\n");
											System.out.print("|           ◈ LifeSteal - +[0-100]% Player HP and -[0-100]% Enemy HP: ");
											
											UserInput_LifeSteal_ExtraHPPercentage = -1;
											
											//---------------------
											
											boolean UserInput_LifeSteal_ExtraHPPercentage_RangeChecking = false;
											boolean UserInput_LifeSteal_ExtraHPPercentage_ValidInput = false;
											while (!UserInput_LifeSteal_ExtraHPPercentage_ValidInput) {
											String UserInput = input.nextLine();
											
												//---------------------
											
												try {
													UserInput_LifeSteal_ExtraHPPercentage = Integer.valueOf(UserInput);
													if (UserInput_LifeSteal_ExtraHPPercentage == Integer.valueOf(UserInput)) {
														UserInput_LifeSteal_ExtraHPPercentage_RangeChecking = true; }}
												catch (NumberFormatException e) {
													System.out.print("|             >> Please enter a valid input: ");   // This msg will also show if the input number is more than 10 digits, which is the limit of the Eclipse
													UserInput_LifeSteal_ExtraHPPercentage = -1; }
													
												//---------------------
													
												if (UserInput_LifeSteal_ExtraHPPercentage_RangeChecking) {
													if(RandomNumber_RangeChecker(UserInput_CriticalHit_ExtraDmgPercentage, MinimumInvalidInput, MaximumInvalidInput)) {
														UserInput_LifeSteal_ExtraHPPercentage_ValidInput = true; }
														
													else {
														if (UserInput_LifeSteal_ExtraHPPercentage == Integer.valueOf(UserInput)) {
														System.out.print("|             >> Please enter a valid input: ");
														UserInput_LifeSteal_ExtraHPPercentage = -1; }
													}
												}
												
												//---------------------
												
											} // End of the 'While' Loop of the {UserInput_LifeSteal_ExtraHPPercentage_ValidInput}
											
											//---------------------------------------------- ^
											
										} // End of the 'If' of Selecting {Life Steal}
										
										//---------------------------------------------- ^
										
										//---------------------------------------------- v
										
										if (PlayerAttribute_Selection.equalsIgnoreCase("3")) {
											PlayerAttributes_ValidInput = true;
											
											System.out.print("|\n");
											System.out.print("|           ◈ Stun Effect - [0-100]% Chance: ");
											
											UserInput_StunPercentage = -1;
											
											//---------------------------------------------- v
											
											boolean UserInput_StunPercentage_RangeChecking = false;
											boolean UserInput_StunPercentage_ValidInput = false;
											while (!UserInput_StunPercentage_ValidInput) {
											String UserInput = input.nextLine();
											
												//---------------------
											
												try {
													UserInput_StunPercentage = Integer.valueOf(UserInput);
													if (UserInput_StunPercentage == Integer.valueOf(UserInput)) {
														UserInput_StunPercentage_RangeChecking = true; }}
												catch (NumberFormatException e) {
													System.out.print("|             >> Please enter a valid input: ");   // This msg will also show if the input number is more than 10 digits, which is the limit of the Eclipse
													UserInput_StunPercentage = -1; }
													
												//---------------------
													
												if (UserInput_StunPercentage_RangeChecking) {
													if(RandomNumber_RangeChecker(UserInput_CriticalHitPercentage, MinimumInvalidInput, MaximumInvalidInput)) {
														UserInput_StunPercentage_ValidInput = true; }
														
													else {
														if (UserInput_StunPercentage == Integer.valueOf(UserInput)) {
														System.out.print("|             >> Please enter a valid input: ");
														UserInput_StunPercentage = -1; }
													}
												}
												
												//---------------------
												
											} // End of the 'While' Loop of the {UserInput_StunPercentage_ValidInput}
											
											//---------------------------------------------- ^
											
										} // End of the 'If' of Selecting {Stun Effect}
										
										//---------------------------------------------- ^
										
										//---------------------------------------------- v
										
										if (PlayerAttribute_Selection.equalsIgnoreCase("Back")) {
											PlayerAttributes_ValidInput = true;
											PlayerAttributes_DoneModifying = true; 
											GameModifiers_DoneModifying = true; }
										
										//---------------------------------------------- ^
										
										//---------------------------------------------- v
										
										if (PlayerAttribute_Selection.equalsIgnoreCase("")) {
											System.out.print("|        >> You didn't input anything: "); }
										
										//---------------------------------------------- ^
										
										//---------------------------------------------- v
										
										if (!PlayerAttribute_Selection.equalsIgnoreCase("1")) {
											if (!PlayerAttribute_Selection.equalsIgnoreCase("2")) {
												if (!PlayerAttribute_Selection.equalsIgnoreCase("3")) {
													if (!PlayerAttribute_Selection.equalsIgnoreCase("")) {
														if (!PlayerAttribute_Selection.equalsIgnoreCase("Back")) {
															System.out.print("|        >> Please Select a Player Attribute from [1-3] or type [Back] otherwise: "); }}}}}
										
										//---------------------------------------------- ^
								
									} // End of the 'While' Loop for the {PlayerAttributes_ValidInput}
								
								} // End of the 'While' Loop for the {PlayerAttributes_DoneModifying}
								
							} // End of the 'If' of Selecting {PlayerAttributes}
							
							//---------------------------------------------- ^
							
							//---------------------------------------------- v
						
							if (GameModifier_Selection.equalsIgnoreCase("2")) {
								
								boolean PotionBundle_DoneModifying = false;
								while (!PotionBundle_DoneModifying) {
								
								System.out.print("|\n");
								System.out.print("|\n");
								System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
								System.out.print("|\n");
								System.out.print("|\n");
								System.out.print("|           +=================================================+                  \n");
								System.out.print("|           🡺🡺🡺  +-+-+-{ PLAYER'S POTION BUNDLE }-+-+-+  🡸🡸🡸                  \n");
								System.out.print("|           +=================================================+                  \n");
								System.out.print("|\n");
								System.out.print("|              ❖[1] Haleness Potion (💗)	   >>>   Slot [4]                      \n");
								System.out.print("|              ❖[2] Strength Potion (⚔️)	   >>>   Slot [5]                      \n");
								System.out.print("|              ❖[3] Weakness Potion (🡻)	   >>>   Slot [6]                      \n");
								System.out.print("|              ❖[4] Venomous Potion (☠️)                                         \n");
								System.out.print("|              ❖[5] Inferno  Potion (🔥)                                         \n");
								System.out.print("|              ❖[6] Blizzard Potion (❄)                                         \n");
								System.out.print("|              ❖[7] Tempest  Potion (🌪)                                         \n");
								System.out.print("|              ❖[8] Immunity Potion (🛡)                                         \n");
								System.out.print("|\n");
								System.out.print("|      _______________________________________________________________________   \n");
								System.out.print("|\n");
								System.out.print("|      ▣ Select a Potion from [1-3] to bring. Type [Back] otherwise: ");
								
								boolean PotionBundle_ValidInput = false;
								while (!PotionBundle_ValidInput) {
									
								String PotionBundle_Selection = input.nextLine();
								
									//---------------------------------------------- v
								
									if (PotionBundle_Selection.equalsIgnoreCase("1")) {
										System.out.print("|        >> Haleness Potion (💗) - Selected!\n");
										System.out.print("|\n");
										System.out.print("|      ▣ Select a Potion from [1-3] to bring. Type [Back] otherwise: "); }
									
									//---------------------
									
									if (PotionBundle_Selection.equalsIgnoreCase("2")) {
										System.out.print("|        >> Strength Potion (⚔️) - Selected!\n");
										System.out.print("|\n");
										System.out.print("|      ▣ Select a Potion from [1-3] to bring. Type [Back] otherwise: "); }
									
									//---------------------
									
									if (PotionBundle_Selection.equalsIgnoreCase("3")) {
										System.out.print("|        >> Weakness Potion (🡻) - Selected!\n");
										System.out.print("|\n");
										System.out.print("|      ▣ Select a Potion from [1-3] to bring. Type [Back] otherwise: "); }
									
									//---------------------
									
									if (PotionBundle_Selection.equalsIgnoreCase("4")) {
										System.out.print("|        >> Venomous Potion (☠️) - Coming Soon!\n");
										System.out.print("|\n");
										System.out.print("|      ▣ Select a Potion from [1-3] to bring. Type [Back] otherwise: "); }
									
									//---------------------
									
									if (PotionBundle_Selection.equalsIgnoreCase("5")) {
										System.out.print("|        >> Inferno  Potion (🔥) - Coming Soon!\n");
										System.out.print("|\n");
										System.out.print("|      ▣ Select a Potion from [1-3] to bring. Type [Back] otherwise: "); }
									
									//---------------------
									
									if (PotionBundle_Selection.equalsIgnoreCase("6")) {
										System.out.print("|        >> Blizzard Potion (❄) - Coming Soon!\n");
										System.out.print("|\n");
										System.out.print("|      ▣ Select a Potion from [1-3] to bring. Type [Back] otherwise: "); }
									
									//---------------------
									
									if (PotionBundle_Selection.equalsIgnoreCase("7")) {
										System.out.print("|        >> Tempest  Potion (🌪) - Coming Soon!\n");
										System.out.print("|\n");
										System.out.print("|      ▣ Select a Potion from [1-3] to bring. Type [Back] otherwise: "); }
									
									//---------------------
									
									if (PotionBundle_Selection.equalsIgnoreCase("8")) {
										System.out.print("|        >> Immunity Potion (🛡) - Coming Soon!\n");
										System.out.print("|\n");
										System.out.print("|      ▣ Select a Potion from [1-3] to bring. Type [Back] otherwise: "); }
									
									//---------------------
									
									if (PotionBundle_Selection.equalsIgnoreCase("")) {
										System.out.print("|        >> You didn't input anything: "); }
									
									//---------------------
									
									if (PotionBundle_Selection.equalsIgnoreCase("Back")) {
										PotionBundle_ValidInput = true;
										PotionBundle_DoneModifying = true;
										GameModifiers_DoneModifying = true; }
									
									//---------------------
									
									if (!PotionBundle_Selection.equalsIgnoreCase("1")) {
										if (!PotionBundle_Selection.equalsIgnoreCase("2")) {
											if (!PotionBundle_Selection.equalsIgnoreCase("3")) {
												if (!PotionBundle_Selection.equalsIgnoreCase("4")) {
													if (!PotionBundle_Selection.equalsIgnoreCase("5")) {
														if (!PotionBundle_Selection.equalsIgnoreCase("6")) {
															if (!PotionBundle_Selection.equalsIgnoreCase("7")) {
																if (!PotionBundle_Selection.equalsIgnoreCase("8")) {
																	if (!PotionBundle_Selection.equalsIgnoreCase("")) {
																		if (!PotionBundle_Selection.equalsIgnoreCase("Back")) {
																			System.out.print("|        >> Please Select a Potion from [1-3] or type [Back] otherwise: "); }}}}}}}}}}
									
									//---------------------------------------------- ^
							
									} // End of the 'While' Loop for the {PotionBundle_ValidInput}
								
								} // End of the 'While' Loop for the {PotionBundle_DoneModifying}
								
							} // End of the 'If' of Selecting {Player's Potion Bundle}
							
							//---------------------------------------------- ^
							
							//---------------------------------------------- v
							
							if (GameModifier_Selection.equalsIgnoreCase("3")) {
								
								boolean PotionDropSystems_DoneModifying = false;	 
								while (!PotionDropSystems_DoneModifying) {
								
								System.out.print("|\n");
								System.out.print("|\n");
								System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
								System.out.print("|\n");
								System.out.print("|\n");
								System.out.print("|             +==============================================+                      \n");
								System.out.print("|             🡺🡺🡺  +-+-+-{ POTION DROP SYSTEMS }-+-+-+  🡸🡸🡸                      \n");
								System.out.print("|             +==============================================+                      \n");
								System.out.print("|\n");
								System.out.print("|                        ❖[1] " + "\033[4;2m" + "Defeated Enemies" + "\033[0m" + "  \n");
								System.out.print("|                           ↪ (0 Dropped Potions)                                   \n");
								System.out.print("|                           ↪ (Potions: Can be common)                              \n");
								System.out.print("|                           ↪ (0% Chance)                                           \n");
								System.out.print("|\n");
								System.out.print("|                        ❖[2] " + "\033[4;2m" + "Round Cleared" + "\033[0m" + "     \n");
								System.out.print("|                           ↪ (3 Dropped Potions)                                   \n");
								System.out.print("|                           ↪ (Potions: Only unique)                                \n");
								System.out.print("|                           ↪ (100% Chance)                                         \n");
								System.out.print("|\n");
								System.out.print("|      _______________________________________________________________________      \n");
								System.out.print("|\n");
								System.out.print("|      ▣ Select a Potion Drop System from [1-2] to modify. Type [Back] otherwise: ");
								
									boolean PotionDropSystems_ValidInput = false;	 
									while (!PotionDropSystems_ValidInput) {
										
									String PotionDropSystems_Selection = input.nextLine();
									
										//---------------------------------------------- v
									
										if (PotionDropSystems_Selection.equalsIgnoreCase("1")) {
											System.out.print("|        >> Potion Drop System 'Defeated Enemies' Modifications - Coming Soon!\n");
											System.out.print("|        >> Potion Drop System 'Defeated Enemies' Modifications - Set to Default\n");
											System.out.print("|\n");
											System.out.print("|      ▣ Select a Potion Drop System from [1-2] to modify. Type [Back] otherwise: "); }
										
										//---------------------
										
										if (PotionDropSystems_Selection.equalsIgnoreCase("2")) {
											System.out.print("|        >> Potion Drop System 'Round Cleared' Modifications - Coming Soon!\n");
											System.out.print("|        >> Potion Drop System 'Round Cleared' Modifications - Set to Default\n");
											System.out.print("|\n");
											System.out.print("|      ▣ Select a Potion Drop System from [1-2] to modify. Type [Back] otherwise: "); }
										
										//---------------------
										
										if (PotionDropSystems_Selection.equalsIgnoreCase("")) {
											System.out.print("|        >> You didn't input anything: "); }
										
										//---------------------
										
										if (PotionDropSystems_Selection.equalsIgnoreCase("Back")) {
											PotionDropSystems_ValidInput = true;
											PotionDropSystems_DoneModifying = true;
											GameModifiers_DoneModifying = true; }
										
										//---------------------
										
										if (!PotionDropSystems_Selection.equalsIgnoreCase("1")) {
											if (!PotionDropSystems_Selection.equalsIgnoreCase("2")) {
												if (!PotionDropSystems_Selection.equalsIgnoreCase("")) {
													if (!PotionDropSystems_Selection.equalsIgnoreCase("Back")) {
														System.out.print("|        >> Please Select a Potion Drop System from [1-2] or type [Back] otherwise: "); }}}}
										
										//---------------------------------------------- ^
								
									} // End of the 'While' Loop for the {PotionDropSystems_ValidInput}
								
								} // End of the 'While' Loop for the {PotionDropSystems_DoneModifying}
								
							} // End of the 'If' of Selecting {Player'sPotionDropSystem}
							
							//---------------------------------------------- ^
							
							//---------------------------------------------- v
							
							if (GameModifier_Selection.equalsIgnoreCase("4")) {
								
								boolean PlayerPreferences_DoneModifying = false;	
								while (!PlayerPreferences_DoneModifying) {
								
								System.out.print("|\n");
								System.out.print("|\n");
								System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
								System.out.print("|\n");
								System.out.print("|\n");
								System.out.print("|             +=============================================+                          \n");
								System.out.print("|             🡺🡺🡺  +-+-+-{ PLAYER PREFERENCES }-+-+-+  🡸🡸🡸                          \n");
								System.out.print("|             +=============================================+                          \n");
								System.out.print("|\n");
								System.out.print("|                    ❖[1] " + "\033[4;2m" + "'Proceedings' Function" + "\033[0m" + "   \n");
								System.out.print("|                       ↪ { Info Given: Advanced }                                     \n");
								System.out.print("|                       ↪ { Status: Activated }                                        \n");
								System.out.print("|\n");
								System.out.print("|                    ❖[2] " + "\033[4;2m" + "'Verification' Function" + "\033[0m" + "  \n");
								System.out.print("|                       ↪ { Status: Activated }                                        \n");
								System.out.print("|\n");
								System.out.print("|      _______________________________________________________________________         \n");
								System.out.print("|\n");
								System.out.print("|      ▣ Select a Function from [1-2] to modify. Type [Back] otherwise: ");
								
								boolean PlayerPreferences_ValidInput = false;	//Uncomment once you decided to add a UI where the {PlayerPreferences_ValidInput = true } will be in a [1-2]
								while (!PlayerPreferences_ValidInput) {
									
								String PlayerPreferences_Selection = input.nextLine();
								
									//---------------------------------------------- v
								
									if (PlayerPreferences_Selection.equalsIgnoreCase("1")) {
										System.out.print("|        >> Proceedings Function Modifications - Coming Soon!\n");
										System.out.print("|        >> Proceedings Function Modifications - Set to Default\n");
										System.out.print("|\n");
										System.out.print("|      ▣ Select a Function from [1-2] to modify. Type [Back] otherwise: "); }
									
									//---------------------
									
									if (PlayerPreferences_Selection.equalsIgnoreCase("2")) {
										System.out.print("|        >> Verification Function Modifications - Coming Soon!\n");
										System.out.print("|        >> Verification Function Modifications - Set to Default\n");
										System.out.print("|\n");
										System.out.print("|      ▣ Select a Function from [1-2] to modify. Type [Back] otherwise: "); }
									
									//---------------------
									
									if (PlayerPreferences_Selection.equalsIgnoreCase("")) {
										System.out.print("|        >> You didn't input anything: "); }
									
									//---------------------
									
									if (PlayerPreferences_Selection.equalsIgnoreCase("Back")) {
										PlayerPreferences_ValidInput = true;
										PlayerPreferences_DoneModifying = true;
										GameModifiers_DoneModifying = true; }
									
									//---------------------
									
									if (!PlayerPreferences_Selection.equalsIgnoreCase("1")) {
										if (!PlayerPreferences_Selection.equalsIgnoreCase("2")) {
											if (!PlayerPreferences_Selection.equalsIgnoreCase("")) {
												if (!PlayerPreferences_Selection.equalsIgnoreCase("Back")) {
													System.out.print("|        >> Please Select a Function from [1-2] or type [Back] otherwise: "); }}}}
									
									//---------------------------------------------- ^
							
								} // End of the 'While' Loop for the {PlayerPreferences_ValidInput}
								
							} // End of the 'While' Loop for the {PlayerPreferences_DoneModifying}
								
							} // End of the 'If' of Selecting {PlayerPreferences}
							
							//---------------------------------------------- ^
							
							//---------------------------------------------- v
							
							if (GameModifier_Selection.equalsIgnoreCase("")) {
								System.out.print("        >> You didn't input anything: "); }
							
							//---------------------------------------------- ^
							
							//---------------------------------------------- v
							
							if (GameModifier_Selection.equalsIgnoreCase("Back")) {
								System.out.print("|\n");
								System.out.print("|\n");
								System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
								GameModifiers_BackToMenuScreen = true; 
								GameModifiers_DoneModifying = true; }
							
							//---------------------------------------------- ^
							
							//---------------------------------------------- v
							
							if (!GameModifier_Selection.equalsIgnoreCase("1")) {
								if (!GameModifier_Selection.equalsIgnoreCase("2")) {
									if (!GameModifier_Selection.equalsIgnoreCase("3")) {
										if (!GameModifier_Selection.equalsIgnoreCase("4")) {
											if (!GameModifier_Selection.equalsIgnoreCase("")) {
												if (!GameModifier_Selection.equalsIgnoreCase("Back")) {
													System.out.print("|        >> Please Select a Game Modifier from [1-4] or type [Back] otherwise: "); }}}}}}
							
							//---------------------------------------------- ^
							
						} // End of the 'While' Loop for the (GameModifiers_DoneModifying}
						
					} // End of the 'While' Loop for the {GameModifiers_BackToMenuScreen}
					
				} // End of the 'If' of Selecting {Game Modifiers}
				
				//============================================== ^
				
				//============================================== v
				
				if (MenuSelection.equalsIgnoreCase("5")) {
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
					MenuSelection_ValidInput = true;
					
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|                +=========================================+                          \n");
					System.out.print("|                🡺🡺🡺  +-+-+-{ GAME MECHANICS }-+-+-+  🡸🡸🡸                          \n");
					System.out.print("|                +=========================================+                          \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      ❖ " + "\033[4;2m" + "Player's Statistics" + "\033[0m" + "                      \n");
					System.out.print("|         ↪ The Player starts with (10 HP) and (10 Dmg).                              \n");
					System.out.print("|         ↪ Once a round is cleared, the Player's stats will revert                   \n");
					System.out.print("|           back to before the Player took any damage.                                \n");
					System.out.print("|         ↪ Before proceeding to the next round, the stats of                         \n");
					System.out.print("|           the Player increases by (+10 HP) and (+10 Dmg)                            \n");
					System.out.print("|\n");
					System.out.print("|         (e.g.)                                                                      \n");
					System.out.print("|                 1st Round          >>>           2nd Round                          \n");
					System.out.print("|            Player's HP:  10 HP              Player's HP:  20 HP                     \n");
					System.out.print("|            Player's Dmg: 10 Dmg             Player's Dmg: 20 Dmg                    \n");
					System.out.print("|\n");
					System.out.print("|      _______________________________________________________________________        \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      ❖ " + "\033[4;2m" + "Available Potions and their effects:" + "\033[0m" + "     \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|           ◈ " + "\033[4;2m" + "Haleness Potion (💗)" + "\033[0m" + "                \n");
					System.out.print("|             >> Heals the Player by (+10 Player HP)                                  \n");
					System.out.print("|             >> Harms the Zombified Enemy by (-10 Zombified Enemy HP)                \n");
					System.out.print("|             >> Can be stacked                                                       \n");
					System.out.print("|\n");
					System.out.print("|           ◈ " + "\033[4;2m" + "Strength Potion (⚔️)" + "\033[0m" + "                \n");
					System.out.print("|             >> Strengthens the Player by (+5 Player Dmg)                            \n");
					System.out.print("|             >> Can be stacked                                                       \n");
					System.out.print("|\n");
					System.out.print("|           ◈ " + "\033[4;2m" + "Weakness Potion (🡻)" + "\033[0m" + "                \n");
					System.out.print("|             >> Weakens the Enemy by (🡻10 Enemy HP) and (🡻10 Enemy Dmg)             \n");
					System.out.print("|             >> Can be stacked                                                       \n");
					System.out.print("|\n");
					System.out.print("|           ◈ " + "\033[4;2m" + "Venomous Potion (☠️)" + "\033[0m" + "                \n");
					System.out.print("|             >> Poisons  the Enemy by (☠️-5 Enemy HP) and (☠️-5 Enemy Dmg) - (x3)    \n");
					System.out.print("|             >> Deceases  zombies  by (☠️+5 Enemy HP) and (☠️+5 Enemy Dmg) - (x3)    \n");
					System.out.print("|             >> Cannot be stacked                                                    \n");
					System.out.print("|\n");
					System.out.print("|           ◈ " + "\033[4;2m" + "Inferno  Potion (🔥)" + "\033[0m" + "                \n");
					System.out.print("|             >> Blazes the Enemy by (🔥-10 Enemy HP) and (🔥-10 Enemy Dmg) - (x2)     \n");
					System.out.print("|             >> The flames can be extinguished by the Blizzard Potion                \n");
					System.out.print("|             >> The flames can be extinguished by the Tempest  Potion                \n");
					System.out.print("|             >> Can be stacked                                                       \n");
					System.out.print("|\n");
					System.out.print("|           ◈ " + "\033[4;2m" + "Blizzard Potion (❄)" + "\033[0m" + "                \n");
					System.out.print("|             >> Freezes the Enemy, making it unable to attack for 1 turn             \n");
					System.out.print("|             >> The ice can be defrosted by the Inferno Potion                       \n");
					System.out.print("|             >> Can be stacked                                                       \n");
					System.out.print("|\n");
					System.out.print("|           ◈ " + "\033[4;2m" + "Tempest  Potion (🌪)" + "\033[0m" + "                \n");
					System.out.print("|             >> Airbornes the Enemy for 3 turns                                      \n");
					System.out.print("|             >> Airborned Enemies cannot attack and cannot be attacked               \n");
					System.out.print("|             >> Can be stacked                                                       \n");
					System.out.print("|\n");
					System.out.print("|           ◈ " + "\033[4;2m" + "Immunity Potion (🛡)" + "\033[0m" + "                \n");
					System.out.print("|             >> Immunes the Player to any attack for 1 turn                          \n");
					System.out.print("|             >> Can be stacked                                                       \n");
					System.out.print("|\n");
					System.out.print("|      _______________________________________________________________________        \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      ❖ " + "\033[4;2m" + "Enemies' Health Points" + "\033[0m" + "                   \n");
					System.out.print("|         ↪ The Health Points of the Enemies are RANDOMLY generated through           \n");
					System.out.print("|           3 specific ranges and then distributes it RANDOMLY.                       \n");
					System.out.print("|         ↪ The range will be moved (not increased) by 10 numbers after               \n");
					System.out.print("|           clearing a round. This is to coincide with the Player's new stats.        \n");
					System.out.print("|\n");
					System.out.print("|         (e.g.)                                                                      \n");
					System.out.print("|                     1st Round          >>>           2nd Round                      \n");
					System.out.print("|               Enemy #1 - (8-11 HP)             Enemy #1 - (18-21 HP)                \n");
					System.out.print("|               Enemy #2 - (13-16 HP)            Enemy #2 - (23-26 HP)                \n");
					System.out.print("|               Enemy #3 - (18-21 HP)            Enemy #2 - (28-31 HP)                \n");
					System.out.print("|\n");
					System.out.print("|      _______________________________________________________________________        \n");
					System.out.print("|\n");
					System.out.print("|\n");
					System.out.print("|      ❖ " + "\033[4;2m" + "Enemies' Attack Damage" + "\033[0m" + "                   \n");
					System.out.print("|         ↪ The Attack Damage of the Enemies are RANDOMLY generated through           \n");
					System.out.print("|           1 specific range. No need to distribute as they share the same range.     \n");
					System.out.print("|         ↪ The range will be moved (not increased) by 5 numbers after                \n");
					System.out.print("|           clearing a round. This is to coincide with the Player's new stats.        \n");
					System.out.print("|\n");
					System.out.print("|         (e.g.)                                                                      \n");
					System.out.print("|                     1st Round          >>>           2nd Round                      \n");
					System.out.print("|               Enemy #1 - (1-4 Dmg)             Enemy #1 - (6-9 Dmg)                 \n");
					System.out.print("|               Enemy #2 - (1-4 Dmg)             Enemy #2 - (6-9 Dmg)                 \n");
					System.out.print("|               Enemy #3 - (1-4 Dmg)             Enemy #2 - (6-9 Dmg)                 \n");
					System.out.print("|\n");
					System.out.print("|      _______________________________________________________________________        \n");
					System.out.print("|\n");
					System.out.print("|      ▣ Type [Back] to go back to the Menu Screen: ");
					
					//----------------------------------------------
				
					boolean GameMechanics_BackToMenuScreen = false;
					while (!GameMechanics_BackToMenuScreen) {
					
					String GameMechanics_Selection = input.nextLine();
					
					//----------------------------------------------
					
					if (GameMechanics_Selection.equalsIgnoreCase("")) {
						System.out.print("|        >> You didn't input anything: "); }
					
					//----------------------------------------------
					
					if (GameMechanics_Selection.equalsIgnoreCase("Back")) {
						System.out.print("|\n");
						System.out.print("|\n");
						System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
						GameMechanics_BackToMenuScreen = true; }
					
					//----------------------------------------------
					
					if (!GameMechanics_Selection.equalsIgnoreCase("")) {
						if (!GameMechanics_Selection.equalsIgnoreCase("Back")) {
							System.out.print("|        >> Please type [Back] to go back to the Menu Screen: "); }}
					
					//----------------------------------------------
					
					} // End of the 'While' Loop for the {GameMechanics_BackToMenuScreen}
					
				} // // End of the 'If' for Selecting {Game Mechanics}
				
				//----------------------------------------------
				//----------------------------------------------
				
				if (MenuSelection.equalsIgnoreCase("")) {
					System.out.print("|                 >> You didn't input any number: "); }
				
				//----------------------------------------------
				//----------------------------------------------
				
				if (!MenuSelection.equalsIgnoreCase("1")) {
					if (!MenuSelection.equalsIgnoreCase("2")) {
						if (!MenuSelection.equalsIgnoreCase("3")) {
							if (!MenuSelection.equalsIgnoreCase("4")) {
								if (!MenuSelection.equalsIgnoreCase("5")) {
									if (!MenuSelection.equalsIgnoreCase("")) {
										System.out.print("|                 >> Please Select from [1-5] for your decision: "); }}}}}}
				
				//----------------------------------------------
			
			} // End of the 'While' Loop for the {MenuSelection_ValidInput}
			
			//=========================================================================== ^
			
		} // End of the 'While' Loop for the {MenuScreen_DoneWithIt}
		
		//=========================================================================== ^
		
		//===========================================================================
		
		if (GameStarting) {
		
		System.out.print("|\n");
		System.out.print("|                     ▣ Enter your Name: ");
		String Username = input.nextLine();
		
		//===========================================================================
		
		System.out.print("|\n");
		String NumOfRounds_Msg = "|                     ▣ Enter the number of Rounds: ";
		
		int NumOfRounds = 0;
		while (NumOfRounds < 1) {
			System.out.print(NumOfRounds_Msg);
			
			String UserInput_NumOfRounds = input.nextLine();
			
			try {
				NumOfRounds = Integer.valueOf(UserInput_NumOfRounds); }
			catch (NumberFormatException e) {
				NumOfRounds_Msg = "|                       >> Please Enter the NUMBER of Rounds: ";   // This msg will also show if the input number is more than 10 digits, which is the limit of the Eclipse
				NumOfRounds = 0; }
			
		} // While Loop to get the NUMBER of Rounds from the User	
		
		//==============================================
		
		for ( int i=1 ; i<=UserInput_CriticalHitPercentage ; i++ ) {	// Adds the percentage of the chance of 'Critical Hit' happening
			CriticalHit_Percentage.add(i); }
		
		//==============================================
		
		for ( int i=1 ; i<=UserInput_LifeStealPercentage ; i++ ) {		// Adds the percentage of the chance of 'Critical Hit' happening
		LifeSteal_Percentage.add(i); }
		
		//==============================================
		
		for ( int i=1 ; i<=UserInput_StunPercentage ; i++ ) {			// Adds the percentage of the chance of 'Critical Hit' happening
		Stun_Percentage.add(i); }
		
		//===========================================================================
		
		System.out.print("|\n");
		System.out.print("|\n");
		System.out.print("|                              Processing");		// Code that activates the {Processing...} for the {CurrentRoundClearedMsgs}
		
		for ( int i=0 ; i<5 ; i++ ) {
			try {
				TimeUnit.SECONDS.sleep(1);
                System.out.print("."); }
			
            catch (InterruptedException e) {
                e.printStackTrace(); } 
		}
		
		System.out.print("\n");
		System.out.print("|\n");
		System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
		System.out.print("|\n");
		
		//===========================================================================
		
			for ( int CurrentRound=1 ; CurrentRound<=NumOfRounds ; CurrentRound++ ) {		// The TRUE Start of the Game, the Round System
				
				//----------------------------------------------
				
				int UserHealthPoints = 0;																
				for ( int UserHP_PerRound=0 ; UserHP_PerRound<CurrentRound ; UserHP_PerRound++ ) {		// For Resetting and increasing the User's HP after clearing a round
					UserHealthPoints += 10; }
				
				//----------------------------------------------
				
				int UserAttackDmg = 0;
				for ( int UserDmg_PerRound=0 ; UserDmg_PerRound<CurrentRound ; UserDmg_PerRound++ ) {		// For Resetting and increasing the User's Dmg after clearing a round
					UserAttackDmg += 10; }
				
				//----------------------------------------------
				
				String UserHP_Info = "";		
				String UserDmg_Info = "";		
				
				String HalenessPotionAffected = "- ";
				String StrengthPotionAffected = "- ";
				
				String Enemy1_WeaknessPotionAffected = "- ";
				String Enemy2_WeaknessPotionAffected = "- ";
				String Enemy3_WeaknessPotionAffected = "- ";
				
				String EnemyInfo_1 = "";
				String EnemyInfo_2 = "";
				String EnemyInfo_3 = "";
				
				String EnemyInfo_1_Weakened = "";
				String EnemyInfo_2_Weakened = "";
				String EnemyInfo_3_Weakened = "";
				
				String DefeatedMsg = "      " + "\033[4;2m" + "+-{ DEFEATED }-+" + "\033[0m" + "";
				
				//----------------------------------------------
				
				int NumOfDefeatedEnemies = 0;
				DefeatedEnemies.clear();
				AfterSelectionMsgs.clear();
				
				//----------------------------------------------
				
				HalenessPotionQuantity++;
				StrengthPotionQuantity++;
				WeaknessPotionQuantity++;
				
				EnemyHP_Range += 10;
				EnemyDmg_Range += 5;
				
				//----------------------------------------------
				
				EnemyHP_List.clear();
				
				int HealthPoints_1 = (RandomNumber_SpecifiedRange(-2  + EnemyHP_Range,EnemyHP_Range +   2)); 		// Randomly picks between 8-11 HP									
				int HealthPoints_2 = (RandomNumber_SpecifiedRange( 3  + EnemyHP_Range,EnemyHP_Range +   7)); 		// Randomly picks between 13-16 HP       ( At the 1st Round )		
				int HealthPoints_3 = (RandomNumber_SpecifiedRange( 8  + EnemyHP_Range,EnemyHP_Range +  12)); 		// Randomly picks between 18-21 HP								    
				
				EnemyHP_List.add(HealthPoints_1);
				EnemyHP_List.add(HealthPoints_2);
				EnemyHP_List.add(HealthPoints_3);
				
				Collections.shuffle(EnemyHP_List);
				
				int EnemyHP_1 = EnemyHP_List.get(0);
				int EnemyHP_2 = EnemyHP_List.get(1);
				int EnemyHP_3 = EnemyHP_List.get(2);
				
				//===============================================================================================================================================================================//
				// For some reason, the RandomNumberGenerator doesn't generate the maximum number that is being set. So, I added 1 more on each maximum to generate the TRUE MAXIMUM number too. //
				//===============================================================================================================================================================================//
	
				int EnemyDmg_1 = (RandomNumber_SpecifiedRange(-4  + EnemyDmg_Range,EnemyDmg_Range)); // Randomly picks between 1-4 Dmg									(2-5)
				int EnemyDmg_2 = (RandomNumber_SpecifiedRange(-4  + EnemyDmg_Range,EnemyDmg_Range)); // Randomly picks between 1-4 Dmg       ( At the 1st Round )		(2-5)
				int EnemyDmg_3 = (RandomNumber_SpecifiedRange(-4  + EnemyDmg_Range,EnemyDmg_Range)); // Randomly picks between 1-4 Dmg									(2-5)
				
				//===========================================================================
				
				//===========================================================================
							
				while (NumOfDefeatedEnemies < 3) {
					
				StunnedEnemy.clear();
					
				String FirstEnemyHP_Msg = ""+EnemyHP_1+" HP"; 
				String FirstEnemyDmg_Msg = ""+EnemyDmg_1+" Dmg"; 
				
				String SecondEnemyHP_Msg = ""+EnemyHP_2+" HP"; 
				String SecondEnemyDmg_Msg = ""+EnemyDmg_2+" Dmg"; 
					
				String ThirdEnemyHP_Msg = ""+EnemyHP_3+" HP"; 
				String ThirdEnemyDmg_Msg = ""+EnemyDmg_3+" Dmg";
				
				//----------------------------------------------
				
				String RoundFrame_Centered_Adjuster = "                        ";
				
				int CurrentRound_NumOfDigits = CurrentRound;
				int NumOfRounds_NumOfDigits = NumOfRounds;
				
				while ( CurrentRound_NumOfDigits != 0 ) {
					CurrentRound_NumOfDigits = CurrentRound_NumOfDigits / 10; 
					RoundFrame_Centered_Adjuster = RoundFrame_Centered_Adjuster.substring(0,RoundFrame_Centered_Adjuster.length()-1); }
				
				while ( NumOfRounds_NumOfDigits != 0 ) {
					NumOfRounds_NumOfDigits = NumOfRounds_NumOfDigits / 100; 
					RoundFrame_Centered_Adjuster  = RoundFrame_Centered_Adjuster.substring(0,RoundFrame_Centered_Adjuster.length()-1); }
				
				//----------------------------------------------
				//----------------------------------------------
	
				System.out.print("|\n");
				
				System.out.print("|                      ◈=◈=◈{   THE CLASSIC   }◈=◈=◈                                              \n");
				System.out.print("|                          ❖-=◈-+-◈=-❖-=◈-+-◈=-❖                                                  \n");
				System.out.print("|"+RoundFrame_Centered_Adjuster+"◈=◈=◈{  ROUND: "+CurrentRound+" OF "+NumOfRounds+"  }◈=◈=◈       \n");
				System.out.print("|                 ________________________________________                                         \n");
				System.out.print("|\n");
				System.out.print("|                 " + "\033[4;2m" + Username + "'s Statistics:" + "\033[0m" +"                     \n");
				System.out.print("|                      ↪ Health Points: "+UserHealthPoints+" HP  "+UserHP_Info+"                   \n");
				System.out.print("|                      ↪ Attack Damage: "+UserAttackDmg+" Dmg "+UserDmg_Info+"                     \n");
				System.out.print("|                 ________________________________________                                         \n");
				System.out.print("|\n");
				System.out.print("|                 " + "\033[4;2m" + "Battlefield Information:" + "\033[0m" +"                      \n");
				System.out.print("|                   ❖[1] Enemy #1 "+EnemyInfo_1+"                                                  \n");
				System.out.print("|                      ↪ Health Points: "+FirstEnemyHP_Msg+"  "+EnemyInfo_1_Weakened+"             \n");
				System.out.print("|                      ↪ Attack Damage: "+FirstEnemyDmg_Msg+" "+EnemyInfo_1_Weakened+"             \n");
				System.out.print("|\n");
				System.out.print("|                   ❖[2] Enemy #2 "+EnemyInfo_2+"                                                  \n");
				System.out.print("|                      ↪ Health Points: "+SecondEnemyHP_Msg+"  "+EnemyInfo_2_Weakened+"            \n");
				System.out.print("|                      ↪ Attack Damage: "+SecondEnemyDmg_Msg+" "+EnemyInfo_2_Weakened+"            \n");
				System.out.print("|\n");
				System.out.print("|                   ❖[3] Enemy #3 "+EnemyInfo_3+"                                                  \n");
				System.out.print("|                      ↪ Health Points: "+ThirdEnemyHP_Msg+"  "+EnemyInfo_3_Weakened+"             \n");
				System.out.print("|                      ↪ Attack Damage: "+ThirdEnemyDmg_Msg+" "+EnemyInfo_3_Weakened+"             \n");
				System.out.print("|                 ________________________________________                                         \n");
				System.out.print("|\n");
				System.out.print("|                 " + "\033[4;2m" + Username + "'s Potion Bundle:" + "\033[0m" +"                  \n");
				System.out.print("|                   ❖[4] Haleness Potion (💗) - (x"+HalenessPotionQuantity+")                      \n");
				System.out.print("|                      ↪ (+10 Player HP)                                                           \n");
				System.out.print("|\n");
				System.out.print("|                   ❖[5] Strength Potion (⚔️) - (x"+StrengthPotionQuantity+")                      \n");
				System.out.print("|                      ↪ (+5 Player Dmg)                                                           \n");
				System.out.print("|\n");
				System.out.print("|                   ❖[6] Weakness Potion (🡻) - (x"+WeaknessPotionQuantity+")                       \n");
				System.out.print("|                      ↪ (🡻10 Enemy HP)                                                            \n");
				System.out.print("|                      ↪ (🡻10 Enemy Dmg)                                                           \n");
				System.out.print("|                 ________________________________________                                         \n");
				System.out.print("|\n");
				System.out.print("|                 ▣ Select from [1-6] for your decision: ");
			        
			        boolean ConsumedPotion = false;
			        boolean UserInputValidation = false;
			        
			        while(!UserInputValidation) {
			        String Selection = input.nextLine();
			        
			        	//----------------------------------------------              
			        
				        if (DefeatedEnemies.contains(Selection)) {
				        	System.out.print("|                   >> Enemy #"+Selection+" is already defeated. Please try again: "); }
				        
				       //----------------------------------------------
				       //----------------------------------------------
				        
				        else {
					        if (Selection.equalsIgnoreCase("1")) {
					        	System.out.print("|                   >> Attack Enemy #1? [Yes/No]: ");
					        	
					        	boolean AttackEnemy1_Selected_YesNo = false;
					        	while (!AttackEnemy1_Selected_YesNo) {
					        	String AttackEnemy1_YesNo = input.nextLine();
					        	
					        		//----------------------------------------------
					        		
						        	if (AttackEnemy1_YesNo.equalsIgnoreCase("No")) {
						        		System.out.print("|\n");
						        		System.out.print("|                 ▣ Select from [1-6] for your decision: "); 
						        		AttackEnemy1_Selected_YesNo = true; }
						        	
						        	//----------------------------------------------
					        		
						        	if (!AttackEnemy1_YesNo.equalsIgnoreCase("No")) {
						        		if (!AttackEnemy1_YesNo.equalsIgnoreCase("Yes")) {
						        			System.out.print("|                   >> Please type between [Yes/No] for your decision: "); }}
						        		
						        	//---------------------------------------------- v
						        	
						        	if (AttackEnemy1_YesNo.equalsIgnoreCase("Yes")) {
						        		AttackEnemy1_Selected_YesNo = true;
						        		UserInputValidation = true; 
						        		AfterSelectionMsgs.add(Username+" decides to attack Enemy #1");
						        		AfterSelectionMsgs.add("Enemy #1 >>> (-"+UserAttackDmg+" HP)");
						        		
						        		//---------------------
						        					
			        					int CriticalHit_Chance = (RandomNumber_SpecifiedRange(1,101));
							       		
							       		if (CriticalHit_Percentage.contains(CriticalHit_Chance)) {
											double UserAttackDmg_Percentage = UserAttackDmg*UserInput_CriticalHit_ExtraDmgPercentage;
											double User_ExtraDmg = UserAttackDmg_Percentage/100;
											UserCriticalHitDmg = (int)Math.round(User_ExtraDmg);
											AfterSelectionMsgs.add("Critical Hit! >>> (+"+UserInput_CriticalHit_ExtraDmgPercentage+"% Player Dmg)");
											AfterSelectionMsgs.add("Enemy #1 >>> (-"+UserCriticalHitDmg+" HP)"); }
								       	
							       		//---------------------
							       		
							       		int LifeSteal_Chance = (RandomNumber_SpecifiedRange(1,101)); 
							       		
							       		if (LifeSteal_Percentage.contains(LifeSteal_Chance)) {
											double EnemyHP_1_Percentage = EnemyHP_1*UserInput_LifeSteal_ExtraHPPercentage;
											double User_ExtraHP = EnemyHP_1_Percentage/100;
											UserLifeStealHP = (int)Math.round(User_ExtraHP);
											UserHealthPoints += UserLifeStealHP;
											AfterSelectionMsgs.add("LifeSteal! >>> (+"+UserInput_LifeSteal_ExtraHPPercentage+"% Player HP) and (-"+UserInput_LifeSteal_ExtraHPPercentage+"% Enemy HP)");
											AfterSelectionMsgs.add(Username+" >>> (+"+UserLifeStealHP+" HP)");
											AfterSelectionMsgs.add("Enemy #1 >>> (-"+UserLifeStealHP+" HP)"); }
							       		
							       		//---------------------
							       		
							       		EnemyHP_1 -= UserCriticalHitDmg;
							       		EnemyHP_1 -= UserLifeStealHP;
							       		EnemyHP_1 -= UserAttackDmg;
							       		
							       		//---------------------	
										
								       	if (EnemyHP_1 >= 1) {
								       		AfterSelectionMsgs.add("Enemy #1 survives "+Username+"'s attack"); 
								       		
								       		int EnemyStunned_Chance = (RandomNumber_SpecifiedRange(1,101)); 
								       		
											if (Stun_Percentage.contains(EnemyStunned_Chance)) {
												StunnedEnemy.add("1");
												AfterSelectionMsgs.add("Enemy #1 has been stunned"); }}
					        		
								       	//---------------------	
					        		
						        		if (EnemyHP_1 <= 0) { 
											EnemyHP_1 = 0;
											EnemyDmg_1 = 0;
											EnemyInfo_1 = DefeatedMsg;
											DefeatedEnemies.add("1");
											NumOfDefeatedEnemies += 1;
								        	AfterSelectionMsgs.add("Enemy #1 has been defeated by "+Username); }
						        		
						        		//---------------------------------------------- ^
								       	
						        	} // End of the 'If' of Selecting "Yes" on Attacking Enemy #1
					        	
					        	} // End of the 'While' Loop of {AttackEnemy1_Selected_YesNo}
					        	
							} // End of the 'If' of Selecting Enemy #1
					        
					        //============================================== ^
					        
					        //============================================== v
					        
							if (Selection.equalsIgnoreCase("2")) {
					        	System.out.print("|                   >> Attack Enemy #2? [Yes/No]: ");
					        	
					        	boolean AttackEnemy2_Selected_YesNo = false;
					        	while (!AttackEnemy2_Selected_YesNo) {
					        	String AttackEnemy2_YesNo = input.nextLine();
					        	
					        		//----------------------------------------------
					        		
						        	if (AttackEnemy2_YesNo.equalsIgnoreCase("No")) {
						        		System.out.print("|\n");
						        		System.out.print("|                 ▣ Select from [1-6] for your decision: ");
						        		AttackEnemy2_Selected_YesNo = true; }
						        		
						        	//----------------------------------------------
					        		
						        	if (!AttackEnemy2_YesNo.equalsIgnoreCase("No")) {
						        		if (!AttackEnemy2_YesNo.equalsIgnoreCase("Yes")) {
						        			System.out.print("|                   >> Please type between [Yes/No] for your decision: "); }} 
						        		
						        	//----------------------------------------------
						        	
						        	if (AttackEnemy2_YesNo.equalsIgnoreCase("Yes")) {
						        		AttackEnemy2_Selected_YesNo = true;
						        		UserInputValidation = true; 
						        		AfterSelectionMsgs.add(Username+" decides to attack Enemy #2");
						        		AfterSelectionMsgs.add("Enemy #2 >>> (-"+UserAttackDmg+" HP)");
						        		
						        		//---------------------
						        					
			        					int CriticalHit_Chance = (RandomNumber_SpecifiedRange(1,101));
							       		
							       		if (CriticalHit_Percentage.contains(CriticalHit_Chance)) {
											double UserAttackDmg_Percentage = UserAttackDmg*UserInput_CriticalHit_ExtraDmgPercentage;
											double User_ExtraDmg = UserAttackDmg_Percentage/100;
											UserCriticalHitDmg = (int)Math.round(User_ExtraDmg);
											AfterSelectionMsgs.add("Critical Hit! >>> (+"+UserInput_CriticalHit_ExtraDmgPercentage+"% Player Dmg)");
											AfterSelectionMsgs.add("Enemy #2 >>> (-"+UserCriticalHitDmg+" HP)"); }
								       	
							       		//---------------------
							       		
							       		int LifeSteal_Chance = (RandomNumber_SpecifiedRange(1,101)); 
							       		
							       		if (LifeSteal_Percentage.contains(LifeSteal_Chance)) {
											double EnemyHP_2_Percentage = EnemyHP_2*UserInput_LifeSteal_ExtraHPPercentage;
											double User_ExtraHP = EnemyHP_2_Percentage/100;
											UserLifeStealHP = (int)Math.round(User_ExtraHP);
											UserHealthPoints += UserLifeStealHP;
											AfterSelectionMsgs.add("LifeSteal! >>> (+"+UserInput_LifeSteal_ExtraHPPercentage+"% Player HP) and (-"+UserInput_LifeSteal_ExtraHPPercentage+"% Enemy HP)");
											AfterSelectionMsgs.add(Username+" >>> (+"+UserLifeStealHP+" HP)");
											AfterSelectionMsgs.add("Enemy #2 >>> (-"+UserLifeStealHP+" HP)"); }
							       		
							       		//---------------------
							       		
										EnemyHP_2 -= UserCriticalHitDmg;
										EnemyHP_2 -= UserLifeStealHP;
							       		EnemyHP_2 -= UserAttackDmg;
							       		
							       		//---------------------	
										
								       	if (EnemyHP_2 >= 1) {
								       		AfterSelectionMsgs.add("Enemy #2 survives "+Username+"'s attack"); 
								       		
								       		int EnemyStunned_Chance = (RandomNumber_SpecifiedRange(1,101)); 
								       		
											if (Stun_Percentage.contains(EnemyStunned_Chance)) {
												StunnedEnemy.add("2");
												AfterSelectionMsgs.add("Enemy #2 has been stunned"); }}
					        		
								       	//---------------------	
					        		
						        		if (EnemyHP_2 <= 0) { 
											EnemyHP_2 = 0;
											EnemyDmg_2 = 0;
											EnemyInfo_2 = DefeatedMsg;
											DefeatedEnemies.add("2");
											NumOfDefeatedEnemies += 1;
								        	AfterSelectionMsgs.add("Enemy #2 has been defeated by "+Username); }
						        		
						        		//---------------------------------------------- ^
								        
						        	} // End of the 'If' of Selecting "Yes" on Attacking Enemy #2
					        	
					        	} // End of the 'While' Loop of {AttackEnemy2_Selected_YesNo}
					        	
							} // End of the 'If' of Selecting Enemy #2
						
							//============================================== ^
							
							//============================================== v
							
							if (Selection.equalsIgnoreCase("3")) {
					        	System.out.print("|                   >> Attack Enemy #3? [Yes/No]: ");
					        	
					        	boolean AttackEnemy3_Selected_YesNo = false;
					        	while (!AttackEnemy3_Selected_YesNo) {
					        	String AttackEnemy3_YesNo = input.nextLine();
					        	
					        		//----------------------------------------------
					        		
						        	if (AttackEnemy3_YesNo.equalsIgnoreCase("No")) {
						        		System.out.print("|\n");
						        		System.out.print("|                 ▣ Select from [1-6] for your decision: "); 
						        		AttackEnemy3_Selected_YesNo = true; }
						        		
						        	//----------------------------------------------
					        		
						        	if (!AttackEnemy3_YesNo.equalsIgnoreCase("No")) {
						        		if (!AttackEnemy3_YesNo.equalsIgnoreCase("Yes")) {
						        			System.out.print("|                   >> Please type between [Yes/No] for your decision: "); }} 
						        		
						        	//----------------------------------------------
						        	
						        	if (AttackEnemy3_YesNo.equalsIgnoreCase("Yes")) {
						        		AttackEnemy3_Selected_YesNo = true;
						        		UserInputValidation = true; 
						        		AfterSelectionMsgs.add(Username+" decides to attack Enemy #3");
						        		AfterSelectionMsgs.add("Enemy #3 >>> (-"+UserAttackDmg+" HP)");
						        		
						        		//---------------------
						        					
			        					int CriticalHit_Chance = (RandomNumber_SpecifiedRange(1,101));
							       		
							       		if (CriticalHit_Percentage.contains(CriticalHit_Chance)) {
											double UserAttackDmg_Percentage = UserAttackDmg*UserInput_CriticalHit_ExtraDmgPercentage;
											double User_ExtraDmg = UserAttackDmg_Percentage/100;
											UserCriticalHitDmg = (int)Math.round(User_ExtraDmg);
											AfterSelectionMsgs.add("Critical Hit! >>> (+"+UserInput_CriticalHit_ExtraDmgPercentage+"% Player Dmg)");
											AfterSelectionMsgs.add("Enemy #3 >>> (-"+UserCriticalHitDmg+" HP)"); }
								       	
							       		//---------------------
							       		
							       		int LifeSteal_Chance = (RandomNumber_SpecifiedRange(1,101)); 
							       		
							       		if (LifeSteal_Percentage.contains(LifeSteal_Chance)) {
											double EnemyHP_3_Percentage = EnemyHP_3*UserInput_LifeSteal_ExtraHPPercentage;
											double User_ExtraHP = EnemyHP_3_Percentage/100;
											UserLifeStealHP = (int)Math.round(User_ExtraHP);
											UserHealthPoints += UserLifeStealHP;
											AfterSelectionMsgs.add("LifeSteal! >>> (+"+UserInput_LifeSteal_ExtraHPPercentage+"% Player HP) and (-"+UserInput_LifeSteal_ExtraHPPercentage+"% Enemy HP)");
											AfterSelectionMsgs.add(Username+" >>> (+"+UserLifeStealHP+" HP)");
											AfterSelectionMsgs.add("Enemy #3 >>> (-"+UserLifeStealHP+" HP)"); }
							       		
							       		//---------------------
							       		
							       		EnemyHP_3 -= UserCriticalHitDmg;
							       		EnemyHP_3 -= UserLifeStealHP;
							       		EnemyHP_3 -= UserAttackDmg;
							       		
							       		//---------------------	
										
								       	if (EnemyHP_3 >= 1) {
								       		AfterSelectionMsgs.add("Enemy #3 survives "+Username+"'s attack"); 
								       		
								       		int EnemyStunned_Chance = (RandomNumber_SpecifiedRange(1,101)); 
								       		
											if (Stun_Percentage.contains(EnemyStunned_Chance)) {
												StunnedEnemy.add("3");
												AfterSelectionMsgs.add("Enemy #3 has been stunned"); }}
					        		
								       	//---------------------	
					        		
						        		if (EnemyHP_3 <= 0) { 
											EnemyHP_3 = 0;
											EnemyDmg_3 = 0;
											EnemyInfo_3 = DefeatedMsg;
											DefeatedEnemies.add("3");
											NumOfDefeatedEnemies += 1;
								        	AfterSelectionMsgs.add("Enemy #3 has been defeated by "+Username); }
						        		
						        		//---------------------------------------------- ^
								       	
						        	} // End of the 'If' of Selecting "Yes" on Attacking Enemy #3
					        	
					        	} // End of the 'While' Loop of {AttackEnemy2_Selected_YesNo}
					        		
							} // End of the 'If' of Selecting Enemy #3
						
							//============================================== ^
							
							//============================================== v
							
							if (Selection.equalsIgnoreCase("4")) {
				        		if (HalenessPotionQuantity == 0) {
									System.out.print("|                   >> You have (x0) Haleness Potions. Please try again: "); }
				        		
				        			//----------------------------------------------
				        		
				        		else {
						        	System.out.print("|                   >> Consume a Haleness Potion? [Yes/No]: ");
						        	
						        	boolean ConsumeHalenessPotion_Selected_YesNo = false;
						        	while (!ConsumeHalenessPotion_Selected_YesNo) {
						        	String ConsumeHalenessPotion_YesNo = input.nextLine();
						        	
							        	//----------------------------------------------
							        		
								        if (ConsumeHalenessPotion_YesNo.equalsIgnoreCase("No")) {
								        	System.out.print("|\n");
								        	System.out.print("|                 ▣ Select from [1-6] for your decision: "); 
							        		ConsumeHalenessPotion_Selected_YesNo = true; }
								        
								        //----------------------------------------------
						        		
							        	if (!ConsumeHalenessPotion_YesNo.equalsIgnoreCase("No")) {
							        		if (!ConsumeHalenessPotion_YesNo.equalsIgnoreCase("Yes")) {
							        			System.out.print("|                   >> Please type between [Yes/No] for your decision: "); }} 
							        		
							        	//----------------------------------------------
							        		
							        	if (ConsumeHalenessPotion_YesNo.equalsIgnoreCase("Yes")) {
							        		ConsumeHalenessPotion_Selected_YesNo = true;
							        		ConsumedPotion = true;
							        			 
											HalenessPotionQuantity--;
											UserHealthPoints += 10;
											HalenessPotionAffected += "💗";
											UserHP_Info = HalenessPotionAffected;
											UserInputValidation = true;
											
											AfterSelectionMsgs.add(Username+" consumes a Haleness Potion (💗)"); 
											AfterSelectionMsgs.add(Username+" >>> (+10 HP)"); }
											
										//----------------------------------------------
							        	
									} // End of the 'While' Loop of {ConsumeHalenessPotion_Selected_YesNo}
					        	
				        		} // Only "Else' of selecting and having 1 or more Haleness Potion
					        		
							} // End of the 'If' of Selecting the Haleness Potion
						
							//==============================================
							
							//============================================== V
								
							if (Selection.equalsIgnoreCase("5")) {
								if (StrengthPotionQuantity == 0) {
									System.out.print("|                   >> You have (x0) Strength Potions. Please try again: "); }
								
									//----------------------------------------------
								
								else {
						        	System.out.print("|                   >> Consume a Strength Potion? [Yes/No]: ");
						        	
						        	boolean ConsumeStrengthPotion_Selected_YesNo = false;
						        	while (!ConsumeStrengthPotion_Selected_YesNo) {
						        	String ConsumeStrengthPotion_YesNo = input.nextLine();
						        	
							        	//----------------------------------------------
							        		
								        if (ConsumeStrengthPotion_YesNo.equalsIgnoreCase("No")) {
								        	System.out.print("|\n");
								        	System.out.print("|                 ▣ Select from [1-6] for your decision: ");
							        		ConsumeStrengthPotion_Selected_YesNo = true; }
								        
								        //----------------------------------------------
						        		
							        	if (!ConsumeStrengthPotion_YesNo.equalsIgnoreCase("No")) {
							        		if (!ConsumeStrengthPotion_YesNo.equalsIgnoreCase("Yes")) {
							        			System.out.print("|                   >> Please type between [Yes/No] for your decision: "); }} // !!! Add a Boolean here and the same system to other Yes/No Areas
							        		
							        	//----------------------------------------------
							        		
							        	if (ConsumeStrengthPotion_YesNo.equalsIgnoreCase("Yes")) {
							        		ConsumeStrengthPotion_Selected_YesNo = true;
											ConsumedPotion = true;
											
											StrengthPotionQuantity--;
											UserAttackDmg += 5;
											StrengthPotionAffected += "⚔️";
											UserDmg_Info = StrengthPotionAffected;
											UserInputValidation = true; 
											
											AfterSelectionMsgs.add(Username+" consumes a Strength Potion (⚔️)");
											AfterSelectionMsgs.add(Username+" >>> (+5 Dmg)"); }
											
										//----------------------------------------------
							        	
									} // End of the 'While' Loop of {ConsumeStrengthPotion_Selected_YesNo}
						        	
								} // Only "Else' of selecting and having 1 or more Strength Potion
				        		
							} // End of the 'If' of Selecting the Strength Potion
						
							//============================================== ^
							
							//============================================== v
							
							else {
								if (Selection.equalsIgnoreCase("6")) {
									if (WeaknessPotionQuantity == 0) {
										System.out.print("|                   >> You have (x0) Weakness Potions. Please try again: "); }
									
									//----------------------------------------------
									
									else {
							        	System.out.print("|                   >> Use a Weakness Potion? [Yes/No]: ");
							        	
							        	boolean UseWeaknessPotion_Selected_YesNo = false;
							        	while (!UseWeaknessPotion_Selected_YesNo) {
							        	String UseWeaknessPotion_YesNo = input.nextLine();
							        	
								        	//----------------------------------------------
								        		
									        if (UseWeaknessPotion_YesNo.equalsIgnoreCase("No")) {
									        	System.out.print("|\n");
									        	System.out.print("|                 ▣ Select from [1-6] for your decision: ");
								        		UseWeaknessPotion_Selected_YesNo = true; }
									        
									        //----------------------------------------------
							        		
								        	if (!UseWeaknessPotion_YesNo.equalsIgnoreCase("No")) {
								        		if (!UseWeaknessPotion_YesNo.equalsIgnoreCase("Yes")) {
								        			System.out.print("|                   >> Please type between [Yes/No] for your decision: "); }} // !!! Add a Boolean here and the same system to other Yes/No Areas
								        		
								        	//----------------------------------------------
								        		
								        	if (UseWeaknessPotion_YesNo.equalsIgnoreCase("Yes")) {
								        		UseWeaknessPotion_Selected_YesNo = true;
								        		ConsumedPotion = true;
								        		AfterSelectionMsgs.add(Username+" decides to use a Weakness Potion (🡻)");
								        		
								        		//----------------------------------------------
								        		//----------------------------------------------
												
												System.out.print("|\n");
												System.out.print("|                 ▣ Select an Enemy from [1-3] Weaken. Type [Cancel] otherwise: ");
											
												boolean SelectedEnemyWeakened = false;
												
												while(!SelectedEnemyWeakened) {
												String WeakenEnemy = input.nextLine();
												
													//----------------------------------------------
												
													if (DefeatedEnemies.contains(WeakenEnemy)) {
														System.out.print("|                   >> Enemy #"+WeakenEnemy+" is already defeated. Pick another: "); }
													
													//============================================== v
													
													else {
														if (WeakenEnemy.equalsIgnoreCase("1")) {
												        	System.out.print("|                   >> Use the Weakness Potion on Enemy #1? [Yes/No]: ");
												        	
												        	boolean WeakenEnemy1_Selected_YesNo = false;
												        	while (!WeakenEnemy1_Selected_YesNo) {
												        	String WeakenEnemy1_YesNo = input.nextLine();
												        	
													        	//----------------------------------------------
													        		
														        if (WeakenEnemy1_YesNo.equalsIgnoreCase("No")) {
														        	System.out.print("|\n");
														        	System.out.print("|                 ▣ Select an Enemy from [1-3] Weaken. Type [Cancel] otherwise: "); 
													        		WeakenEnemy1_Selected_YesNo = true; }
														        
														        //----------------------------------------------
												        		
													        	if (!WeakenEnemy1_YesNo.equalsIgnoreCase("No")) {
													        		if (!WeakenEnemy1_YesNo.equalsIgnoreCase("Yes")) {
													        			System.out.print("|                   >> Please type between [Yes/No] for your decision: "); }} // !!! Add a Boolean here and the same system to other Yes/No Areas
													        		
													        	//----------------------------------------------
													        		
														        if (WeakenEnemy1_YesNo.equalsIgnoreCase("Yes")) {
														        	WeakenEnemy1_Selected_YesNo = true;
														        	WeaknessPotionQuantity--;
														        	Enemy1_WeaknessPotionAffected += "🡻";
														        	EnemyInfo_1_Weakened = Enemy1_WeaknessPotionAffected;
																	
																	//----------------------------------------------
																	
																	if (EnemyHP_1 == 1 && EnemyDmg_1 == 1) {
																		System.out.print("|                   >> Enemy #1 is already at its lowest. Pick another: "); }
																	
																	//----------------------------------------------
																	
																	else {
																		UserInputValidation = true;
																		SelectedEnemyWeakened = true;
																		String Enemy1_Weakened_DecreasedHP = "";
																		String Enemy1_Weakened_DecreasedDmg = "";
																		
																		//---------------------
																		
																		if (EnemyHP_1 > 10) {
																			EnemyHP_1 -= 10; 
																			Enemy1_Weakened_DecreasedHP = "10"; }
																		
																		else {
																			if (EnemyHP_1 <= 10) {
																				
																				int Enemy1_DecreasedHP_Result = EnemyHP_1 -= 1;
																				String Enemy1_DecreasedHP = Integer.toString(Enemy1_DecreasedHP_Result);
																				Enemy1_Weakened_DecreasedHP = Enemy1_DecreasedHP;
																				
																				EnemyHP_1 = 1;
																			}
																		}
																		
																		//---------------------
																		
																		if (EnemyDmg_1 > 10) {
																			EnemyDmg_1 -= 10;  
																			Enemy1_Weakened_DecreasedDmg = "10"; }
																		else {
																			if (EnemyDmg_1 <= 10) {
																				
																				int Enemy1_DecreasedDmg_Result = EnemyDmg_1 -= 1;
																				String Enemy1_DecreasedDmg = Integer.toString(Enemy1_DecreasedDmg_Result);
																				Enemy1_Weakened_DecreasedDmg = Enemy1_DecreasedDmg;
																				
																				EnemyDmg_1 = 1; 
																			}
																		}
																		
																		//---------------------
																		
																		AfterSelectionMsgs.add(Username+" decides to weaken Enemy #1"); 
																		AfterSelectionMsgs.add("Enemy #1 has been weakened >>> (🡻"+Enemy1_Weakened_DecreasedHP+" HP) and (🡻"+Enemy1_Weakened_DecreasedDmg+" Dmg)"); 
																		
																		//---------------------
																		
																	}
																	
																	//----------------------------------------------
																	
														        } // End of the 'If' of Selecting "Yes" on Weakening Enemy #1
														        
															} // End of the 'While' Loop of WeakenEnemy1_Selected_YesNo
													        	
														} // End of the 'If' of Selecting Enemy #1 to Weaken
														
													//============================================== ^
														
													//============================================== v
							
														if (WeakenEnemy.equalsIgnoreCase("2")) {
												        	System.out.print("|                   >> Use the Weakness Potion on Enemy #2? [Yes/No]: ");
												        	
												        	boolean WeakenEnemy2_Selected_YesNo = false;
												        	while (!WeakenEnemy2_Selected_YesNo) {
												        	String WeakenEnemy2_YesNo = input.nextLine();
												        	
													        	//----------------------------------------------
													        		
														        if (WeakenEnemy2_YesNo.equalsIgnoreCase("No")) {
														        	System.out.print("|\n");
														        	System.out.print("|                 ▣ Select an Enemy from [1-3] Weaken. Type [Cancel] otherwise: "); 
													        		WeakenEnemy2_Selected_YesNo = true; }
														        
														        //----------------------------------------------
												        		
													        	if (!WeakenEnemy2_YesNo.equalsIgnoreCase("No")) {
													        		if (!WeakenEnemy2_YesNo.equalsIgnoreCase("Yes")) {
													        			System.out.print("|                   >> Please type between [Yes/No] for your decision: "); }} // !!! Add a Boolean here and the same system to other Yes/No Areas
													        		
													        	//----------------------------------------------
													        		
														        if (WeakenEnemy2_YesNo.equalsIgnoreCase("Yes")) {
														        	WeakenEnemy2_Selected_YesNo = true;
														        	WeaknessPotionQuantity--;
														        	Enemy2_WeaknessPotionAffected += "🡻";
														        	EnemyInfo_2_Weakened = Enemy2_WeaknessPotionAffected;
																
																	//----------------------------------------------
																	
																	if (EnemyHP_2 == 1 && EnemyDmg_2 == 1) {
																		System.out.print("|                   >> Enemy #2 is aleady at its lowest. Pick another: "); }
																	
																	//----------------------------------------------
																	
																	else {
																		UserInputValidation = true;
																		SelectedEnemyWeakened = true;
																		String Enemy2_Weakened_DecreasedHP = "";
																		String Enemy2_Weakened_DecreasedDmg = "";
																		
																		//---------------------
																		
																		if (EnemyHP_2 > 10) {
																			EnemyHP_2 -= 10; 
																			Enemy2_Weakened_DecreasedHP = "10"; }
																		else {
																			if (EnemyHP_2 <= 10) {
																				
																				int Enemy2_DecreasedHP_Result = EnemyHP_2 -= 1;
																				String Enemy2_DecreasedHP = Integer.toString(Enemy2_DecreasedHP_Result);
																				Enemy2_Weakened_DecreasedHP = Enemy2_DecreasedHP;
																				
																				EnemyHP_2 = 1;
																			}
																		}
																		
																		//---------------------
																		
																		if (EnemyDmg_2 > 10) {
																			EnemyDmg_2 -= 10; 
																			Enemy2_Weakened_DecreasedDmg = "10"; }
																		
																		else {
																			if (EnemyDmg_2 <= 10) {
																				
																				int Enemy2_DecreasedDmg_Result = EnemyDmg_2 -= 1;
																				String Enemy2_DecreasedDmg = Integer.toString(Enemy2_DecreasedDmg_Result);
																				Enemy2_Weakened_DecreasedDmg = Enemy2_DecreasedDmg;
																				
																				EnemyDmg_2 = 1;
																			}
																		}
																		
																		//---------------------
																		
																		AfterSelectionMsgs.add(Username+" decides to weaken Enemy #2"); 
																		AfterSelectionMsgs.add("Enemy #2 has been weakened >>> (🡻"+Enemy2_Weakened_DecreasedHP+" HP) and (🡻"+Enemy2_Weakened_DecreasedDmg+" Dmg)"); 
																		
																		//---------------------
																		
																	}
																	
																	//----------------------------------------------
																
														        } // End of the 'If' of Selecting "Yes" on Weakening Enemy #2
														        
															} // End of the 'While' Loop of WeakenEnemy2_Selected_YesNo
															
														} // End of the 'If' of Selecting Enemy #2 to Weaken
														
													//============================================== ^
														
													//============================================== v
							
														if (WeakenEnemy.equalsIgnoreCase("3")) {
												        	System.out.print("|                   >> Use the Weakness Potion on Enemy #3? [Yes/No]: ");
												        	
												        	boolean WeakenEnemy3_Selected_YesNo = false;
												        	while (!WeakenEnemy3_Selected_YesNo) {
												        	String WeakenEnemy3_YesNo = input.nextLine();
												        	
													        	//----------------------------------------------
													        		
														        if (WeakenEnemy3_YesNo.equalsIgnoreCase("No")) {
														        	System.out.print("|\n");
														        	System.out.print("|                 ▣ Select an Enemy from [1-3] Weaken. Type [Cancel] otherwise: "); 
													        		WeakenEnemy3_Selected_YesNo = true; }
														        
														        //----------------------------------------------
												        		
													        	if (!WeakenEnemy3_YesNo.equalsIgnoreCase("No")) {
													        		if (!WeakenEnemy3_YesNo.equalsIgnoreCase("Yes")) {
													        			System.out.print("|                   >> Please type between [Yes/No] for your decision: "); }} // !!! Add a Boolean here and the same system to other Yes/No Areas
													        		
													        	//----------------------------------------------
													        		
														        if (WeakenEnemy3_YesNo.equalsIgnoreCase("Yes")) { 
														        	WeakenEnemy3_Selected_YesNo = true;
														        	WeaknessPotionQuantity--;
														        	Enemy3_WeaknessPotionAffected += "🡻"; 
														        	EnemyInfo_3_Weakened = Enemy3_WeaknessPotionAffected;
																
																	//----------------------------------------------
																	
																	if (EnemyHP_3 == 1 && EnemyDmg_3 == 1) {
																		System.out.print("|                   >> Enemy #3 is already at its lowest. Pick another one: "); }
																	
																	//----------------------------------------------
																	
																	else {
																		UserInputValidation = true;
																		SelectedEnemyWeakened = true;
																		String Enemy3_Weakened_DecreasedHP = "";
																		String Enemy3_Weakened_DecreasedDmg = "";
			
																		//---------------------
																		
																		if (EnemyHP_3 > 10) {
																			EnemyHP_3 -= 10;  
																			Enemy3_Weakened_DecreasedHP = "10"; }
																		else {
																			if (EnemyHP_3 <= 10) { 
																				
																				int Enemy3_DecreasedHP_Result = EnemyHP_3 -= 1;
																				String Enemy3_DecreasedHP = Integer.toString(Enemy3_DecreasedHP_Result);
																				Enemy3_Weakened_DecreasedHP = Enemy3_DecreasedHP;
																				
																				EnemyHP_3 = 1; }}
																		
																		//---------------------
																		
																		if (EnemyDmg_3 > 10) {
																			EnemyDmg_3 -= 10;  
																			Enemy3_Weakened_DecreasedDmg = "10"; }
																		else {
																			if (EnemyDmg_3 <= 10) {
																				 
																				int Enemy3_DecreasedDmg_Result = EnemyDmg_3 -= 1;
																				String Enemy3_DecreasedDmg = Integer.toString(Enemy3_DecreasedDmg_Result);
																				Enemy3_Weakened_DecreasedDmg = Enemy3_DecreasedDmg;
																				
																				EnemyDmg_3 = 1; }}
																		
																		//---------------------
																		
																		AfterSelectionMsgs.add(Username+" decides to weaken Enemy #3"); 
																		AfterSelectionMsgs.add("Enemy #3 has been weakened >>> (🡻"+Enemy3_Weakened_DecreasedHP+" HP) and (🡻"+Enemy3_Weakened_DecreasedDmg+" Dmg)"); 
																		
																		//---------------------   
																		
																	}
																	
																	//----------------------------------------------
																	
																} // End of the 'If' of Selecting "Yes" on Weakening Enemy #3
														        
															} // End of the 'While' Loop of WeakenEnemy1_Selected_YesNo
															
														} // End of the 'If' of Selecting Enemy #3 to Weaken
														
													//============================================== ^
											
														
								//=============================================================================//
								// Continuation of the Nested 'If and 'Else' Chain of {SelectedEnemyWeakened}. //  
								//=============================================================================//						
													
														
														//============================================== v
														
														else {
															if (WeakenEnemy.equalsIgnoreCase("Cancel")) {
																System.out.print("|                   >> The Selection of using the Weakness Potion has been cancelled\n");
																System.out.print("|\n");
																System.out.print("|                 ▣ Select from [1-6] for your decision: ");
																ConsumedPotion = false;
																SelectedEnemyWeakened = true; 
																AfterSelectionMsgs.add(Username+" changes its mind"); }
															
															//----------------------------------------------
															
															else {
																if (WeakenEnemy.equalsIgnoreCase("")) {
																	System.out.print("|                   >> You didn't input anything: "); }
																
																//----------------------------------------------
																
																else {
																	if (!WeakenEnemy.equalsIgnoreCase("1")) {
																	if (!WeakenEnemy.equalsIgnoreCase("2")) {
																	if (!WeakenEnemy.equalsIgnoreCase("3")) {
																		System.out.print("|                   >> Please Select an Enemy from [1-3] to Weaken or type [Cancel] otherwise: "); }}}
																	
																//----------------------------------------------
																	
																} // Last 'Else' of the {SelectedEnemyWeakened} for inputting something that is not in any of the selection 
																
															} // 'Else' of the {SelectedEnemyWeakened} for not inputting any number 
															
														} // 'Else' for the Cancellation of Using the Weakness Potion
														
														//============================================== ^
														
														
								//=============================================================================//
								// Continuation of the Nested 'If and 'Else' Chain of {SelectedEnemyWeakened}. //  
								//=============================================================================//		
														
														
													//==============================================
														
													} // First 'Else' of the {SelectedEnemyWeakened} where the selecting on which enemy to weaken begins after the First 'If' where it detects if the enemy to weaken is already defeated
														
												} // End of the 'While' Loop for the {SelectedEnemyWeakened} in the {UserInputValidation} 'While' Loop
												
											} // End of the 'If' of Selecting "Yes" on Weakness Potion
								        	
										} // End of the 'While' Loop of {UseWeaknessPotion_Selected_YesNo}
							        	
									} // Only "Else' of selecting and having 1 or more Weakness Potion
									
								} // End of the 'If' of Selecting the Weakness Potion
								
							//==============================================
								
								
						//===========================================================================//
						// Continuation of the Nested 'If and 'Else' Chain of {UserInputValidation}. //  
						//===========================================================================//
								
								
									//============================================== v
			
									else {
										if (Selection.equalsIgnoreCase("")) {
											System.out.print("|                   >> You didn't input any number: "); }
										
										//----------------------------------------------
										
										else {
											if (!Selection.equalsIgnoreCase("1")) {
											if (!Selection.equalsIgnoreCase("2")) {
											if (!Selection.equalsIgnoreCase("3")) {
											if (!Selection.equalsIgnoreCase("4")) {
											if (!Selection.equalsIgnoreCase("5")) {
											if (!Selection.equalsIgnoreCase("6")) {
												System.out.print("|                   >> Please Select from [1-6] for your decision: "); }}}}}}
											
										} // Last 'Else' of the {UserInputValidation} for inputting something that is not in any of the selection  
										
									} // 'Else' of the {UserInputValidation} for not inputting any number 
								
									//============================================== ^
									
								
						//=========================================================================================//
						// There is a gap here because this is where the code for the Weakness Potion is inserted. //
						//=========================================================================================//
								
								
							//==============================================
								
							} // 'Else' of the {UserInputValidation} of the Selecting the Weakness Potion 
							
						} // First 'Else' of the {UserInputValidation} where the validating of the UserInput begins after the First 'If' where it detects if the enemy to attack is already defeated
				        
					} // End of the 'While' Loop of the {UserInputValidation}
			        
			        System.out.print("|\n");
			        System.out.print("|\n");
			        System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
			        System.out.print("|\n");
	
					//===========================================================================
			        
			        
						//===============================================================================================================//
						// Continuation of the line of code of {NumOfDefeats} 'While' Loop after the {UserInputValidation} 'While' Loop. //
						//===============================================================================================================//
			    
			        
			    //===========================================================================
			       
			       
			        
			    //=========================================================================== v
			        	
					boolean AliveEnemyTurn = false;
					while (!AliveEnemyTurn && !ConsumedPotion && NumOfDefeatedEnemies < 3) {
						
					int RandomNumber = (RandomNumber_SpecifiedRange(1,4));
					String RandomEnemyTurn = Integer.toString(RandomNumber);
					
						//----------------------------------------------
					
						if (DefeatedEnemies.contains(RandomEnemyTurn)) {
							System.out.print(""); }
						
						else {
							if (StunnedEnemy.contains(RandomEnemyTurn)) {
							System.out.print(""); }
							
							else {
								AliveEnemyTurn = true;
								AfterSelectionMsgs.add("Enemies' turn to attack");
								AfterSelectionMsgs.add("Enemy #"+RandomEnemyTurn+" decides to attack "+Username+"");
							
								//=========================================================================== v
								
								if (RandomEnemyTurn.equalsIgnoreCase("1")) {
									AfterSelectionMsgs.add(Username+" >>> (-"+EnemyDmg_1+" HP)");
									
									if (UserHealthPoints > EnemyDmg_1) {
						        		UserHealthPoints -= EnemyDmg_1; 
						        		AfterSelectionMsgs.add(Username+" survives Enemy #1's attack"); }
									
									//----------------------------------------------
						        	
									else {
										if (UserHealthPoints <= EnemyDmg_1) { 
											AfterSelectionMsgs.add(Username+" has been defeated by Enemy #1");
								        	PlayerLost = true; }
									}
								}
								
								//=========================================================================== ^
								
								//=========================================================================== v
								
								if (RandomEnemyTurn.equalsIgnoreCase("2")) {
									AfterSelectionMsgs.add(Username+" >>> (-"+EnemyDmg_2+" HP)");
									
									if (UserHealthPoints > EnemyDmg_2) {
										UserHealthPoints -= EnemyDmg_2; 
										AfterSelectionMsgs.add(Username+" survives Enemy #2's attack"); }
									
									//----------------------------------------------
						        	
									else {
										if (UserHealthPoints <= EnemyDmg_2) { 
											AfterSelectionMsgs.add(Username+" has been defeated by Enemy #2");
											PlayerLost = true; }
									}
								}
								
								//=========================================================================== ^
								
								//=========================================================================== v
							
								if (RandomEnemyTurn.equalsIgnoreCase("3")) {
									AfterSelectionMsgs.add(Username+" >>> (-"+EnemyDmg_3+" HP)");
									
									if (UserHealthPoints > EnemyDmg_3) {
										UserHealthPoints -= EnemyDmg_3; 
										AfterSelectionMsgs.add(Username+" survives Enemy #3's attack"); }
									
									//----------------------------------------------
						        	
									else {
										if (UserHealthPoints <= EnemyDmg_3) { 
											AfterSelectionMsgs.add(Username+" has been defeated by Enemy #3");
											PlayerLost = true; }
									}
								}
								
								//=========================================================================== ^
							
							} // Second 'Else' of the RandomEnemyTurn
							
						} // First 'Else' of the RandomEnemyTurn
					
					} // End of the 'While' Loop of the {AliveEnemyTurn}
					
					//=========================================================================== v
					
					if (!ConsumedPotion) {							// Code of the {ProceedingsText} that activates after selecting an enemy to attack, then clearing the {ProceedingsText} ArrayList
						
					System.out.print("|\n");
					System.out.print("|                 +======================================+\n");
					System.out.print("|                 🡺🡺🡺  +-+-+-{ PROCEEDINGS }-+-+-+  🡸🡸🡸\n");
					System.out.print("|                 +======================================+\n");
					System.out.print("|\n");
						
					//----------------------------------------------
						
						int k=0;
						for ( int i=0 ; i<AfterSelectionMsgs.size() ; i++ ) {							// Code to print the {AfterSelectionMsgs}
							try {
								k++;
								TimeUnit.SECONDS.sleep(1);
				                System.out.print("|                 "+k+".) "+AfterSelectionMsgs.get(i)+"\n"); 
				                TimeUnit.SECONDS.sleep(1); }
				            catch (InterruptedException e) {
				                e.printStackTrace(); }
						}
						
						//----------------------------------------------
	
						AfterSelectionMsgs.clear();
						
						//----------------------------------------------
	
						System.out.print("|\n");
						System.out.print("|\n");
						System.out.print("|                              Processing");		// Code that activates the {Processing...} for the {AfterSelectionMsgs}
						
						for ( int i=0 ; i<3 ; i++ ) {
							try {
								TimeUnit.SECONDS.sleep(1);
				                System.out.print(".");
				                TimeUnit.SECONDS.sleep(1); }
							
				            catch (InterruptedException e) {
				                e.printStackTrace(); } 
						}
						System.out.print("\n");
						System.out.print("|");
						
						//----------------------------------------------
						
					} // End of the 'If' of the {ProceedingsText} Function where it will show and clear the {AfterSelectionMsgs} if the Player's last action's is attacking an Enemy
					
					//=========================================================================== ^
					
					//=========================================================================== v
						
					if (ConsumedPotion) { 							// Code that activates the {Using...} for using any potion.
						System.out.print("|                 "+Username+" is using a potion");
						
						for ( int i=0 ; i<3 ; i++ ) {
							try {
								TimeUnit.SECONDS.sleep(1);
				                System.out.print("."); }
							
				            catch (InterruptedException e) {
				                e.printStackTrace(); } 
						}
					}
						
					//=========================================================================== ^
					
					//=========================================================================== v
					
					if (NumOfDefeatedEnemies == 3) {						// Code that activates if a defeated all 3 enemies in a current round
						
						//----------------------------------------------
						
						CurrentRoundClearedMsgs.clear();
						
						System.out.print("\n");
						
						//----------------------------------------------
						
						System.out.print("|\n");
						System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
						System.out.print("|\n");
						
						CurrentRoundClearedMsgs.add("|"); 
						CurrentRoundClearedMsgs.add("|                      ◈=◈=◈{   THE CLASSIC   }◈=◈=◈                                                  ");
						CurrentRoundClearedMsgs.add("|                          ❖-=◈-+-◈=-❖-=◈-+-◈=-❖                                                      ");
						CurrentRoundClearedMsgs.add("|"+RoundFrame_Centered_Adjuster+"◈=◈=◈{  ROUND "+CurrentRound+" OF "+NumOfRounds+"  }◈=◈=◈            ");
						CurrentRoundClearedMsgs.add("|               ___________________________________________                                            ");
						CurrentRoundClearedMsgs.add("|");
						CurrentRoundClearedMsgs.add("|                      +===========================+");
						CurrentRoundClearedMsgs.add("|                      🡺🡺🡺 +-{  CLEARED  }-+  🡸🡸🡸                                                    ");
						CurrentRoundClearedMsgs.add("|                      +===========================+");
						CurrentRoundClearedMsgs.add("|");
	
						//----------------------------------------------
						
						for ( int i=0 ; i<CurrentRoundClearedMsgs.size() ; i++ ) {			// Code that prints the {CurrentRoundClearedMsgs)
							try {
				                System.out.print(CurrentRoundClearedMsgs.get(i)+"\n"); 
				                TimeUnit.SECONDS.sleep(1); }
				            catch (InterruptedException e) {
				                e.printStackTrace(); } 
						}
	
						System.out.print("|\n");
						System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
						System.out.print("|\n");
						
						//----------------------------------------------
						
						//----------------------------------------------
	
						System.out.print("|                              Processing");		// Code that activates the {Processing...} for the {CurrentRoundClearedMsgs}
						
						for ( int i=0 ; i<3 ; i++ ) {
							try {
								TimeUnit.SECONDS.sleep(1);
				                System.out.print(".");
				                TimeUnit.SECONDS.sleep(1); }
							
				            catch (InterruptedException e) {
				                e.printStackTrace(); } 
						}
						
						//----------------------------------------------
						
					} // End of the 'If' of detecting if all enemies have been defeated in a current round
					
					//=========================================================================== ^
					
					//=========================================================================== v
					
					if (PlayerLost) {
						
						System.out.print("\n");
						System.out.print("|\n");
						System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
				        System.out.print("|\n");
				        System.out.print("|\n");
						System.out.print("|      +================================================================+\n");
						System.out.print("|      🡺🡺🡺           +-+-+{ !!! MISSION FAIL !!! }-+-+-+           🡸🡸🡸\n");
						System.out.print("|      🡺🡺🡺         ◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈         🡸🡸🡸\n");
						System.out.print("|      🡺🡺🡺     +-+-+-{ !!! YOU HAVE BEEN CONQUERED !!! }-+-+-+     🡸🡸🡸\n");
						System.out.print("|      +================================================================+\n");
						System.out.print("|\n");
						System.out.print("|\n");
						System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
						return; }
					
					//=========================================================================== ^
					
					//=========================================================================== v
					
					System.out.print("\n");
					System.out.print("|\n");
					System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
					System.out.print("|\n");
					
					//=========================================================================== ^
					
					//=========================================================================== v
					
				} // End of the 'While' Loop of {NumOfDefeats}
				
			} // End of the 'For' Loop of the {NumOfRounds}
		
		} // End of the 'While' Loop of {GameStarting}
		
		//=========================================================================== ^
		
        System.out.print("|\n");
		System.out.print("|      +===================================================================+\n");
		System.out.print("|      🡺🡺🡺           +-+-+{ !!! CONGRATULATIONS !!! }-+-+-+           🡸🡸🡸\n");
		System.out.print("|      🡺🡺🡺           ◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈-+-◈=-❖-=◈          🡸🡸🡸\n");
		System.out.print("|      🡺🡺🡺     +-+-+-{ !!! YOU HAVE OBTAINED IMPERIUM !!! }-+-+-+     🡸🡸🡸\n");
		System.out.print("|      +===================================================================+\n");
		System.out.print("|\n");
		System.out.print("|\n");
		System.out.print("|      ◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈=◈\n");
		
		} // End of the Public Static Void Main
		
	} // End of Scanner
	
	// Authority of Kirby Adrian P. Saligan
	
	//===========================================================================
	
		//---------------
		
		// System.out.print("|                    -+-{   " + "\033[4;2m" + "SELECTED GAME MODE:" + "\033[0m" + "   }-+-\n");
			
		// System.out.print("|                    -+-{       THE CLASSIC       }-+-  \n");
		// System.out.print("|                    -+-{     THE LIVING DEAD     }-+-  \n");
		// System.out.print("|                    -+-{    GHOSTLY VENGEANCE    }-+-  \n");
		
		//---------------
		
		// System.out.print("|      🡺🡺🡺      ◈=◈=◈{   THE CLASSIC   }◈=◈=◈           🡸🡸🡸\n");
		// System.out.print("|      🡺🡺🡺    ◈=◈=◈{   THE LIVING DEAD   }◈=◈=◈           🡸🡸🡸\n");
		// System.out.print("|      🡺🡺🡺   ◈=◈=◈{   GHOSTLY VENGEANCE   }◈=◈=◈           🡸🡸🡸\n");
		// System.out.print("|      🡺🡺🡺          ❖-=◈-+-◈=-❖-=◈-+-◈=-❖         🡸🡸🡸\n");
		// System.out.print("|      🡺🡺🡺      ◈=◈=◈{  ROUND: 1 OF 1  }◈=◈=◈     🡸🡸🡸\n");
		
		//---------------
	
	//===========================================================================
	
		//---------------
	
		// "\033[4;2m" >>> Start of Underline
		// "\033[1m"   >>> Start of Bold
		
		// "\033[0m"   >>> End of both
	
		//---------------
		
		// e.g >>> System.out.println("\033[4;2m" + "Hello World" + "\033[1m"); >>> Hello World (w/ Underline)
		// e.g >>> System.out.println("\033[1m" + "Hello World" + "\033[1m"); >>> Hello World (w/ Bold)
		
		// Underline Template >>> " + "\033[4;2m" + "Insert Text Here" + "\033[0m" + "
		// Bold Template >>> " + "\033[1m" + "Insert Text Here" + "\033[0m" + "
	
		//---------------
	
	//===========================================================================
	
	
		//=======================================================//
	
		static int RandomNumber_SpecifiedRange (int min,int max) {
			Random RandomNumber = new Random();
			
			return RandomNumber.nextInt(max-min)+min; }
		
		static boolean RandomNumber_RangeChecker (int num, int min, int max) {
			return num>min && num<max; }

		//=======================================================//


	} // End of the Public Class
