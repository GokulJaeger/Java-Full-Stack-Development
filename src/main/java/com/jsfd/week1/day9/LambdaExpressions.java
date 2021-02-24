package com.jsfd.week1.day9;
import static java.lang.String.format;


public class LambdaExpressions {

  static void apply(String text, TextConverter... converters) {
    System.out.println(format("Applying %d converters to [%s]", converters.length, text));
    String result = text;
    for (TextConverter converter : converters) {
      result = converter.convert(result);
      System.out.println(format("Applied converter [%s] and got [%s]", converter.getClass().getName(), result));
    }
    System.out.println(result);
    System.out.println();
  }

  public static void main(String[] args) {

    TextConverter toLower =
        new TextConverter() {
          @Override
          public String convert(String text) {
            return text.toLowerCase();
          }
        };

    TextConverter toUpper = (String text) -> {
      return text.toUpperCase();
    };

    TextConverter doubler = text -> text + text;

    TextConverter reverser = text -> {
      var sb = new StringBuilder();
      for (int i = text.length() - 1; i >= 0; i--)
        sb.append(text.charAt(i));
      return sb.toString();
    };

    apply("Gokul", toLower);
    apply("Sweatha", toUpper);
    apply("Wow!", doubler);
    apply("I am doing ,y internship at SRM Technologies", reverser);
    apply("Lambda", toLower, doubler, reverser);
    apply("Attack On Titans", toUpper, reverser, doubler, reverser);

    apply("OnePlus 5", text -> text.toLowerCase());
    apply("Sony Extra Bass", text -> text.replaceAll("9", "999"));

    apply("Yamaha R15 V3",
          text -> text.toUpperCase(),
          text -> text + text,
          text -> {
            StringBuilder sb = new StringBuilder();
            for (int i = text.length() - 1; i >= 0; i--)
              sb.append(text.charAt(i));
            return sb.toString();
          });
  }
}