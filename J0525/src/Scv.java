
public class Scv extends GroundUnit{

	Scv(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(GroundUnit g) {
		while(g.hitPoint != g.MAX_HP) {
			g.hitPoint++;
		}
	}
}
