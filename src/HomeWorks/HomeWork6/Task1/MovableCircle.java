package HomeWorks.HomeWork6.Task1;

public class MovableCircle implements Movable
{
    private int radious = 0;
    private MovablePoint center = new MovablePoint(0,0,0,0);

    MovableCircle(int x, int y, int xSpeed, int ySpeed)
    {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveUp() {

    }

    @Override
    public String toString()
    {
        return "string";
    }
}
