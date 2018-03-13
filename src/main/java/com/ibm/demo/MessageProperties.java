package com.ibm.demo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties( "message" )
public class MessageProperties {
	private String name, text;

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText( String text ) {
		this.text = text;
	}

	@Override
	public String toString() {
		// https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/builder/ToStringStyle.html#SHORT_PREFIX_STYLE
		// ToStringStyle.SHORT_PREFIX_STYLE
		return ToStringBuilder.reflectionToString( this, ToStringStyle.JSON_STYLE );
	}
}