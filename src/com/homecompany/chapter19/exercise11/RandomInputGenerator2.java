package com.homecompany.chapter19.exercise11;

import util.Generator;

class RandomInputGenerator2 implements Generator<ExtendedInput> {
    @Override
    public ExtendedInput next() {
        return new ExtendedInput(ItemToSell.randomSelection(), Input2.randomSelection());
    }
}
