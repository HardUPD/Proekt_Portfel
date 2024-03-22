package com.example.proekt_portfel

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.proekt_portfel.databinding.FragmentSettingBinding


class Fragment_Setting : Fragment() {

    lateinit var binding: FragmentSettingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val yourSwitch1 = view.findViewById<Switch>(R.id.Switch1)
        val yourSwitch2 = view.findViewById<Switch>(R.id.Switch2)
        val yourSwitch3 = view.findViewById<Switch>(R.id.Switch3)


        val cardView1 = view.findViewById<CardView>(R.id.cvSettings)


        val textView1 = view.findViewById<TextView>(R.id.tvSubTextSubtitle)
        val textView2 = view.findViewById<TextView>(R.id.tvTextTransSubs)
        val textView3 = view.findViewById<TextView>(R.id.tvLanguageText)
        val textView4 = view.findViewById<TextView>(R.id.tvLanguageVoice)
        val textView5 = view.findViewById<TextView>(R.id.tvTypeSing)

        val textView6 = view.findViewById<TextView>(R.id.tvTextTypeVoice)

//        val textView7 = view.findViewById<TextView>(R.id. tvTextTransSubs)
//        val textView8 = view.findViewById<TextView>(R.id.tvTypeSing)
//        val textView9 = view.findViewById<TextView>(R.id.tvLanguageText)
//        val textView10 = view.findViewById<TextView>(R.id.tvLanguageVoice)
//        val textView11 = view.findViewById<TextView>(R.id.tvTextTypeVoice)


        val imageView3 = view.findViewById<ImageView>(R.id.imFlagTransSubs)
        val imageView4 = view.findViewById<ImageView>(R.id.imFlagVoice)
        val imageView5 = view.findViewById<ImageView>(R.id.imChevronRight2)


        val fadeInCardView = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
        fadeInCardView.setTarget(cardView1)

        val fadeOutCardView = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
        fadeOutCardView.setTarget(cardView1)

        val fadeInTextView1 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
        fadeInTextView1.setTarget(textView1)

        val fadeInTextView2 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
        fadeInTextView2.setTarget(textView2)

        val fadeInTextView3 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
        fadeInTextView3.setTarget(textView3)

        val fadeInTextView4 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
        fadeInTextView4.setTarget(textView4)

        val fadeInTextView5 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
        fadeInTextView5.setTarget(textView5)

        val fadeInTextView6 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
        fadeInTextView6.setTarget(textView6)

//        val fadeInTextView7 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInTextView7.setTarget(textView7)
//
//        val fadeInTextView8 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInTextView8.setTarget(textView8)
//
//        val fadeInTextView9 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInTextView9.setTarget(textView9)
//
//        val fadeInTextView10 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInTextView10.setTarget(textView10)
//
//        val fadeInTextView11 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInTextView11.setTarget(textView11)



        val fadeOutTextView1 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
        fadeOutTextView1.setTarget(textView1)

        val fadeOutTextView2 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
        fadeOutTextView2.setTarget(textView2)

        val fadeOutTextView3 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
        fadeOutTextView3.setTarget(textView3)

        val fadeOutTextView4 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
        fadeOutTextView4.setTarget(textView4)

        val fadeOutTextView5 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
        fadeOutTextView5.setTarget(textView5)

        val fadeOutTextView6 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
        fadeOutTextView6.setTarget(textView6)


//        val fadeOutTextView7 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
//        fadeOutTextView7.setTarget(textView7)
//
//        val fadeOutTextView8 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
//        fadeOutTextView8.setTarget(textView8)
//
//        val fadeOutTextView9 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
//        fadeOutTextView9.setTarget(textView9)
//
//        val fadeOutTextView10 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
//        fadeOutTextView10.setTarget(textView10)
//
//        val fadeOutTextView11 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
//        fadeOutTextView11.setTarget(textView11)






        val fadeInImageView3 = AnimatorInflater.loadAnimator(requireActivity(),R.animator.fade_in)
        fadeInImageView3.setTarget(imageView3)

        val fadeInImageView4 = AnimatorInflater.loadAnimator(requireActivity(),R.animator.fade_in)
        fadeInImageView4.setTarget(imageView4)

        val fadeInImageView5 = AnimatorInflater.loadAnimator(requireActivity(),R.animator.fade_in)
        fadeInImageView5.setTarget(imageView5)



        val fadeOutImageView3 = AnimatorInflater.loadAnimator(requireActivity(),R.animator.fade_out)
        fadeOutImageView3.setTarget(imageView3)

        val fadeOutImageView4 = AnimatorInflater.loadAnimator(requireActivity(),R.animator.fade_out)
        fadeOutImageView4.setTarget(imageView4)

        val fadeOutImageView5 = AnimatorInflater.loadAnimator(requireActivity(),R.animator.fade_out)
        fadeOutImageView5.setTarget(imageView5)



        var isCardViewVisible = false


