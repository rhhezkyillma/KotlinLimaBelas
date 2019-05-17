package com.reezkyillma.kotlinempatbelas.kotlinlimabelas.activitiesAnimationAction

import android.animation.ValueAnimator

class MajuMundur  : BaseAnimationActivity() {
        override fun onStartAnimation() {
            val animator = ValueAnimator.ofFloat(0f, -screenHeight)
            animator.addUpdateListener {
                val value = it.animatedValue as Float
                rocket.translationY = value
                doge.translationY = value
            }

            animator.repeatMode = ValueAnimator.REVERSE
            animator.repeatCount = 3
            animator.duration = 500L
            animator.start()

        }
    }