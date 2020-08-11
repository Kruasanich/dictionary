package com.hormunkuk.project.dictionary.dao

import groovy.transform.Immutable

/**
 * This class describe the language in which the word is written.
 */
@Immutable
class Language {
    /**
     * The name of language.
     */
    String name

    /**
     * The locale of the language.
     */
    Locale locale
}