package reservation.frontController;

public class ActionForward {

	private boolean isRedirect = false;
	private String viewPage = null;
	
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	public String getViewPage() {
		return viewPage;
	}
	public void setViewPage(String viewPage) {
		this.viewPage = viewPage;
	}
	
	public ActionForward() {
	}
	
	public ActionForward(boolean isRedirect, String viewPage) {
		this.isRedirect = isRedirect;
		this.viewPage = viewPage;
	}
	
}