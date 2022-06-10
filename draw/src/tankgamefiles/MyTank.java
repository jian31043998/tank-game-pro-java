package tankgamefiles;

public class MyTank extends Tanks{
    public MyTank(int axisX, int axisY, int direction) {
        super(axisX, axisY, direction);
        super.setCampProfile(0);
    }

}
