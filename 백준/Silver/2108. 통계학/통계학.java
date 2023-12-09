import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }
        List<Integer> temp = numbers;
        Collections.sort(numbers);
        List<Integer> sortedList = numbers;
        numbers = temp;

        System.out.println(calculateAverage(numbers));
        System.out.println(calculateMedian(sortedList));
        System.out.println(findMostFrequencyValue(sortedList.toArray(Integer[]::new)));
        System.out.println(calculateRange(sortedList));
    }

    private static long calculateAverage(List<Integer> numbers) {
        int total = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        Double avg = (double) total / (double) numbers.size();

        return Math.round((avg * 100) / 100.0);
    }

    private static int calculateMedian(List<Integer> numbers) {
        int median = (int) (numbers.size() / 2 + 0.5);

        return numbers.get(median);
    }

    private static int findMostFrequencyValue(Integer[] numbers) {
        // 최빈값이 여러 개일 경우 두 번째로 작은 수를 리턴해야 하기 때문에 오름차순 정렬되어 있는 배열을 전달받음
        // 왜냐하면 작은 수가 큰 수보다 더 빨리 발견되기 때문
        int max = Integer.MIN_VALUE;
        int count = 1;
        int mode = numbers[0];
        boolean isFoundValue = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (Objects.equals(numbers[i], numbers[i + 1])) {
                // 주어진 리스트는 오름차순 정렬된 리스트니까 같은 값이 옆에 위치해 있음
                // 따라서 바로 옆에 있는 값이 같은지 확인하면 됨
                count++;
            } else {
                // 옆에 있는 값이 같지 않다면
                // 지금까지 발견되던 수와 다른 수니까 count를 1으로 초기화
                count = 1;
            }

            if (count > max) {
                // 지금까지의 최빈값보다 더 많이 조사된 값이 있는 순간
                // 최빈값을 교체함과 동시에
                // 최빈값을 계산하는 지표인 '얼마나 조사되었는가'를 나타내는 값도 동시에 교체
                max = count;
                mode = numbers[i];
                isFoundValue = true;
                // 최빈값이 발견되어 있는 상태라는 것을 표기
                // 그러므로 이후 빈도수가 같은 값이 발견되면 그 값은 두 번째 최빈값이라는 말
            } else if (max == count && isFoundValue) {
                // 빈도수가 같을 때, 최빈값이 발견되어 있는 상태라는 걸 표기해 둔 상태라면 지금 발견된 최빈값은 두 번째 최빈값
                mode = numbers[i];
                isFoundValue = false;
                // 두 번째 최빈값을 저장했으니 boolean형 변수를 false로 바꾸면 이제 그 이후로 발견되는 최빈값은 저장하지 않음
            }
        }

        return mode;
    }

    private static int calculateRange(List<Integer> numbers) {
        return numbers.get(numbers.size() - 1) - numbers.get(0);
    }

}