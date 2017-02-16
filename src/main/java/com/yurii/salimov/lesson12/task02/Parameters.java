package com.yurii.salimov.lesson12.task02;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Parameters {

    private static Parameters parameters = new Parameters();

    private String link;
    private int connectNumber;
    private long timer;
    private boolean reconnect;

    private Parameters() {
        this.link = "http://prog.kiev.ua";
        this.connectNumber = 100000;
        this.timer = 10000;
        this.reconnect = true;
    }

    public static Parameters getInstance() {
        return parameters;
    }

    @Override
    public String toString() {
        return "Link = " + this.link +
                "; \r\nNumber Of Connections = " + this.connectNumber +
                "; \r\nTimer := " + this.timer / 1000 +
                "; \r\nReconnect := " + this.reconnect;
    }

    public String getLink() {
        return this.link;
    }

    public int getNumberOfConnections() {
        return this.connectNumber;
    }

    public long getTimer() {
        return this.timer;
    }

    public boolean isReconnect() {
        return this.reconnect;
    }
}