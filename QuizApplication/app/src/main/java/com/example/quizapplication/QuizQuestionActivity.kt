package com.example.quizapplication

import android.content.DialogInterface.OnClickListener
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.quizapplication.databinding.ActivityQuizQuestionBinding
import kotlin.math.log

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int=1
    private var mQuestionList:ArrayList<Question>? = null
    private var mselectedOptionPosition:Int=0
    private var mCurrectAnswers:Int=0
    private var mUserName:String?=null
    private lateinit var binding:ActivityQuizQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityQuizQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mUserName= intent.getStringExtra(Constants.USER_NAME)
        mQuestionList=Constants.getQuestions()
        setQuestion()
        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionSecond.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)
        binding.submit.setOnClickListener(this)




    }
    private fun setQuestion(){
//        mCurrentPosition=1

        val question=mQuestionList!![mCurrentPosition -1]
        defaultOptionsView()
        if (mCurrentPosition == mQuestionList!!.size){
                binding.submit.text="FINISH"
            }
            else{
                binding.submit.text="SUBMIT"
            }

        binding.progressbar.progress=mCurrentPosition
        binding.tvProgress.text= "$mCurrentPosition" + "/" + binding.progressbar.max
        binding.tvQuestion.text=question!!.question
        binding.image.setImageResource(question.image)
        binding.tvOptionOne.text=question!!.optionOne
        binding.tvOptionSecond.text=question!!.optionTwo
        binding.tvOptionThree.text=question!!.optionThree
        binding.tvOptionFour.text=question!!.optionFour

    }
    private fun defaultOptionsView(){
        val options= ArrayList<TextView>()
        options.add(0,binding.tvOptionOne)
        options.add(1,binding.tvOptionSecond)
        options.add(2,binding.tvOptionThree)
        options.add(3,binding.tvOptionFour)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface= Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(
                this,R.drawable.option_border_bg
            )
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one->{
                selectedOptionView(binding.tvOptionOne,1)
            }
            R.id.tv_option_second->{
                selectedOptionView(binding.tvOptionSecond,2)
            }
            R.id.tv_option_Three->{
                selectedOptionView(binding.tvOptionThree,3)
            }
            R.id.tv_option_Four->{
                selectedOptionView(binding.tvOptionFour,4)
            }
            R.id.submit->{
                if (mselectedOptionPosition==0){
                    mCurrentPosition++

                    when{
                        mCurrentPosition <= mQuestionList!!.size ->{
                            setQuestion()
                        }else->{
                            var intent = Intent(this,ResultActivity::class.java)
                        intent.putExtra(Constants.USER_NAME,mUserName)
                        intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionList!!.size)
                        intent.putExtra(Constants.CORRECT_ANSWERS,mCurrectAnswers)
                           startActivity(intent)
                        }
                    }
                }
                //                else{
//                    val question = mQuestionList?.get(mCurrentPosition -1)
//                    if (question!!.correctAnswer != mselectedOptionPosition){
//                        answerView(mselectedOptionPosition,R.drawable.incurrent_border_bg)
//                    }else{
//                        mCurrectAnswers++
//                    }
//                    answerView(question.correctAnswer, R.drawable.current_border_bg)
//
//                    if(mCurrentPosition == mQuestionList!!.size){
//                        binding.submit.text="FINISH"
//                    }
//                    else{
//                        binding.submit.text="GO TO NEXT QUESTION"
//                    }
//                    mselectedOptionPosition = 0
//                }
            }
        }
    }
    private fun  answerView(answer:Int,drawableView:Int){
        when(answer){
            1->{
                binding.tvOptionOne.background= ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            2->{
                binding.tvOptionSecond.background= ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            3->{
                binding.tvOptionThree.background= ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            4->{
                binding.tvOptionFour.background= ContextCompat.getDrawable(
                    this,drawableView
                )
            }
        }
    }
    private fun selectedOptionView(tv:TextView,selectedOptionNum:Int){
        defaultOptionsView()
            mselectedOptionPosition=selectedOptionNum
       tv.setTextColor(Color.parseColor("#363A43"))
//      tv.setTypeface(tv.typeface,Typeface.BOLD)
//       tv.background=ContextCompat.getDrawable(
//            this,R.drawable.selected_border_bg
//        )
        val question = mQuestionList?.get(mCurrentPosition -1)
        if (question!!.correctAnswer != mselectedOptionPosition){
            answerView(mselectedOptionPosition,R.drawable.incurrent_border_bg)
        }else{
            mCurrectAnswers++
        }
        answerView(question.correctAnswer, R.drawable.current_border_bg)

        if(mCurrentPosition == mQuestionList!!.size){
            binding.submit.text="FINISH"
        }
        else{
            binding.submit.text="GO TO NEXT QUESTION"
        }
        mselectedOptionPosition = 0
    }
}