//   && || !

public class logical {
    public static void main(String[] args) {
        // &&(AND)
        System.err.println( (5>3) && (8>3));
        System.err.println( (5<3) && (8<3));

        // ||(OR)
        System.err.println( (5>3) || (7>3));
        System.err.println( (5>3) || (5<3));

        // !(NOT)
        System.err.println( !(8>3));
        System.err.println( !(8<3));
    }
    
}
