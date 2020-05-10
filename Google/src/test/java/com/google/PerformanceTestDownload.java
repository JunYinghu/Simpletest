package com.google;

import org.testng.annotations.Test;
import perFrormance.JmeterPerformance;

public class PerformanceTestDownload {

    @Test
    public void downloadFile(){

        String jmeterPlan="DownloadAndUpload-000018.jmx";

        String  jmeterCsv="DownloadCsv.csv";

        String  failureMessage="Execution wrong";
        JmeterPerformance.cmdExecJmeter(jmeterPlan,jmeterCsv, failureMessage);
    }

}
