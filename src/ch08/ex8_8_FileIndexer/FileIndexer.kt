package ch08.ex8_8_FileIndexer

import java.io.File

class FileIndexer: FileContentProcessor {
    override fun processContents(
        path: File?,
        binaryContents: ByteArray?,
        textContents: List<String>?
    ) {
        // ...
    }
}