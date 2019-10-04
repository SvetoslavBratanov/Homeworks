package nestedClasses;
import java.security.Permission;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Traktor t = new Traktor();
		Traktor.Engine e = new Traktor.Engine();
		Traktor.Engine me = new MotornaLodka.Engine();
		System.out.println(e.broiButala);
		System.out.println(e.x + "\n");
		System.out.println(me.broiButala);
		System.out.println(me.x);
		Piqnica peshoPiqndeto = new Piqnica("Rusnak");
		System.out.println(peshoPiqndeto.piene);

	}

	static void vecherqm(int kolkoShteIzqm) {
		
		 String vecherq = "PileSOriz";
		 int x = 5;

		class VkusnaVecherq   {
			public VkusnaVecherq() {
				System.out.println(x);
				System.out.println(vecherq);
			}
		}

		//vecherq -> effectively final
		System.out.println(vecherq);
		//vecherq = "Musaka";// vecherq ne e final promenliva
		
		VkusnaVecherq v = new VkusnaVecherq();

	}

}
