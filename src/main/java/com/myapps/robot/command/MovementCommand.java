package com.myapps.robot.command;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MovementCommand {
    @NonNull
    private String instructions;


    public List<String> getInstructionList() {
        return instructions.chars()
                .mapToObj(i -> String.valueOf((char) i)).collect(Collectors.toList());
    }
}
