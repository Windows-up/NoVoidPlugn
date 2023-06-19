package ru.doctorixx;

public class Config {

    static private final Config instance = new Config();

    private long x;
    private long y;
    private long z;

    public static Config getInstance() {
        return instance;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long getZ() {
        return z;
    }

    public void setPosition(long x, long y, long z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


}
