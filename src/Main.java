public class Main {
    public static void main(String[] args) {
        Varos varos = new Varos("Szekelyudvarhely", 34000);
        System.out.println(varos.toString());
        Fovaros fovaros = new Fovaros("Bukarest",2000000,138,6);
        System.out.println(fovaros.toString());
    }
}