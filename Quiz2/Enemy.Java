package KuisPBO2;

public class Enemy implements Attackable {
    protected String name;
    protected int hp;
    protected int baseAtt;
    protected int skillAtt;

    public Enemy (String name, int hp, int baseAtt){
        this.name = name;
        this.hp = hp;
        this.baseAtt = baseAtt;
    }

    @Override
    public void attack(Attackable target){
        System.out.println(name + " menyerang " + target.getName() + ". Damage diberikan => " + baseAtt);

        if (target instanceof Player){
            ((Player) target).takeDamage(baseAtt);
        }
    }

    @Override
    public void useSkill(Attackable target){
        System.out.println(name + " menyerang " + target.getName() + " dengan skill spesial. Damage diberikan => " + skillAtt);
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
