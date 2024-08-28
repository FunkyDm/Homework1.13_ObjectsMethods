public class Author {
    private String authorName;        //имя автора
    private String authorSurname;     //фамилия автора

    //конструктор класса Author
    public Author(String authorName, String authorSurname){
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    //геттер для параметра имени автора
    public String getAuthorName(){
        return this.authorName;
    }

    //геттер для параметра фамилии автора
    public String getAuthorSurname(){
        return this.authorSurname;
    }

    //переопределенный метод toString для класса Author
    @Override
    public String toString(){
        return ". Автор: " + authorName + " " + authorSurname + " ";
    }

    //переопределенный метод equals для класса Author
    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (this.getClass() != other.getClass() || other == null) return false;
        Author author = (Author) other;
        return (authorName.equals(author.authorName)) && (authorSurname.equals(author.authorSurname));
    }

    //переопределенный метод hashCode для класса Author
    @Override
    public int hashCode(){
        return java.util.Objects.hash(authorName, authorSurname);
    }

}