package builderDesignPatternExample;


public class Package extends PostOfficeItem{

    private final double mWeight;

    private Package(PackageBuilder builder){
        this.mWeight = builder.mWeight;
        this.mDestinationCity = builder.mDestinationCity;
        this.mPriority = builder.mPriority;
        this.mOriginCity = builder.mOriginCity;
    }

    public double getWeight() {
        return mWeight;
    }

    public String getDestinationCity() {
        return mDestinationCity;
    }

    public boolean isPriority() {
        return mPriority;
    }

    public String getOriginCity() {
        return mOriginCity;
    }

    @Override
    public double calculatePrice() {
        if(isPriority()) return (getWeight() / 2) + 5;
        else return getWeight() / 2;
    }

    @Override
    public String toString(){
        return "Package weight: " + getWeight() + "\nPriority: " + isPriority() + "\nOrigin: " +
                getOriginCity() + "\nDestination: " + getDestinationCity() + "\nTotal cost: " + calculatePrice()  + "\n";
    }

    //BUILDER CLASS
    public static class PackageBuilder{
        private double mWeight;
        private final String mDestinationCity;
        private final boolean mPriority;
        private final String mOriginCity;

        public PackageBuilder(String origin, String destination, boolean priority){
            this.mOriginCity = origin;
            this.mDestinationCity = destination;
            this.mPriority = priority;
        }
        public PackageBuilder setWeight(double weight){
            this.mWeight = weight;
            return this;
        }

        public Package build(){
            return new Package(this);
        }
    }
}
