public enum Categories {
  FICTION("Fiction"),
  DOCUMENTARIE("Documentaire");

  private final String description;

  Categories(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
