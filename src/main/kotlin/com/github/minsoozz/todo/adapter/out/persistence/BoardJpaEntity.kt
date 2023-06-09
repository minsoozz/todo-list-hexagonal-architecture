package com.github.minsoozz.todo.adapter.out.persistence

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class BoardJpaEntity(
    title: String,
    content: String,
    id: Long?
) {
    @Id
    @GeneratedValue
    var id: Long? = id

    @Column(nullable = false)
    var title: String = title

    @Column(nullable = false)
    var content: String = content
}

