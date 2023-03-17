package task2;

import java.util.ArrayList;

public class NEWRoad extends main{
    ArrayList<Road> WaLL = new ArrayList<>();

    public ArrayList<Road> addItemList(Wall road, Road wall) {
        this.WaLL.add(road);
        this.WaLL.add(wall);
        return WaLL;
    }

    public void printItemList(){
        System.out.println(WaLL);
    }
    public void getWaLL() {
        System.out.println(WaLL);
    }
    public void printOfItemList(){
        for (int i = 0; i < WaLL.size(); i++) {
            System.out.println( WaLL.get(i).getLength());
            System.out.println(WaLL.get(i));
        }
    }

}
