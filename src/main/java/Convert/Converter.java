package Convert;

public interface Converter<S,T> {
    T convert(S source);
}
