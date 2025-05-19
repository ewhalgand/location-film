public class Main {
  public static void main(String... strings) {

    Film monFilm = new Film("Inception", "2010", "Christopher Nolan", Categories.FICTION.getDescription());
    System.out.println(monFilm);
  }
}
