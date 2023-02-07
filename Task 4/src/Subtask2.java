import java.util.Random;
import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

	public class Subtask2 {

	private static final int COUNT_OF_NUMBERS = 100;

	public static void main(String[] args) {
	Random random = new Random();
	File file = new File("random_numbers.txt");
	int[] randomNumbers = new int[COUNT_OF_NUMBERS];

	for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
	randomNumbers[i] = random.nextInt(100);
	}

	Arrays.sort(randomNumbers);

	try (FileWriter writer = new FileWriter(file)) {
	for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
	writer.write(randomNumbers[i] + " ");
	}
	} catch (IOException e) {
	e.printStackTrace();
	}

	}
	}



