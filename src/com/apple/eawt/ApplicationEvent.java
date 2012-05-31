package com.apple.eawt;

import java.util.EventObject;

public class ApplicationEvent extends EventObject {

	private static final long serialVersionUID = 1L;

	public ApplicationEvent(Object source) {
		super(source);
	}

	public String getFilename() {
		return "";
	}

	public boolean isHandled() {
		return true;
	}

	public void setHandled(boolean state) {
	}

}
