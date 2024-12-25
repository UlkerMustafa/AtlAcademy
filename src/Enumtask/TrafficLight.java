package Enumtask;

public enum TrafficLight {
    RED("DAYAN"),
    YELLOW("HAZIRLAS"),
    GREEN("GET");
    private  final String action;

    TrafficLight(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
