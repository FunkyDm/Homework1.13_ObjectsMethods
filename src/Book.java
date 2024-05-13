public class Book {
    private String title;   //название книги
    private Author name;    //имя автора
    private int year;       //год публикации книги

    //конструктор класса Book
    public Book (String title, Author name, int year){
        this.title = title;
        this.name = name;
        this.year = year;
    }

    //геттер для параметра названия книги
    public String getTitle(){
        return this.title;
    }

    //геттер для параметра имени автора
    public Author getName(){
        return this.name;
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
        return "Название книги: " + title + name.toString() + ". Год написания: " + year + ".";
    }

    //переопределенный метод equals для класса Book
    @Override
    public boolean equals(Object other){
        if (this.getClass() != other.getClass()){
            return false;
        }
        Book book = (Book) other;
        return (title.equals(book.title)) && (name.equals(book.name) && (year == book.getYear()));
    }

    //переопределенный метод hashCode для класса Book
    @Override
    public int hashCode(){
        return java.util.Objects.hash(title, name, year);
    }

}