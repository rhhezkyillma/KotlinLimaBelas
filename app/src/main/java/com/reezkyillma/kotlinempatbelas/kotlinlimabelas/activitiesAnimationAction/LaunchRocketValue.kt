package com.reezkyillma.kotlinempatbelas.kotlinlimabelas.activitiesAnimationAction

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class LaunchRocketValue : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight)
        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float

            rocket.translationY = value
        }

        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = DEFAULT_ANIM_DURATION

        valueAnimator.start()
    }
}