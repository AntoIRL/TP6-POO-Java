package tp_algo_base_java;

public class Tp6 {

	public static void afficher(int t[]) {
		for (int i=0; i<t.length; i++)
			System.out.print(t[i]+" ");
		System.out.println("");
	}

	public static void afficherA(int t[], int a) {
		if (0<=a && a<t.length)
			System.out.println(t[a]);
		else {
			System.err.println("afficher(int t[], int a)"
					+ "\n Usage: 0<=a<t.length");		
		}
	}

	public static void afficherAB(int t[], int a, int b) {
		if (!(0<=a && a<t.length))
			System.err.println("afficher(int t[], int a, int b)"
					+ "\n Usage: 0<=a<t.length");
		else if (!(0<=b && b<t.length))
			System.err.println("afficher(int t[], int a, int b)"
					+ "\n Usage: 0<=b<t.length");
		else {
			for (int i=a; i<=b; i++)
				System.out.println(t[i]+ " ");
		}
	}

	public static String concatener(String t[]) {
		String res="";
		for (int i=0; i<t.length; i++)
			res += t[i];
		return res;
	}

	public static boolean appartient(int t[], int x) {
		for (int i=0; i<t.length; i++)
			if (x==t[i]) return true;
		return false;
	}

	public static boolean nonAppartient(int t[], int x) {	
		return !appartient(t, x);
	}

	public static boolean appartient2(int t1[], int t2[], int x) {
		return appartient(t1, x) && appartient(t2, x);
	}

	public static boolean appartient3(int t1[], int t2[], int x) {
		return appartient(t1, x) && nonAppartient(t2, x);
	}

	public static boolean appartient4(int t1[], int t2[], int t3[], int x) {
		return appartient(t1, x) && (appartient(t2, x)||appartient(t3, x));
	}

	public static void main(String[] args) {
		int t[] = new int[10];
		afficher(t);
		int t2[] = {1,2,3,4,5};
		afficher(t2);

		afficherA(t2, 10);
		afficherA(t2, 1);

		afficherAB(t2, -1, 4);
		afficherAB(t2, 1, 40);
		afficherAB(t2, 1, 4);

		String t3[] = {"un", "deux", "trois", "quatre"};
		System.out.println(concatener(t3));
		
		int t4[] = {2,4,6};
		
		System.out.println(appartient(t4, 4));
		System.out.println(appartient(t4, 5));
		System.out.println(nonAppartient(t4, 5));
		System.out.println(nonAppartient(t4, 4));
		
		System.out.println(appartient2(t2, t4, 4));
		System.out.println(appartient2(t2, t4, 5));
		
		System.out.println(appartient3(t2, t4, 4));
		System.out.println(appartient3(t2, t4, 5));
		
		System.out.println(appartient4(t2, t4, t, 6));
		System.out.println(appartient4(t2, t4, t, 2));
	}

}
