package com.example.batch.proxy;

public class TargetImpl implements TargetInterface {
    @Override
    public void run() {
        System.out.println("I'm running");
    }
}
