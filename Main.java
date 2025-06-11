public class Main {
  public static void main(String... strings) {

    Film monFilm1 = new Film("Inception", "2010", "Christopher Nolan", Categories.FICTION.getDescription());

    Film monFilm2 = new Film("Balerina", "2025", "unknown", Categories.FICTION.getDescription());
    System.out.println(monFilm1);
    System.out.println(monFilm2);
  }
}
