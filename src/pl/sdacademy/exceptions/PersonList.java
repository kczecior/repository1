package pl.sdacademy.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-07-11.
 */
public class PersonList  extends ArrayList<Person>  {
    public static List<Person> findAnAge(Integer age, List<Person> myPersonList) throws IllegalArgumentException {
        if (age > 0) {
            myPersonList.stream().filter(p -> p.getAge() == age);
            return myPersonList;
        } else {
            throw new IllegalArgumentException("argument age musi mieć wartość większą od 0")
        }
    }
}
