package KuisPBO2;

public class Player implements Attackable{
    protected String name;
    protected int hp;
    protected int baseAtt;
    protected int skillAtt;
    protected int defend;

    public Player (String name, int hp, int baseAtt, int skillAtt){
        this.name = name;
        this.hp = hp;
        this.baseAtt = baseAtt;
        this.skillAtt = skillAtt;;
    }

    @Override
    public void attack(Attackable target){
        System.out.println(name + " menyerang " + target.getName() + ". Damage diberikan => " + baseAtt );

        if (target instanceof Enemy){
            Enemy e = (Enemy) target;
            e.takeDamage(baseAtt);

            if (!e.isAlive()){
                System.out.println(e.getName() + " telah dikalahkan!");
            }
        }
    }

    @Override
    public void useSkill(Attackable target){
        System.out.println(name + " menyerang " + target.getName() + " dengan skill spesial. Damage diberikan => " + skillAtt);
        Enemy e = (Enemy) target;
        e.takeDamage(skillAtt);

        if (!e.isAlive()){
            System.out.println(e.getName() + " telah dikalahkan!");
        }
    }

    public void takeDamage(int damage){
        hp -= damage;
        if (hp < 0) hp = 0;
    }

    @Override
    public boolean isAlive(){
        return hp > 0;
    }

    @Override
    public String getName(){
        return name;
    }

    public int getHP(){
        return hp;
    }    
}
