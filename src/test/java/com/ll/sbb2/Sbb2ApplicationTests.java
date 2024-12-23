package com.ll.sbb2;

import com.ll.sbb2.answer.Answer;
import com.ll.sbb2.answer.AnswerRepository;
import com.ll.sbb2.question.Question;
import com.ll.sbb2.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Sbb2ApplicationTests {

    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    AnswerRepository answerRepository;

    @Test
    void JpaTest() {
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        Answer a = new Answer();
        a.setContent("쾅");
        a.setQuestion(q);
        a.setCreateDate(LocalDateTime.now());
        this.answerRepository.save(a);
        }
    }



