package com

class SampleTest extends BaseTest {

    def "test 1" () {
        given:
        def a = 0
        when:
        def b = a * 2
        then:
        a == b
    }
}
