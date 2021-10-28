public class Settings {

    /**
     * Class 밖에서 new 를 사용할 수 없도록 제어
     */
    private Settings() {}

    /**
     * @return 외부에서 사용할 수 있는 인스턴스 제공
     */
    public static Settings getInstance() {
        return new Settings();
    }

}
