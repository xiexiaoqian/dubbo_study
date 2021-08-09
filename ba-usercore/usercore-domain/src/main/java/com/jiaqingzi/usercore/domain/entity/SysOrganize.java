package com.jiaqingzi.usercore.domain.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_organize")
public class SysOrganize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 组织名称
     */
    private String name;

    /**
     * 备注说明
     */
    private String memo;

    /**
     * 是否有效  
     */
    @Column(name = "is_action")
    private Byte isAction;

    @Column(name = "create_by")
    private Long createBy;

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
     * @return parent_id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取组织名称
     *
     * @return name - 组织名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置组织名称
     *
     * @param name 组织名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取是否有效  
     *
     * @return is_action - 是否有效  
     */
    public Byte getIsAction() {
        return isAction;
    }

    /**
     * 设置是否有效  
     *
     * @param isAction 是否有效  
     */
    public void setIsAction(Byte isAction) {
        this.isAction = isAction;
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