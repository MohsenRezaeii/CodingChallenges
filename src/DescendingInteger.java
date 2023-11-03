import java.util.stream.IntStream;

public class DescendingInteger {
    public static int sortDesc(final int num) {
        IntStream st = String.valueOf(num).chars()
                .map(Character::getNumericValue).boxed()
                .sorted((n1, n2) -> Integer.compare(n2, n1))
                .mapToInt(Integer::intValue);
        StringBuilder resultString = new StringBuilder();
        st.forEach(i -> resultString.append(i));
        return Integer.valueOf(resultString.toString());
    }

    //    Alternative:
//    public static int sortDesc(final int num) {
//        return Integer.parseInt(String.valueOf(num)
//                .chars()
//                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.joining()));
//    }

    public static void main(String[] args) {
        int sss = DescendingInteger.sortDesc(104);
        System.out.println(sss);
    }
}
