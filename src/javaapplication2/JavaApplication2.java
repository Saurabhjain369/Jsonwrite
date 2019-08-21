package javaapplication2;

import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author 1894017
 */
public class JavaApplication2 {

    public static void main(String[] args) throws IOException {

        JSONObject mainobject = new JSONObject();

        mainobject.accumulate("id", 12345);

        mainobject.accumulate("fname", "Saurabh");

        mainobject.accumulate("lname", "Jain");

        mainobject.accumulate("active", true);

        mainobject.accumulate("GPA", 86.7);

        JSONObject address = new JSONObject();
        //Insert object type data

        address.accumulate("number", 275);

        address.accumulate("Sname", "Dresdan");

        address.accumulate("Zipcode", "h3p28b");

        mainobject.accumulate("address", address);
        // accumalate the address object

        // Create Array of String for store the phone no.
        JSONArray phones = new JSONArray();

        phones.add("(514)-154-4598");

        phones.add("(514)-235-4598");

        phones.add("(514)-256-4598");

        mainobject.accumulate("phones", phones);

        JSONArray results = new JSONArray();

        JSONObject singleresult = new JSONObject();

        singleresult.accumulate("title", "DataBase");

        singleresult.accumulate("mark", 86.8);

        //add first object
        results.add(singleresult);

        //clean the object before adding another object
        singleresult.clear();

        singleresult.accumulate("title", "Programdebugging");

        singleresult.accumulate("mark", 84.8);

        //add second project
        results.add(singleresult);

        // add Results in Mainobject
        mainobject.accumulate("results", results);

        
        
        // create the json file in json folder (Writing into json file)
        FileWriter.saveStringIntoFile("Json/student.json",mainobject.toString());
        
        System.out.println(mainobject);

    }

}
