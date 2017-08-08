
public abstract class Duck {
	Flybehavior flybehavior;//����ä��� Flybehavior
	Quackbehavior quackbehavior;//����ä��� Quackbehavior
	void performQuack(){
		quackbehavior.quack();
	}
	void performFly(){
		flybehavior.fly();
	}
	void setquackBehavior(Quackbehavior qb){
		quackbehavior = qb; 
	}
	void swim(){		System.out.println("I'm swimming");
	}
	abstract void display();
}
