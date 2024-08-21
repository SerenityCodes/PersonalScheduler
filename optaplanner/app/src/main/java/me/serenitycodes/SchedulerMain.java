package me.serenitycodes;

import static spark.Spark.get;

public class SchedulerMain {
    
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World!"); 
    }
}
