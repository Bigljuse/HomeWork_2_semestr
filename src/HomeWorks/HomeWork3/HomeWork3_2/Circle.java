package HomeWorks.HomeWork3.HomeWork3_2;

import java.util.Random;

public class Circle
{
    private int radius = 0;
    private float length = 0;
    private Point position = new Point(0,0);

    Circle()
    {
        radius = (new Random()).nextInt(500);
        length = radius*2 * 3.14f;
    }

    public float GetLength() {
        return length;
    }

    public int GetRadius() {
        return radius;
    }

    public Point GetPosition() {
        return position;
    }
}
