public class Main {
//Почему-то не видятся классы из других модулей, хотя зависимости прописаны
    public static void main(String[] args) {
        MyService myService = new MyService();
        System.out.println(myService.getMyEntity());
        System.out.println(myService.setMyEntity(new MyEntity("second")));
        System.out.println(myService.getMyEntity());
    }
}
