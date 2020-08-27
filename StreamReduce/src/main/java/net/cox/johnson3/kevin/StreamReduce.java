package net.cox.johnson3.kevin;

// Fig. 17.3: StreamReduce.java
// Sum the integers from 1 through 10 with IntStream.
import java.util.stream.IntStream;


public class StreamReduce
{
    public static void main( String[] args )
    {
        // Sum the integers from 1 through 10
        System.out.printf("Sum fo 1 through 10 is: %d%n",
                IntStream.rangeClosed(1, 10)
                            .sum());
    }
}
