package ch04.secondary_constructor

import java.net.URI

open class DownLoader {
    constructor(uri: String?) {

    }
    constructor(uri: URI?) {

    }
}
class MyDownLoader: DownLoader {
    constructor(uri: String?): this(URI(uri)) {

    }
    constructor(uri: URI?): super(uri) { //상위 클래스 생성자에 위임

    }
}