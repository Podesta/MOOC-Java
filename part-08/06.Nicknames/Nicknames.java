import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        System.out.println(nicknames.get("matthew"));
        System.out.println(nicknames.get("arthur"));
        System.out.println(nicknames.get("michael"));
    }

}
