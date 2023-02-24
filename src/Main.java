        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.*;
public class Main {

    public static void main(String[] args) {

        Wine w1 = new Wine();

        w1.setName("Hospices de Beaune");
        w1.setDateSpill("01/02/2009");
        w1.setCountry("Франция");
        w1.setTrademark("Дом Пьера Грубера");
        w1.setNote("разливной");


        String name = w1.getName();
        String country = w1.getCountry();
        String trademark = w1.getTrademark();
        String note = w1.getNote();

        Date d = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setTimeZone(TimeZone.getTimeZone("EAT"));
        String d1 = df.format(d);

        long days = w1.calculationOfExposure(d1);

        System.out.println("Выдержка вина под названием "+name+" составляет "+days+" дней" );
        System.out.println("Его торговая марка: "+trademark);
        System.out.println("Страна производства: "+country);
        System.out.println("Примечание: "+note);
    }
}
