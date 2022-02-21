package generics;

public class TreedPrinterTest {

	public static void main(String[] args) {
		
		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		Powder powder = (Powder)printer.getMaterial();
		System.out.println(printer);
		
		
		TreeDPrinter<Plastic> printerplastic = new TreeDPrinter<Plastic>();
		printerplastic.setMaterial(new Plastic());
		Plastic plastic = (Plastic)printerplastic.getMaterial();
		System.out.println(printerplastic);
		
		
//		TreeDPrinter<Water> printWater = new TreeDPrinter<Water>(); TreeDPrinter클래스에서 Material을 상속하는 클래스들만 사용할 수 있게 선언했음
//		printWater.setMaterial(new Water());
//		System.out.println(printWater);
		
		printerplastic.printing();
		
	}

}
