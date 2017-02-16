package com.yurii.salimov.lesson06.task02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Time extends Thread {

    private final static SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("hh:mm:ss");

    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println(TIME_FORMAT.format(new Date().getTime()));
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                return;
            }
        }
    }
}
