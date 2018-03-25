import java.util.Random;

/**
 * JavaAPI
 */
public class JavaAPI {


    public static void main(String[] args) {
        System.out.println(Math.sqrt(16) );

        System.out.println(Math.pow(2,8) );

        System.out.println(Math.sin(60) );



        Random random=new Random();
        System.out.println(random.nextInt(200) );
        System.out.println(random.nextInt(300) );
        System.out.println(random.nextInt(10) );
        System.out.println(random.nextInt(5) );
        

        System.out.println("------------------");

        String s="Hello";

        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf('o'));
        System.out.println(s.lastIndexOf('l'));
        System.out.println(s.substring(1,4));

        s=s+" Everyone";
        System.out.println(s.concat(" ABC"));
        

        
        
        
    }
    
}