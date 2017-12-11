package jp.ac.uryukyu.ie.e175708;

public class Hero extends LivingThing {
    public Hero (String name,int hitPoint,int attack){
        super(name,hitPoint,attack);
    }

    public void attack(LivingThing opponent){
        if (!isDead()) {
            int damage = (int) (Math.random() * getAttack());
            if(damage == 0){
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n",getName(),opponent.getName());
            }
            else {
                int prob = (int)(Math.random()*101);
                if(prob <= 40){
                    damage = damage*2;
                    System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！\n",getName(),opponent.getName(),damage);
                }
                else {
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
                }
                opponent.wounded(damage);
            }
        }
    }

    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}

