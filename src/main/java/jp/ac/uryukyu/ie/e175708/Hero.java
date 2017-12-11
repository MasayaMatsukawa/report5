package jp.ac.uryukyu.ie.e175708;

public class Hero extends LivingThing {
    public Hero (String name,int hitPoint,int attack){
        super(name,hitPoint,attack);
    }

    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}

