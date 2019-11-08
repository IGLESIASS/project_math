package util;

public enum Phrases {

    INIT_PHRASE("Пожалуйста, напишите свое имя. Доступ разрешен только Иустине." + "\n"
            + "Внимнание, если вы не Иутина немедленно завершите работу програмы!"),
    USER_NAME("иустина"),
    USER_ERROR("Вы не Иустина! Немедленно завершите работу программы."),
    INCORRECT_ANSWER("Неверно, попробуйте еще раз:"),
    HELP_MESSAGE("Или воспользуйтесь подсказкой Help, нажав клавишу h");

    private String value;

    Phrases(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
