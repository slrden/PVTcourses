
public class Massive {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int k = args.length;
		try {
			int result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("wda");
			try {
				a = 1;
				b = 0;
				try {
					int result = a / b;
				} catch (ArithmeticException с) {
					System.out.println("Ytdthuj");
				}
				finally {
					System.out.println("Do somethig");
				}

				String[] Names = { "Андрей", "Степан", "Егор" };
				Names[5] = "Вася";
			} catch (ArrayIndexOutOfBoundsException с) {
				System.out.println("Нет такого имени");
			} catch (ArithmeticException с) {
				System.out.println("Ytdthuj");
			}
		}
		try {
			int l = 42 / a;
			int z[] = { 1 };
			z[42] = 99;

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException c) {
			System.out.println("Ytdtwsddwhuj");

		}

	}
}
