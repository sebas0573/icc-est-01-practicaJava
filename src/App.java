public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        String cadena = "Hola mundo";
        
        System.out.println(cadena);
        System.out.print("Tamaño de la cadena ");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[0]);

        for(int i = 0; i < cadena.length(); i++){
            if(i == cadena.length()-1){
                System.out.print(cadena.charAt(i));
            }else{
                System.out.print(cadena.charAt(i)+ "-");
            }
        }
        
        System.out.println();
        //contar palabras
        int palabras = cadena.split(" ").length;
        System.out.println(palabras);

        //contar cuantas a hay en la cadena
        char letraA = 'a';
        int contador = 0;

        for(int i =0; i<cadena.length(); i++){
            if(cadena.charAt(i) == letraA){
                contador++;
            }
        }
        System.out.println("Numero de a en la cadena es: "+ contador);
    }
}
