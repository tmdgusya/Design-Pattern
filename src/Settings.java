public class Settings {

    private static volatile Settings instance;

    /**
     * Class 밖에서 new 를 사용할 수 없도록 제어
     */
    private Settings() {}

    /**
     * Double Checked Locking
     * @return 외부에서 사용할 수 있는 인스턴스 제공
     */
    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }

}
