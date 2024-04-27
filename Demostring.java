public class Demostring {

    public static void main(String[] args){
        String name="sanskar";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String nonTrimmedstring="      sanskar      ";
        System.out.println(nonTrimmedstring);
        String trimmedstring="   sanskar    ";
        System.out.println(trimmedstring.trim());
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));
        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("r","ran"));
        System.out.println(name.startsWith("kumar"));
        System.out.println(name.startsWith("san"));
        System.out.println(name.endsWith("p"));
        System.out.println(name.endsWith("r"));
        String modifiedname="sanskarkumar";
        System.out.println(modifiedname.indexOf("ar"));
        System.out.println(modifiedname.indexOf("ar",7));
        System.out.println(modifiedname.lastIndexOf("nskar",7));
        System.out.println(name.equals("sanskar"));
        System.out.println(name.equalsIgnoreCase("ssnkar"));
    }
}
