public class Main {
    // ДЗ 13 1.10. Методы объектов
    public static void main(String[] args) {
        Author LevTolstoy = new Author("L.Tolstoy");
        Author APushkin = new Author("A.Pushkin");
        Book WarAndPeace = new Book("Война и Мир", 1820, LevTolstoy);
        Book Shot = new Book("Выстрел", 1830, APushkin);
        System.out.println("Книга: " + WarAndPeace.getTitle());
        System.out.println("Автор: " + WarAndPeace.getAuthor().getAuthor());
        System.out.println("Год публикации: " + WarAndPeace.getPublishingYear());
        System.out.println("Книга: " + Shot.getTitle());
        System.out.println("Автор: " + Shot.getAuthor().getAuthor());
        System.out.println("Год публикации: " + Shot.getPublishingYear());
        System.out.println(WarAndPeace.equals(WarAndPeace));
        System.out.println(Shot.equals(Shot));

    }
}