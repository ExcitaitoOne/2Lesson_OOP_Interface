package task2;

// 2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//         должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//         печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
//
//3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//        этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
//        списку он препятствий не идет
public class main implements iFitness{

    public static void main(String[] args) {
        String s = "";
        int roadM = 0;
        int wallM = 0;
        int jump = 0;
        int run = 0;
        int a = 0;
        int b = 0;
        int size1 = 0;
        int size2 = 0;
        boolean logic = false;
        Road road = new Road(3);
        Wall wall = new Wall(2);
        Road road1 = new Road(4);
        Wall wall1 = new Wall(3);
        Road road2 = new Road(1);
        Wall wall2 = new Wall(1);
        ArrayPartcipant arrayLystP = new ArrayPartcipant();
        ArrayRoadWall roadList = new ArrayRoadWall();
        ArrayRoadWall wallList = new ArrayRoadWall();


        Participant part = new Participant("Ярик",2,3);
        Participant part1 = new Participant("Чемпион", 5, 5);
        Participant part2 = new Participant("Василий", 4, 2);
        Participant part3 = new Participant("Василиса",1,1);

        arrayLystP.addPartList(part3);
        arrayLystP.addPartList(part1);
        arrayLystP.addPartList(part2);
        arrayLystP.addPartList(part);
        arrayLystP.getList();

        roadList.addRoadList(road);
        roadList.addRoadList(road1);
        roadList.addRoadList(road2);
        roadList.printRoadList();

        wallList.addItemList(wall1);
        wallList.addItemList(wall);
        wallList.addItemList(wall2);
        wallList.printItemList();
        System.out.println();

        for (int i = 0; i < arrayLystP.partListLength(size1); i++) {
            s = arrayLystP.nameArraymetod(i, s);
            System.out.println("----------------------------");
            System.out.println("Имя участника: " + s);
            jump = arrayLystP.powerJumpArraymetod(i,jump);
            System.out.println("сила прыжка: " + jump);
            run = arrayLystP.powerRunArraymetod(i,run);
            System.out.println("сила бега: " + run);
            System.out.println("----------------------------");
            for (int j = 0; j < roadList.roadListLength(size2) ; j++) {
                wallM = wallList.wallArraymetod(j);
                System.out.println("************");
                System.out.println("Стенка = " + wallM);
                roadM = roadList.roadArraymetod(j);
                System.out.println("Дорожка = " + roadM);
                System.out.println("************");
                logic = arrayLystP.iJump(arrayLystP.powerJumpArraymetod(i,jump),wallList.wallArraymetod(j), logic);
                if (logic == true){
                    break;
                }
                else {
                    logic = false;
                }
                logic = arrayLystP.iRun(arrayLystP.powerRunArraymetod(i,jump),roadList.roadArraymetod(j), logic);
                if (logic == true){
                    break;
                }
                else {
                    logic = false;
                }
            }


        }
    }

    @Override
    public boolean iJump(int a, int b, boolean logic) {
        if(a >= b){
            logic = false;
            System.out.println(">>>>>>");
            System.out.println("Перепрыгнул стену");
        }
        else {
            logic = true;
            System.out.println(">>>>>>");
            System.out.println("Не удалось перепрыгнутьт стену");
        }
        return logic;
    }

    @Override
    public boolean iRun(int a, int b, boolean logic) {
        if(a >= b){
            logic = false;
            System.out.println(">>>>>>");
            System.out.println("Пробежал дорожку");
        }
        else {
            logic = true;
            System.out.println(">>>>>>");
            System.out.println("Не удалось Пробежать дорожку");
        }
        return logic;
    }

}
