package com.morph.mbmgerman.db.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "words")
data class Word(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    override val id: Long,

    var article: String?,
    var word: String,
    var plural: String?,
    var translation: String,
    var partOfSpeech: String?,

    var repeatingLevel: Short = 1,
    var learningLevel: Short = 0,

    var lastTryDate: LocalDate?,
    var lastTryResult: Boolean = false,
    var nextTryDate: LocalDate? = LocalDate.now(),

) : MbmEntity() {

}