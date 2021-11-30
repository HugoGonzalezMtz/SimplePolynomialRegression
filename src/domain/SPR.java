package domain;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class SPR extends Agent{

    @Override
    protected void setup(){
        addBehaviour(new MyOneShotBehaviour());
    }
    
    private class MyOneShotBehaviour extends OneShotBehaviour {

    @Override
    public void action() {
        System.out.println("Agent Executed");
        Method Poly = new Method();
        Poly.Metodo();
    } 
    
    @Override
    public int onEnd() {
      System.out.println("Agent Killed");
      myAgent.doDelete();   
      return super.onEnd();
    } 
    
}
}
