package com.hormunkuk.project.dictionary.dao

import groovy.transform.Immutable

/**
 * This class describe the word usage.
 */
@Immutable
class WordExample {
    /**
     * The word for which examples are indicated.
     */
    Word word

    /**
     * All examples.
     */
    Set<String> examples
}
