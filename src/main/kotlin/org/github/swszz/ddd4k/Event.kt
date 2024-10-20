package org.github.swszz.ddd4k

import java.time.ZonedDateTime

interface Event {
    fun occurredOn(): ZonedDateTime
}