package com.myapps.robot.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(staticName = "of")
public class Coordinate {
    private final Integer xPoint;
    private final Integer yPoint;


    Coordinate plus(final Coordinate distance) {
        return new Coordinate(this.xPoint + distance.xPoint, this.yPoint + distance.yPoint);
    }
}
