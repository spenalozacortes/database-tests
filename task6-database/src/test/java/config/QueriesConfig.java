package config;

public class QueriesConfig {

    private static final ConfigReader CONFIG_READER = new ConfigReader("src/test/resources/queries.json");

    public static String getAuthorByLogin() {
        return CONFIG_READER.getValueByKey("getAuthorByLogin").getAsString();
    }

    public static String getAddAuthor() {
        return CONFIG_READER.getValueByKey("addAuthor").getAsString();
    }

    public static String getProjectByName() {
        return CONFIG_READER.getValueByKey("getProjectByName").getAsString();
    }

    public static String getAddProject() {
        return CONFIG_READER.getValueByKey("addProject").getAsString();
    }

    public static String getAddSession() {
        return CONFIG_READER.getValueByKey("addSession").getAsString();
    }

    public static String getTestById() {
        return CONFIG_READER.getValueByKey("getTestById").getAsString();
    }

    public static String getTests() {
        return CONFIG_READER.getValueByKey("getTests").getAsString();
    }

    public static String getAddTest() {
        return CONFIG_READER.getValueByKey("addTest").getAsString();
    }

    public static String getUpdateTest() {
        return CONFIG_READER.getValueByKey("updateTest").getAsString();
    }

    public static String getDeleteTest() {
        return CONFIG_READER.getValueByKey("deleteTest").getAsString();
    }
}