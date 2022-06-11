package tankgamefiles;

public class MyTank extends Tanks{
    public MyTank(int axisX, int axisY) {
        super(axisX, axisY);
        super.setCampProfile(0);
        super.setDirection(8);
    }

}
