/**
 * ISendService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package parsian.webService.mediapayamak;

public interface ISendService extends java.rmi.Remote {
    public java.lang.Integer sendSMS(java.lang.String userName, java.lang.String password, java.lang.String fromNumber, java.lang.String[] toNumbers, java.lang.String messageContent, java.lang.Boolean isFlash, parsian.webService.mediapayamak.holders.ArrayOflongHolder recId, javax.xml.rpc.holders.ByteArrayHolder status) throws java.rmi.RemoteException;
    public java.math.BigDecimal getCredit(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.Long getDeilvery(java.lang.String userName, java.lang.String password, java.lang.Long recId) throws java.rmi.RemoteException;
    public java.lang.Long getDelivery(java.lang.String userName, java.lang.String password, java.lang.Long recId) throws java.rmi.RemoteException;
    public parsian.webService.mediapayamak.MessageInfo[] getMessages(java.lang.String userName, java.lang.String password, java.lang.Integer messageType, java.lang.String[] fromNumbers, java.lang.Integer index, java.lang.Integer count) throws java.rmi.RemoteException;
    public parsian.webService.mediapayamak.MessageInfo[] getMessagesByDateRange(java.lang.String userName, java.lang.String password, java.lang.Integer messageType, java.lang.String[] fromNumbers, java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;
    public java.lang.Integer getInboxCount(java.lang.String userName, java.lang.String password, java.lang.Boolean isRead) throws java.rmi.RemoteException;
    public void sendBatchSms(java.lang.String userName, java.lang.String password, java.lang.String fromNumber, java.lang.String[] toNumbers, java.lang.String messageContent, java.lang.Boolean isFlash, javax.xml.rpc.holders.IntegerWrapperHolder sendBatchSmsResult, javax.xml.rpc.holders.IntegerWrapperHolder batchSmsId) throws java.rmi.RemoteException;
    public void getBatchDelivery(java.lang.String userName, java.lang.String password, java.lang.Integer batchSmsId, java.lang.Integer index, java.lang.Integer count, javax.xml.rpc.holders.IntegerWrapperHolder getBatchDeliveryResult, parsian.webService.mediapayamak.holders.ArrayOfstringHolder numbers, parsian.webService.mediapayamak.holders.ArrayOfintHolder deliveryStatus) throws java.rmi.RemoteException;
    public java.lang.String getSenderNumbers(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public void sendSmsLikeToLike(java.lang.String userName, java.lang.String password, java.lang.String fromNumber, java.lang.String[] toNumbers, java.lang.String[] messageContents, java.lang.Boolean isFlash, javax.xml.rpc.holders.IntegerWrapperHolder sendSmsLikeToLikeResult, javax.xml.rpc.holders.IntegerWrapperHolder smsId) throws java.rmi.RemoteException;
    public void getDeliveryLikeToLike(java.lang.String userName, java.lang.String password, java.lang.Integer smsId, javax.xml.rpc.holders.IntegerWrapperHolder getDeliveryLikeToLikeResult, parsian.webService.mediapayamak.holders.ArrayOfstringHolder numbers, parsian.webService.mediapayamak.holders.ArrayOfintHolder deliveryStatus) throws java.rmi.RemoteException;
    public void extractTelecomBlacklistNumbers(java.lang.String userName, java.lang.String password, java.lang.String numbers, javax.xml.rpc.holders.IntegerWrapperHolder extractTelecomBlacklistNumbersResult, parsian.webService.mediapayamak.holders.ArrayOfstringHolder blacklistNumbers) throws java.rmi.RemoteException;
    public java.lang.Integer numberIsInTelecomBlacklist(java.lang.String userName, java.lang.String password, java.lang.String number) throws java.rmi.RemoteException;
    public java.lang.Integer checkSmsContent(java.lang.String userName, java.lang.String password, java.lang.String message) throws java.rmi.RemoteException;
    public java.lang.Integer dummy(java.lang.Integer number) throws java.rmi.RemoteException;
}
