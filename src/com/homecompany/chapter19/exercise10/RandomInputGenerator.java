package com.homecompany.chapter19.exercise10;

import util.Generator;

class RandomInputGenerator implements Generator<Input> {

    @Override
    public Input next() {
        return Input.randomSelection();
    }
}
