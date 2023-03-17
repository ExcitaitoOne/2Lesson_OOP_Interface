package task2;

import java.util.ArrayList;

public class ArrayRoadWall {
    private ArrayList<Wall> itemList = new ArrayList<>();

    private ArrayList<Road> roadList = new ArrayList<>();


    Wall wall = new Wall();
    Road road = new Road();

    public ArrayRoadWall(Road road, Wall wall) {
        this.road = road;
        this.wall = wall;
    }
    public ArrayRoadWall(){

    }


    public void setItemList(ArrayList<Wall> itemList) {
        this.itemList = itemList;
    }

    public void setRoadList(ArrayList<Road> roadList) {
        this.roadList = roadList;
    }


    public ArrayList<Road> addRoadList(Road a) {
        this.roadList.add(a);
        return roadList;
    }
    public ArrayList<Wall> addItemList(Wall a) {
        this.itemList.add(a);
        return itemList;
    }

    public void printItemList() {
        System.out.println(itemList);
    }
    public void printRoadList() {
        System.out.println(roadList);
    }

    public int roadListLength(int a) {
        a = roadList.size();
        return a;
    }

    public Wall getWall() {
        return wall;
    }

    public Road getRoad() {
        return road;
    }

    public int  roadArraymetod (int i){

        return roadList.get(i).getLength();
    }
    public int  wallArraymetod (int index){
        return itemList.get(index).getHight();
    }
}


