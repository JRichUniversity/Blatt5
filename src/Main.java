public class Main {
    public static void main(String[] args) {
        Newspaper news = new Newspaper(2);
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        // Throws exception when list size is already full
        try{
            news.subscribe(p1);
            news.subscribe(p2);
            news.subscribe(p3);
        } catch (SubscriptionFullException e){
            System.out.println(e.getMessage());
        }
    }
}
