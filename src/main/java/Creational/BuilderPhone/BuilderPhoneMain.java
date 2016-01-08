package Creational.BuilderPhone;

/**
 * Created by al on 09.01.2016.
 */
public class BuilderPhoneMain {
    public static void main(String[] args) {
        Phone smartPhone = (new Phone.Builder("Nokia").display("Amoled screen").smsModule("Standart SMS module")).build();
        System.out.println(smartPhone);
    }
}
