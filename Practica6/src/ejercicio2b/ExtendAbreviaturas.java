/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2b;

import java.io.InputStream;
import java.util.StringTokenizer;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import mapa.*;
/**
 *
 * @author LenovoPavon
 */
public class ExtendAbreviaturas {
    /**
     * htAbbreviations. Mapa constante que contiene para cada idioma, su diccionario de abreviaturas correspondiente.
     * el cual es otro Mapa que contiene para cada abreviatura su extensión
     * El Mapa se crea a partir de ficheros JSON, uno para cada idioma
    */
    private static final Map<String, Map<String,String>> htAbbreviations = new HashMap<>();
    
    static { 
        for (String i : new String[]{"abbrev.es.json", 
                                     "abbrev.en.json",
                                     "abbrev.fr.json"
        }) {

            String lang = i.substring(7, 9).toUpperCase();
            InputStream is = ExtendAbreviaturas.class.getResourceAsStream(i);
            JsonReader rdr = Json.createReader(is);
            JsonObject jsonObject = rdr.readObject();
            rdr.close();
            Map<String, String> dict = new HashMap<>();
            jsonObject.keySet().forEach((abbrev) -> {
                dict.insertar(abbrev, jsonObject.getString(abbrev));
            });
            htAbbreviations.insertar(lang, dict);   
        }
    }
    
  /**
     * traduccionAbreviaturas. Este método devuelve un nuevo texto con las abreviaturas extendidas
     * según su idioma correspondiente.
     * @param textoExtender 
     * @param idioma (limitado a Español (ES), Inglés (EN), Francés (FR))
     * @return Texto traducido
     */ 
    
    public static String extensionAbreviaturas (String textoExtender, String idioma) {
        String toRet="";
        String[] parts = textoExtender.split(" ");
        Map<String,String> dict=htAbbreviations.get(idioma.toUpperCase());
        
        for (int i = 0; i < parts.length; i++) {
             if (dict.get(parts[i]) !=null)
                toRet += dict.get(parts[i]);
            else toRet+=parts[i];
            toRet+= " ";  
        }
         return toRet;   
    }
    
}
