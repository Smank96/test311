import java.io.*;
import java.util.*;

public class Main {
	/*
	* Дано: n - число элементов в строке
	*		s - строка
	* 		2 <= n <= 10e6
	*		s[i]= {UD}
	* Эта строка описывает движение человека с уровня 0. D - шаг вниз; U - шаг вверх.
	* Человек прошел долину, если спустился вниз и вернулся на уровень 0.
	* Вывести число долин на пути следования.
	* Пример:
	* 8
	* UDDDUDUU
	* 1
	*
	*_/\      _
	*   \    /
  	*    \/\/
	*/

    static int func1(String s) {
        char[] array = s.toCharArray();

        int steps = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++)
        {
            int prev = steps;
            if (array[i] == 'D')
            {
                steps--;
            }
            else
            {
                steps++;
            }
            if (steps == 0 & prev == -1)
            {
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt")); //System.getenv("OUTPUT_PATH")

        String s = scanner.nextLine();

        int result = func1(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}