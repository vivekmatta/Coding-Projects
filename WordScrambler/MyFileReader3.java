import java.util.*;
import java.io.*;

public class MyFileReader3 {

    String fileName;
    ArrayList<String> wordList;
    Iterator it;
    String parseDelim;

    private void setUp()
            throws FileNotFoundException, IOException {

        wordList = new ArrayList<String>();
        processFile(fileName);
        it = wordList.iterator();

    }


    public MyFileReader3 ()
            throws FileNotFoundException, IOException {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter File Name: ");
        fileName = kb.nextLine();
        parseDelim = " (),.\"\'`:[]{};?!=-/";
        setUp();
    }

    public MyFileReader3 (String p)
            throws FileNotFoundException, IOException {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter File Name: ");
        fileName = kb.nextLine();
        parseDelim = p;
        setUp();
    }

    /*
     public MyFileReader3 (String s) 
       throws FileNotFoundException, IOException {
      
         fileName = s;
         parseDelim = " (),.\"\'`:[]{};?!=-/";
         setUp();
      }
      */
    public MyFileReader3 (String s, String p)
            throws FileNotFoundException, IOException {

        fileName = s;
        parseDelim = p;
        setUp();
    }

    public boolean hasNext(){

        return it.hasNext();
    }

    public String next(){
        return (String)it.next();
    }

    private void processWord (String word) {

        wordList.add(word);
    }

    private void processLine (String s) {
        StringTokenizer st = new StringTokenizer (s, parseDelim);
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            processWord (word.toLowerCase ());
        }
    }

    private void processFile (String filename)
            throws FileNotFoundException, IOException {

        FileReader fileReader = new FileReader (filename);
        BufferedReader in = new BufferedReader (fileReader);

        while (true) {
            String s = in.readLine();
            if (s == null) break;
            processLine (s);
        }
    }

    public static void main (String[] args)
            throws FileNotFoundException, IOException {

        MyFileReader3 f = new MyFileReader3();//new MyFileReader3("MyFileReader3.java", "()*;}{ ");

        while (f.hasNext()){
            System.out.println(f.next());

        }
        System.out.println();

    }
}