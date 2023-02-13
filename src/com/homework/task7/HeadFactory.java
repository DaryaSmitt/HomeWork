package com.homework.task7;

public class HeadFactory implements Head {
    public Head[] create() {
        Head[] heads = new Head[3];
        for (int i = 1; i < heads.length; i++) {
            heads[i] = Body.values()[];
        }
        return heads;
    }

}
