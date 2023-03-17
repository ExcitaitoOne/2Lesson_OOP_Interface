package task2;

public class Road extends main {
    private int length;

    public Road(int length) {
        this.length = length;
    }

    public Road() {
    }
    public int getLength(){
        return length;
    }

    public int roadAddest(int a){
        a = this.length;
        return a;
    }
    public void printLength(){
        System.out.println(this.length);
    }

}


