package perFrormance;

import utils.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JmeterPerformance {


    public static void cmdExecJmeter(String jmeterPlan, String jmeterCsvReport, String failureMessage) {

        String performanceTestResultCsv = ""+ jmeterCsvReport ;
        String performanceTestResultHtml = "";
        String performanceTestPlanPath = ""+jmeterPlan;
        String performanceTestJmeter = "/jmeter.bat";

        String[] performanceCmd = new String[]{performanceTestJmeter, "-n", "-t", performanceTestPlanPath, "-l", performanceTestResultCsv, "-e", "-o", performanceTestResultHtml};

        Log.info("Executed CMD:" + performanceTestJmeter + "-n" + "-t" + performanceTestPlanPath + "-l" + performanceTestResultCsv);
        if (!cmdExecute(performanceCmd).contains("end of run")) {
            Log.error(failureMessage);
        }
    }

    private static String cmdExecute(String[] performanceCmd) {

        StringBuilder outMessage = new StringBuilder();
        Process cmdProcess = null;

        BufferedReader stdInput = null;

        try {
            cmdProcess = Runtime.getRuntime().exec(performanceCmd);
            stdInput = new BufferedReader(new InputStreamReader(cmdProcess.getInputStream()));

            Log.info("Succeed to Execute" + Arrays.toString(performanceCmd));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String s = null;
        while (true) {
            try {
                assert stdInput != null;
                if ((s = stdInput.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            outMessage.append(s);
            outMessage.append(System.lineSeparator());
        }

        return outMessage.toString();

    }
}
