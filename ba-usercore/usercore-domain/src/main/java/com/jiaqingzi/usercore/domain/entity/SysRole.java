package com.jiaqingzi.usercore.domain.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_role")
public class SysRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 备注说明
     */
    private String memo;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "create_user")
    private Long createUser;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "update_user")
    private Long updateUser;

    /**
     * 角色组织
     */
    @Column(name = "organize_id")
    private Long organizeId;

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
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取备注说明
     *
     * @return memo - 备注说明
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注说明
     *
     * @param memo 备注说明
     */
    public void setMemo(String memo) {
        this.memo = memo;
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

    /**
     * @return create_user
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * @param createUser
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
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
     * @return update_user
     */
    public Long getUpdateUser() {
        return updateUser;
    }

    /**
     * @param updateUser
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取角色组织
     *
     * @return organize_id - 角色组织
     */
    public Long getOrganizeId() {
        return organizeId;
    }

    /**
     * 设置角色组织
     *
     * @param organizeId 角色组织
     */
    public void setOrganizeId(Long organizeId) {
        this.organizeId = organizeId;
    }
}