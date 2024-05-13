public class Main {
    public static void main(String[] args) {

        Author authorOne = new Author("Fyodor", "Dostoevsky");
        Author authorTwo = new Author("William", "Gibson");
        Author authorThree = new Author("William", "Gibson");

        Book bookOne = new Book("Crime and punishment", authorOne, 1865);
        Book bookTwo = new Book("Neuromancer", authorTwo, 1975);
        Book bookThree = new Book("Neuromancer", authorTwo, 2000);

        System.out.println(bookOne.toString());

        System.out.println(bookTwo.equals(bookThree));

        System.out.println(authorTwo.equals(authorThree));

    }
}

//Реализуйте метод
//hashCode
// в классах
//Author
// и
//Book.