package com.myapps.robot.command;

import com.myapps.robot.model.Robot;

import java.util.function.Consumer;

public enum InstructionsType {
    L(Robot::turnLeft),
    R(Robot::turnRight),
    F(Robot::moveForward);

    private final Consumer<Robot> function;


    InstructionsType(Consumer<Robot> function) {
        this.function = function;
    }


    public void perform(Robot robot) {
        this.function.accept(robot);
    }
}
