package ru.class2hw1;

public class Treadmill {
    private String name;
    private int treadmill;
    private int run;

    public Treadmill(int treadmill) {
        this.treadmill = treadmill;
    }

    public int getTreadmill() {
        return treadmill;
    }

    static void Treadmill (String name , int treadmill, int run){

        if (run >= treadmill) {

            System.out.println(name + " пробежал дистанцию на беговой дорожке длинной " + treadmill + "м.");
        }else{
            System.out.println(name + " не пробежал на беговой дорожке дистанцию длинной " + treadmill + "м.");
        }

    }


}
