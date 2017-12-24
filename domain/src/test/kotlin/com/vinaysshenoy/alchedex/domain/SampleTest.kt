package com.vinaysshenoy.alchedex.domain

import org.amshove.kluent.`should be true`
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

/**
 * Created by vinaysshenoy on 24/12/17.
 */
object SampleTest : Spek({

  describe("A test value") {
    val value = 10

    on("Comparing it to an equal value") {
      it("should be true") {
        (value == 10).`should be true`()
      }
    }
  }
})