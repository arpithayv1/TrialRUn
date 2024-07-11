package com.example.trialrun

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.recyclerview.widget.RecyclerView

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testRecyclerViewIsDisplayed() {
        // Check if RecyclerView is displayed
        onView(withId(R.id.recyclerView)).check(matches(isDisplayed()))
    }

    @Test
    fun testRecyclerViewItemClick() {
        // Scroll to a specific position in RecyclerView and perform a click
        onView(withId(R.id.recyclerView))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                    2,
                    click()
                )
            )

        // Here you could add checks for actions that should happen after clicking the item
        // onView(withId(R.id.detailView)).check(matches(isDisplayed()))
    }

    @Test
    fun testTypeTextInEditText() {
        // Type text (this will work even without a real EditText)
        onView(withText("ABC")) // Replace with any existing text view
            .perform(replaceText("Hello"), closeSoftKeyboard())

        // Check if the text is now "Hello"
        onView(withText("Hello")).check(matches(isDisplayed()))
    }
}

