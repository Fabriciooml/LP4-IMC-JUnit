public class Imc {

    double peso;
    double altura;
    double imc;
    boolean isHomem;

    public Imc(double peso, double altura, boolean isHomem) {
        this.peso = peso;
        this.altura = altura;
        this.isHomem = isHomem;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setHomem(boolean homem) {
        isHomem = homem;
    }

    public void calcImc(){
        this.imc = peso/Math.pow(altura, 2);
    }

    public String getResultado(){
        if (isHomem){
            if (this.imc < 20.7){
                return "abaixo do peso";
            }
            else if (this.imc < 26.4){
                return "no peso normal";
            }
            else if (this.imc < 27.8){
                return "marginalmente acima do peso";
            }
            else if (this.imc < 31.1){
                return "acima do peso ideal";
            }
            else {
                return "obeso";
            }
        }
        else {
            if (this.imc < 19.1){
                return "abaixo do peso";
            }
            else if (this.imc < 25.8){
                return "no peso normal";
            }
            else if (this.imc < 27.3){
                return "marginalmente acima do peso";
            }
            else if (this.imc < 32.3){
                return "acima do peso ideal";
            }
            else {
                return "obeso";
            }
        }
    }
}
