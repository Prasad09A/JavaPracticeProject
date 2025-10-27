package CoreJava.String;


public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("java");
        sb.append(" Programming");

        System.out.println(sb);

        sb.replace(1,4,"unit");
        System.out.println(sb);

        System.out.println(sb.insert(1,"P"));

        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.reverse());
    }
}
