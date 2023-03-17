package task2;
public class Wall extends Road
    {
    private int hight;

    public Wall(int hight) {
        this.hight = hight;
    }
    public Wall(){

    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
}
