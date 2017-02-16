package com.yurii.salimov.lesson06.task06;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Progress implements IProgress {

    private int progress;
    private double percent;

    @Override
    public void update(double percent) {
        this.percent += percent;
        if ((int) this.percent > this.progress) {
            this.progress = (int) Math.round(this.percent);
            System.out.println("Progress " + this.progress + "%");
            if (this.progress >= 100) {
                System.out.println("Copying is completed!");
            }
        }
    }

    @Override
    public int getProgress() {
        return progress;
    }
}
