package model;

public class Character {
    int id;
    String name;
    String specialAttack;
    // String special_attackはよくない！　Javaはキャメルケースを使うよ

    //コンストラクター(newする時に動くよ)
    public Character(){};


    //ゲッターとセッター
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }
}
