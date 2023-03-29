package default_package;

public class OpMedidas {
    private Double valorMedida, resultado;
    private int tipoMedida1, tipoMedida2;

    public OpMedidas() {
    }

    public Double getValorMedida() {
        return valorMedida;
    }

    public void setValorMedida(Double valorMedida) {
        this.valorMedida = valorMedida;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public int getTipoMedida1() {
        return tipoMedida1;
    }

    public void setTipoMedida1(int tipoMedida1) {
        this.tipoMedida1 = tipoMedida1;
    }

    public int getTipoMedida2() {
        return tipoMedida2;
    }

    public void setTipoMedida2(int tipoMedida2) {
        this.tipoMedida2 = tipoMedida2;
    }

    public Double conversorMedida(){
        //Metros a Kilometros y viseversa
        if (tipoMedida1 == 0 && tipoMedida2 == 1){
            resultado = valorMedida / 1000;
        }else if (tipoMedida1 ==1 && tipoMedida2 == 0){
            resultado = valorMedida * 1000;
        }

        //Metros a Millas y viseversa
        if (tipoMedida1 == 0 && tipoMedida2 == 2){
            resultado = valorMedida / 1609.34;
        }else if (tipoMedida1 ==2 && tipoMedida2 == 0){
            resultado = valorMedida * 1609.34;
        }
        //Metros a Centimetros y viseversa
        if (tipoMedida1 == 0 && tipoMedida2 == 3){
            resultado = valorMedida / 0.01;
        }else if (tipoMedida1 ==3 && tipoMedida2 == 0){
            resultado = valorMedida * 0.01;
        }

        //Metros a Milimetros y viseversa
        if (tipoMedida1 == 0 && tipoMedida2 == 4){
            resultado = valorMedida / 0.001;
        }else if (tipoMedida1 ==4 && tipoMedida2 == 0){
            resultado = valorMedida * 0.001;
        }

        //Metros a Yardas y viseversa
        if (tipoMedida1 == 0 && tipoMedida2 == 5){
            resultado = valorMedida / 0.9144;
        }else if (tipoMedida1 ==5 && tipoMedida2 == 0){
            resultado = valorMedida * 0.9144;
        }

        //Metros a Pies y viseversa
        if (tipoMedida1 == 0 && tipoMedida2 == 6){
            resultado = valorMedida / 0.3048;
        }else if (tipoMedida1 ==6 && tipoMedida2 == 0){
            resultado = valorMedida * 0.3048;
        }
        //Metros a Pulgadas y viseversa
        if (tipoMedida1 == 0 && tipoMedida2 == 7){
            resultado = valorMedida / 0.0254;
        }else if (tipoMedida1 ==7 && tipoMedida2 == 0){
            resultado = valorMedida * 0.0254;
        }

        //Kilometros a Millas y viseversa
        if (tipoMedida1 == 1 && tipoMedida2 == 2){
            resultado = valorMedida * 0.621371;
        }else if (tipoMedida1 ==2 && tipoMedida2 == 1){
            resultado = valorMedida / 0.621371;
        }

        //Kilometros a Centimetros y viseversa
        if (tipoMedida1 == 1 && tipoMedida2 == 3){
            resultado = valorMedida * 100000;
        }else if (tipoMedida1 ==3 && tipoMedida2 == 1){
            resultado = valorMedida / 100000;
        }

        //Kilometros a Milimetros y viseversa
        if (tipoMedida1 == 1 && tipoMedida2 == 4){
            resultado = valorMedida * 1e+6;
        }else if (tipoMedida1 ==4 && tipoMedida2 == 1){
            resultado = valorMedida / 1e+6;
        }
        //Kilometros a Yardas y viseversa
        if (tipoMedida1 == 1 && tipoMedida2 == 5){
            resultado = valorMedida * 1093.61;
        }else if (tipoMedida1 ==5 && tipoMedida2 == 1){
            resultado = valorMedida / 1093.61;
        }

        //Kilometros a Pie y viseversa
        if (tipoMedida1 == 1 && tipoMedida2 == 6){
            resultado = valorMedida * 3280.84;
        }else if (tipoMedida1 ==6 && tipoMedida2 == 1){
            resultado = valorMedida / 3280.84;
        }
        //Kilometros a Pulgadas y viseversa
        if (tipoMedida1 == 1 && tipoMedida2 == 7){
            resultado = valorMedida * 39370.1;
        }else if (tipoMedida1 ==7 && tipoMedida2 == 1){
            resultado = valorMedida / 39370.1;
        }
        //Millas a Centimetros y viseversa
        if (tipoMedida1 == 2 && tipoMedida2 == 3){
            resultado = valorMedida * 160934;
        }else if (tipoMedida1 ==3 && tipoMedida2 == 2){
            resultado = valorMedida / 160934;
        }
        //Millas a Milimetros y viseversa
        if (tipoMedida1 == 2 && tipoMedida2 == 4){
            resultado = valorMedida * 1.609e+6;
        }else if (tipoMedida1 ==4 && tipoMedida2 == 2){
            resultado = valorMedida / 1.609e+6;
        }
        //Millas a Yarda viseversa
        if (tipoMedida1 == 2 && tipoMedida2 == 5){
            resultado = valorMedida * 1760;
        }else if (tipoMedida1 ==5 && tipoMedida2 == 2){
            resultado = valorMedida / 1760;
        }
        //Millas a Pie y viseversa
        if (tipoMedida1 == 2 && tipoMedida2 == 6){
            resultado = valorMedida * 5280;
        }else if (tipoMedida1 ==6 && tipoMedida2 == 2){
            resultado = valorMedida / 5280;
        }

        //Millas a Pulgada y viseversa
        if (tipoMedida1 == 2 && tipoMedida2 == 7){
            resultado = valorMedida * 63360;
        }else if (tipoMedida1 ==7 && tipoMedida2 == 2){
            resultado = valorMedida / 63360;
        }

        //Centimetro a Milimetros y viseversa
        if (tipoMedida1 == 3 && tipoMedida2 == 4){
            resultado = valorMedida * 10;
        }else if (tipoMedida1 ==4 && tipoMedida2 == 3){
            resultado = valorMedida / 10;
        }
        //Centimetro a Yarda y viseversa
        if (tipoMedida1 == 3 && tipoMedida2 == 5){
            resultado = valorMedida * 0.109361;
        }else if (tipoMedida1 ==5 && tipoMedida2 == 3){
            resultado = valorMedida / 0.109361;
        }
        //Centimetro a Pie y viseversa
        if (tipoMedida1 == 3 && tipoMedida2 == 6){
            resultado = valorMedida * 0.0328084;
        }else if (tipoMedida1 ==6 && tipoMedida2 == 3){
            resultado = valorMedida / 0.0328084;
        }
        //Centimetro a Pulgada y viseversa
        if (tipoMedida1 == 3 && tipoMedida2 == 7){
            resultado = valorMedida * 0.393701;
        }else if (tipoMedida1 ==7 && tipoMedida2 == 3){
            resultado = valorMedida / 0.393701;
        }

        //Milimetro a Yarda y viseversa
        if (tipoMedida1 == 4 && tipoMedida2 == 5){
            resultado = valorMedida * 0.00109361;
        }else if (tipoMedida1 ==5 && tipoMedida2 == 4){
            resultado = valorMedida / 0.00109361;
        }
        //Milimetro a Pie y viseversa
        if (tipoMedida1 == 4 && tipoMedida2 == 6){
            resultado = valorMedida * 0.00328084;
        }else if (tipoMedida1 ==6 && tipoMedida2 == 4){
            resultado = valorMedida / 0.00328084;
        }
        //Milimetro a Pulgada y viseversa
        if (tipoMedida1 == 4 && tipoMedida2 == 5){
            resultado = valorMedida * 0.0393701;
        }else if (tipoMedida1 ==5 && tipoMedida2 == 4){
            resultado = valorMedida / 0.0393701;
        }

        //Yarda a Pie y viseversa
        if (tipoMedida1 == 5 && tipoMedida2 == 6){
            resultado = valorMedida * 3;
        }else if (tipoMedida1 ==6 && tipoMedida2 == 5){
            resultado = valorMedida / 3;
        }

        //Yarda a Pulgada y viseversa
        if (tipoMedida1 == 5 && tipoMedida2 == 7){
            resultado = valorMedida * 36;
        }else if (tipoMedida1 ==7 && tipoMedida2 == 5){
            resultado = valorMedida / 36;
        }

        //Pie a Pulgada y viseversa
        if (tipoMedida1 == 6 && tipoMedida2 == 7){
            resultado = valorMedida * 12;
        }else if (tipoMedida1 ==7 && tipoMedida2 == 6){
            resultado = valorMedida / 12;
        }




        return resultado;
    }


}
