package com.morph.mbmgerman.db

import com.morph.mbmgerman.db.entity.Word
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WordRepository : JpaRepository<Word, Long> {
}