package com.myapps.robot.model;

public class Robot
{
    private AxisType currentDirection;
    private Coordinate currentPosition;


    private Robot(final AxisType currentDirection, final Coordinate currentPosition)
    {
        this.currentDirection = currentDirection;
        this.currentPosition = currentPosition;
    }

    public Coordinate getCurrentPosition() {
        return currentPosition;
    }

    public static Robot newInstance()
    {
        return new Robot(AxisType.AXIS_Y_POSITIVE, Coordinate.of(0, 0));
    }


    public void turnLeft()
    {
        currentDirection = currentDirection.turnLeft();
    }


    public void turnRight()
    {
        currentDirection = currentDirection.turnRight();
    }


    public void moveForward()
    {
        currentPosition = currentDirection.moveForwardFrom(currentPosition);
    }
}
