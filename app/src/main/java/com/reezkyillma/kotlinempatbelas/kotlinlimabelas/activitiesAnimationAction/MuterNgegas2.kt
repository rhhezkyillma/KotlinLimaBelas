package com.reezkyillma.kotlinempatbelas.kotlinlimabelas.activitiesAnimationAction

class MuterNgegas2 : BaseAnimationActivity() {

    override fun onStartAnimation() {
        rocket.animate()
            .translationY(-screenHeight)
            .rotationBy(360f)
            .setDuration(DEFAULT_ANIM_DURATION)
            .start()
    }
}