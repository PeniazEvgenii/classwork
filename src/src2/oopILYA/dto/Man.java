package oopILYA.dto;

public class Man extends Human {
    /**
     * текущая длина волос
     */
    private int hair;

    /**
     * метод получения длины волос
     * @return
     */
    public int getHair() {
        return hair;
    }
    public void setHair(int hair) {
        this.hair = hair;
    }

    /**
     * Отращивание волос
     */
    public void grow(){
        hair+=1;
    }
}
