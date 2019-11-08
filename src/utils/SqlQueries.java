package utils;

public enum  SqlQueries {

    CREATE_USER_T("CREATE TABLE IF NOT EXISTS user_t(id varchar(225) NOT NULL UNIQUE , first_name varchar(225)," +
            "second_name varchar(225), userName varchar(225) NOT NULL, email varchar(225) NOT NULL," +
            "birth_year numeric(10), progress float(10))");

    private String value;

    SqlQueries(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
