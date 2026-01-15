package software.ulpgc.kata4.control;

import software.ulpgc.kata4.model.Title;
import software.ulpgc.kata4.viewmodel.Histogram;

import java.util.List;
import java.util.function.Function;

public class HistogramControl {
    public <T> Histogram<T> build(List<Title> titles, Function<Title, T> attribute) {
        Histogram<T> histogram = new Histogram<>();
        for (Title title : titles) {
            histogram.increment(attribute.apply(title));
        }
        return histogram;
    }
}
