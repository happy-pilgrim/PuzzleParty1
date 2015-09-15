import java.util.Scanner;

class Lock {

	public static void main(String[] args) throws InterruptedException {

		Scanner scan = new Scanner(System.in);

		printLock("locked");
	
		System.out.print("\t>");
	
		if(scan.nextLine().trim().toUpperCase().equals("Magnum opus".toUpperCase())) {
				printLock("unlocked");
				for(char c: "https://sites.google.com/site/kghfcvjxchgvkytr65dci/098234hg798h43".toCharArray()) {
					System.out.print(c);
					Thread.sleep(50);
				}
				System.out.println();
				System.out.println();
		}
		else {
				printLock("locked");
		}

	}

	private static void printLock(String l) {
		if(l.equals("locked")) {
			System.out.println("                   ");
			System.out.println("      ______       ");
			System.out.println("     /      \\      ");
			System.out.println("    |        |     ");
			System.out.println("    |        |     ");
			System.out.println("    |  a&&a   |     ");
			System.out.println("    AGGGGGGGGA     ");
			System.out.println("   GGGooooooGGG    ");
			System.out.println("  GGGooo  oooGGG   ");
			System.out.println("  GGGoo    ooGGG   ");
			System.out.println("  GGGooo  oooGGG   ");
			System.out.println("  GGGGoo  ooGGGG   ");
			System.out.println("   GGGGooooGGGG    ");
			System.out.println("     ^GGGGGG^       ");
			System.out.println("                   ");
		}
		else if(l.equals("unlocked")) {
				System.out.println("                         ");
				System.out.println("                         ");
				System.out.println("              ______     ");
				System.out.println("             /      \\    ");
				System.out.println("             |      |    ");
				System.out.println("             |      |    ");
				System.out.println("    |  a&&a  |           ");
				System.out.println("    AGGGGGGGGA           ");
				System.out.println("   GGGooooooGGG          ");
				System.out.println("  GGGooo  oooGGG         ");
				System.out.println("  GGGoo    ooGGG         ");
				System.out.println("  GGGooo  oooGGG         ");
				System.out.println("  GGGGoo  ooGGGG         ");
				System.out.println("   GGGGooooGGGG          ");
				System.out.println("     ^GGGGGG^             ");
				System.out.println("                         ");
		}
		else {
			throw new IllegalArgumentException();
		}

	}


}
