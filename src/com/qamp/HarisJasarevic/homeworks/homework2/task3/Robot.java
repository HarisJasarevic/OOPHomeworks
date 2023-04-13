package com.qamp.HarisJasarevic.homeworks.homework2.task3;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int x;
    private int y;
    private int robotMoves;
    private List<String> robotPositions;

    public Robot() {
        this.x = 0;
        this.y = 0;
    }

    public Robot(final int x, final int y) {
        this.x = x;
        this.y = y;
        this.robotMoves = 0;
        this.robotPositions = new ArrayList<>();
        this.robotPositions.add("(" + this.x + "," + this.y + ")");
    }

    public void movesSouth () {
        this.y--;
        this.robotMoves++;
        this.robotPositions.add("(" + this.x + "," + this.y + ")");
    }

    public void movesNorth () {
        this.y++;
        this.robotMoves++;
        this.robotPositions.add("(" + this.x + "," + this.y + ")");
    }

    public void movesEast () {
        this.x++;
        this.robotMoves++;
        this.robotPositions.add("(" + this.x + "," + this.y + ")");
    }

    public void movesWest () {
        this.x--;
        this.robotMoves++;
        this.robotPositions.add("(" + this.x + "," + this.y + ")");
    }

    public final String getRobotPosition () {
        return "(" + this.x + "," + this.y + ")";
    }

    public final double getRobotDistance () {
        final double x0 = this.robotPositions.get(0).charAt(1) - '0';
        final double y0 = this.robotPositions.get(0).charAt(3) - '0';
        final double x1 = this.x;
        final double y1 = this.y;
        return Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2));
    }

    public int getRobotMoves() {
        return this.robotMoves;
    }

    public void printLastRobotPosition (int n) {
        if (n > this.robotMoves) {
            n = this.robotMoves;
        }
        for (int i = this.robotPositions.size() - n; i < this.robotPositions.size(); i++) {
            System.out.println(this.robotPositions.get(i));
        }
    }
}
