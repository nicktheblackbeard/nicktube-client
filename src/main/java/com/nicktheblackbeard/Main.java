package com.nicktheblackbeard;

import com.nicktheblackbeard.client.*;
import fr.bmartel.speedtest.SpeedTestReport;
import fr.bmartel.speedtest.inter.ISpeedTestListener;
import fr.bmartel.speedtest.model.SpeedTestError;
import fr.bmartel.speedtest.SpeedTestSocket;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author nicktheblackbeard
 * 6/6/21
 */
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        DownloadSpeed ds = new DownloadSpeed();
        ds.countSpeed();
        TimeUnit.SECONDS.sleep(12);
    }
}
