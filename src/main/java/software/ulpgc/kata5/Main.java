package software.ulpgc.kata5;

import software.ulpgc.kata5.control.HistogramControl;
import software.ulpgc.kata5.io.FileTitleLoader;
import software.ulpgc.kata5.io.TitleLoader;
import software.ulpgc.kata5.io.TsvTitleDeserializer;
import software.ulpgc.kata5.model.Title;
import software.ulpgc.kata5.view.HistogramDisplay;
import software.ulpgc.kata5.view.JFreeChartHistogramDisplay;
import software.ulpgc.kata5.viewmodel.Histogram;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("title.basics.tsv");

        TitleLoader loader = new FileTitleLoader(file, new TsvTitleDeserializer());
        List<Title> titles = loader.load();

        HistogramControl control = new HistogramControl();

        Histogram<String> histogram = control.build(titles, Title::getTitleType);

        HistogramDisplay display = new JFreeChartHistogramDisplay(histogram);
        display.display();
    }
}
