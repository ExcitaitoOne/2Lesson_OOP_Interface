package task1;

public class Human extends General {
    private String human;

    public void getHuman(int b) {
        System.out.printf("Этот человек: ");
        if (b == 1) {
            iJump();
        } else if (b == 2) {
            iRun();
        } else {
            System.out.println("спит");
        }

    }
}
