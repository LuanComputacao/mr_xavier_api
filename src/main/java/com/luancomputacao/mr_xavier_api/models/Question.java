package com.luancomputacao.mr_xavier_api.models;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Objects;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Question extends BaseEntity {
    private String wording;
    private Integer level;
    private QuestionTypeEnum questionTypeEnum;
    private Integer spaces;
    private Boolean published;

    // RELATIONSHIPS
    @ManyToOne
    private Subject subject;
    @ManyToOne
    private Professor professor;
    @ManyToMany
    private Set<Knowledge> knowledgeList;
    @ManyToMany
    private Set<Grade> gradeSet;


    @Builder
    public Question(Long id, String uuid, String wording, Integer level, QuestionTypeEnum questionTypeEnum, Integer spaces, Boolean published) {
        this.id = id;
        this.uuid = uuid;
        this.wording = wording;
        this.level = level;
        this.questionTypeEnum = questionTypeEnum;
        this.spaces = spaces;
        this.published = published;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(id, question.id) && Objects.equals(uuid, question.uuid) && Objects.equals(wording, question.wording);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uuid, wording);
    }

    @Override
    public String toString() {
        return "Question{" +
                "id='" + super.id + '\'' +
                ", uuid='" + uuid + '\'' +
                ", wording='" + wording + '\'' +
                ", level=" + level +
                ", questionTypeEnum=" + questionTypeEnum +
                ", spaces=" + spaces +
                ", published=" + published +
                '}';
    }
}
