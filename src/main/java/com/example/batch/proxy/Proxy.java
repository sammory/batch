package com.example.batch.proxy;

public class Proxy implements TargetInterface{
    private final TargetInterface target;

    public Proxy(TargetInterface target) {
        this.target = target;
    }

    @Override
    public void run() {
        System.out.println("Intercept start!");
        target.run();
        System.out.println("Intercept end!");
    }
}
