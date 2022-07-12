package com.plus6is10.homemaker.jython;


import org.python.core.PyFunction;
// import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/jython")
public class Reco {

    private static PythonInterpreter interpreter;

    @GetMapping("/reco")
    public String pytest() {
        interpreter = new PythonInterpreter();
        interpreter.execfile("E:\\Amazon review data (2018)\\97. BE\\src\\main\\java\\com\\plus6is10\\homemaker\\jython\\Test.py");
        interpreter.exec("print(testFunc(5,10))");

        PyFunction pyFuntion = interpreter.get("testFunc", PyFunction.class);

        PyObject pyobj = pyFuntion.__call__();
        System.out.println(pyobj.toString());

        return pyobj.toString();
    }
}