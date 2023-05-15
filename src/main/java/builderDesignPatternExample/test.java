package builderDesignPatternExample;


public class test {
    public static void main(String[] args){
        Package aPackage1 = new Package.PackageBuilder(
                1.5, "Zagreb", true
        ).build();

        Package aPackage2 = new Package.PackageBuilder(
                0.5, "Rijeka", false
        ).setOriginCity("Osijek").build();

        System.out.println(aPackage1.toString());
        System.out.println(aPackage2.toString());
    }
}
