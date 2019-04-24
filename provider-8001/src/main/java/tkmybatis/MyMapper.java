package tkmybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: 张宏运
 * @Date: 2019-04-24 15:27
 */
public interface MyMapper<T> extends Mapper<T> , MySqlMapper<T> {
}
