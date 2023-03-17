package task1;
//Создайте три класса: Человек, Кот, Робот, которые наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
public class General implements iFitness {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Human human = new Human();
        Robot robot = new Robot();

        cat.getCat(1);
        cat.getCat(2);
        human.getHuman(1);
        human.getHuman(2);
        human.getHuman(3);
        robot.getRobot(1);
        robot.getRobot(2);


    }

    @Override
    public void iJump() {
        System.out.println("прыгнул");
    }

    @Override
    public void iRun() {
        System.out.println("бежит");
    }

}


