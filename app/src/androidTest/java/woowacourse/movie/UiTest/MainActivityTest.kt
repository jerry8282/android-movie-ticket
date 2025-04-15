package woowacourse.movie.UiTest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import woowacourse.movie.MainActivity
import woowacourse.movie.R

class MainActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun `목록은_영화_제목을_가진다`() {
        onView(withId(R.id.movie_title))
            .check(matches(withText("해리 포터와 마법사의 돌")))
    }

    @Test
    fun `목록은_영화_상영일을_가진다`() {
        onView(withId(R.id.movie_date))
            .check(matches(withText("상영일: 2025.4.1")))
    }

    @Test
    fun `목록은_영화_러닝타임을_가진다`() {
        onView(withId(R.id.movie_time))
            .check(matches(withText("러닝타임: 152분")))
    }

    @Test
    fun `목록은_예매_버튼을_가진다`() {
        onView(withId(R.id.reserve_button))
            .check(matches(withText("지금 예매")))
    }
}