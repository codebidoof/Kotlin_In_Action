package ch08.ex8_9_DataParser;

import java.util.List;

interface DataParser <T>{
    void parseData(
            String input,
            List<T> output,
            List<String> errors
    );

}