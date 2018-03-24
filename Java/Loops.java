
class Loops {

    public static void main(String[] args) {

        int i=1;
        for ( i = 1; i < 10; i=i+2) {
            System.err.print("# ");
        }
        System.out.println(i);


        i=1;
        while(i<10)
        {
            System.err.println("* ");        
            i+=2;    
        }

        i=1;

        do{
            System.err.println("DO_WHILE ");
            i++;

        }
        while(i<10);


    }

}