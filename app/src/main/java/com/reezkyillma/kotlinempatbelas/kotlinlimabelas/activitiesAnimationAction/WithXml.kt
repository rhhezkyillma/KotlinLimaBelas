package com.reezkyillma.kotlinempatbelas.kotlinlimabelas.activitiesAnimationAction

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import com.reezkyillma.kotlinempatbelas.kotlinlimabelas.R

class WithXml : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val rocketAnim = AnimatorInflater.loadAnimator(this, R.animator.jump_blink) as AnimatorSet
        rocketAnim.setTarget(rocket)

        val dagoAnim = AnimatorInflater.loadAnimator(this, R.animator.jump_blink) as AnimatorSet
        dagoAnim.setTarget(doge)

        val bothAnimSet = AnimatorSet()
        bothAnimSet.playTogether(rocketAnim, dagoAnim)
        bothAnimSet.duration = DEFAULT_ANIM_DURATION
        bothAnimSet.start()
    }

}