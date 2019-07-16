package com.ray.design.patterns.memoto;

public class ComputerMemoto {
    String system;
    String hardisk;
    String userDoc;
    String userApp;

    public ComputerMemoto(String system, String hardisk, String userDoc, String userApp) {
        this.system = system;
        this.hardisk = hardisk;
        this.userDoc = userDoc;
        this.userApp = userApp;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getHardisk() {
        return hardisk;
    }

    public void setHardisk(String hardisk) {
        this.hardisk = hardisk;
    }

    public String getUserDoc() {
        return userDoc;
    }

    public void setUserDoc(String userDoc) {
        this.userDoc = userDoc;
    }

    public String getUserApp() {
        return userApp;
    }

    public void setUserApp(String userApp) {
        this.userApp = userApp;
    }
}
