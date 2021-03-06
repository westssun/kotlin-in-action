package chapter3_함수_정의와_호출._6_문자열과_정규식

/*
3중 따옴표 문자열을 문자열 이스케이프를 피하기 위해서만 사용하지 않는다.
3중 따옴표 문자열에는 줄 바꿈을 표현하는 아무 문자열이나 그대로 들어간다.
따라서 3중 따옴표를 쓰면 줄 바꿈이 들어있는 프로그램 텍스트를 쉽게 문자열로 만들 수 있다.
 */

fun main() {
    // 여러줄 문자열 = 3중 따옴표 문자열
    // 들여쓰기, 줄바꿈 등 포함한 모든 문자가 들어간다.
    /*
    결과
    | //
                   .| //
                   .|/ \
     */
    val kotlinLogo = """| //
                   .| //
                   .|/ \"""
    println(kotlinLogo)
}