package Creational.BuilderPhone;

/**
 * Created by al on 09.01.2016.
 */
public class Phone {
    private String name;
    private String dialModule;
    private String display;
    private String radioModule;
    private String flashLight;
    private String smsModule;

    public static class Builder{
        private String name;
        private String dialModule = "none";
        private String display = "none";
        private String radioModule = "none";
        private String flashLight = "none";
        private String smsModule = "none";

        public Builder(String name){
            this.name = name;
        }

        Builder dialModule(String val){
            display = val;
            return this;
        }

        Builder display(String val){
            display = val;
            return this;
        }

        Builder radioModule(String val){
            radioModule = val;
            return this;
        }

        Builder flashLight(String val){
            flashLight = val;
            return this;
        }

        Builder smsModule(String val){
            smsModule = val;
            return this;
        }

        Phone build(){
            return new Phone(this);
        }
    }

    private Phone(Builder builder){
        name = builder.name;
        dialModule = builder.dialModule;
        display = builder.display;
        radioModule = builder.radioModule;
        flashLight = builder.flashLight;
        smsModule = builder.smsModule;
    }

    @Override
    public String toString(){
        String res = "";
        res += "madel name = " + name + "\n";
        res += "dialModule = " + dialModule + "\n";
        res += "display = " + display + "\n";
        res += "radioModule = " + radioModule + "\n";
        res += "flashLight = " + flashLight + "\n";
        res += "smsModule = " + smsModule + "\n";
        return res;
    }
}
