package org.github.swszz.ddd4k

abstract class LongId(value: Long) : AbstractId<Long>(value = value) {
    override fun validate() {
        require(value = super.value >= 0) { "Id of type Long cannot be less than 0." }
    }
}