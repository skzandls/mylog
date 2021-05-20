package com.skz.springboot.mylog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author skz
 * @since 2021-05-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_blog")
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 赞赏
     */
    private Boolean appreciation;

    /**
     * 是否开启评论
     */
    private Boolean commentabled;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建时间
     */
    private LocalDateTime create_time;

    /**
     * 描述
     */
    private String description;

    /**
     * 首图
     */
    private String first_picture;

    /**
     * 标记
     */
    private String flag;

    /**
     * 是否发布
     */
    private Boolean published;

    private Boolean recommend;

    /**
     * 是否开启版权
     */
    private Boolean share_statement;

    /**
     * 标题
     */
    private String title;

    /**
     * 更新时间
     */
    private LocalDateTime update_time;

    private Integer views;

    /**
     * 类型
     */
    private Long type_id;

    /**
     * 用户id
     */
    private Long user_id;

    /**
     * 浏览次数
     */
    private Integer comment_count;

    private Type type;

    private User user;
    private List <Comment> comments=new ArrayList<>();


}
