package domain;

public class Method {

    Arithmetic ar = new Arithmetic();
    DataSet data = new DataSet();
    Coeficientes cof = new Coeficientes();
    
    public Method() {}
    
    public void Metodo() {
        
        double sumax = 0, sumay = 0, sumaxy = 0, sumax2 = 0, 
               sumax3 = 0, sumax4 = 0, sumax2y = 0;
        
        int n = data.getN();
        
        sumax = ar.sumatoriaNormal(data.getX());
        sumax2 = ar.sumatoriaPotencia(data.getX(), 2);
        sumax3 = ar.sumatoriaPotencia(data.getX(), 3);
        sumax4 = ar.sumatoriaPotencia(data.getX(), 4);
        sumay = ar.sumatoriaNormal(data.getY());
        sumaxy = ar.sumatoriaMultiplica(data.getX(), data.getY());
        sumax2y = ar.sumatoriaMultPotencia(data.getX(), 2, data.getY());
        
        double Ds = (n*sumax2*sumax4)+(sumax*sumax3*sumax2)+(sumax2*sumax*sumax3)-(sumax*sumax*sumax4)-(n*sumax3*sumax3)-(sumax2*sumax2*sumax2);
        double DB0 = (sumay*sumax2*sumax4)+(sumax*sumax3*sumax2y)+(sumaxy*sumax3*sumax2)-(sumax2*sumax2*sumax2y)-(sumax3*sumax3*sumay)-(sumaxy*sumax*sumax4);
        double DB1 = (n*sumaxy*sumax4)+(sumay*sumax3*sumax2)+(sumax*sumax2y*sumax2)-(sumax2*sumaxy*sumax2)-(sumax3*sumax2y*n)-(sumax*sumay*sumax4);
        double DB2 = (n*sumax2*sumax2y)+(sumax*sumaxy*sumax2)+(sumax*sumax3*sumay)-(sumay*sumax2*sumax2)-(sumaxy*sumax3*n)-(sumax*sumax*sumax2y);
        
        cof.setBeta0(DB0 / Ds);
        cof.setBeta1(DB1 / Ds);
        cof.setBeta2(DB2 / Ds);
        
        System.out.println("Beta0 = " + cof.getBeta0() + "\nBeta1 = " + cof.getBeta1() + "x"+ "\nBeta2 " + cof.getBeta2() + "x^2"); 
    }
    
}
