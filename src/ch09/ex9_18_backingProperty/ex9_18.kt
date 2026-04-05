package ch09.ex9_18_backingProperty

//class Person(val name: String) {
//    private var _emails: List<Email>? = null //데이터를 저장하고 emails의 위임 프로퍼티 역할을 하는 _emails 프로퍼티
//
//    val emails: List<Email>
//        get() {
//            if (_emails == null) {
//                _emails = loadEmails(this) //최초 접근 시 이메일을 가져온다
//            }
//            return _emails!! //저장해 둔 데이터가 있으면 그 데이터를 반환한다.
//        }
//}
//
//fun main() {
//    val p = Person("Alice")
//    p.emails //최초로 emails를 읽을 때 단 한 번만 이메일을 가져온다.
//    // Loading emails for Alice
//    p.emails
//    //
//}