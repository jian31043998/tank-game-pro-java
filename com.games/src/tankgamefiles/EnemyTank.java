package tankgamefiles;

/**
 * @author Charles
 */
public class EnemyTank extends Tanks{

    public EnemyTank(int axisX, int axisY) {
        super(axisX, axisY);
        this.setCampProfile(1);
        this.setDirection(2);
    }
}
