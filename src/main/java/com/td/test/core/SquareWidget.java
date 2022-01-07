package com.td.test.core;

public class SquareWidget extends Widget {
    private final int size;

    public SquareWidget(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Widget widget = new SquareWidget(100);
        System.out.println(widget.height());
        System.out.println(widget.width());
    }

    @Override
    protected int width() {
        return size;
    }

    @Override
    protected int height() {
        return size;
    }
}