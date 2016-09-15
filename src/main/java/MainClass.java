
import java.util.HashMap;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakob
 */
public class MainClass
{
   public static void main(String[] args)
    {
        HashMap<String, Object> props = new HashMap();
        props.put("javax.persistence.schema-generation.database.action", "drop-and-create");
        //props.put("javax.persistence.schema-generation.database.action", "clear-db");
        
        Persistence.generateSchema("jpa_basics1", props);
    } 
}
