package tankgamefiles;

public class Tanks {
    private int axisX;
    private int axisY;
    private int direction;
    private int campProfile;

    public int getAxisX() {
        return axisX;
    }

    public void setAxisX(int axisX) {
        this.axisX = axisX;
    }

    public int getAxisY() {
        return axisY;
    }

    public void setAxisY(int axisY) {
        this.axisY = axisY;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getCampProfile() {
        return campProfile;
    }

    public void setCampProfile(int campProfile) {
        this.campProfile = campProfile;
    }

    public Tanks(int axisX, int axisY, int direction) {
        this.axisX = axisX;
        this.axisY = axisY;
        this.direction = direction;

    }
}
