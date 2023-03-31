import java.util.Random;

public class Util {

	// Converts int[] to String with optional spacing
	public String ArrayToString(int[] arr, String... str) {
		String line = "";
		String split;

		split = str.length == 0 ? "" : str[0];

		for (int i = 0; i < arr.length; i++) {
			line += Integer.toString(arr[i]);
			if (i < arr.length - 1) {
				line += split;
			}
		}

		return line;
	}

	// Converts String[] to String with optional spacing
	public String ArrayToString(String[] arr, String... str) {
		String line = "";
		String split;

		split = str.length == 0 ? "" : str[0];

		for (int i = 0; i < arr.length; i++) {
			line += arr[i];
			if (i < arr.length - 1) {
				line += split;
			}
		}

		return line;
	}

	// Converts double[] to String with optional spacing
	public String ArrayToString(double[] arr, String... str) {
		String line = "";
		String split;

		split = str.length == 0 ? "" : str[0];

		for (int i = 0; i < arr.length; i++) {
			line += Double.toString(arr[i]);
			if (i < arr.length - 1) {
				line += split;
			}
		}

		return line;
	}

	// Converts char[] to String with optional spacing
	public String ArrayToString(char[] arr, String... str) {
		String line = "";
		String split;

		split = str.length == 0 ? "" : str[0];

		for (int i = 0; i < arr.length; i++) {
			line += arr[i];
			if (i < arr.length - 1) {
				line += split;
			}
		}

		return line;
	}

	// Converts int[][] to String[] with optional spacing
	public String[] Array2StringArr(int[][] arr, int mX, int mY, String... str) {
		String line[] = new String[mY];
		String split;

		split = str.length == 0 ? "" : str[0];

		int x, y;

		for (y = 0; y < mY; y++) {
			line[y] = "";
			for (x = 0; x < mX; x++) {
				line[y] += Integer.toString(arr[y][x]) + split;
			}
		}

		return line;
	}

	// Converts double[][] to String[] with optional spacing
	public String[] Array2StringArr(double[][] arr, int mX, int mY, String... str) {
		String line[] = new String[mY];
		String split;

		split = str.length == 0 ? "" : str[0];

		int x, y;

		for (y = 0; y < mY; y++) {
			line[y] = "";
			for (x = 0; x < mX; x++) {
				line[y] += Double.toString(arr[y][x]) + split;
			}
		}

		return line;
	}

	// Converts String[][] to String[] with optional spacing
	public String[] Array2StringArr(String[][] arr, int mX, int mY, String... str) {
		String line[] = new String[mY];
		String split;

		split = str.length == 0 ? "" : str[0];

		int x, y;

		for (y = 0; y < mY; y++) {
			line[y] = "";
			for (x = 0; x < mX; x++) {
				line[y] += arr[y][x] + split;
			}
		}

		return line;
	}

	// Converts char[][] to String[] with optional spacing
	public String[] Array2StringArr(char[][] arr, int mX, int mY, String... str) {
		String line[] = new String[mY];
		String split;

		split = str.length == 0 ? "" : str[0];

		int x, y;

		for (y = 0; y < mY; y++) {
			line[y] = "";
			for (x = 0; x < mX; x++) {
				line[y] += arr[y][x] + split;
			}
		}

		return line;
	}

	// Fills an int[] with random numbers (includes negative numbers)
	// Min and max and be swapped
	public int[] FillArray(int[] arr, int... boundIn) {
		Random random = new Random();

		int bound = 0;
		int min = 0, max = 0;

		if (boundIn.length == 0) {
			bound = 256;
		} else if (boundIn.length == 1) {
			bound = boundIn[0] + 1;
			bound *= bound < 0 ? -1 : 1;
		} else {
			if (boundIn[0] > boundIn[1]) {
				min = boundIn[1];
				max = boundIn[0];
			} else {
				min = boundIn[0];
				max = boundIn[1];
			}
			bound = max - min + 1;
			bound *= bound < 0 ? -1 : 1;
		}

		int x;

		for (x = 0; x < arr.length; x++) {
			arr[x] = random.nextInt(bound);
			arr[x] += boundIn.length > 1 ? min : 0;
			arr[x] *= boundIn.length == 1 && boundIn[0] < 0 ? -1 : 1;
			arr[x] *= boundIn.length > 1 && bound < 0 ? -1 : 1;
		}

		return arr;
	}

	// Returns the absolute value of an int
	public int ABS(int num) {
		num *= num < 0 ? -1 : 1;
		return num;
	}

	public void print(String... str) {
		if (str.length == 0) {
			System.out.print("null");
		} else {
			System.out.print(ArrayToString(str));
		}
	}

	public void println(String... str) {
		if(str.length == 0){
			System.out.println();
		} else {
			System.out.println(ArrayToString(str));
		}
	}
}
