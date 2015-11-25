package be.xploregroup.joe.oxygen;

/**
 * Created by bertswinnen on 02/11/15.
 */
public enum OxygenSystemType {
    NORMAL("normal"), PREMIUM("premium");

    private String value;

    OxygenSystemType(String type) {
        this.value = type;
    }

    public static OxygenSystemType getByType(String type){
        if("premium".equalsIgnoreCase(type)){
            return PREMIUM;
        }

        return NORMAL;
    }

    public String getValue(){
        return this.value;
    }
}
