package com.qamp.HarisJasarevic.homeworks.homework2.task3;

public class RobotMain {

    public static void main(String[] args) {

        Robot robot = new Robot(8,18);

        robot.movesSouth();
        robot.movesNorth();
        robot.movesEast();
        robot.movesWest();

        System.out.println("Robots current position: " + robot.getRobotPosition());
        System.out.println("Robots distance from initial position: " + robot.getRobotDistance());
        System.out.println("Robots moves: " + robot.getRobotMoves());

        int n = 3;
        robot.printLastRobotPosition(n);

    }
}
