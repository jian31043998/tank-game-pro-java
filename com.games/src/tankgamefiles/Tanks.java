package tankgamefiles;

public class Tanks {
    private int axisX;
    private int axisY;
    private int direction;
    private int campProfile;

    private int speed = 1;




    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void moveUp() {
        axisY -= speed;
    }

    public void moveDown() {
        axisY += speed;
    }

    public void moveLeft() {
        axisX -= speed;
    }

    public void moveRight() {
        axisX += speed;
    }

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

    public Tanks(int axisX, int axisY) {
        this.axisX = axisX;
        this.axisY = axisY;

    }
}
