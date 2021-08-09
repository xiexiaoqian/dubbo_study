package com.jiaqingzi.usercore.domain.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 登录名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 密码
     */
    private String password;

    @Column(name = "user_name")
    private String userName;

    /**
     * 关联手机
     */
    private String mobile;

    /**
     * 账号状态 1 禁用 2 启用
     */
    @Column(name = "is_action")
    private Byte isAction;

    /**
     * 逻辑删除字段 1删除 0未删除
     */
    @Column(name = "is_delete")
    private Byte isDelete;

    /**
     * 用户类型 1 系统管理员 2普通用户
     */
    @Column(name = "is_admin")
    private Byte isAdmin;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Long createUser;

    /**
     * 修改时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 修改人
     */
    @Column(name = "update_user")
    private Long updateUser;

    /**
     * 最近登陆日期
     */
    @Column(name = "login_date")
    private Date loginDate;

    /**
     * 登陆次数
     */
    @Column(name = "login_num")
    private Integer loginNum;

    /**
     * 组织id
     */
    @Column(name = "organize_id")
    private Long organizeId;

    /**
     * 部门id
     */
    @Column(name = "department_id")
    private Long departmentId;

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
     * 获取登录名
     *
     * @return login_name - 登录名
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录名
     *
     * @param loginName 登录名
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取关联手机
     *
     * @return mobile - 关联手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置关联手机
     *
     * @param mobile 关联手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取账号状态 1 禁用 2 启用
     *
     * @return is_action - 账号状态 1 禁用 2 启用
     */
    public Byte getIsAction() {
        return isAction;
    }

    /**
     * 设置账号状态 1 禁用 2 启用
     *
     * @param isAction 账号状态 1 禁用 2 启用
     */
    public void setIsAction(Byte isAction) {
        this.isAction = isAction;
    }

    /**
     * 获取逻辑删除字段 1删除 0未删除
     *
     * @return is_delete - 逻辑删除字段 1删除 0未删除
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 设置逻辑删除字段 1删除 0未删除
     *
     * @param isDelete 逻辑删除字段 1删除 0未删除
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取用户类型 1 系统管理员 2普通用户
     *
     * @return is_admin - 用户类型 1 系统管理员 2普通用户
     */
    public Byte getIsAdmin() {
        return isAdmin;
    }

    /**
     * 设置用户类型 1 系统管理员 2普通用户
     *
     * @param isAdmin 用户类型 1 系统管理员 2普通用户
     */
    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取修改时间
     *
     * @return update_date - 修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置修改时间
     *
     * @param updateDate 修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取修改人
     *
     * @return update_user - 修改人
     */
    public Long getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置修改人
     *
     * @param updateUser 修改人
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取最近登陆日期
     *
     * @return login_date - 最近登陆日期
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * 设置最近登陆日期
     *
     * @param loginDate 最近登陆日期
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * 获取登陆次数
     *
     * @return login_num - 登陆次数
     */
    public Integer getLoginNum() {
        return loginNum;
    }

    /**
     * 设置登陆次数
     *
     * @param loginNum 登陆次数
     */
    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
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
}