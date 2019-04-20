package com.myapps.robot.model;

public enum AxisDirection
{
    AXIS_X_POSITIVE(AxisDirection.AXIS_Y_POSITIVE, AxisDirection.AXIS_Y_NEGATIVE, Coordinate.of(1, 0)),
    AXIS_Y_POSITIVE(AxisDirection.AXIS_X_NEGATIVE, AxisDirection.AXIS_X_POSITIVE, Coordinate.of(0, 1)),
    AXIS_X_NEGATIVE(AxisDirection.AXIS_Y_NEGATIVE, AxisDirection.AXIS_Y_POSITIVE, Coordinate.of(-1, 0)),
    AXIS_Y_NEGATIVE(AxisDirection.AXIS_X_POSITIVE, AxisDirection.AXIS_X_NEGATIVE, Coordinate.of(0, -1));

    private final AxisDirection left;
    private final AxisDirection right;
    private final Coordinate distance;


    AxisDirection(final AxisDirection left, final AxisDirection right, final Coordinate distance)
    {
        this.left = left;
        this.right = right;
        this.distance = distance;
    }


    public AxisDirection getLeft()
    {
        return left;
    }


    public AxisDirection getRight()
    {
        return right;
    }


    public Coordinate moveForwardFrom(Coordinate currentPosition)
    {
        return currentPosition.plus(distance);
    }
}
