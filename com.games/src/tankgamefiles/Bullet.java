package tankgamefiles;

public class Bullet {
    private int axisX;
    private int axisY;
    private int bulletSpeed;
    private int direction;

    public void moveUp() {
        axisY -= bulletSpeed;
    }

    public void moveDown() {
        axisY += bulletSpeed;
    }

    public void moveLeft() {
        axisX -= bulletSpeed;
    }

    public void moveRight() {
        axisX += bulletSpeed;
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

    public int getBulletSpeed() {
        return bulletSpeed;
    }

    public void setBulletSpeed(int bulletSpeed) {
        this.bulletSpeed = bulletSpeed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Bullet(int axisX, int axisY, int bulletSpeed, int direction) {
        this.axisX = axisX;
        this.axisY = axisY;
        this.bulletSpeed = bulletSpeed;
        this.direction = direction;
    }
}
