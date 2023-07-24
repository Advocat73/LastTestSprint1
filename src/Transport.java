public class Transport {
    private int maxSpeed;
    private String color;

    Transport (String col, int maxSp) {
        maxSpeed = maxSp;
        color = col;
    }

    public String getColor () {
        return color;
    }
    public int getMaxSpeed () {
        return maxSpeed;
    }
}
