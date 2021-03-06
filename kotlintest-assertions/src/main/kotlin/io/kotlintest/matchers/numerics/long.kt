package io.kotlintest.matchers.numerics

import io.kotlintest.Matcher
import io.kotlintest.Result
import io.kotlintest.matchers.gt
import io.kotlintest.matchers.gte
import io.kotlintest.matchers.lt
import io.kotlintest.matchers.lte
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.shouldNot
import io.kotlintest.shouldNotBe

fun Long.shouldBeEven() = this should lbeEven()
fun Long.shouldNotBeEven() = this shouldNot lbeEven()
fun lbeEven() = object : Matcher<Long> {
  override fun test(value: Long): Result =
      Result(value % 2 == 0L, "$value should be even", "$value should be odd")
}

fun Long.shouldBeOdd() = this should lbeOdd()
fun Long.shouldNotBeOdd() = this shouldNot lbeOdd()
fun lbeOdd() = object : Matcher<Long> {
  override fun test(value: Long): Result =
      Result(value % 2 == 1L, "$value should be odd", "$value should be even")
}

fun Long.shouldBeLessThan(x: Long) = this shouldBe lt(x)
fun Long.shouldNotBeLessThan(x: Long) = this shouldNotBe lt(x)

fun Long.shouldBeLessThanOrEqual(x: Long) = this shouldBe lte(x)
fun Long.shouldNotBeLessThanOrEqual(x: Long) = this shouldNotBe lte(x)

fun Long.shouldBeGreaterThan(x: Long) = this shouldBe gt(x)
fun Long.shouldNotBeGreaterThan(x: Long) = this shouldNotBe gt(x)

fun Long.shouldBeGreaterThanOrEqual(x: Long) = this shouldBe gte(x)
fun Long.shouldNotBeGreaterThanOrEqual(x: Long) = this shouldNotBe gte(x)
