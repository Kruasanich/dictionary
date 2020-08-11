package com.hormunkuk.project.dictionary.dao


import groovy.transform.Immutable

/**
 * Card describe word and translation options.
 * Card has translation direction. Here you can see what language do you translate into.
 */
@Immutable
class Card {
    /**
     * Translation direction show you what language do you translate into.
     */
    TranslationDirection translateDirection

    /**
     * The word we translate.
     */
    Word word

    /**
     * All translation of this word.
     */
    Set<Word> translation
}