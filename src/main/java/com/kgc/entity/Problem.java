package com.kgc.entity;

import java.sql.Date;

/**
 * Created by  王帆 on 2017/3/7.
 */
public class Problem {
    private int id;
    private String question;
    private String state;
    private String qType;
    private Date qTime;
    private String answerTime;
    private String mangerPic;
    private String mangerName;
    private String answer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getqType() {
        return qType;
    }

    public void setqType(String qType) {
        this.qType = qType;
    }

    public Date getqTime() {
        return qTime;
    }

    public void setqTime(Date qTime) {
        this.qTime = qTime;
    }

    public String getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
    }

    public String getMangerPic() {
        return mangerPic;
    }

    public void setMangerPic(String mangerPic) {
        this.mangerPic = mangerPic;
    }

    public String getMangerName() {
        return mangerName;
    }

    public void setMangerName(String mangerName) {
        this.mangerName = mangerName;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Problem problem = (Problem) o;

        if (id != problem.id) return false;
        if (question != null ? !question.equals(problem.question) : problem.question != null) return false;
        if (state != null ? !state.equals(problem.state) : problem.state != null) return false;
        if (qType != null ? !qType.equals(problem.qType) : problem.qType != null) return false;
        if (qTime != null ? !qTime.equals(problem.qTime) : problem.qTime != null) return false;
        if (answerTime != null ? !answerTime.equals(problem.answerTime) : problem.answerTime != null) return false;
        if (mangerPic != null ? !mangerPic.equals(problem.mangerPic) : problem.mangerPic != null) return false;
        if (mangerName != null ? !mangerName.equals(problem.mangerName) : problem.mangerName != null) return false;
        if (answer != null ? !answer.equals(problem.answer) : problem.answer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (qType != null ? qType.hashCode() : 0);
        result = 31 * result + (qTime != null ? qTime.hashCode() : 0);
        result = 31 * result + (answerTime != null ? answerTime.hashCode() : 0);
        result = 31 * result + (mangerPic != null ? mangerPic.hashCode() : 0);
        result = 31 * result + (mangerName != null ? mangerName.hashCode() : 0);
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", state='" + state + '\'' +
                ", qType='" + qType + '\'' +
                ", qTime=" + qTime +
                ", answerTime='" + answerTime + '\'' +
                ", mangerPic='" + mangerPic + '\'' +
                ", mangerName='" + mangerName + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
