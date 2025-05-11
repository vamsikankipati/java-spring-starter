package com

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.TestPropertySource
import spock.lang.Specification

@SpringBootTest
@ContextConfiguration
@TestPropertySource(locations = "classpath:application.yaml")
class BaseTest extends Specification {
}
