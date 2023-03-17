package task1;

public class Cat extends General {

    private String Cat;


    public void setCat(String cat) {
        Cat = cat;
    }

    public void getCat(int b) {
        System.out.printf("Этот кот: ");
        if(b == 1){
            iJump();
        }else
        if(b==2){
            iRun();
        }
        else {
            System.out.println("спит");
        }

    }

}
