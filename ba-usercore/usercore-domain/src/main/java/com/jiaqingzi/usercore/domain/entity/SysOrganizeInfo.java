package com.jiaqingzi.usercore.domain.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_organize_info")
public class SysOrganizeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 组织id
     */
    @Column(name = "organize_id")
    private Long organizeId;

    /**
     * 联系电话
     */
    @Column(name = "link_mobile")
    private String linkMobile;

    /**
     * 联系人
     */
    @Column(name = "link_user")
    private String linkUser;

    /**
     * 业务经理
     */
    @Column(name = "business_user")
    private Long businessUser;

    /**
     * 地址
     */
    private String address;

    /**
     * 省
     */
    @Column(name = "province_id")
    private Long provinceId;

    /**
     * 市
     */
    @Column(name = "city_id")
    private Long cityId;

    /**
     * 区
     */
    @Column(name = "district_id")
    private Long districtId;

    /**
     * 经度
     */
    private Long longitude;

    /**
     * 维度
     */
    private Long latitude;

    @Column(name = "create_by")
    private Long createBy;

    @Column(name = "update_by")
    private Long updateBy;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "create_date")
    private Date createDate;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取组织id
     *
     * @return organize_id - 组织id
     */
    public Long getOrganizeId() {
        return organizeId;
    }

    /**
     * 设置组织id
     *
     * @param organizeId 组织id
     */
    public void setOrganizeId(Long organizeId) {
        this.organizeId = organizeId;
    }

    /**
     * 获取联系电话
     *
     * @return link_mobile - 联系电话
     */
    public String getLinkMobile() {
        return linkMobile;
    }

    /**
     * 设置联系电话
     *
     * @param linkMobile 联系电话
     */
    public void setLinkMobile(String linkMobile) {
        this.linkMobile = linkMobile;
    }

    /**
     * 获取联系人
     *
     * @return link_user - 联系人
     */
    public String getLinkUser() {
        return linkUser;
    }

    /**
     * 设置联系人
     *
     * @param linkUser 联系人
     */
    public void setLinkUser(String linkUser) {
        this.linkUser = linkUser;
    }

    /**
     * 获取业务经理
     *
     * @return business_user - 业务经理
     */
    public Long getBusinessUser() {
        return businessUser;
    }

    /**
     * 设置业务经理
     *
     * @param businessUser 业务经理
     */
    public void setBusinessUser(Long businessUser) {
        this.businessUser = businessUser;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取省
     *
     * @return province_id - 省
     */
    public Long getProvinceId() {
        return provinceId;
    }

    /**
     * 设置省
     *
     * @param provinceId 省
     */
    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取市
     *
     * @return city_id - 市
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * 设置市
     *
     * @param cityId 市
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取区
     *
     * @return district_id - 区
     */
    public Long getDistrictId() {
        return districtId;
    }

    /**
     * 设置区
     *
     * @param districtId 区
     */
    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public Long getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取维度
     *
     * @return latitude - 维度
     */
    public Long getLatitude() {
        return latitude;
    }

    /**
     * 设置维度
     *
     * @param latitude 维度
     */
    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    /**
     * @return create_by
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * @return update_by
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}