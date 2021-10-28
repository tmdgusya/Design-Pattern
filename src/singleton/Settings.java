package singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    /**
     * Class 밖에서 new 를 사용할 수 없도록 제어
     */
    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    /**
     * Thread-Safe
     * @return 외부에서 사용할 수 있는 인스턴스 제공
     */
    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    /**
     * DeSerialize 할때 SingleTon 을 지키기 위해 선언
     * @return SettingsHolder.INSTANCE
     */
    protected Object readResolve() {
        return getInstance();
    }

}
