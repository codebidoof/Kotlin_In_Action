package ch08.ex8_8_FileIndexer;

import java.io.File;
import java.util.List;

interface FileContentProcessor {
    void processContents(
            File path,
            byte[] binaryContents,
            List<String> textContents
    );
}
