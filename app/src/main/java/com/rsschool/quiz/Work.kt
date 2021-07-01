package com.rsschool.quiz

interface Work {

    fun Result(userId: Long, uAnswers: HashMap<Int, Int>, uAnswersText: HashMap<Int, String>)

    fun startQuiz()

}