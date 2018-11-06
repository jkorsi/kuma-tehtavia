/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author eo388
 */
public final class BossVaateFactory implements VaateFactory {
    
     private static volatile BossVaateFactory instance = null;
     private BossVaateFactory(){
         
     }
     public static BossVaateFactory getInstance(){
         BossVaateFactory instance = BossVaateFactory.instance;
         if(instance == null){
               synchronized(BossVaateFactory.class){
                 instance = BossVaateFactory.instance;
                   if(instance == null){
                       BossVaateFactory.instance = instance = new BossVaateFactory();
                   }
         }
         }
         
         return instance;
     }
    
    @Override
    public Paahine makePaahine() {
        
        return new BossPaahine();
    }

    @Override
    public Housut makeHousut() {
        
        return new BossHousut();
    }

    @Override
    public Kengat makeKengat() {
        
        return new BossKengat();
    }

    @Override
    public Paita makePaita() {
        
        return new BossPaita();
    }



}
