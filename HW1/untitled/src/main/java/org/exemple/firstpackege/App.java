package org.exemple.firstpackege;

import org.exemple.secondpackege.InputClass;
import org.exemple.secondpackege.OutputClass;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){


//        InputClass beginClass = new InputClass();
//        OutputClass endClass = new OutputClass();

        String beginClass2 = InputClass.hello();

        OutputClass.result(beginClass2);

    }
}
