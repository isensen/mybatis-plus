package com.baomidou.mybatisplus.core.toolkit.condition;

/**
 * 条件定义，只提需求
 *
 * <p>Create by HCL at 2018/05/29</p>
 */
public interface ICondition<This, CLASS, COLUMN> {

    // 暂时定义一个方法
    This eq(COLUMN column, Object value);

}
