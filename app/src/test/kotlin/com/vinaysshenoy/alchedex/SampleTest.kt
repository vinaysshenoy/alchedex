package com.vinaysshenoy.alchedex

import org.amshove.kluent.shouldBeTrue
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

/**
 * Created by vinaysshenoy on 24/12/17.
 */
object SampleTest: Spek({

  describe("A value") {
    val value = 10

    on("Comparing with an equal value") {

      it("should be true") {
        (value == 10).shouldBeTrue()
      }
    }
  }
})