package com.nettyim.server.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 单聊消息模型
 */
public class ChatModel {
    
    @JsonProperty("from_shell_id")
    private Long fromShellId;
    
    @JsonProperty("to_shell_id")
    private Long toShellId;
    
    @JsonProperty("content")
    private String content;

    public Long getFromShellId() {
		return fromShellId;
	}

	public void setFromShellId(Long fromShellId) {
		this.fromShellId = fromShellId;
	}

	public Long getToShellId() {
		return toShellId;
	}

	public void setToShellId(Long toShellId) {
		this.toShellId = toShellId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("ChatMessage{fromShellId:").append(this.fromShellId).append(", ");
        sb.append("toShellId:").append(this.toShellId).append(", ");
        sb.append("content:").append(this.content).append("}");
        return sb.toString();
    }
}
