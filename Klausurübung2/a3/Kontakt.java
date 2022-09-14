import java.io.Serializable;
import java.util.Date;

public abstract class Kontakt implements Serializable{
    private Date timestamp;
    public abstract String getInformation();

    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
