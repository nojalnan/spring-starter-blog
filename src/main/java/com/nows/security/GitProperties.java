package com.nows.security;

import java.util.Collections;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("git")
public class GitProperties {
	private final Github github = new Github();

	private final Security security = new Security();

	public Github getGithub() {
		return this.github;
	}

	public Security getSecurity() {
		return this.security;
	}

	public static class Github {

		private String token;

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}
	}

	public static class Security {

		private List<String> admins = Collections.singletonList("nojalnan");

		public List<String> getAdmins() {
			return admins;
		}

		public void setAdmins(List<String> admins) {
			this.admins = admins;
		}

	}
}