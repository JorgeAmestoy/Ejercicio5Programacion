import java.util.Scanner;

public class Main {
    public static final int seguridadSocial=36;
    public static void main(String[] args) {
        double sueldoFijo, comision, importeTotal, quilometraxe, kilometros,dietas, diasDesplazamiento, IRPF, sueldoBruto , sueldoLiquido;

        Scanner obxCantidades = new Scanner(System.in);
        System.out.println("Teclea sueldoFijo");
        sueldoFijo = obxCantidades.nextDouble();
        System.out.println("Teclea importeTotal");
        importeTotal = obxCantidades.nextDouble();
        System.out.println("Teclea kilometros");
        kilometros = obxCantidades.nextDouble();
        System.out.println("Teclea diasDesplazamiento");
        diasDesplazamiento = obxCantidades.nextDouble();

        comision = (5*importeTotal)/100;
        quilometraxe = 2*kilometros;
        dietas = 30*diasDesplazamiento;
        sueldoBruto = sueldoFijo+comision+quilometraxe+dietas;
        IRPF = (18*sueldoBruto)/100;
        sueldoLiquido = sueldoBruto - (IRPF+seguridadSocial);

        System.out.println("el sueldo bruto es = " +sueldoBruto+ "\n el sueldo liquido es = " +sueldoLiquido);



    }
}