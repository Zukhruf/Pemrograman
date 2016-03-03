public class RobotTest {
    public static void main(String[]args){
        Robot robot1 = new Robot();
        robot1.tampilRobot();
        robot1.tambahKecepatan(20);
        robot1.tampilRobot();
        
        Robot robot2 = new Robot();
        robot2.setArahRobotLain(robot1, 3);
        robot1.tampilRobot();
        robot1.menari();
    }
}
