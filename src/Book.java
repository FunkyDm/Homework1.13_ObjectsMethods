public class Book {
    private String title;   //название книги
    private Author authorName;    //имя автора
    private int year;       //год публикации книги

    //конструктор класса Book
    public Book (String title, Author name, int year){
        this.title = title;
        this.authorName = name;
        this.year = year;
    }

    //геттер для параметра названия книги
    public String getTitle(){
        return this.title;
    }

    //геттер для параметра имени автора
    public Author getAuthorName(){
        return this.authorName;
    }

    //геттер для параметра года публикации книги
    public int getYear(){
        return this.year;
    }

    //сеттер для параметра года публикации у книги
    public void setYear(int year){
        this.year = year;
    }

    //переопределенный метод toString для класса Book
    @Override
    public String toString(){
        return "Название книги: " + title + authorName.toString() + ". Год написания: " + year + ".";
    }

    //переопределенный метод equals для класса Book
    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if ((this.getClass() != other.getClass()) || other == null) return false;
        Book book = (Book) other;
        return (title.equals(book.title)) && (authorName.equals(book.authorName) && (year == book.getYear()));
    }

    //переопределенный метод hashCode для класса Book
    @Override
    public int hashCode(){
        return java.util.Objects.hash(title, authorName, year);
    }

}