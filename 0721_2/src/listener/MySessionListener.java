package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionBindingListener, HttpSessionListener, HttpSessionAttributeListener,
		HttpSessionIdListener {

	@Override
	public void sessionIdChanged(HttpSessionEvent event, String oldSessionId) {
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
	}

}
