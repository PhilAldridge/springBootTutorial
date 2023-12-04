package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements Game {
    public void up() {
        System.out.println("scg up");
    }

    public void down() {
        System.out.println(("scg down"));

    }

    public void left() {
        System.out.println("scg left");
    }

    public void right() {
        System.out.println("scg right");
    }
}
