package com.morph.mbmgerman.db.entity

import jakarta.persistence.*

@Entity
@Table(name = "test")
data class Test(
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    val id: Long,
    var name: String?
) {
}