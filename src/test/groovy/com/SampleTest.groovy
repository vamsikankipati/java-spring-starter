package com

import com.org.list.SortArray
import groovy.json.JsonSlurper

import java.nio.file.Files
import java.nio.file.Paths

class SampleTest extends BaseTest {

    SortArray array
    int[] dataset
    List<Integer> largeList

    def setup() {
        array = new SortArray()
        def filePath = "src/test/resources/data/large_arrays_dataset.json"
        def jsonContent = new String(Files.readAllBytes(Paths.get(filePath)))
        // Parse the JSON content
        def jsonSlurper = new JsonSlurper()
        dataset = jsonSlurper.parseText(jsonContent)
        largeList = Arrays.asList(dataset)
    }

    def "collection sort - small" () {
        when:
        List<Integer> sorted = array.sort(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1))
        then:
        sorted == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }

    def "collections sort - large" () {
        when:
        List<Integer> sorted = array.sort(largeList)
        then:
        sorted != null
    }

    def "collections parallel sort - large" () {
        when:
        List<Integer> sorted = array.parallelSort(dataset)
        then:
        sorted != null
    }

    def "stream sort - large" () {
        when:
        List<Integer> sorted = array.streamSort(largeList)
        then:
        sorted != null
    }

    def "parallel stream sort - large" () {
        when:
        List<Integer> sorted = array.parallelStreamSort(largeList)
        then:
        sorted != null
    }
}
