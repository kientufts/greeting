package me.iansky.greeting;

import java.io.FileInputStream;
import java.io.IOException;
import me.iansky.greeting.Greeting.Greet;

public class GreetReader{
  public static void main(String[] args) throws IOException {
    Greet.Builder greetBuilder= Greet.newBuilder();

    String filename = "greeting_protobuf_output";
    System.out.println("Reading from file " + filename);

    try(FileInputStream input = new FileInputStream(filename)){
      Greet greet = greetBuilder.mergeFrom(input).build();
      System.out.println("Greeting: " + greet.getGreeting() + "\n" + "Username: " + greet.getUsername());
    }
  }
}
