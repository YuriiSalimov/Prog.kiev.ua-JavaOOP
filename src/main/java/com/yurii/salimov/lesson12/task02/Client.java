package com.yurii.salimov.lesson12.task02;

import java.io.IOException;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Client extends Thread {

    private Parameters parameters;

    public Client(final Parameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                Server.getPage(this.parameters.getLink());
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                return;
            } catch (IOException ex) {
                ex.printStackTrace();
                if (!this.parameters.isReconnect()) {
                    interrupt();
                }
            }
        }
    }

    public void setParameters(final Parameters parameters) {
        this.parameters = parameters;
    }

    public Parameters getParameters() {
        return this.parameters;
    }
}
