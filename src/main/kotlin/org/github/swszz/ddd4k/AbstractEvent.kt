package org.github.swszz.ddd4k

import java.time.ZonedDateTime

abstract class AbstractEvent(
    val occurred: ZonedDateTime = ZonedDateTime.now()
) : Event {
    override fun occurredOn(): ZonedDateTime {
        return this.occurred
    }
}