package ru.mirea.lab1.HomeWork2.HomeWork2_2;

public class BallTest
{
    public static void Start()
    {
        Ball ball = new Ball(20,20);
        ball.SetXY(5,5);
        ball.GetX();
        ball.GetY();
        ball.Move(-500,5);
        System.out.print(String.format("Шар стоит в точке: %s:%s",ball.GetX(), ball.GetY()));
    }
}
