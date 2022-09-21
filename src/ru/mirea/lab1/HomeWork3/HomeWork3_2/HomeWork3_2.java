package ru.mirea.lab1.HomeWork3.HomeWork3_2;

public class HomeWork3_2
{
    static Circle[] circles;
    static int circlesCount = 0;

    public static void Start()
    {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        circles = new Circle[4];
        circles[0] = circle1;
        circles[1] = circle2;
        circles[2] = circle3;
        circles[3] = circle4;

        for (int counter = 0; counter < circles.length; counter++)
        {
            System.out.println("Круг "+ counter+": "+circles[counter].GetRadius());
        }

        System.out.println("max Cirlce: " + GetMaxCircle().GetRadius());
        System.out.println("min Cirlce: " + GetMinCircle().GetRadius());

        SortCircles();

        for (int counter = 0; counter < circles.length; counter++)
        {
            System.out.println("Круг "+ counter+": "+circles[counter].GetRadius());
        }
    }

    public static Circle GetMinCircle()
    {
        Circle minCircle = new Circle();
        for(Circle circle : circles)
        {
            if(minCircle.GetRadius() <= 0)
                minCircle = circle;

            if(circle.GetRadius() < minCircle.GetRadius())
                minCircle = circle;
        }

        return minCircle;
    }

    public static Circle GetMaxCircle()
    {
        Circle minCircle = new Circle();
        for(Circle circle : circles)
        {
            if(circle.GetRadius() > minCircle.GetRadius())
                minCircle = circle;
        }

        return minCircle;
    }

    public static void SortCircles()
    {
        Circle temp1 = circles[0];
        int temp1Id = 0;
        int sortedCircles = 0;

        while (sortedCircles < circles.length)
        {
            for (int counter = 0; counter < circles.length - sortedCircles; counter++) {
                Circle circle = circles[counter];

                if (circle.GetRadius() > temp1.GetRadius())
                {
                    temp1 = circle;
                    temp1Id = counter;
                }
            }
            int lastUnSortedCircleId = circles.length - 1 - sortedCircles;
            circles[temp1Id] = circles[lastUnSortedCircleId];
            circles[lastUnSortedCircleId] = temp1;

            temp1 = circles[0];
            temp1Id = 0;
            sortedCircles++;
        }
    }
}
