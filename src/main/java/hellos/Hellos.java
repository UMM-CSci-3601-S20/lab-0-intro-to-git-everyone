package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public static final String WELCOME_LINE = "Hello, folks!";

  public static void main(String[] args) {
    String output = generateOutput();
    System.out.println(output);
  }

  public static String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(WELCOME_LINE + "\n");
    builder.append(aaronSaysHello());
    builder.append(audreySaysHello());
    builder.append(austinSaysHello());
    builder.append(baileySaysHello());
    builder.append(benSaysHello());
    builder.append(benjaminSaysHello());
    builder.append(bobSaysHello());
    builder.append(cookieSaysHello());
    builder.append(erikSaysHello());
    builder.append(firasSaysHello());
    builder.append(jackSaysHello());
    builder.append(jakeSaysHello());
    builder.append(joeSaysHello());
    builder.append(johannesSaysHello());
    builder.append(jonahSaysHello());
    builder.append(joshuaSaysHello());
    builder.append(kkSaysHello());
    builder.append(kyleSaysHello());
    builder.append(lukeSaysHello());
    builder.append(nicSaysHello());
    builder.append(shawnSaysHello());
    builder.append(trentSaysHello());

    return builder.toString();
  }

  private static String austinSaysHello(){
    return "Austin says 'Hello!'\n";
  }
  public static String aaronSaysHello() {
    return "Aaron says 'Bonjour!'\n";
  }
  private static String audreySaysHello() {
    return "Audrey says 'Hello!'\n";
  }

  private static String benjaminSaysHello() {
    return "Benjamin says 'Howdy!'\n";
  }

  private static String benSaysHello() {
    return "Ben says 'Hi!'\n";
  }

  private static String shawnSaysHello() {
    return "Shawn says 'Hello!'\n";
  }


  private static String joeSaysHello() {
    return "Joe says 'Hello hello!'\n";
  }

  private static String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private static String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private static String kyleSaysHello() {
    return "Kyle says 'Hi!'\n";
  }

  private static String cookieSaysHello() {
    return "Cookie says 'Hello!'\n";
  }

  private static String jackSaysHello(){
    return "Jack says 'Hello!'\n";
  }


  private static String johannesSaysHello() {
    return "Johannes says 'Hello!'\n";
  }

  private static String lukeSaysHello() {
    return "Luke says 'Hello!'\n";
  }

    private static String bobSaysHello() {
    return "Bob says 'Hello!'\n";
  }

    private static String baileySaysHello() {
    return "Bailey says 'Hello!'\n";
  }

  private static String jakeSaysHello() {
    return "Jake says 'Hello!'\n";
  }

  private static String firasSaysHello() {
    return "Firas says 'Hello!'\n";
  }

  private static String trentSaysHello() {
    return "Trent says 'Sup!'\n";
  }

  private static String erikSaysHello() {
    return "Erik says 'Hello is fine!'\n";
  }

  private static String joshuaSaysHello(){
    return "Joshua says 'Guten Tag!'\n";
  }

  private static String jonahSaysHello() {
    return "Jonah says 'Hello!'\n";
  }
}
