package com.myapps.robot.command;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class MovementCommand
{
    private final String instructions;
}
