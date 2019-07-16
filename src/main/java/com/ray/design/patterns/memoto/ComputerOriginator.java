package com.ray.design.patterns.memoto;

public class ComputerOriginator {
    private String system = "macOS";
    private String hardisk = "ssd";
    private String userDoc = "desk";
    private String userApp = "pages,numbers...";

    public ComputerMemoto save(){
        return new ComputerMemoto(system,hardisk,userDoc,userApp);
    }

    public void restore(ComputerMemoto memoto){
        this.hardisk = memoto.getHardisk();
        this.system = memoto.getSystem();
        this.userApp = memoto.getUserApp();
        this.userDoc = memoto.getUserDoc();
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