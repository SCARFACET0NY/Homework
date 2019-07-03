import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamUtils {
    public static String addOddSerialNumber(List<String> list) {
        AtomicInteger counter = new AtomicInteger(1);
        return list.stream().map(name -> counter.getAndAdd(2) + ". " + name).collect(Collectors.joining(", "));
    }

    public static List<String> convertToUppercaseAndSortAsc(List<String> list) {
        return list.stream().map(String::toUpperCase).sorted().collect(Collectors.toList());
    }

    public static List<String> splitCollectionElementByComma(List<String> list) {
        return list.stream().flatMap(Pattern.compile(", ")::splitAsStream).collect(Collectors.toList());
    }

    public static LongStream createInfiniteStreamOfRandomNumbers(long seed, long a, long c, long m) {
        return LongStream.iterate(seed, i -> (a * i + c) % m);
    }

    public static <T> Stream<T> combineTwoStreams(Stream<T> left, Stream<T> right) {
        Spliterator<T> splLeft = left.spliterator();
        Spliterator<T> splRight = right.spliterator();

        T[] single = (T[]) new Object[1];

        Stream.Builder<T> builder = Stream.builder();

        while (splRight.tryAdvance(x -> single[0] = x) && splLeft.tryAdvance(builder)) {
            builder.add(single[0]);
        }

        return builder.build();
    }

    public static void main(String[] args) {}
}
