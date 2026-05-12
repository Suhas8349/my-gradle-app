public class App {
    public String getGreeting() {
        return "Hello.How r u?";
    }
    public static void main(String args[]){
        System.out.println(new App().getGreeting());
    }

}
