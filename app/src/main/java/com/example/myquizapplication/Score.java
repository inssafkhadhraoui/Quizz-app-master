package com.example.myquizapplication;

public class Score {
    public static int score = 0;
    public static String pseudo="";
    //public static HashMap<String,Boolean> responses = new HashMap<String,Boolean>();
    public static boolean m1q2 =false;
    public static boolean m1q1=false;
    public static boolean m1q3=false;
    public static boolean m2q1=false;
    public static boolean m2q2=false;
    public static boolean m2q3=false;
    public static boolean m3q1=false;
    public static boolean m3q2=false;
    public static boolean m3q3=false;
    public static boolean m4q1=false;
    public static boolean m4q2=false;
    public static boolean m4q3=false;
    public Score() {
    }

    public static String getPseudo() {
        return pseudo;
    }

    public static void setPseudo(String pseudo) {
        Score.pseudo = pseudo;
    }

    public static boolean isM1q2() {
        return m1q2;
    }

    public static void setM1q2(boolean m1q2) {
        Score.m1q2 = m1q2;
    }

    public static boolean isM1q1() {
        return m1q1;
    }

    public static void setM1q1(boolean m1q1) {
        Score.m1q1 = m1q1;
    }

    public static boolean isM1q3() {
        return m1q3;
    }

    public static void setM1q3(boolean m1q3) {
        Score.m1q3 = m1q3;
    }

    public static boolean isM2q1() {
        return m2q1;
    }

    public static void setM2q1(boolean m2q1) {
        Score.m2q1 = m2q1;
    }

    public static boolean isM2q2() {
        return m2q2;
    }

    public static void setM2q2(boolean m2q2) {
        Score.m2q2 = m2q2;
    }

    public static boolean isM2q3() {
        return m2q3;
    }

    public static void setM2q3(boolean m2q3) {
        Score.m2q3 = m2q3;
    }

    public static boolean isM3q1() {
        return m3q1;
    }

    public static void setM3q1(boolean m3q1) {
        Score.m3q1 = m3q1;
    }

    public static boolean isM3q2() {
        return m3q2;
    }

    public static void setM3q2(boolean m3q2) {
        Score.m3q2 = m3q2;
    }

    public static boolean isM3q3() {
        return m3q3;
    }

    public static void setM3q3(boolean m3q3) {
        Score.m3q3 = m3q3;
    }

    public static boolean isM4q1() {
        return m4q1;
    }

    public static void setM4q1(boolean m4q1) {
        Score.m4q1 = m4q1;
    }

    public static boolean isM4q2() {
        return m4q2;
    }

    public static void setM4q2(boolean m4q2) {
        Score.m4q2 = m4q2;
    }

    public static boolean isM4q3() {
        return m4q3;
    }

    public static void setM4q3(boolean m4q3) {
        Score.m4q3 = m4q3;
    }



    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        Score.score = score;
    }

}


