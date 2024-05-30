package ntu.proj.fixingthingsocop;

import java.io.Serializable;
import java.util.HashMap;

public class Testing implements Serializable {



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String name;

    public Testing(String name, String date, String message) {
        this.name = name;
        this.date = date;
        this.message = message;
    }

    public Testing() {
    }

    String date;
    String message;

    public HashMap<String, String> toFirebaseObject(){
        HashMap<String, String> testing = new HashMap<String, String>();
        testing.put("Name", name);
        testing.put("Date", date);
        testing.put("Message", message);
//        testing.put("Name", name);
//        testing.put("Name", name);
        return testing;

    }
}

