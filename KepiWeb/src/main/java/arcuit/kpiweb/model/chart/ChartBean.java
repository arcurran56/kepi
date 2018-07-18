package arcuit.kpiweb.model.chart;

import java.util.Map;

public class ChartBean {
    enum ChartType {LINE, BAR} ;
    private ChartType chartType;
    private ChartDatasetBean chartData;
    private Map<String,String> chartOptions;

}


