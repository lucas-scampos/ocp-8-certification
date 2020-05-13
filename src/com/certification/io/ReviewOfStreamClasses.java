package com.certification.io;

/*
   -  : low-level
   +  : high-level

   InputStream (abstract)
        FileInputStream  -
        FilterInputStream +
            BufferedInputStream +
        ObjectInputStream +

    Reader (abstract)
        BufferedReader +
        InputStreamReader +
            FileReader -

    OutputStream (abstract)
        FileOutputStream -
        FilterOutputStream +
            BufferedOutputStream  +
            PrintStream  +
        ObjectOutputStream +

    Writer (abstract)
        BufferedWriter +
        OutputStreamWriter  +
            FileWriter  -
        PrintWriter  +
*
*
* */
public class ReviewOfStreamClasses {
}

