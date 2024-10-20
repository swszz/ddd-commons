package org.github.swszz.ddd4k

interface Identity<T : Any> {
    fun getId(): T
}