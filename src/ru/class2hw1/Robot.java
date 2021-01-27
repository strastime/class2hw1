package ru.class2hw1;

public class Robot {

    private  String name;
    private int run;
    private int jump;

    public Robot(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }

    static void Run (String name,int treadmill ,int run){
//        System.out.println("Робот пробежал " + run + " метров.");
        Treadmill.Treadmill(name, treadmill,run);
    }

    static void Jump(String name, int wall ,int jump){
        //System.out.println("Робот подпрыгнул на " + jump + " метров ." );

        Wall.Wall(name, wall, jump);
    }
}