        yourSwitch1?.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked) {
                cardView1?.visibility = View.VISIBLE

                val animatorSet = AnimatorSet()
                animatorSet.playTogether(
                    fadeInCardView,
                )
                animatorSet.start()
            } else {

                val animatorSet = AnimatorSet()
                animatorSet.playTogether(
                    fadeOutCardView,
                )

                animatorSet.start()

                cardView1?.visibility = View.GONE
            }
        }
        yourSwitch2?.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked) {
                textView1.visibility = View.VISIBLE
                textView2.visibility = View.VISIBLE
                imageView3.visibility = View.VISIBLE

                val animatorSet = AnimatorSet()
                animatorSet.playTogether(
                    fadeInTextView1,
                    fadeInTextView2,
                    fadeInImageView3
                )
                animatorSet.start()

            } else {

                val animatorSet = AnimatorSet()
                animatorSet.playTogether(
                    fadeOutTextView1,
                    fadeOutTextView2,
                    fadeOutImageView3
                )

                animatorSet.start()

                textView1.visibility = View.GONE
                textView2.visibility = View.GONE
                imageView3.visibility = View.GONE


            }
        }
        yourSwitch3?.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked) {
                textView3.visibility = View.VISIBLE
                textView4.visibility = View.VISIBLE
                textView5.visibility = View.VISIBLE
                textView6.visibility = View.VISIBLE
                imageView4.visibility = View.VISIBLE
                imageView5.visibility = View.VISIBLE

                val animatorSet = AnimatorSet()
                animatorSet.playTogether(
                    fadeInTextView3,
                    fadeInTextView4,
                    fadeInTextView5,
                    fadeInTextView6,
                    fadeInImageView4,
                    fadeInImageView5
                )
                animatorSet.start()
            } else {

                val animatorSet = AnimatorSet()
                animatorSet.playTogether(
                    fadeOutTextView3,
                    fadeOutTextView4,
                    fadeOutTextView5,
                    fadeOutTextView6,
                    fadeOutImageView4,
                    fadeOutImageView5
                )

                animatorSet.start()

                textView3.visibility = View.GONE
                textView4.visibility = View.GONE
                textView5.visibility = View.GONE
                textView6.visibility = View.GONE
                imageView4.visibility = View.GONE
                imageView5.visibility = View.GONE


            }
            binding.tvTextClassSubs.setOnClickListener{
                MAIN.navController.navigate(R.id.action_fragment_Setting_to_fragmentList)
            }
            binding.tvTextTransSubs.setOnClickListener{
                MAIN.navController.navigate(R.id.action_fragment_Setting_to_fragmentLanguagelist2)
            }


        }


//
//            yourSwitch2?.setOnCheckedChangeListener { _, isChecked ->
//                if (isChecked) {
//                    showCardViewWithAnimation(
//                        cardView1,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        textView6,
//                        null,
//                        null
//                    )
//                } else {
//                    hideCardViewWithAnimation(
//                        cardView1,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        textView6,
//                        null,
//                        null
//                    )
//                }
//            }
//
//
//            yourSwitch3?.setOnCheckedChangeListener { _, isChecked ->
//                if (isChecked) {
//                    showCardViewWithAnimation(
//                        cardView1,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        textView7,
//                        textView8
//                    )
//                } else {
//                    hideCardViewWithAnimation(
//                        cardView1,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        textView7,
//                        textView8
//                    )
//                }
//            }
//        }
    }

//    private fun showCardViewWithAnimation(
//        cardView: CardView,
//        textView1: TextView?,
//        textView2: TextView?,
//        textView3: TextView?,
//        textView4: TextView?,
//        textView5: TextView?,
//        textView6: TextView?,
//        textView7: TextView?,
//        textView8: TextView?
//    ) {
//        val fadeInCardView = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInCardView.setTarget(cardView)
//
//        val fadeInTextView1 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInTextView1.setTarget(textView1)
//
//        val fadeInTextView2 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInTextView2.setTarget(textView2)
//
//        val fadeInTextView3 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInTextView3.setTarget(textView3)
//
//        val fadeInTextView4 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInTextView4.setTarget(textView4)
//
//        val fadeInTextView5 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInTextView5.setTarget(textView5)
//
//        val fadeInTextView6 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInTextView6.setTarget(textView6)
//
//        val fadeInTextView7 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInTextView7.setTarget(textView7)
//
//        val fadeInTextView8 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_in)
//        fadeInTextView8.setTarget(textView8)
//
//        val animatorSet = AnimatorSet()
//        animatorSet.playTogether(
//            fadeInCardView,
//            fadeInTextView1,
//            fadeInTextView2,
//            fadeInTextView3,
//            fadeInTextView4,
//            fadeInTextView5,
//            fadeInTextView6,
//            fadeInTextView7,
//            fadeInTextView8
//        )
//        animatorSet.start()
//
//        cardView.visibility = View.VISIBLE
//    }
//
//    private fun hideCardViewWithAnimation(
//        cardView: CardView,
//        textView1: TextView?,
//        textView2: TextView?,
//        textView3: TextView?,
//        textView4: TextView?,
//        textView5: TextView?,
//        textView6: TextView?,
//        textView7: TextView?,
//        textView8: TextView?
//    ) {
//        val fadeOutCardView = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
//        fadeOutCardView.setTarget(cardView)
//
//        val fadeOutTextView7 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
//        fadeOutTextView7.setTarget(textView7)
//
//        val fadeOutTextView8 = AnimatorInflater.loadAnimator(requireActivity(), R.animator.fade_out)
//        fadeOutTextView8.setTarget(textView8)
//
//        val animatorSet = AnimatorSet()
//        animatorSet.playTogether(fadeOutCardView, fadeOutTextView7, fadeOutTextView8)
//        animatorSet.start()
//
//        cardView.visibility = View.GONE
//
//    }

}
