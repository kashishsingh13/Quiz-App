package com.example.quizapplication

object Constants {

    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWERS:String="correct_answer"
    fun getQuestions():ArrayList<Question>{
        val questionsList=ArrayList<Question>()
        val que1=Question(id = 1,
            "What country does this flag belong to?",
            R.drawable.india_flag,
            "India",
            "Argentins",
            "Iran",
            "Japan",
            1
        )
        questionsList.add(que1)
        val que2=Question(id = 2,
            "What country does this flag belong to?",
            R.drawable.iceland_flag,
            "India",
            "Japan",
            "Iran",
            "Iceland",
            4
        )
        questionsList.add(que2)
        val que3=Question(id = 3,
            "What country does this flag belong to?",
            R.drawable.australia_flag,
            "India",
            "Aurtralia",
            "Iran",
            "Japan",
            2
        )
        questionsList.add(que3)
        val que4=Question(id = 4,
            "What country does this flag belong to?",
            R.drawable.austria_flag,
            "India",
            "Iceland",
            "Austria",
            "Japan",
            3
        )
        questionsList.add(que4)
        val que5=Question(id = 5,
            "What country does this flag belong to?",
            R.drawable.belize_flag,
            "Belize",
            "Argentins",
            "Iran",
            "Japan",
            1
        )
        questionsList.add(que5)
        val que6=Question(id = 6,
            "What country does this flag belong to?",
            R.drawable.brazil_flag,
            "India",
            "Belize",
            "Iran",
            "Brazil",
            4
        )
        questionsList.add(que6)
        val que7=Question(id = 7,
            "What country does this flag belong to?",
            R.drawable.car_flag,
            "India",
            "car",
            "Iran",
            "Japan",
            2
        )
        questionsList.add(que7)
        val que8=Question(id = 8,
            "What country does this flag belong to?",
            R.drawable.chile_flag,
            "India",
            "car",
            "Chile",
            "Japan",
            3
        )
        questionsList.add(que8)
        val que9=Question(id = 9,
            "What country does this flag belong to?",
            R.drawable.drc_flag,
            "DRC",
            "Argentins",
            "Iran",
            "Japan",
            1
        )
        questionsList.add(que9)
        val que10=Question(id = 10,
            "What country does this flag belong to?",
            R.drawable.fiji_flag,
            "CAR",
            "DRC",
            "Iran",
            "Fiji",
            4
        )
        questionsList.add(que10)
//        val que11=Question(id = 11,
//            "What country does this flag belong to?",
//            R.drawable.france_flag,
//            "India",
//            "France",
//            "Iran",
//            "Japan",
//            2
//        )
//        questionsList.add(que11)
//        val que12=Question(id = 12,
//            "What country does this flag belong to?",
//            R.drawable.grenada_flag,
//            "India",
//            "Argentins",
//            "Grenada",
//            "Japan",
//            3
//        )
//        questionsList.add(que12)
//        val que13=Question(id = 13,
//            "What country does this flag belong to?",
//            R.drawable.iran_flag,
//            "Iran",
//            "Argentins",
//            "Iaos",
//            "Japan",
//            1
//        )
//        questionsList.add(que13)
//        val que14=Question(id = 14,
//            "What country does this flag belong to?",
//            R.drawable.japan_flag,
//            "India",
//            "Argentins",
//            "Iran",
//            "Japan",
//            4
//        )
//        questionsList.add(que14)
//        val que15=Question(id = 15,
//            "What country does this flag belong to?",
//            R.drawable.laos_flag,
//            "India",
//            "Iaos",
//            "Iran",
//            "Mali",
//            2
//        )
//        questionsList.add(que15)
//        val que16=Question(id = 16,
//            "What country does this flag belong to?",
//            R.drawable.maldives_flag,
//            "India",
//            "Argentins",
//            "Maldives",
//            "Japan",
//            3
//        )
//        questionsList.add(que16)
//        val que17=Question(id = 17,
//            "What country does this flag belong to?",
//            R.drawable.mali_flag,
//            "Mali",
//            "Argentins",
//            "Iran",
//            "Japan",
//            1
//        )
//        questionsList.add(que17)
//        val que18=Question(id = 18,
//            "What country does this flag belong to?",
//            R.drawable.nepal_flag,
//            "India",
//            "Argentins",
//            "Iran",
//            "Nepal",
//            4
//        )
//        questionsList.add(que18)
//        val que19=Question(id = 19,
//            "What country does this flag belong to?",
//            R.drawable.pakistan_flag,
//            "India",
//            "Pakistan",
//            "Iran",
//            "Japan",
//            2
//        )
//        questionsList.add(que19)
//        val que20=Question(id = 20,
//            "What country does this flag belong to?",
//            R.drawable.peru_flag,
//            "India",
//            "Argentins",
//            "Peru",
//            "Japan",
//            3
//        )
//        questionsList.add(que20)

        return questionsList
    }
}