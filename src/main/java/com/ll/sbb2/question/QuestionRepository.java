package com.ll.sbb2.question;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository <Question, Integer> {
}
