package com.yhy.mvcproject.response;

/**
 * 作者 : YangHaoyi on 2016/6/22.
 * 邮箱 ：yanghaoyi@neusoft.com
 */
public class Register extends ResponseDataBean{

    /**
     * code : 0
     * description : string
     * lastUpdateTime : 0
     * payload : {"accountBalance":0,"auditFlag":0,"birthday":"2016-06-22T06:40:39.961Z","cancelCnt":0,"createBy":"string","createDate":"2016-06-22T06:40:39.961Z","delFlag":0,"deposit":0,"device":{"cid":"string","createBy":"string","createDate":"2016-06-22T06:40:39.961Z","delFlag":0,"deviceId":0,"deviceNo":"string","deviceType":0,"operateType":0,"remarks":"string","updateBy":"string","updateDate":"2016-06-22T06:40:39.961Z","userId":0},"drivingLicenseUrl":"string","expiryDate":"2016-06-22T06:40:39.961Z","failureReason":"string","gender":0,"headPortraitUrl":"string","idCardNumber":"string","idCardUrl":"string","mail":"string","nickName":"string","openId":"string","password":"string","refundStatus":0,"remarks":"string","updateBy":"string","updateDate":"2016-06-22T06:40:39.961Z","userId":0,"userName":"string"}
     */

    /**
     * accountBalance : 0
     * auditFlag : 0
     * birthday : 2016-06-22T06:40:39.961Z
     * cancelCnt : 0
     * createBy : string
     * createDate : 2016-06-22T06:40:39.961Z
     * delFlag : 0
     * deposit : 0
     * device : {"cid":"string","createBy":"string","createDate":"2016-06-22T06:40:39.961Z","delFlag":0,"deviceId":0,"deviceNo":"string","deviceType":0,"operateType":0,"remarks":"string","updateBy":"string","updateDate":"2016-06-22T06:40:39.961Z","userId":0}
     * drivingLicenseUrl : string
     * expiryDate : 2016-06-22T06:40:39.961Z
     * failureReason : string
     * gender : 0
     * headPortraitUrl : string
     * idCardNumber : string
     * idCardUrl : string
     * mail : string
     * nickName : string
     * openId : string
     * password : string
     * refundStatus : 0
     * remarks : string
     * updateBy : string
     * updateDate : 2016-06-22T06:40:39.961Z
     * userId : 0
     * userName : string
     */

    private PayloadBean payload;

    public PayloadBean getPayload() {
        return payload;
    }

    public void setPayload(PayloadBean payload) {
        this.payload = payload;
    }

    public static class PayloadBean {
        private int accountBalance;
        private int auditFlag;
        private String birthday;
        private int cancelCnt;
        private String createBy;
        private String createDate;
        private int delFlag;
        private int deposit;
        /**
         * cid : string
         * createBy : string
         * createDate : 2016-06-22T06:40:39.961Z
         * delFlag : 0
         * deviceId : 0
         * deviceNo : string
         * deviceType : 0
         * operateType : 0
         * remarks : string
         * updateBy : string
         * updateDate : 2016-06-22T06:40:39.961Z
         * userId : 0
         */

        private DeviceBean device;
        private String drivingLicenseUrl;
        private String expiryDate;
        private String failureReason;
        private int gender;
        private String headPortraitUrl;
        private String idCardNumber;
        private String idCardUrl;
        private String mail;
        private String nickName;
        private String openId;
        private String password;
        private int refundStatus;
        private String remarks;
        private String updateBy;
        private String updateDate;
        private int userId;
        private String userName;

        public int getAccountBalance() {
            return accountBalance;
        }

        public void setAccountBalance(int accountBalance) {
            this.accountBalance = accountBalance;
        }

        public int getAuditFlag() {
            return auditFlag;
        }

        public void setAuditFlag(int auditFlag) {
            this.auditFlag = auditFlag;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public int getCancelCnt() {
            return cancelCnt;
        }

        public void setCancelCnt(int cancelCnt) {
            this.cancelCnt = cancelCnt;
        }

        public String getCreateBy() {
            return createBy;
        }

        public void setCreateBy(String createBy) {
            this.createBy = createBy;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public int getDelFlag() {
            return delFlag;
        }

        public void setDelFlag(int delFlag) {
            this.delFlag = delFlag;
        }

        public int getDeposit() {
            return deposit;
        }

        public void setDeposit(int deposit) {
            this.deposit = deposit;
        }

        public DeviceBean getDevice() {
            return device;
        }

        public void setDevice(DeviceBean device) {
            this.device = device;
        }

        public String getDrivingLicenseUrl() {
            return drivingLicenseUrl;
        }

        public void setDrivingLicenseUrl(String drivingLicenseUrl) {
            this.drivingLicenseUrl = drivingLicenseUrl;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        public String getFailureReason() {
            return failureReason;
        }

        public void setFailureReason(String failureReason) {
            this.failureReason = failureReason;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String getHeadPortraitUrl() {
            return headPortraitUrl;
        }

        public void setHeadPortraitUrl(String headPortraitUrl) {
            this.headPortraitUrl = headPortraitUrl;
        }

        public String getIdCardNumber() {
            return idCardNumber;
        }

        public void setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
        }

        public String getIdCardUrl() {
            return idCardUrl;
        }

        public void setIdCardUrl(String idCardUrl) {
            this.idCardUrl = idCardUrl;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getOpenId() {
            return openId;
        }

        public void setOpenId(String openId) {
            this.openId = openId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getRefundStatus() {
            return refundStatus;
        }

        public void setRefundStatus(int refundStatus) {
            this.refundStatus = refundStatus;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public String getUpdateBy() {
            return updateBy;
        }

        public void setUpdateBy(String updateBy) {
            this.updateBy = updateBy;
        }

        public String getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public static class DeviceBean {
            private String cid;
            private String createBy;
            private String createDate;
            private int delFlag;
            private int deviceId;
            private String deviceNo;
            private int deviceType;
            private int operateType;
            private String remarks;
            private String updateBy;
            private String updateDate;
            private int userId;

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getCreateBy() {
                return createBy;
            }

            public void setCreateBy(String createBy) {
                this.createBy = createBy;
            }

            public String getCreateDate() {
                return createDate;
            }

            public void setCreateDate(String createDate) {
                this.createDate = createDate;
            }

            public int getDelFlag() {
                return delFlag;
            }

            public void setDelFlag(int delFlag) {
                this.delFlag = delFlag;
            }

            public int getDeviceId() {
                return deviceId;
            }

            public void setDeviceId(int deviceId) {
                this.deviceId = deviceId;
            }

            public String getDeviceNo() {
                return deviceNo;
            }

            public void setDeviceNo(String deviceNo) {
                this.deviceNo = deviceNo;
            }

            public int getDeviceType() {
                return deviceType;
            }

            public void setDeviceType(int deviceType) {
                this.deviceType = deviceType;
            }

            public int getOperateType() {
                return operateType;
            }

            public void setOperateType(int operateType) {
                this.operateType = operateType;
            }

            public String getRemarks() {
                return remarks;
            }

            public void setRemarks(String remarks) {
                this.remarks = remarks;
            }

            public String getUpdateBy() {
                return updateBy;
            }

            public void setUpdateBy(String updateBy) {
                this.updateBy = updateBy;
            }

            public String getUpdateDate() {
                return updateDate;
            }

            public void setUpdateDate(String updateDate) {
                this.updateDate = updateDate;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }
        }
    }
}
