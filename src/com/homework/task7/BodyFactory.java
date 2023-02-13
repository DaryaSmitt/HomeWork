package com.homework.task7;

public class BodyFactory implements Body {
    public Body[] create() {
        Body[] bodies = new Body[3];
        for (int i = 1; i < bodies.length; i++) {
            bodies[i] = Body.values()[];
        }
        return bodies;
    }
}
