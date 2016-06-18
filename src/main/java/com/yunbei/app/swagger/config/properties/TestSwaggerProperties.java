package com.yunbei.app.swagger.config.properties;

/**
 * @author: mlc
 * @dat: 2016年6月4日
 * @Description: TODO
 */

// @ConfigurationProperties(prefix = "swagger.apiinfo.test")
public class TestSwaggerProperties {

	/**
	 * 版本
	 */
	private String version;

	/**
	 * 标题
	 */
	private String title;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 
	 */
	private String termsOfServiceUrl;

	/**
	 * 证书
	 */
	private String license;

	/**
	 * url
	 */
	private String licenseUrl;

	/**
	 * 联系方式
	 */
	private String contact;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTermsOfServiceUrl() {
		return termsOfServiceUrl;
	}

	public void setTermsOfServiceUrl(String termsOfServiceUrl) {
		this.termsOfServiceUrl = termsOfServiceUrl;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getLicenseUrl() {
		return licenseUrl;
	}

	public void setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
