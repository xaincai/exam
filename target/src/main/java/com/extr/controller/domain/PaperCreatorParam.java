package com.extr.controller.domain;

import java.util.HashMap;
import java.util.Map;

public class PaperCreatorParam {

	private String paperName;
	private HashMap<Integer,Integer> questionTypeNum;
	private HashMap<Integer,Float> questionTypePoint;
	private HashMap<Integer,Float> questionKnowledgePointRate;
	private Float paperDifficulty;
	private int passPoint;
	private int time;
	private float paperPoint;
	private String paperType;
	public String getPaperType() {
		return paperType;
	}
	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}
	public float getPaperPoint() {
		return paperPoint;
	}
	public void setPaperPoint(float paperPoint) {
		this.paperPoint = paperPoint;
	}
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public HashMap<Integer, Integer> getQuestionTypeNum() {
		return questionTypeNum;
	}
	public void setQuestionTypeNum(HashMap<Integer, Integer> questionTypeNum) {
		this.questionTypeNum = questionTypeNum;
	}
	public HashMap<Integer, Float> getQuestionTypePoint() {
		return questionTypePoint;
	}
	public void setQuestionTypePoint(HashMap<Integer, Float> questionTypePoint) {
		this.questionTypePoint = questionTypePoint;
	}
	public HashMap<Integer, Float> getQuestionKnowledgePointRate() {
		return questionKnowledgePointRate;
	}
	public void setQuestionKnowledgePointRate(
			HashMap<Integer, Float> questionKnowledgePointRate) {
		this.questionKnowledgePointRate = questionKnowledgePointRate;
	}
	public Float getPaperDifficulty() {
		return paperDifficulty;
	}
	public void setPaperDifficulty(Float paperDifficulty) {
		this.paperDifficulty = paperDifficulty;
	}
	public int getPassPoint() {
		return passPoint;
	}
	public void setPassPoint(int passPoint) {
		this.passPoint = passPoint;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}
