package favoriteMovies;

import java.io.Serializable;

public class Rating implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9023348085979680594L;
	
	private String source;
    private String value;
    
    public Rating() {
    	
    }
    
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Rating withSource(String source) {
        this.source = source;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Rating withValue(String value) {
        this.value = value;
        return this;
    }


}
