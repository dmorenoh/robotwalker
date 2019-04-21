package com.myapps.robot.model;

public enum AxisType {
    AXIS_X_POSITIVE(Coordinate.of(1, 0)) {
        @Override
        public AxisType turnLeft() {
            return AXIS_Y_NEGATIVE;
        }

        @Override
        public AxisType turnRight() {
            return AXIS_Y_POSITIVE;
        }
    },
    AXIS_Y_POSITIVE(Coordinate.of(0, 1)) {
        @Override
        public AxisType turnLeft() {
            return AXIS_X_NEGATIVE;
        }

        @Override
        public AxisType turnRight() {
            return AXIS_X_POSITIVE;
        }
    },
    AXIS_X_NEGATIVE(Coordinate.of(-1, 0)) {
        @Override
        public AxisType turnLeft() {
            return AXIS_Y_POSITIVE;
        }

        @Override
        public AxisType turnRight() {
            return AXIS_Y_NEGATIVE;
        }
    },
    AXIS_Y_NEGATIVE(Coordinate.of(0, -1)) {
        @Override
        public AxisType turnLeft() {
            return AXIS_X_NEGATIVE;
        }

        @Override
        public AxisType turnRight() {
            return AXIS_X_POSITIVE;
        }
    };

    private final Coordinate distance;


    AxisType(final Coordinate distance) {
        this.distance = distance;
    }

    protected abstract AxisType turnLeft();

    protected abstract AxisType turnRight();

    public Coordinate moveForwardFrom(Coordinate currentPosition) {
        return currentPosition.plus(distance);
    }
}
