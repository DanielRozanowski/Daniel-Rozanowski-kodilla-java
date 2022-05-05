package com.kodilla.patterns.singleton;


public enum Logger {

    INSTANCE;

    private String lastLog = "";

    public void open(final String lastLog) {
        this.lastLog = lastLog;
        System.out.println("Opening logs... ");
    }

    public void close() {
        this.lastLog = "";
        System.out.println("Closing logs...");
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        log("19.04.2021; 21.09 Beginning work with this exercise.");
        log("19.04.2021; 21.10 Need some coffee?.");
        log("19.04.2021; 22.15 Exercise done.");
        return lastLog;
    }

}
