package reservation.util;

public class Modal {

	public final static String SUCCESS = "btn btn-primary";
	public final static String ERROR = "btn btn-danger";
	
	private String modalTitle;
	private String modalBody;
	private String modalColor;
	
	public String getModalTitle() {
		return modalTitle;
	}
	public void setModalTitle(String modalTitle) {
		this.modalTitle = modalTitle;
	}
	public String getModalBody() {
		return modalBody;
	}
	public void setModalBody(String modalBody) {
		this.modalBody = modalBody;
	}
	public String getModalColor() {
		return modalColor;
	}
	public void setModalColor(String modalColor) {
		this.modalColor = modalColor;
	}
	
	public Modal(String modalTitle, String modalBody, String modalColor) {
		super();
		this.modalTitle = modalTitle;
		this.modalBody = modalBody;
		this.modalColor = modalColor;
	}
	
}