package TiposPrimitivos;

public class Primitivos {
 public static void main(String[] args) {
    int idade = 10;
    double salarioDouble = 100.00;
    float salarioFloat = 250.0F;
    boolean verdadeiro = true;
    boolean falso = false;
    String texto = "Ramalho";

    Primitivos.Print(idade);
    
    Primitivos.Print(salarioDouble);
    Primitivos.Print(salarioFloat);
    
    Primitivos.Print(verdadeiro);
    Primitivos.Print(falso);

    Primitivos.Print(texto);
    Primitivos.Print(texto.toUpperCase());
    Primitivos.Print(texto.toLowerCase());

    Primitivos.Soma(idade, 2023);
 }  

 public static <T> T Print(T value) {
    System.out.println(value.getClass());
    System.out.println(value);
    return value;
 }

 public static <T> int Soma(int value1, int value2) {
    int total = value1 + value2;
    Print(total);
    return total;
 }

}
