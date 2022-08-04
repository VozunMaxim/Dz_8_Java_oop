public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.birthday = new FormDate();

        post.birthday.day = 13;
        post.birthday.mouth = 6;
        post.birthday.year = 1999;

        post.surname = "Иванов";
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;

        System.out.println(post.birthday.day);
        System.out.println(post.birthday.mouth);
        System.out.println(post.birthday.year);
        System.out.println(post.surname);
        System.out.println(post.name);
        System.out.println(post.patronymic);
        System.out.println(post.passport);
        System.out.println(post.phone);
        System.out.println(post.subscription);
    }
}
