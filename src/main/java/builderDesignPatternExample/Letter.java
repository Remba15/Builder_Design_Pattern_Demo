package builderDesignPatternExample;

public class Letter extends PostOfficeItem{
    private final String mFormat;
    private final boolean mStamp;

    private Letter(LetterBuilder builder){
        this.mFormat = builder.mFormat;
        this.mStamp = builder.mStamp;
        this.mDestinationCity = builder.mDestinationCity;
        this.mPriority = builder.mPriority;
        this.mOriginCity = builder.mOriginCity;
    }

    public String getFormat() {
        return mFormat;
    }
    public boolean isStamped() {
        return mStamp;
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
        if(isStamped() && !isPriority()) return 0.5 + 1;
        else if (!isStamped() && isPriority()) return 0.5 + 5;
        else if (!isStamped() && !isPriority()) return 0.5;
        else return 0.5 + 1 + 5;
    }

    @Override
    public String toString(){
        return "Format: " + getFormat() + "\nStamp: " + isStamped() + "\nPriority: " + isPriority() + "\nOrigin: " +
                getOriginCity() + "\nDestination: " + getDestinationCity() + "\nTotal cost: " + calculatePrice() + "\n";
    }

    //BUILDER CLASS
    public static class LetterBuilder{
        private String mFormat;
        private boolean mStamp;

        private final String mDestinationCity;
        private final boolean mPriority;
        private final String mOriginCity;

        public LetterBuilder(String origin, String destination, boolean priority){
            this.mOriginCity = origin;
            this.mDestinationCity = destination;
            this.mPriority = priority;
        }

        public LetterBuilder setFormat(String format){
            this.mFormat = format;
            return this;
        }

        public LetterBuilder setStamp(){
            this.mStamp = true;
            return this;
        }

        public Letter build(){
            return new Letter(this);
        }
    }
}
