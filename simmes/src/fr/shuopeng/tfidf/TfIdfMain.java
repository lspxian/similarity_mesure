package fr.shuopeng.tfidf;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TfIdfMain {

	/**
     * Main method
     * @param args
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        DocumentParser dp = new DocumentParser();
        dp.parseFiles("testFolder");//location of your source files, only text file
        dp.tfIdfCalculator(); //calculates tfidf
        dp.getCosineSimilarity(); //calculated cosine similarity  
    }

}
