package rs.behavioral.command;

public class Rectangle {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void increaseWidth(int size) {
        width += size;
    }

    public void decreaseWidth(int size) {
        if (width >= size)
            width -= size;
        else
            width = 0;
    }

    public void increaseHeight(int size) {
        height += size;
    }

    public void decreaseHeight(int size) {
        if (height >= size)
            height -= size;
        else
            height = 0;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("{ width: %d, height: %d, color: '%s' }",
                width, height, color);
    }
}
