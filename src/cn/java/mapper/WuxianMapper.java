package cn.java.mapper;

import java.util.List;

import cn.java.model.Wuxian;

public interface WuxianMapper {

    int insertSelective(Wuxian record);

    Wuxian selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wuxian record);

    List<Wuxian> selectAll();
}