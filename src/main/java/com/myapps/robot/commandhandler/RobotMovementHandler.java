package com.myapps.robot.commandhandler;

import com.myapps.robot.command.InstructionsType;
import com.myapps.robot.command.MovementCommand;
import com.myapps.robot.exceptions.InvalidInstructionsException;
import com.myapps.robot.model.Robot;


public class RobotMovementHandler {

    private static final String REG_EXP = "\\b[LFR]+\\b(?![,])";

    public Robot handle(final MovementCommand movementCommand) {
        if (!isValidInstruction(movementCommand.getInstructions())) {
            throw new InvalidInstructionsException("invalid instruction");
        }
        final Robot robot = Robot.newInstance();

        movementCommand.getInstructionList()
                .forEach(instruction -> InstructionsType.valueOf(instruction).perform(robot));

        return robot;
    }

    private boolean isValidInstruction(String instructions) {
        return instructions.matches(REG_EXP);
    }
}
