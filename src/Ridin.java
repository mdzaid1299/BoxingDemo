public class Ridin {
    //this autoboxing
    public static void main(String[] args) {
        int num = 7;
        Integer ObjNum = num;
        System.out.println(ObjNum);

        //wrapper class obj to primiitive
        Integer aNum = 4;
        int num2 = aNum.intValue();
        System.out.println(num2);

        // converting int primitive type into wrapper object
        Integer bNum = Integer.valueOf(num2);
        System.out.println(bNum);
    }

}
