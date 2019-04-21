package com.myapps.robot

import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import com.myapps.robot.command.MovementCommand
import com.myapps.robot.model.Coordinate
import spock.lang.Specification

class RobotMovementHandlerSpec extends Specification {

    @Subject
    RobotMovementHandler robotMovementHandler

    def "should return fail when non-valid instructions"() {
        given: "a non-valid instructions"
            def invalidMovementCommand = new MovementCommand("invalidInstruction")
        when: "handles robot movement command"
            robotMovementHandler.handle(invalidMovementCommand)
        then: "command fails"
            thrown InvalidInstructionsException
    }

    def "should robot with last position as #lastPosition when receiving #instructins as instructions"() {
        given: " #insturction as instruction"
            def invalidMovementCommand = new MovementCommand(instructions)
        when: "handles robot movement command"
        def returned = robotMovementHandler.handle(invalidMovementCommand)
        then: "returns final position as #lastPosition"
            lastPosition==returned.getCurrentPosition()
        where:
            instructions | lastPosition
            "FF"         | Coordinate.of(0, 2)

    }
}
