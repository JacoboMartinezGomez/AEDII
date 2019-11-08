/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2b; 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.StringReader;
import org.glassfish.json.*;
import javax.json.*;
import javax.json.stream.JsonParser;
import practica6.*;

/**
 *
 * @author Jacobo
 */
public class ejercicio2b {
    
    //trabajar con los ficheros json
    public static void prueba(){
        
        
        File jsonInputFile = new File("C:\\Users\\Jacobo\\Desktop\\AEDII\\AEDII\\Librerias\\abbrev.es.json");
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            // Create JsonReader from Json.
            JsonReader reader = Json.createReader(is);
            // Get the JsonObject structure from JsonReader.
            JsonObject empObj = reader.readObject();
            reader.close();
            // read string data
           
            
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    

    public static void getWords() {

        String string = "Atentamente dirigido por jacobo";
        String[] parts = string.split(" ");
        String part1 = parts[0]; // 123
        String part2 = parts[1]; // 654321
        String part3 = parts[2];
        String part4 = parts[3];
        System.out.println(part4);

    }
    
    
    

    public static void main(String[] args) {
       // getWords();
        prueba();
    }

}
