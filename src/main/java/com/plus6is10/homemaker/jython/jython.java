package com.plus6is10.homemaker.jython;
import org.python.util.PythonInterpreter;


public class jython {
    private static PythonInterpreter interpreter;

    public static void main(String[] args) {

        interpreter = new PythonInterpreter();
        interpreter.exec("from java.lang import System");

        interpreter.exec("s = 'Hello World'");
        interpreter.exec("System.out.println(s)");
        
        interpreter.exec("print('asdf')");

    }
}
