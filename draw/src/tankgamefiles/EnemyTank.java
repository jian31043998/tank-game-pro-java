package tankgamefiles;

public class EnemyTank extends Tanks{

    public EnemyTank(int axisX, int axisY, int direction) {
        super(axisX, axisY, direction);
        this.setCampProfile(1);
    }
}
