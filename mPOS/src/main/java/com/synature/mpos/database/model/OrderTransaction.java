package com.synature.mpos.database.model;

public class OrderTransaction {
	private int transactionId;
	private int computerId;
	private int shopId;
	private String openTime;
	private String closeTime;
	private int openStaffId;
	private String paidTime;
	private int paidStaffId;
	private int transactionStatusId;
	private int saleMode;
	private int documentTypeId;
	private int receiptYear;
	private int receiptMonth;
	private int receiptId;
	private String saleDate;
	private int sessionId;
	private int promotionPriceGroupId;
	private int voidStaffId;
	private String voidReason;
	private String voidTime;
	private int memberId;
	private double transactionVatable;
	private double transactionVat;
	private double transactionVatExclude;
	private double serviceCharge;
	private double serviceChargeVat;
	private String transactionNote;
	private String staffName;
	private String receiptNo;
	private String remark;
	private int sendStatus;
	private String ej;
	private String ejVoid;

	public int getSendStatus() {
		return sendStatus;
	}

	public void setSendStatus(int sendStatus) {
		this.sendStatus = sendStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTransactionNote() {
		return transactionNote;
	}

	public void setTransactionNote(String transactionNote) {
		this.transactionNote = transactionNote;
	}

	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public double getTransactionVatable() {
		return transactionVatable;
	}

	public void setTransactionVatable(double transactionVatable) {
		this.transactionVatable = transactionVatable;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public String getPaidTime() {
		return paidTime;
	}

	public void setPaidTime(String paidTime) {
		this.paidTime = paidTime;
	}

	public String getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}

	public String getVoidTime() {
		return voidTime;
	}

	public void setVoidTime(String voidTime) {
		this.voidTime = voidTime;
	}

	public double getTransactionVat() {
		return transactionVat;
	}

	public void setTransactionVat(double transactionVat) {
		this.transactionVat = transactionVat;
	}

	public double getTransactionVatExclude() {
		return transactionVatExclude;
	}

	public void setTransactionVatExclude(double transactionVatExclude) {
		this.transactionVatExclude = transactionVatExclude;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public double getServiceChargeVat() {
		return serviceChargeVat;
	}

	public void setServiceChargeVat(double serviceChargeVat) {
		this.serviceChargeVat = serviceChargeVat;
	}

	public int getPaidStaffId() {
		return paidStaffId;
	}

	public void setPaidStaffId(int paidStaffId) {
		this.paidStaffId = paidStaffId;
	}

	public int getReceiptYear() {
		return receiptYear;
	}

	public void setReceiptYear(int receiptYear) {
		this.receiptYear = receiptYear;
	}

	public int getReceiptMonth() {
		return receiptMonth;
	}

	public void setReceiptMonth(int receiptMonth) {
		this.receiptMonth = receiptMonth;
	}

	public int getComputerId() {
		return computerId;
	}

	public void setComputerId(int computerId) {
		this.computerId = computerId;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getOpenStaffId() {
		return openStaffId;
	}

	public void setOpenStaffId(int openStaffId) {
		this.openStaffId = openStaffId;
	}

	public int getTransactionStatusId() {
		return transactionStatusId;
	}

	public void setTransactionStatusId(int transactionStatusId) {
		this.transactionStatusId = transactionStatusId;
	}

	public int getSaleMode() {
		return saleMode;
	}

	public void setSaleMode(int saleMode) {
		this.saleMode = saleMode;
	}

	public int getDocumentTypeId() {
		return documentTypeId;
	}

	public void setDocumentTypeId(int documentTypeId) {
		this.documentTypeId = documentTypeId;
	}

	public int getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(int receiptId) {
		this.receiptId = receiptId;
	}

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public int getVoidStaffId() {
		return voidStaffId;
	}

	public void setVoidStaffId(int voidStaffId) {
		this.voidStaffId = voidStaffId;
	}

	public String getVoidReason() {
		return voidReason;
	}

	public void setVoidReason(String voidReason) {
		this.voidReason = voidReason;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getPromotionPriceGroupId() {
		return promotionPriceGroupId;
	}

	public void setPromotionPriceGroupId(int promotionPriceGroupId) {
		this.promotionPriceGroupId = promotionPriceGroupId;
	}

	public String getEj() {
		return ej;
	}

	public void setEj(String ej) {
		this.ej = ej;
	}

	public String getEjVoid() {
		return ejVoid;
	}

	public void setEjVoid(String ejVoid) {
		this.ejVoid = ejVoid;
	}
}
