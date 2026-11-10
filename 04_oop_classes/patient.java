package chatbot;

public class patient {
    String name;
    int order;
    
    public patient(String name, int order) {
    	this.name = name;
    	this.order = order;
    }
    public int getorder() {
    	return order;
    }
    public String getname() {
    	return name;
    }
}
