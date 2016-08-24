package com.yhy.refreshlistview.data;

import java.io.Serializable;
import java.util.List;

/**
 * 作者 : YangHaoyi on 2016/7/25.
 * 邮箱 ：yanghaoyi@neusoft.com
 */
public class ChargingOrders extends ResponseDataBean implements Serializable{

    private PayloadBean payload;

    public PayloadBean getPayload() {
        return payload;
    }

    public void setPayload(PayloadBean payload) {
        this.payload = payload;
    }

    public static class PayloadBean {
        private String currentPage;
        private String totalPages;
        private List<ListBean> list;

        public String getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(String currentPage) {
            this.currentPage = currentPage;
        }

        public String getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(String totalPages) {
            this.totalPages = totalPages;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean implements Serializable {
            private String accountPayable;
            private BillingInfoBean billingInfo;
            private String billingTemplateId;
            private String chargingEndTime;
            private String chargingStartTime;
            private String chargingStatus;
            private boolean comPrivateVehicle;
            private String coverCharge;
            private String disbursements;
            private ElePileBean elePile;
            private String elePileId;
            private String electricCharge;
            private String evdevId;
            private String id;
            private String meterEnd;
            private String meterNow;
            private String meterStart;
            private String orderEndTime;
            private String orderStartTime;
            private String originalAmount;
            private String power;
            private boolean privateVehicle;
            private RentalShopBean rentalShop;
            private String rentalShopId;
            private boolean rentalVehicle;
            private String sedevId;
            private String spendsTime;
            private String status;
            private String terminateDesc;
            private String time;
            private String totalPower;
            private String userId;
            private String vehicleId;
            private String vehicleType;
            private boolean waitForCharge;
            private List<ActionListBean> actionList;

            public String getAccountPayable() {
                return accountPayable;
            }

            public void setAccountPayable(String accountPayable) {
                this.accountPayable = accountPayable;
            }

            public BillingInfoBean getBillingInfo() {
                return billingInfo;
            }

            public void setBillingInfo(BillingInfoBean billingInfo) {
                this.billingInfo = billingInfo;
            }

            public String getBillingTemplateId() {
                return billingTemplateId;
            }

            public void setBillingTemplateId(String billingTemplateId) {
                this.billingTemplateId = billingTemplateId;
            }

            public String getChargingEndTime() {
                return chargingEndTime;
            }

            public void setChargingEndTime(String chargingEndTime) {
                this.chargingEndTime = chargingEndTime;
            }

            public String getChargingStartTime() {
                return chargingStartTime;
            }

            public void setChargingStartTime(String chargingStartTime) {
                this.chargingStartTime = chargingStartTime;
            }

            public String getChargingStatus() {
                return chargingStatus;
            }

            public void setChargingStatus(String chargingStatus) {
                this.chargingStatus = chargingStatus;
            }

            public boolean isComPrivateVehicle() {
                return comPrivateVehicle;
            }

            public void setComPrivateVehicle(boolean comPrivateVehicle) {
                this.comPrivateVehicle = comPrivateVehicle;
            }

            public String getCoverCharge() {
                return coverCharge;
            }

            public void setCoverCharge(String coverCharge) {
                this.coverCharge = coverCharge;
            }

            public String getDisbursements() {
                return disbursements;
            }

            public void setDisbursements(String disbursements) {
                this.disbursements = disbursements;
            }

            public ElePileBean getElePile() {
                return elePile;
            }

            public void setElePile(ElePileBean elePile) {
                this.elePile = elePile;
            }

            public String getElePileId() {
                return elePileId;
            }

            public void setElePileId(String elePileId) {
                this.elePileId = elePileId;
            }

            public String getElectricCharge() {
                return electricCharge;
            }

            public void setElectricCharge(String electricCharge) {
                this.electricCharge = electricCharge;
            }

            public String getEvdevId() {
                return evdevId;
            }

            public void setEvdevId(String evdevId) {
                this.evdevId = evdevId;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getMeterEnd() {
                return meterEnd;
            }

            public void setMeterEnd(String meterEnd) {
                this.meterEnd = meterEnd;
            }

            public String getMeterNow() {
                return meterNow;
            }

            public void setMeterNow(String meterNow) {
                this.meterNow = meterNow;
            }

            public String getMeterStart() {
                return meterStart;
            }

            public void setMeterStart(String meterStart) {
                this.meterStart = meterStart;
            }

            public String getOrderEndTime() {
                return orderEndTime;
            }

            public void setOrderEndTime(String orderEndTime) {
                this.orderEndTime = orderEndTime;
            }

            public String getOrderStartTime() {
                return orderStartTime;
            }

            public void setOrderStartTime(String orderStartTime) {
                this.orderStartTime = orderStartTime;
            }

            public String getOriginalAmount() {
                return originalAmount;
            }

            public void setOriginalAmount(String originalAmount) {
                this.originalAmount = originalAmount;
            }

            public String getPower() {
                return power;
            }

            public void setPower(String power) {
                this.power = power;
            }

            public boolean isPrivateVehicle() {
                return privateVehicle;
            }

            public void setPrivateVehicle(boolean privateVehicle) {
                this.privateVehicle = privateVehicle;
            }

            public RentalShopBean getRentalShop() {
                return rentalShop;
            }

            public void setRentalShop(RentalShopBean rentalShop) {
                this.rentalShop = rentalShop;
            }

            public String getRentalShopId() {
                return rentalShopId;
            }

            public void setRentalShopId(String rentalShopId) {
                this.rentalShopId = rentalShopId;
            }

            public boolean isRentalVehicle() {
                return rentalVehicle;
            }

            public void setRentalVehicle(boolean rentalVehicle) {
                this.rentalVehicle = rentalVehicle;
            }

            public String getSedevId() {
                return sedevId;
            }

            public void setSedevId(String sedevId) {
                this.sedevId = sedevId;
            }

            public String getSpendsTime() {
                return spendsTime;
            }

            public void setSpendsTime(String spendsTime) {
                this.spendsTime = spendsTime;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getTerminateDesc() {
                return terminateDesc;
            }

            public void setTerminateDesc(String terminateDesc) {
                this.terminateDesc = terminateDesc;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTotalPower() {
                return totalPower;
            }

            public void setTotalPower(String totalPower) {
                this.totalPower = totalPower;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public String getVehicleId() {
                return vehicleId;
            }

            public void setVehicleId(String vehicleId) {
                this.vehicleId = vehicleId;
            }

            public String getVehicleType() {
                return vehicleType;
            }

            public void setVehicleType(String vehicleType) {
                this.vehicleType = vehicleType;
            }

            public boolean isWaitForCharge() {
                return waitForCharge;
            }

            public void setWaitForCharge(boolean waitForCharge) {
                this.waitForCharge = waitForCharge;
            }

            public List<ActionListBean> getActionList() {
                return actionList;
            }

            public void setActionList(List<ActionListBean> actionList) {
                this.actionList = actionList;
            }

            public static class BillingInfoBean implements Serializable{
                private String add;
                private String addPowerMoney;
                private String addServiceMoney;
                private String billingType;
                private String init;
                private String initMoney;

                public String getAdd() {
                    return add;
                }

                public void setAdd(String add) {
                    this.add = add;
                }

                public String getAddPowerMoney() {
                    return addPowerMoney;
                }

                public void setAddPowerMoney(String addPowerMoney) {
                    this.addPowerMoney = addPowerMoney;
                }

                public String getAddServiceMoney() {
                    return addServiceMoney;
                }

                public void setAddServiceMoney(String addServiceMoney) {
                    this.addServiceMoney = addServiceMoney;
                }

                public String getBillingType() {
                    return billingType;
                }

                public void setBillingType(String billingType) {
                    this.billingType = billingType;
                }

                public String getInit() {
                    return init;
                }

                public void setInit(String init) {
                    this.init = init;
                }

                public String getInitMoney() {
                    return initMoney;
                }

                public void setInitMoney(String initMoney) {
                    this.initMoney = initMoney;
                }
            }

            public static class ElePileBean implements Serializable{
                private String anchorName;
                private boolean available;
                private ElePileTypeBean elePileType;
                private String faultType;
                private String id;
                private String pileId;
                private String pileTypeId;
                private String rentalShopId;
                private String sedevId;
                private String status;

                public String getAnchorName() {
                    return anchorName;
                }

                public void setAnchorName(String anchorName) {
                    this.anchorName = anchorName;
                }

                public boolean isAvailable() {
                    return available;
                }

                public void setAvailable(boolean available) {
                    this.available = available;
                }

                public ElePileTypeBean getElePileType() {
                    return elePileType;
                }

                public void setElePileType(ElePileTypeBean elePileType) {
                    this.elePileType = elePileType;
                }

                public String getFaultType() {
                    return faultType;
                }

                public void setFaultType(String faultType) {
                    this.faultType = faultType;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getPileId() {
                    return pileId;
                }

                public void setPileId(String pileId) {
                    this.pileId = pileId;
                }

                public String getPileTypeId() {
                    return pileTypeId;
                }

                public void setPileTypeId(String pileTypeId) {
                    this.pileTypeId = pileTypeId;
                }

                public String getRentalShopId() {
                    return rentalShopId;
                }

                public void setRentalShopId(String rentalShopId) {
                    this.rentalShopId = rentalShopId;
                }

                public String getSedevId() {
                    return sedevId;
                }

                public void setSedevId(String sedevId) {
                    this.sedevId = sedevId;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public static class ElePileTypeBean {
                    private String batch;
                    private String billingTemplateId;
                    private String createBy;
                    private String createDate;
                    private String delFlag;
                    private String interfaceNormal;
                    private String interfaceNormalName;
                    private String name;
                    private String pileTypeId;
                    private String power;
                    private String remarks;
                    private String type;
                    private String updateBy;
                    private String updateDate;

                    public String getBatch() {
                        return batch;
                    }

                    public void setBatch(String batch) {
                        this.batch = batch;
                    }

                    public String getBillingTemplateId() {
                        return billingTemplateId;
                    }

                    public void setBillingTemplateId(String billingTemplateId) {
                        this.billingTemplateId = billingTemplateId;
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

                    public String getDelFlag() {
                        return delFlag;
                    }

                    public void setDelFlag(String delFlag) {
                        this.delFlag = delFlag;
                    }

                    public String getInterfaceNormal() {
                        return interfaceNormal;
                    }

                    public void setInterfaceNormal(String interfaceNormal) {
                        this.interfaceNormal = interfaceNormal;
                    }

                    public String getInterfaceNormalName() {
                        return interfaceNormalName;
                    }

                    public void setInterfaceNormalName(String interfaceNormalName) {
                        this.interfaceNormalName = interfaceNormalName;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getPileTypeId() {
                        return pileTypeId;
                    }

                    public void setPileTypeId(String pileTypeId) {
                        this.pileTypeId = pileTypeId;
                    }

                    public String getPower() {
                        return power;
                    }

                    public void setPower(String power) {
                        this.power = power;
                    }

                    public String getRemarks() {
                        return remarks;
                    }

                    public void setRemarks(String remarks) {
                        this.remarks = remarks;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
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
                }
            }

            public static class RentalShopBean implements Serializable{
                private String address;
                private String areaId;
                private String cityId;
                private String description;
                private String discountId;
                private String introPictureUrl;
                private String latitude;
                private String longitude;
                private String lotNumber;
                private String name;
                private String rentalShopId;
                private String returnEtime;
                private String returnFlag;
                private String returnStime;
                private String status;
                private boolean stop;
                private String street;

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getAreaId() {
                    return areaId;
                }

                public void setAreaId(String areaId) {
                    this.areaId = areaId;
                }

                public String getCityId() {
                    return cityId;
                }

                public void setCityId(String cityId) {
                    this.cityId = cityId;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getDiscountId() {
                    return discountId;
                }

                public void setDiscountId(String discountId) {
                    this.discountId = discountId;
                }

                public String getIntroPictureUrl() {
                    return introPictureUrl;
                }

                public void setIntroPictureUrl(String introPictureUrl) {
                    this.introPictureUrl = introPictureUrl;
                }

                public String getLatitude() {
                    return latitude;
                }

                public void setLatitude(String latitude) {
                    this.latitude = latitude;
                }

                public String getLongitude() {
                    return longitude;
                }

                public void setLongitude(String longitude) {
                    this.longitude = longitude;
                }

                public String getLotNumber() {
                    return lotNumber;
                }

                public void setLotNumber(String lotNumber) {
                    this.lotNumber = lotNumber;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getRentalShopId() {
                    return rentalShopId;
                }

                public void setRentalShopId(String rentalShopId) {
                    this.rentalShopId = rentalShopId;
                }

                public String getReturnEtime() {
                    return returnEtime;
                }

                public void setReturnEtime(String returnEtime) {
                    this.returnEtime = returnEtime;
                }

                public String getReturnFlag() {
                    return returnFlag;
                }

                public void setReturnFlag(String returnFlag) {
                    this.returnFlag = returnFlag;
                }

                public String getReturnStime() {
                    return returnStime;
                }

                public void setReturnStime(String returnStime) {
                    this.returnStime = returnStime;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public boolean isStop() {
                    return stop;
                }

                public void setStop(boolean stop) {
                    this.stop = stop;
                }

                public String getStreet() {
                    return street;
                }

                public void setStreet(String street) {
                    this.street = street;
                }
            }

            public static class ActionListBean implements Serializable{
                private String actionName;
                private String time;

                public String getActionName() {
                    return actionName;
                }

                public void setActionName(String actionName) {
                    this.actionName = actionName;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }
        }
    }
}
