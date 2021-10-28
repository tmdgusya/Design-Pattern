public class Settings {

    private static final Settings INSTANCE = new Settings();

    /**
     * Class 밖에서 new 를 사용할 수 없도록 제어
     */
    private Settings() {}

    /**
     * 외부에서 같은 인스턴스를 이용하도록 if 문 조건 추가
     * @return 외부에서 사용할 수 있는 인스턴스 제공
     */
    public static synchronized Settings getInstance() {
        return INSTANCE;
    }

}
