package default_package;

public class OpTemperatura {
    private Double valorTemperatura, resultado;
    private int tipoTemp1, tipoTemp2;

    public OpTemperatura() {
    }

    public Double getValorTemperatura() {
        return valorTemperatura;
    }

    public void setValorTemperatura(Double valorTemperatura) {
        this.valorTemperatura = valorTemperatura;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public int getTipoTemp1() {
        return tipoTemp1;
    }

    public void setTipoTemp1(int tipoTemp1) {
        this.tipoTemp1 = tipoTemp1;
    }

    public int getTipoTemp2() {
        return tipoTemp2;
    }

    public void setTipoTemp2(int tipoTemp2) {
        this.tipoTemp2 = tipoTemp2;
    }

    public double conversion(){

        //ºC a ºF y viseversa
        if (tipoTemp1 ==0 && tipoTemp2 == 1){
            resultado = (valorTemperatura*9/5)+32;
        } else if (tipoTemp1==1 && tipoTemp2 ==0) {
            resultado = (valorTemperatura - 32)*5/9;
        }

        //ºC a K y viseversa
        if (tipoTemp1 ==0 && tipoTemp2 == 2){
            resultado = valorTemperatura+273.15;
        } else if (tipoTemp1==2 && tipoTemp2 ==0) {
            resultado = valorTemperatura-273.15;
        }

        //ºF a K y viseversa
        if (tipoTemp1 ==1 && tipoTemp2 == 2){
            resultado = (valorTemperatura-32)*5/9+273.15;
        } else if (tipoTemp1==2 && tipoTemp2 ==1) {
            resultado = (valorTemperatura-273.15)*9/5+32;
        }

        return resultado;
    }


}
