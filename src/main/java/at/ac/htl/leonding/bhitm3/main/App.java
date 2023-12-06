package at.ac.htl.leonding.bhitm3.main;

import at.ac.htl.leonding.bhitm3.Greeter;

/**
 * Demo App. Please delete me!
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        var app = new App();
        System.out.println(app.getGreeting());
    }
    public Object getGreeting() {
        return new Greeter().getGreeting();
    }
}
