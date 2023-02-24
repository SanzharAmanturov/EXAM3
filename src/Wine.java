import java.text.SimpleDateFormat;
import java.util.Date;

public class Wine {
    private String name;
    private String trademark;
    private String country;
    private String dateSpill;
    private String note;

    public void setName(String name) {
        this.name = name;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDateSpill(String dateSpill) {
        this.dateSpill = dateSpill;
    }

    public void setNote(String note) {
        this.note = note;
    }



    public String getName() {
        return this.name;
    }

    public String getTrademark() {
        return this.trademark;
    }

    public String getCountry() {
        return this.country;
    }

    public String getDateSpill() {
        return this.dateSpill;
    }

    public String getNote() {
        return this.note;
    }

    public long calculationOfExposure (String curDate) {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = null;
        Date date2 = null;
        try {
            date1 = format.parse(curDate);
            date2 = format.parse(dateSpill);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        long difference = date1.getTime() - date2.getTime();
        long days =  difference / (24 * 60 * 60 * 1000);

        return days;

    }

}