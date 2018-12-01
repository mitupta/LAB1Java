public class lab31 {
    public static void main(String[] args) {
        System.out.println("************3.1.1***********");
        int a = 14_000;
        System.out.println("kwota: " + a +"zl");
        a*=1.4;
        System.out.println("po wzroście o 40%: " + a + "zl");
        a-=1_500;
        System.out.println("po stracie 1500zl: " + a+  "zl");
        a*=1.12;
        System.out.println("po wzroście 12%: " + a + "zl");

        System.out.println("************3.1.2***********");
        int b = 8;
        int c = 3;
        int div = b/c;
        int mod = b/c;
        /*System.out.println(div);
        System.out.println(mod);*/
        System.out.println("Liczba b= " + b + "\nLiczba c= " + c + "\nWynik dzielenia b/c= " + div + "\t" + mod );

        System.out.println("************3.1.3***********");

        int d = 18;
        System.out.println("Liczba dziesiętna: " + d);
        System.out.println("W systemie dwójkowym: " + Integer.toBinaryString(d));
        System.out.println("W systemie ósemkowym: " + Integer.toOctalString(d));
        System.out.println("W systemie szesnastkowym: " + Integer.toHexString(d));




    }
}
