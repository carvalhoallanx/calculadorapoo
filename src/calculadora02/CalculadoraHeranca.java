
package calculadora02;

public class CalculadoraHeranca extends PegarNum implements Interface{
   private double Valor1;
   private double Valor2;
   private String Calcular;
   private String Percentual;
   private boolean Calculo;
   
   public double PegarNum(double Valor1, double Valor2){
       return (Valor1 + Valor2);
   }
   
    public void setvalor1 (double Valor1){
        this.Valor1 = Valor1;
    }
    public double getValor1(){
        return this.Valor1;
    } 
    public void setvalor2 (double Valor2){
        this.Valor2 = Valor2;
    }
    public double getValor2(){
        return this.Valor2;
    } 
    public void setPercentual (String Percentual){
        this.Percentual = Percentual;
    }
    public String getPercentual(){
        return this.Percentual;
    }
    public void setCalcular (String Calcular){
        this.Calcular = Calcular;
    }
    public String getCalcular(){
        return this.Calcular;
    }
    public void setcalculo (boolean Calculo){
        this.Calculo = Calculo;
    }
    public boolean getcalculo(){
        return this.Calculo;
    } 
    

    @Override
    public double getsomar() {
        return (Valor1 + Valor2);
    }

    @Override
    public double getsubtrair() {
        return (Valor1 - Valor2);
    }

    @Override
    public double getdividir() {
        return (Valor1 / Valor2);
    }

    @Override
    public double getmultiplicar() {
        return (Valor1 * Valor2);
    }

    @Override
    public double getpercentual() {
        double p;
        p = (Valor2 / 100);
        return ((p*Valor1));
    }

    @Override
    public double getpercentualsomar() {
        double p;
        p = (Valor2/100);
        return (Valor1 + (p*Valor1));
    }

    @Override
    public double getpercentualdiminuir() {
        double p;
        p = (Valor2 / 100);
        return (Valor1 - (p*Valor1));
    }

    @Override
    public double getpercentualmultiplicar() {
        double p;
        p = (Valor2 / 100);
        return (Valor1 * p);
    }

    @Override
    public double getpercentualdividir() {
        double p;
        p = (Valor2 / 100);
        return (Valor1 / p);
    }
    
}

