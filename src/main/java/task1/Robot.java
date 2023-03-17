package task1;

public class Robot extends General{
    private String robot;
    public void getRobot(int b) {
        System.out.printf("Этот робот: ");
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
