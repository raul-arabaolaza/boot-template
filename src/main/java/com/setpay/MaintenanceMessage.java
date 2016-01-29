package com.setpay;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by raul on 23/11/15.
 */
public class MaintenanceMessage extends ResourceSupport{

    private String errorMessage;
    private String trackingCode;

    public MaintenanceMessage(String errorMessage, String trackingCode) {
        super();
        this.errorMessage = errorMessage;
        this.trackingCode = trackingCode;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage
     *            the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return the trackingCode
     */
    public String getTrackingCode() {
        return trackingCode;
    }

    /**
     * @param trackingCode
     *            the trackingCode to set
     */
    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }
}
