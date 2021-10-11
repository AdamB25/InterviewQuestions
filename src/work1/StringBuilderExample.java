package work1;

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder str=new StringBuilder("Barış");

        StringBuilder str1=new StringBuilder(7);

        str1.append("denemmemwfffff");
        System.out.println("str1 = " + str1);
        str1.replace(1,6,"seriner");
        System.out.println("str1 = " + str1);


    }
}
