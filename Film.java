public class Film {
  String title;
  String releaseDate;
  String producer;
  String categories;

  public Film(String title, String releaseDate, String producer, String categories) {
    this.title = title;
    this.releaseDate = releaseDate;
    this.producer = producer;
    this.categories = categories;
  }

  public String toString() {
    return "Le film " + title + " est sorti en " + releaseDate + " et est réalisé par " + producer + "\nCatégorie : "
        + categories;
  }
}
