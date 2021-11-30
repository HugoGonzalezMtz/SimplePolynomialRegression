package domain;

public class DataSet {

    private int n;
    private double[] x, y;
    
    public DataSet(){
        //Quadratic
        this.x = new double[]{-3,-2,-1,0,1,2,3};
        this.y = new double[]{7.5,3,.05,1,3,6,14};
        
        /* //Polynomial
        this.x = new double[]{50, 50, 50, 70, 70, 70, 80,80,80,90,90,90,100,100,100};
        this.y = new double[]{3.3, 2.8, 2.9, 2.3, 2.6, 2.1, 2.5,2.9,2.4,3.0,3.1,2.8,3.3,3.5,3.0};
        */
        
        /* //Temperatura
        this.x = new double[]{0,20,40,60,80,100};
        this.y = new double[]{0.0002,0.0012,0.0060,0.0300,0.0900,0.2700};
        */
        
        this.n = x.length;
    }
    

    public int getN() {return n;}
    
    public double[] getX(){return this.x;}
    public void setX(double[] aux){this.x = aux;}
    
    public double[] getY(){return this.y;}
    public void setY(double[] aux){this.y = aux;}
    
}
