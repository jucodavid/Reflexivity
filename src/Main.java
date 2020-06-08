import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Class c = String.class;
		Class c2 = new String().getClass();
		
		System.out.println("La supercalsse de la classe " +String.class.getName()+ " est : " +String.class.getSuperclass());
		
		Class[] faces = c.getInterfaces();
		System.out.println("Il y a " +faces.length+ " interfaces implémentées");
		for(int i = 0; i < faces.length; i++)
			System.out.println(faces[i]);
		
		Method[] m = c.getMethods();
		System.out.println("Il y a " +m.length+ " méthodes dans cette classe");
		for(int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
			
			Class[] p = m[i].getParameterTypes();
			for(int j = 0; j< p.length; j++)
				System.out.println(p[j].getName());
			System.out.println("---------------------------\n");
		}
		
		Field[] f = c.getDeclaredFields();
		
		System.out.println("Il y a " +f.length+ " champs dans cette classe");
		for(int i = 0; i < f.length; i++)
			System.out.println(f[i].getName());
		
		Constructor[] construc = c.getConstructors();
		System.out.println("Il y a " +construc.length+ " constructeurs dans cette calsse");
		for(int i = 0; i < construc.length; i++) {
			System.out.println(construc[i].getName());
			Class[] param = construc[i].getParameterTypes();
			for(int j = 0; j < param.length; j++)
				System.out.println(param[j]);
			System.out.println("---------------------------\n");
		}

	}

}
