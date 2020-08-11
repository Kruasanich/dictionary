package com.hormunkuk.project.dictionary.dao

import groovy.transform.Immutable

/**
 * This class shows direction of translation.
 */
@Immutable
class TranslationDirection {
    /**
     * It is the language which from is going translation.
     */
    Language from

    /**
     * It is the destination language.
     */
    Language to
}