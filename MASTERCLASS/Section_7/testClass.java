package MASTERCLASS.Section_7;

public class testClass {
    // write your code here
    private int x;
    private int y;
    
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        return (double)(Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)));
    }
    public double distance(int x, int y) {
        return (double)(Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)));
    }
    public double distance(testClass p) {
        return distance(p.getX(), p.getY());
    }
}