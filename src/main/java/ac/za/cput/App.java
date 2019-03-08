package ac.za.cput;

import java.util.*;

import javax.swing.*;
import java.util.*;

public class App 
{
    Person personObject= new Person("Rowan", 50);
    Person personObject1= new Person("Mettas", 1200);
    Person personObject2= new Person("Jeanan", 200);



    public Collection<String> collectionStyle()
    {
        Collection<String> subjects = new ArrayList<>();
        ((ArrayList<String>) subjects).add("Application Development Practice");
        ((ArrayList<String>) subjects).add("Project presentation");
        ((ArrayList<String>) subjects).add("Information Systems");

        return subjects;
    }

    public Set<String> setStyle()
    {
        Set<String> setSubjects = new LinkedHashSet<>();

        setSubjects.add("Application Development Practice");
        setSubjects.add("Project presentation");
        setSubjects.add("Information Systems");

        return setSubjects;
    }


    public Map<Person, Integer> mapStyle()
    {

        Map map = new LinkedHashMap<Person, Integer>();
        map.put(personObject,1);
        map.put(personObject1,2);
        map.put(personObject2,3);

        return map;
    }
}
