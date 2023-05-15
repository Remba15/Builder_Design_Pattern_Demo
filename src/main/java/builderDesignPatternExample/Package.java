package builderDesignPatternExample;

public class Package{
    private final double mWeight; //required
    private final String mDestinationCity; //required
    private final boolean mPriority; //required
    private final String mOriginCity; //optional

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
    public String toString(){
        return "Package weight: " + getWeight() + "\nPriority: " + isPriority() + "\nOrigin: " +
                getOriginCity() + "\nDestination: " + getDestinationCity() + "\n";
    }

    //BUILDER CLASS
    public static class PackageBuilder{
        private final double mWeight;
        private final String mDestinationCity;
        private final boolean mPriority;
        private String mOriginCity;

        public PackageBuilder(double weight, String destination, boolean priority){
            this.mWeight = weight;
            this.mDestinationCity = destination;
            this.mPriority = priority;
        }
        public PackageBuilder setOriginCity(String origin){
            this.mOriginCity = origin;
            return this;
        }

        public Package build(){
            return new Package(this);
        }
    }
}
