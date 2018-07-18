package arcuit.kpiweb.model.db;

import arcuit.kpiweb.model.dto.BarChartDataPoint;

import javax.persistence.*;
import java.sql.Date;

@NamedNativeQueries( {

    @NamedNativeQuery(
        name = "fetch_bar_chart_data",
        query =
                "SELECT label1 as label, value1 as value FROM MEASUREMENTTUPLE WHERE msid = 3",
        resultSetMapping = "bar_chart_data_mapping"
),
        @NamedNativeQuery(
        name = "calculate_value3",
        query =
                "SELECT id, msid, keydate, label1, label2, value1, value2, value3 FROM MEASUREMENTTUPLE WHERE msid = 2",
        resultClass = MeasurementTuple.class
)}
)
@SqlResultSetMapping(
                name = "bar_chart_data_mapping",
                classes = @ConstructorResult(
                        targetClass = BarChartDataPoint.class,
                        columns = {
                                @ColumnResult(name = "label"),
                                @ColumnResult(name = "value")
                        }
                )
        )
@Entity( name = "MEASUREMENTTUPLE")
public class MeasurementTuple {

    public int getMsid() {
        return msid;
    }

    public void setMsid(int msid) {
        this.msid = msid;
    }

    public Date getKeydate() {
        return keydate;
    }

    public void setKeydate(Date keydate) {
        this.keydate = keydate;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int getValue3() {
        return value3;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int msid;

    private Date keydate;

    private int value1;

    private int value2;

    private int value3;

    private String label1;

    private String label2;

}

