package com.reezkyillma.kotlinempatbelas.kotlinlimabelas.activitiesAnimationAction

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class LaunchRocketObject : BaseAnimationActivity() {

    override fun onStartAnimation() {
        val objAnimator = ObjectAnimator
            .ofFloat(rocket, "translationY", 0f, -screenHeight)

        objAnimator.duration = DEFAULT_ANIM_DURATION
        objAnimator.start()
    }

}