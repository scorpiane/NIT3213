package com.example.final_assignment.models

import org.junit.Assert.assertEquals
import org.junit.Test

class EntityDetailsTest {

    @Test
    fun testEntityDetails() {
        val entity = EntityDetails(
            artworkTitle = "Starry Night",
            artist = "Vincent van Gogh",
            medium = "Oil on Canvas",
            year = 1889,
            description = "A famous painting by Vincent van Gogh."
        )

        assertEquals("Starry Night", entity.artworkTitle)
        assertEquals("Vincent van Gogh", entity.artist)
        assertEquals("Oil on Canvas", entity.medium)
        assertEquals(1889, entity.year)
        assertEquals("A famous painting by Vincent van Gogh.", entity.description)
    }
}
