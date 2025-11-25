public class ConversaoTipos {

    public static void main(String[] args) {

        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int int2 = (int) d2;

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();

        Double numeroDouble = 55.8;
        String numeroDoubleString = numeroDouble.toString();

        Long numeroLong = 50L;
        String numeroLongString = numeroLong.toString();

        String numeroString2 = "1234";
        Integer numeroConvertidoInteger = Integer.parseInt(numeroString2);
        Double numeroConvertidoDouble = Double.parseDouble(numeroString2);
        Long numeroConvertidoLong = Long.parseLong(numeroString2);

        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroInteger + " " + numeroString); //numero integer convertido para string
        System.out.println(numeroDouble + " " + numeroDoubleString); //numero double convertido para string
        System.out.println(numeroLong + " " + numeroLongString); //numero long convertido para string
        System.out.println(numeroString2 + " " + numeroConvertidoInteger); //numero em string convertido para integer
        System.out.println(numeroString2 + " " + numeroConvertidoDouble); //numero em string convertido para double
        System.out.println(numeroString2 + " " + numeroConvertidoLong); //numero em string convertido para long

        System.out.println("Resultado: " + (3 * 5));
    }
}
