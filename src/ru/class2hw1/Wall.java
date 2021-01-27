package ru.class2hw1;

public class Wall {

    private String name;
    private int wall;
    private int jump;

    public Wall(int wall) {
        this.wall = wall;
    }

    public int getWall() {
        return wall;
    }

    static void Wall (String name , int wall, int jump){

        if (jump >= wall) {

            System.out.println(name + " преодалел стену высотой " + wall);
        }else{
            System.out.println(name + " не преодалел стену высотой " + wall);
        }

    }
}
