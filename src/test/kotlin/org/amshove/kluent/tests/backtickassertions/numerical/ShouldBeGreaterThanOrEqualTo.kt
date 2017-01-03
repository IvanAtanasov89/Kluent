package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should be greater than or equal to`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeGreaterThanOrEqualTo : Spek({
    given("the `should be greater or equal than` method") {
        on("passing a greater value") {
            it("should pass") {
                5 `should be greater than or equal to` 2
            }
        }
        on("passing an equal value") {
            it("should pass") {
                5 `should be greater than or equal to` 5
            }
        }
        on("passing a lesser value") {
            it("should fail") {
                assertFails({ 2 `should be greater than or equal to` 5 })
            }
        }
    }
})
