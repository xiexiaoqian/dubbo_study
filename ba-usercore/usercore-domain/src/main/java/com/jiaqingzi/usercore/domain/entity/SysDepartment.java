package com.jiaqingzi.usercore.domain.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_department")
public class SysDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门描述
     */
    private String description;

    /**
     * 所属部门id
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 所属组织id
     */
    @Column(name = "organize_id")
    private Long organizeId;

    /**
     * 是否有效；1 有效；0 无效；
     */
    @Column(name = "is_action")
    private Long isAction;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private Long createBy;

    /**
     * 更新人
     */
    @Column(name = "update_by")
    private Long updateBy;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
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
     * 获取部门名称
     *
     * @return name - 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门名称
     *
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取部门描述
     *
     * @return description - 部门描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置部门描述
     *
     * @param description 部门描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取所属部门id
     *
     * @return parent_id - 所属部门id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置所属部门id
     *
     * @param parentId 所属部门id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取所属组织id
     *
     * @return organize_id - 所属组织id
     */
    public Long getOrganizeId() {
        return organizeId;
    }

    /**
     * 设置所属组织id
     *
     * @param organizeId 所属组织id
     */
    public void setOrganizeId(Long organizeId) {
        this.organizeId = organizeId;
    }

    /**
     * 获取是否有效；1 有效；0 无效；
     *
     * @return is_action - 是否有效；1 有效；0 无效；
     */
    public Long getIsAction() {
        return isAction;
    }

    /**
     * 设置是否有效；1 有效；0 无效；
     *
     * @param isAction 是否有效；1 有效；0 无效；
     */
    public void setIsAction(Long isAction) {
        this.isAction = isAction;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
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
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}