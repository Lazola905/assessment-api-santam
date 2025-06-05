package common;

public class TestData {

    private TestData(){
        throw new IllegalStateException("Test data class must not be instantiated");
    }

    public static final String BREED_MASTIFF = "mastiff";
    public static final String SUB_BREED_ENGLISH = "english";
    public static final String SUCCESS_STATUS = "success";
}