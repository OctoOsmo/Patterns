package Creational.Factory;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by al on 07.01.2016.
 */
public abstract class Food {
    private PrintStream printStream;

    public Food(){
        printStream = System.out;
    }

    public Food(PrintStream printStream) {
        this.printStream = printStream;
    }

    public PrintStream getPrintStream() {
        return printStream;
    }

    public void setPrintStream(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printClassName(){
        printStream.println(this.getClass().getName());
    }
}
