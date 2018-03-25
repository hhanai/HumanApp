package jp.techacademy.hanai.hideo.humanapp;

import android.util.Log;

//　Humanクラス

class Human extends Animal implements Thinkable{

    //　メンバ変数（趣味）
    public String hobby;

    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void say(){
        Log.d("javatest","私の名前は" + this.name + "です。年は" +this.age+"歳です。");

    }

    @Override
    public void think(){
        Log.d("javatest","私は" + this.hobby + "について考える");
    }
}
