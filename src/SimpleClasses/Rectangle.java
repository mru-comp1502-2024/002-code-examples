package SimpleClasses;


public class Rectangle {
    
    private float length;
    private float width;
    
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(float newLength) {
        this.length = newLength;
    }

    public void setWidth(float newWidth) {
        this.width = newWidth;
    }

    public float getLength() {
        return this.length;
    }

    public float getWidth() {
        return this.width;
    }

    public float getArea() {
        return this.length * this.width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 6);
        System.out.println(r.getArea());
        r.setLength(10);
    }    
}
