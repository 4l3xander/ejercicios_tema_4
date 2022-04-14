public class condicionales {

    public static void main(String[] args) {
        int numerolf = -5;
        if (numerolf < 0) {
            System.out.println("El numero es negativo");
        } else if (numerolf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El NUMERO ES INALCANSABLE...");
        }


        int numero_while = 0;
        while (numero_while < 3) {
            numero_while += 1;
            System.out.println(numero_while);
        }

        do {
            System.out.println(numero_while);
            numero_while -= 1;

        } while (numero_while > 2);



        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1 ){
            System.out.println(numeroFor);
        }
            var estacion = "lunes";

        switch (estacion){
            case"verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case"primavera":
                System.out.println("Es primavera");
                break;
            case"otoño":
                System.out.println("Es otoño");
            default:
                System.out.println(" DIGITE CORRECTAMENTE UNA ESTACION... ");
        }
    }

}

