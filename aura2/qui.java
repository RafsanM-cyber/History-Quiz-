import java.util.Scanner;

public class qui { 

    public static void main(String[] args) {
        System.out.println("Welcome! This is a History Quiz, Try your best! ");
        System.out.println("What would you like the difficulty level to be: Easy | Medium | Hard?");
        
        Scanner scan = new Scanner(System.in); 
        String[] aur = {"Easy", "Medium", "Hard"};
        String[] ans = {" " ," ", " "};

        ans[0] = scan.next();
  
        
        String[] answers = {"a", "c", "a", "a", "a"};
        String[] responses = {" ", " ", " ", " ", " "};
        String[] answersMed = {"a", "a", "b", "b", "c"};
        String[] answersHard = {"d", "a", "b", "c", "a"};


   if(ans[0].equalsIgnoreCase(aur[0])) {
     // Easy
     System.out.println("What is the Capitol of the USA");
     System.out.println("a. Washington DC");
     System.out.println("b. Berlin");
     System.out.println("c. Albany");
     System.out.println("d. Washington");

     System.out.println("When did WW2 occur?");
     System.out.println("a. 1933");
     System.out.println("b. 1945");
     System.out.println("c. 1939");
     System.out.println("d. 1938");

     System.out.println("When did the Cold War commence?");
     System.out.println("a. 1945");
     System.out.println("b. 1949");
     System.out.println("c. 1951");
     System.out.println("d. 1946");

     System.out.println("When did the British Empire end?");
     System.out.println("a. 1990s");
     System.out.println("b. 1940s");
     System.out.println("c. 1980s");
     System.out.println("d. 1960s");

     System.out.println("When did the French Revolution happen?");
     System.out.println("a. 1789");
     System.out.println("b. 1801");
     System.out.println("c. 1790");
     System.out.println("d. 1793");

     System.out.println("");

    responses[0] = scan.next();
    responses[1] = scan.next();
    responses[2] = scan.next();
    responses[3] = scan.next();
    responses[4] = scan.next();
    

    int score = 0;


     for(int i = 0; i <= 4; i++) {
        if(responses[i].equalsIgnoreCase(answers[i])) {
          score++;

        }
     }

    

     System.out.println("Score: " + score + "/5"); 



 }

else if(ans[0].equalsIgnoreCase(aur[1])) {

     // Medium

     System.out.println("Questions may be harder than Easy, but if you get 5/5 for this one too, you may qualify for the next round.");

     System.out.println("What was the major cause of The Civil War?");
     System.out.println("a. Slavery");
     System.out.println("b. Money");
     System.out.println("c. Border Disputes");
     System.out.println("d. Trade");

     System.out.println("What was the purpose of the Marshall Plan?");
     System.out.println("a. Rebuilt and stabilize Europe");
     System.out.println("b. Destroy and kill European Citizens");
     System.out.println("c. Hand Over all territories to The Soviet Union");
     System.out.println("d. Put the Nazi Regieme back into Power");

     System.out.println("What made The Battle of Hastings in 1066 so significant?");
     System.out.println("a. Led England to fight a battle with France");
     System.out.println("b. Led Norman Conquest of England");
     System.out.println("c. Drawn Russia to fight England");
     System.out.println("d. First battle where England won againt The Normans");

     System.out.println("What were the main objectives of the Civil Rights Movement in the United States during the 1950s and 1960s?");
     System.out.println("a. To abolish slavery");
     System.out.println("b. To promote economic equality for African Americans");
     System.out.println("c. To increase economic equality for women");
     System.out.println("d. To disintegrate Jim Crow Laws");

     System.out.println("How did Enlightment ideas shape democracies around the world today?");
     System.out.println("a. Allowed aboslute monarchies to further expand their powerhouse");
     System.out.println("b. Promoted Freedom, Plutocracy, and Equality");
     System.out.println("c. Promoted Freedom, Liberty, and Equality to all citizens");
     System.out.println("d. Drove innovation allowing more freedom among citizens");

     System.out.println("");

    responses[0] = scan.next();
    responses[1] = scan.next();
    responses[2] = scan.next();
    responses[3] = scan.next();
    responses[4] = scan.next();
    

    int score = 0;


     for(int i = 0; i <= 4; i++) {
        if(responses[i].equalsIgnoreCase(answersMed[i])) {
          score++;

        }
     }

   
    

     System.out.println("Score: " + score + "/5"); 
     
 }


 else if(ans[0].equalsIgnoreCase(aur[2])) {

     // Hard

     System.out.println("This is the hard level, congrats for making it all through. If you pass this with flying colors, you may earn a cookie and a thank you for trying out my program. Good Luck :). ");

     System.out.println("How did the Treaty of Westphilia(1648) affect the modern state system?");
     System.out.println("a. Further spread Enlightment Ideas");
     System.out.println("b. Discouraged the idea of independant states");
     System.out.println("c. Encouraged nationalism to expand overseas");
     System.out.println("d. Ended 30 years war ");

     System.out.println("Cause and Effect of Opium Wars in China");
     System.out.println("a. British Trade of Opium to China, leading to mass addiction");
     System.out.println("b. French Trade of Opium, leading to mass addiction");
     System.out.println("c. British Trade of Opium, leading to China's Growth as a result of mass trade");
     System.out.println("d. American Trade of Opium, leading to outrage and contributing to China’s century of humiliation.");

     System.out.println("What were primary motivations behind European imperialism in Africa during the late 19th century?");
     System.out.println("a. Lack of Political Competition in Africa");
     System.out.println("b. Economic opportunities");
     System.out.println("c. Further spread European ideals and customs in Africa");
     System.out.println("d. Europe seeing Africa's soaring state, and taking advantage of it to gain power");

     System.out.println("What was the significance of the Meiji Restoration in transforming Japan into a modern nation-state?");
     System.out.println("a. Drive innovation in Japan");
     System.out.println("b. Build Japan's Nuclear Bomb Project");
     System.out.println("c. Increased Japan's network of International Relations");
     System.out.println("d. Increase ties with The Philipines and South Korea ");

     System.out.println("To what extent did the collapse of the Soviet Union in 1991 change the political landscape of Eastern Europe?");
     System.out.println("a. Led more nations to form and a rise of nationalism");
     System.out.println("b. Led to more rebellions and outcry in Eastern Europe with the Fall of the Soviets");
     System.out.println("c. Led to a slow end of Absolute Monarchies in Eastern Europe");
     System.out.println("d. Led to a shift towards Republics formed in all countries in Eastern Europe");

     System.out.println("");

    responses[0] = scan.next();
    responses[1] = scan.next();
    responses[2] = scan.next();
    responses[3] = scan.next();
    responses[4] = scan.next();
    

    int score = 0;


     for(int i = 0; i <= 4; i++) {
        if(responses[i].equalsIgnoreCase(answersHard[i])) {
          score++;

        }
     }
    

     System.out.println("Score: " + score + "/5"); 

     if(score == 5) {
      System.out.println("Congrats! Here is your cookie!");
     }
 } 
}
}

 