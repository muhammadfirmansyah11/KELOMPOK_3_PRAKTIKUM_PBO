package KuisPBO2;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Gojo", 6000, 700, 1000);
        Enemy e1 = new Enemy("Sukuna", 5500,400);

        System.out.println("Pertarungan Dimulai");
        System.out.println("HP " + p1.getName() + " = " + p1.getHP());
        System.out.println("HP " + e1.getName() + " = " + e1.getHP());
        System.out.println("========================================================");
        
        while (p1.isAlive() && e1.isAlive()){
            p1.attack(e1);
            if (e1.isAlive()){
                e1.attack(p1);
            }

            System.out.println(p1.getName() + " HP: " + p1.getHP());
            System.out.println(e1.getName() + " HP: " + e1.getHP());
            System.out.println("--------------------------------------------------------");
        }

        if(p1.isAlive()){
            System.out.println(p1.getName().toUpperCase() + " MENANG!!!");
        } else {
            System.out.println("Game Over!!!");
        }
    }
}
