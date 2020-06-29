package Singleton.EnumBasedSingleton;

enum EnumBasedSingleton {
    INSTANCE;//hoooooooooorrrrrrrraaaaaaaaayyyyyyyyyyyyyyyyyyyyyyyyy

    // enum type already has a private constructor by default,
    // but if you need to initialize things...
    EnumBasedSingleton() {
        value = 42;
    }

    // enums are inherently serializable (but what good is that?)
    // reflection not a problem, guaranteed 1 instance in JVM

    // field values not serialized!
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
