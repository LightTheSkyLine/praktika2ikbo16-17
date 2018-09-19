public class TestAuthor {
    public static void main(String[] args) {

        Author Auth1 = new Author("Danil", "ikbo1617@mirea.ru", 'M');
        System.out.println(Auth1);
        System.out.println(Auth1.getName());
        System.out.println(Auth1.getEmail());
        Auth1.setEmail("lllo@mail.ru");
        System.out.println(Auth1);
        System.out.println(Auth1.getGender());
    }
}
