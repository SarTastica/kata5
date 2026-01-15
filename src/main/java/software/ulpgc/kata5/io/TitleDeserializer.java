package software.ulpgc.kata5.io;

import software.ulpgc.kata5.model.Title;

public interface TitleDeserializer {
    Title deserialize(String line);
}

