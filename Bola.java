
package bola;

public class Bola {
    private double jariJari;
    
    public double setJariJari (double jari){
        return this.jariJari=jari;
    }
    public double showDiameter(){
        return jariJari * 2;
    }
    public double showLuasPermukaan(){
        return 4*Math.PI*Math.pow(jariJari, 2);
    }
    public double showVolume(){
           return (Math.PI*Math.pow(jariJari, 3)/3);
    }
    public void cetak(){
        String showLuas;
        System.out.print("Diameter\t:"+showDiameter()+
        "\nLuas Permukaan\t:"+showLuasPermukaan()+
        "\nVolume\t:"+showVolume());
    }
}
