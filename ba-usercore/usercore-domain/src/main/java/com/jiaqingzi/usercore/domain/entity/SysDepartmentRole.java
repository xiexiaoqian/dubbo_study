package com.jiaqingzi.usercore.domain.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_department_role")
public class SysDepartmentRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 部门id
     */
    @Column(name = "department_id")
    private Long departmentId;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 更新人
     */
    @Column(name = "update_by")
    private Long updateBy;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

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
     * 获取部门id
     *
     * @return department_id - 部门id
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置部门id
     *
     * @param departmentId 部门id
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取更新人
     *
     * @return update_by - 更新人
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新人
     *
     * @param updateBy 更新人
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}