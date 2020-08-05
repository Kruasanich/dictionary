package com.hormunkuk.project.dictionary.dao

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Word(
        @Id
        val id: String?,
        val Language: Language,
        val name: String,
        val translations: Set<Word>
)