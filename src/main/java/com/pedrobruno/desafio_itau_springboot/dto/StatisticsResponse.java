package com.pedrobruno.desafio_itau_springboot.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticsResponse {


    private double count;
    private double sum;
    private double agv;
    private double min;
    private double max;

    public StatisticsResponse(DoubleSummaryStatistics stats) {
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.agv = stats.getAverage();
        if (stats.getMin() == Double.POSITIVE_INFINITY || stats.getMin() == Double.NEGATIVE_INFINITY)
            this.min = 0.0;
        else
            this.min = stats.getMin();
        if (stats.getMax() == Double.POSITIVE_INFINITY || stats.getMax() == Double.NEGATIVE_INFINITY)
            this.max = 0.0;
        else
            this.max = stats.getMax();
    }

    public double getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getAgv() {
        return agv;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }
}
