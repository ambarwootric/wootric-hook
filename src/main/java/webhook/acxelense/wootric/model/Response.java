package webhook.acxelense.wootric.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Response {
	
	private int responseId;
	private int id;
	private int score;
	private String text;
	private String ipAddress;
	private String originUrl;
	private int endUserId;
	private int surveyId;
	private String createdAt;
	private String updatedAt;
	private boolean excludedFromCalculation;
	private String eventName;
	private String timestamp;	
	
	public Response() {
		
	}

	public Response(int id, int score, String text, String ipAddress, String originUrl, int endUserId, int surveyId,
			String createdAt, String updatedAt, boolean excludedFromCalculation, String eventName, String timestamp) {
		super();
		this.id = id;
		this.score = score;
		this.text = text;
		this.ipAddress = ipAddress;
		this.originUrl = originUrl;
		this.endUserId = endUserId;
		this.surveyId = surveyId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.excludedFromCalculation = excludedFromCalculation;
		this.eventName = eventName;
		this.timestamp = timestamp;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false, nullable = false, unique = true)
	public int getResponseId() {
		return responseId;
	}

	public void setResponseId(int responseId) {
		this.responseId = responseId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getOriginUrl() {
		return originUrl;
	}

	public void setOriginUrl(String originUrl) {
		this.originUrl = originUrl;
	}

	public int getEndUserId() {
		return endUserId;
	}

	public void setEndUserId(int endUserId) {
		this.endUserId = endUserId;
	}

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isExcludedFromCalculation() {
		return excludedFromCalculation;
	}

	public void setExcludedFromCalculation(boolean excludedFromCalculation) {
		this.excludedFromCalculation = excludedFromCalculation;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}
