/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.ArrayList;

/**
 *
 * @author bajwa
 */
public class main {
 
    public static void main(String[] args) {
        Bird b=new Bird();
        Dog d=new Dog();
        Rabbit r=new Rabbit();
        
        ArrayList<Creature> creatures =new ArrayList<>();
        
        creatures.add(b);
        creatures.add(d);
        creatures.add(r);
        
        BirdTrick bt=new BirdTrick();
        DogTrick dt=new DogTrick();
        
        b.setBt(bt);
        d.setDt(dt);
        
        b.eatFood();
        b.makeNest();
        d.breathe();
        r.hop();
    }
    
}
