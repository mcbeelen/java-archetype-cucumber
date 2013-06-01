#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};


public class Greeting {
    private static final String DEFAULT_GREETING = "World";

    public static String greet(String name) {
        if (name == null) {
            name = DEFAULT_GREETING;
        }
        return String.format("Hello %s", name);
    }
}
