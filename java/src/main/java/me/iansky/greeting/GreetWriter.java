package me.iansky.greeting;

import java.io.FileOutputStream;
import java.io.IOException;
import me.iansky.greeting.Greeting.Greet;

public class GreetWriter {
  public static void main(String[] args) throws IOException {
    Greet greeting = Greet.newBuilder().setGreeting(args[0]).setUsername(args[1]).build();

    String filename = "greeting_protobuf_output";
    System.out.println("Saving greeting to file: " + filename);

    try(FileOutputStream output = new FileOutputStream(filename)){
      greeting.writeTo(output);
    }

    System.out.println("Saved greeting with following data to disk: \n" + greeting);
  }
}
