package builderDesignPatternExample;

public abstract class PostOfficeItem {
    public String mDestinationCity;
    public String mOriginCity;
    public boolean mPriority;

    public abstract double calculatePrice();
}
