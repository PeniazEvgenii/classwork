package Properties;

public class MainProp {
    private static final String KEY_BASE = "password";
    private static final String NAME_BASE = "username";
    private static final String URL_BASE = "url";

    public static void main(String[] args) {
        System.out.println(PropUtil.get(KEY_BASE));
        System.out.println(PropUtil.get(NAME_BASE));
        System.out.println(PropUtil.get(URL_BASE));
    }
}
