package utils;

public enum Configs {

    DB_URL("jdbc:postgresql://127.0.0.1:5432/math_db"),
    DB_LOGIN("postgres"),
    DB_PASSWORD("root");

    private String value;

    Configs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
