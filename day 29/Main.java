import java.util.List;

public class Main {

    public static void main(String[] args) {

        // =========================
        // TEST 1: Player Constructor
        // =========================
        Player player = new Player("Harshita", 10, 15);

        System.out.println("TEST 1");
        System.out.println(player);

        // Expected:
        // Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}


        // =========================
        // TEST 2: Player Getters
        // =========================
        System.out.println("\nTEST 2");

        System.out.println(player.getName());
        System.out.println(player.getHitPoints());
        System.out.println(player.getStrength());
        System.out.println(player.getWeapon());


        // =========================
        // TEST 3: Player Setters
        // =========================
        System.out.println("\nTEST 3");

        player.setName("poonam");
        player.setHitPoints(20);
        player.setStrength(30);
        player.setWeapon("Axe");

        System.out.println(player);

        


        // =========================
        // TEST 4: Player write()
        // =========================
        System.out.println("\nTEST 4");

        List<String> playerData = player.write();

        System.out.println(playerData);

        

        // =========================
        // TEST 5: Player read()
        // =========================
        System.out.println("\nTEST 5");

        Player newPlayer = new Player("Temp", 1, 1);

        newPlayer.read(playerData);

        System.out.println(newPlayer);

       


        // =========================
        // TEST 6: Monster
        // =========================
        System.out.println("\nTEST 6");

        Monster monster = new Monster("Werewolf", 20, 40);

        System.out.println(monster);

        


        // =========================
        // TEST 7: Monster Getters
        // =========================
        System.out.println("\nTEST 7");

        System.out.println(monster.getName());
        System.out.println(monster.getHitPoints());
        System.out.println(monster.getStrength());

        // Expected:
        // Werewolf
        // 20
        // 40


        // =========================
        // TEST 8: Monster write()
        // =========================
        System.out.println("\nTEST 8");

        List<String> monsterData = monster.write();

        System.out.println(monsterData);

        // Expected:
        // [Werewolf, 20, 40]


        // =========================
        // TEST 9: Monster read()
        // =========================
        System.out.println("\nTEST 9");

        Monster newMonster = new Monster("Temp", 1, 1);

        newMonster.read(monsterData);

        System.out.println(newMonster);

        

        // =========================
        // TEST 10: Null read()
        // =========================
        System.out.println("\nTEST 10");

        newPlayer.read(null);
        newMonster.read(null);

        System.out.println(newPlayer);
        System.out.println(newMonster);

      
    }
}
