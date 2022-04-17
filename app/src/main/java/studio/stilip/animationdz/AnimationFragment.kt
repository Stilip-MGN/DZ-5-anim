package studio.stilip.animationdz

import android.os.Bundle
import androidx.transition.Scene
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.transition.ChangeBounds
import androidx.transition.TransitionManager
import androidx.transition.TransitionSet
import studio.stilip.animationdz.databinding.AnimationFragmentBinding

class AnimationFragment : Fragment(R.layout.animation_fragment) {
    lateinit var binding: AnimationFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = AnimationFragmentBinding.bind(view)
        binding.buttonAnim.setOnClickListener {
            val scene = Scene.getSceneForLayout(
                requireView() as ViewGroup,
                R.layout.animation_fragment2,
                requireContext()
            )
            TransitionManager.go(scene, TransitionSet().apply {
                duration = 400
                addTransition(ChangeBounds())
            })
        }
    }
}