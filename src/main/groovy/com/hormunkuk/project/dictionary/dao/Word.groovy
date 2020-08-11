package com.hormunkuk.project.dictionary.dao

import groovy.transform.Immutable
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * This class describe a word which we can translate or use us translation.
 */
@Document
@Immutable
class Word {
    /**
     * Identifier of the word.
     */
    @Id
    String id
    /**
     * The language in which the word is written.
     */
    Language language
    /**
     * The name of this word.
     */
    String name
    /**
     * The display name which we can show on the page.
     */
    String displayName
}