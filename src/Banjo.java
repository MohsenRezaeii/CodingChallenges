public class Banjo {

    public static String areYouPlayingBanjo(String name) {
        if (name.toLowerCase().startsWith("r")) {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }

    public static void main(String[] args) {
        String name = "sick";
        System.out.println(Banjo.areYouPlayingBanjo(name));
    }

}
