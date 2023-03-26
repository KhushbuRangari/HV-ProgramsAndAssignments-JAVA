public class string {
    public static void main(String[] args) {
        String name="abc";
        String name3="def";
        String name2= new String("Maharshi");
        String name4= new String("Maharshi");
        System.out.println(name +" "+name2);
        System.out.println(name==name3);
        System.out.println(name2==name4);
        String result= name +" "+name2;
        System.out.println(result.length());
        String sub=result.substring(2, 8);
        System.out.println(sub);
        System.out.println(result.indexOf("Mahaa"));
        System.out.println(name.equals(name3));
        System.out.println(name.equalsIgnoreCase(name3));
        System.out.println(result.startsWith("Laav"));
        System.out.println(result.endsWith("shi"));
        System.out.println(name3.compareTo(name));
        }
}
