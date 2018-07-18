package arcuit.kpiweb.action;

import arcuit.kpiweb.model.dao.MeasurementSetDAO;
import arcuit.kpiweb.model.dao.MeasurementTupleDAO;
import arcuit.kpiweb.model.db.MeasurementTuple;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class InitDb extends ActionSupport {
    private String[] labels = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};
    private String[] dates = {"01/01/2018","01/02/2018","01/03/2018","01/04/2018","01/05/2018","01/06/2018"};
    private int[] value1s;
    private int[] value2s[];

    public String execute() {
        List<MeasurementTuple> recordList = new ArrayList<>();
        for (int i = 0; i< labels.length; i++){
            MeasurementTuple record = new MeasurementTuple();
            record.setKeydate(new Date(Date.parse(dates[i])));
            record.setLabel1(labels[i]);
            record.setMsid(3);
            record.setValue1(5*i);
            record.setValue2(i*i*i/3 + 3*i*i + 20);
            recordList.add(record);
        }
        (new MeasurementTupleDAO()).save(recordList);
        return SUCCESS;
    }
}
