package default_package;

public class OpDivisas {

    private double valorMoneda;
    private int valorMoneda1;
    private int valorMoneda2;
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }


    public double getValorMoneda() {
        return valorMoneda;
    }

    public void setValorMoneda(double valorMoneda) {
        this.valorMoneda = valorMoneda;
    }

    public int getValorMoneda1() {
        return valorMoneda1;
    }

    public void setValorMoneda1(int valorMoneda1) {
        this.valorMoneda1 = valorMoneda1;
    }

    public int getValorMoneda2() {
        return valorMoneda2;
    }

    public void setValorMoneda2(int valorMoneda2) {
        this.valorMoneda2 = valorMoneda2;
    }

    public OpDivisas() {

    }

    private double QxDolar = 7.79, QxEur = 8.25, QxLibra = 9.29, QxWon = 0.0059, QxYen = 0.057;
    private double DolarxEur= 1.06,DolarxLibra= 1.19,DolarxWon=0.00075, DolarxYen=0.0073;
    private double EurxLibra=1.13 , EurxWon=0.00071, EurxYen=0.0069;
    private double LibraxWon=0.00063,LibraxYen=0.0061, WonxYen=9.73;
    public double conversion(){
        //Quetzal a Dolar y viseversa
        if (valorMoneda1 ==0 && valorMoneda2==1){
            resultado = valorMoneda / QxDolar;
        }else if (valorMoneda1 == 1 && valorMoneda2==0){
            resultado = valorMoneda * QxDolar;
        }

        //Quetzal a Euro y viseversa
        if (valorMoneda1 ==0 && valorMoneda2==2){
            resultado = valorMoneda / QxEur;
        }else if (valorMoneda1 == 0 && valorMoneda2==0){
            resultado = valorMoneda * QxEur;
        }

        //Quetzal a Libra y viseversa
        if (valorMoneda1 ==0 && valorMoneda2==3){
            resultado = valorMoneda / QxLibra;
        }else if (valorMoneda1 == 3 && valorMoneda2==0){
            resultado = valorMoneda * QxLibra;
        }

        //Quetzal a Won y viseversa
        if (valorMoneda1 ==0 && valorMoneda2==4){
            resultado = valorMoneda / QxWon;
        }else if (valorMoneda1 == 4 && valorMoneda2==0){
            resultado = valorMoneda * QxWon;
        }

        //Quetzal a Yen y viseversa
        if (valorMoneda1 ==0 && valorMoneda2==5){
            resultado = valorMoneda / QxYen;
        }else if (valorMoneda1 == 5 && valorMoneda2==0){
            resultado = valorMoneda * QxYen;
        }

        //Dolar a Euro y viseversa y viseversa
        if (valorMoneda1 ==1 && valorMoneda2==2){
            resultado = valorMoneda / DolarxEur;
        }else if (valorMoneda1 == 2 && valorMoneda2==1){
            resultado = valorMoneda * DolarxEur;
        }

        //Dolar a Libra y viseversa y viseversa
        if (valorMoneda1 ==1 && valorMoneda2==3){
            resultado = valorMoneda / DolarxLibra;
        }else if (valorMoneda1 == 3 && valorMoneda2==1){
            resultado = valorMoneda * DolarxLibra;
        }

        //Dolar a Won y viseversa y viseversa
        if (valorMoneda1 ==1 && valorMoneda2==4){
            resultado = valorMoneda / DolarxWon;
        }else if (valorMoneda1 ==4 && valorMoneda2==1){
            resultado = valorMoneda * DolarxWon;
        }

        //Dolar a Yen y viseversa
        if (valorMoneda1 ==1 && valorMoneda2==5){
            resultado = valorMoneda / DolarxYen;
        }else if (valorMoneda1 == 5 && valorMoneda2==1){
            resultado = valorMoneda * DolarxYen;
        }

        //Euro a Libra y viseversa
        if (valorMoneda1 ==2 && valorMoneda2==3){
            resultado = valorMoneda / EurxLibra;
        }else if (valorMoneda1 == 3 && valorMoneda2==2){
            resultado = valorMoneda * EurxLibra;
        }

        //Euro a Won y viseversa
        if (valorMoneda1 ==2 && valorMoneda2==4){
            resultado = valorMoneda / EurxWon;
        }else if (valorMoneda1 == 4 && valorMoneda2==2){
            resultado = valorMoneda * EurxWon;
        }

        //Euro a Yen y viseversa
        if (valorMoneda1 ==2 && valorMoneda2==5){
            resultado = valorMoneda / EurxLibra;
        }else if (valorMoneda1 == 5 && valorMoneda2==2){
            resultado = valorMoneda * EurxLibra;
        }

        //Libra a Won y viseversa
        if (valorMoneda1 ==3 && valorMoneda2==4){
            resultado = valorMoneda / LibraxWon;
        }else if (valorMoneda1 == 4 && valorMoneda2==3){
            resultado = valorMoneda * LibraxWon;
        }

        //Libra a Yen y viseversa
        if (valorMoneda1 ==3 && valorMoneda2==5){
            resultado = valorMoneda / LibraxYen;
        }else if (valorMoneda1 == 5 && valorMoneda2==3){
            resultado = valorMoneda * LibraxYen;
        }

        //Won a Yen y viseversa
        if (valorMoneda1 ==4 && valorMoneda2==5){
            resultado = valorMoneda / LibraxWon;
        }else if (valorMoneda1 == 5 && valorMoneda2==4){
            resultado = valorMoneda * LibraxWon;
        }

        return resultado;
    }
}
