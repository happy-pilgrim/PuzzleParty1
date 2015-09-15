import java.util.*;
class Puzzle2 {

	//the point is to input the right value IN THE RIGHT ORDER
	//reorganizing the string should give you the episode name, as well as pointing out the order of the values
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> els = new ArrayList<String>();
		String in;
		double h2o = 0, c = 0, nh3 = 0, cao = 0, p = 0, nacl = 0, kno3 = 0, s = 0, fl = 0, fe = 0, si = 0;		
		int which = 0;
		ArrayList<String> cards = new ArrayList<String>();
		String order = "";

		els.add("H2O");	els.add("C"); els.add("NH3"); els.add("CaO"); els.add("P");	els.add("NaCl"); els.add("KNO3"); els.add("S");	els.add("F"); els.add("Fe"); els.add("Si");
		Collections.shuffle(els);
		cards.add("first"); cards.add("second"); cards.add("third"); cards.add("fourth"); cards.add("fifth"); cards.add("sixth"); cards.add("seventh"); cards.add("eighth"); cards.add("ninth"); cards.add("tenth"); cards.add("eleventh");
		cards.add("next"); cards.add("next"); cards.add("next"); cards.add("next"); 
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\tWILL WHO THOSE CHALLENGE COMPONENTS OUR KNOWN BE SUN TO THE");
		System.out.println();
		System.out.println("\tType \"Ctrl+C\" to exit.");
		System.out.println();

		do {
			System.out.println("\tWhich one " + cards.get(which) + "?");
			System.out.print("\t|");
			for(String el:els) {
				System.out.print("| " + el + " |");
			}
			System.out.println("|");
			System.out.print("\t\t>");
			in = scan.next().trim();
			in = in.trim();


			if(els.contains(in)) {
				System.out.println("\tValue?");
				System.out.print("\t\t>");
				
				try {
					switch(in) {
						case "H2O":
							h2o = scan.nextDouble();
							break;
						case "C":
							c = scan.nextDouble();
							break;
						case "NH3":
							nh3 = scan.nextDouble();
							break;
						case "CaO":
							cao = scan.nextDouble();
							break;
						case "P":
							p = scan.nextDouble();
							break;
						case "NaCl":
							nacl = scan.nextDouble();
							break;
						case "KNO3":
							kno3 = scan.nextDouble();
							break;
						case "S":
							s = scan.nextDouble();
							break;
						case "F":
							fl = scan.nextDouble();
							break;
						case "Fe":
							fe = scan.nextDouble();
							break;
						case "Si":
							si = scan.nextDouble();
							break;
						default:
							break;
					}
					els.remove(in);
					order += in;
					which++;
				}
				catch(InputMismatchException e) {
					System.out.println();
					System.out.println("\tBad input.");
					scan.next().trim();
				}
			}
			else {
				System.out.println();
				System.out.println("\tChoose one from the list.");
			}
		} while(!els.isEmpty());

		if(order.toUpperCase().equals("NH3SKNO3FCH2OPCaOSiNaClFe".toUpperCase()))
		if(h2o==35)
		if(c==20)
		if(nh3==4)
		if(cao==1.5)
		if(p==800)
		if(nacl==250)
		if(kno3==100)
		if(s==80)
		if(fl==7.5)
		if(fe==5)
		if(si==3) {
			System.out.println("\tThe key is Magnum opus");
			return;
		}
		System.out.println("\tWrong.");
	}



}
