package KuisPBO2;

public interface Attackable {
    void attack(Attackable target);
    void useSkill(Attackable target);
    boolean isAlive();
    String getName();
}
