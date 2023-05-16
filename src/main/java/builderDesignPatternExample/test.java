package builderDesignPatternExample;


public class test {
    public static void main(String[] args){
        Package aPackage1 = new Package.PackageBuilder(
                "Osijek", "Zagreb", true
        ).setWeight(2).build();

        Package aPackage2 = new Package.PackageBuilder(
                "Osijek", "Rijeka", false
        ).setWeight(2.5).build();

        Letter aLetter1 = new Letter.LetterBuilder(
                "Osijek", "Zagreb", true
        ).setFormat("A4").setStamp().build();

        Letter aLetter2 = new Letter.LetterBuilder(
                "Osijek", "Zagreb", false
        ).setFormat("A4").setStamp().build();

        Letter aLetter3 = new Letter.LetterBuilder(
                "Osijek", "Zagreb", true
        ).setFormat("A4").build();

        Letter aLetter4 = new Letter.LetterBuilder(
                "Osijek", "Zagreb", false
        ).setFormat("A4").build();

        System.out.println(aPackage1.toString());
        System.out.println(aPackage2.toString());
        System.out.println(aLetter1.toString());
        System.out.println(aLetter2.toString());
        System.out.println(aLetter3.toString());
        System.out.println(aLetter4.toString());
    }
}
