package com.jiaqingzi.usercore.domain.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_menu")
public class SysMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 菜单级别0菜单  1,页面 2 按钮
     */
    @Column(name = "menu_level")
    private Byte menuLevel;

    /**
     * 菜单排序
     */
    @Column(name = "menu_sort")
    private Integer menuSort;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "create_user")
    private Long createUser;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "update_user")
    private Long updateUser;

    @Column(name = "route_key")
    private String routeKey;

    /**
     * 路径
     */
    private String path;

    /**
     * 图标
     */
    private String icon;

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
     * 获取菜单名称
     *
     * @return menu_name - 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置菜单名称
     *
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
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
     * 获取菜单级别0菜单  1,页面 2 按钮
     *
     * @return menu_level - 菜单级别0菜单  1,页面 2 按钮
     */
    public Byte getMenuLevel() {
        return menuLevel;
    }

    /**
     * 设置菜单级别0菜单  1,页面 2 按钮
     *
     * @param menuLevel 菜单级别0菜单  1,页面 2 按钮
     */
    public void setMenuLevel(Byte menuLevel) {
        this.menuLevel = menuLevel;
    }

    /**
     * 获取菜单排序
     *
     * @return menu_sort - 菜单排序
     */
    public Integer getMenuSort() {
        return menuSort;
    }

    /**
     * 设置菜单排序
     *
     * @param menuSort 菜单排序
     */
    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
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
     * @return route_key
     */
    public String getRouteKey() {
        return routeKey;
    }

    /**
     * @param routeKey
     */
    public void setRouteKey(String routeKey) {
        this.routeKey = routeKey;
    }

    /**
     * 获取路径
     *
     * @return path - 路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置路径
     *
     * @param path 路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }
}