package task2;

import java.util.ArrayList;

public class ArrayPartcipant extends Participant {

    private ArrayList<Participant> partList = new ArrayList<>();

    public int partListLength(int a){
        a = partList.size();
        return a;
    }


    public ArrayList<Participant> addPartList(Participant a) {
        this.partList.add(a);
        return partList;
    }
    public int getIndexPartList(int a) {
        this.partList.get(a);
        return a;
    }

    public void getList() {
        System.out.println(partList);
    }
   public void PrintOfPartList(){
       for (int i = 0; i < partList.size() ; i++) {
           System.out.println(partList.get(i).getName());
           System.out.println(partList.get(i).getPowerJump());
           System.out.println(partList.get(i).getPowerRun());
       }
   }
   public void PrintListP(){
       System.out.println(partList);
   }

    /**
     *
     * @param i индекс
     * @param s Имя спортсмена
     * @return Имя
     */
   public String nameArraymetod(int i, String s){
    return partList.get(i).getName();
    }

    /**
     *
     * @param i индекс
     * @param s Сила бега
     * @return Сила бега
     */
    public int powerRunArraymetod(int i, int s){
        return partList.get(i).getPowerRun();
    }

    /**
     *
     * @param i индекс
     * @param s Сила прыжка
     * @return Сила прыжка
     */
    public int  powerJumpArraymetod (int i, int s){
        return partList.get(i).getPowerJump();
    }

}
