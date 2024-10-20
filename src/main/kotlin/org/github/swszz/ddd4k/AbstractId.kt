package org.github.swszz.ddd4k

abstract class AbstractId<T : Any>(
    val value: T
) : Identity<T> {
    init {
        this.validate()
    }

    @Throws(IllegalArgumentException::class)
    abstract fun validate()
}