public class Main {
    public static void main(String[] args) {

        //создаем двух уникальных авторов и одну копию для проверки метода equals
        Author authorOne = new Author("Fyodor", "Dostoevsky");
        Author authorTwo = new Author("William", "Gibson");
        Author authorThree = new Author("William", "Gibson");

        //создаем две уникальные книги и одну копию для проверки метода equals
        Book bookOne = new Book("Crime and punishment", authorOne, 1865);
        Book bookTwo = new Book("Neuromancer", authorTwo, 1975);
        Book bookThree = new Book("Neuromancer", authorTwo, 1975);

        //проверяем метод toString
        System.out.println(bookOne.toString());

        //проверяем метод equals
        System.out.println(bookTwo.equals(bookThree));
        System.out.println(authorTwo.equals(authorThree));

        //проверем метод hashCode
        System.out.println(bookOne.hashCode());
        System.out.println(authorOne.hashCode());

    }
}

//Реализуйте метод
//hashCode
// в классах
//Author
// и
//Book.