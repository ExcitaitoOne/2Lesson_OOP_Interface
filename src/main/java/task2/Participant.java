package task2;

import java.util.ArrayList;

public class Participant extends main {
    private int PowerJump;
    private int PowerRun;
    private String Name;


    /**
     *
     * @param Name Имя участника
     * @param powerJump Сила прыжка
     * @param powerRun Сила прыжка в длину
     */
    public Participant(String Name, int powerJump, int powerRun) {
        this.PowerJump = powerJump;
        this.PowerRun = powerRun;
        this.Name = Name;
    }

    public Participant() {
    }
    public int getPowerJump() {
        return PowerJump;
    }


    public int getPowerRun() {
        return PowerRun;
    }


    public String getName() {
        return Name;
    }

}
