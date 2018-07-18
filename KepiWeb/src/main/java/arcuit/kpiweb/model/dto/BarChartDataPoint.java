package arcuit.kpiweb.model.dto;

public class BarChartDataPoint {

    private String label;
    private int value;

    public BarChartDataPoint(String label, int value){
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
