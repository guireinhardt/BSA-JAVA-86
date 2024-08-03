package entities;

public class Calculador {

    public static String maiorValorArea(FiguraGeometrica fig01, FiguraGeometrica fig02){
        if (fig01.calcularArea() > fig02.calcularArea()){
            return String.format("A área maior é igual à %.3f",fig01.calcularArea());
        }else {
            return String.format("A área maior é igual à %.3f",fig02.calcularArea());
        }
    }
}
