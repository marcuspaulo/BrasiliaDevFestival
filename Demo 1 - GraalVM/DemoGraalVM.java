// const express = require('express');
// const app = express();
// app.listen(3000);
// app.get('/', function(req, res) {
//   var text = 'Hello World!';
//   const BigInteger = Java.type(
//     'java.math.BigInteger');
//   text += BigInteger.valueOf(2)
//     .pow(100).toString(16);
//   text += Polyglot.eval(
//     'R', 'runif(100)')[0];
//   res.send(text);
// })


// PrettyPrintJSON.java
import java.io.*;
import java.util.stream.*;
import org.graalvm.polyglot.*;

public class DemoGraalVM {
  public static void main(String[] args) throws java.io.IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String input = reader.lines().collect(Collectors.joining(System.lineSeparator()));
    try (Context context = Context.create("js")) {
      Value parse = context.eval("js", "JSON.parse");
      Value stringify = context.eval("js", "JSON.stringify");
      Value result = stringify.execute(parse.execute(input), null, 2);
      System.out.println(result.asString());
    }
  }
}