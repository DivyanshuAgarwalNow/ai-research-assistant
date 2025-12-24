package com.research.assistant;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeminiResponse {
	
	public List<Candidate> candidates;
	
	public List<Candidate> getCandidates() {
		return candidates;
	}

	@Data
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Candidate{
		public Content content;

		public Content getContent() {
			return content;
		}

	}
	
	@Data
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Content{
		public List<Part> parts;

		public List<Part> getParts() {
			return parts;
		}

	}
	
	@Data
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Part{
		public String text;

		public String getText() {
			return text;
		}

	}

}
