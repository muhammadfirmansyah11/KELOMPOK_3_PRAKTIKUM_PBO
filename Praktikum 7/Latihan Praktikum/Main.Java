public class Main {
    public static void main(String[] args) {

         Player player = new Player("Player" , 90,50,25);
         player.startGame();

          Goblin goblin = new Goblin("Goblin", 90,50,20);
          goblin.startGame();

          goblin.attackPlayer(player);
          player.attackGoblin(goblin);
          goblin.attackPlayer(player);
          player.attackGoblin(goblin);
          goblin.attackPlayer(player);
          player.attackGoblin(goblin);
          goblin.attackPlayer(player);


    }
}
