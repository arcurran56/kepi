package arcuit.kpiweb.model.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="MEASUREMENTSET")
public class MeasurementSet {
    @Id
    private int id;

    private String name;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
