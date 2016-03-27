package com.asiainfo.bdx.dsrv.client.withoutspring;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
//import org.apache.ws.security.WSPasswordCallback;
import org.apache.wss4j.common.ext.WSPasswordCallback;

public class WsClinetAuthHandler implements CallbackHandler {

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
			System.out.println("identifier: " + pc.getIdentifier());
			// 这里必须设置密码，否则会抛出：java.lang.IllegalArgumentException: pwd == null
			// but a password is needed
			pc.setPassword("testPassword");// ▲【这里必须设置密码】▲
		}
	}
}