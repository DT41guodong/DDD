/**
 * Project Name:dt41_root
 * File Name:WuxanService.java
 * Package Name:cn.java.service
 * Date:2017年10月11日下午11:58:40
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.java.mapper.WuxianMapper;
import cn.java.model.Wuxian;

/**
 * Description: <br/>
 * Date: 2017年10月11日 下午11:58:40 <br/>
 * 
 * @author guoD
 * @version
 * @see
 */
@Service
public class WuxianService implements WuxianMapper {
    @Autowired
    private WuxianMapper wuxianMapper;

    public int insertSelective(Wuxian record) {

        return wuxianMapper.insertSelective(record);
    }

    public Wuxian selectByPrimaryKey(Integer id) {

        return wuxianMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Wuxian record) {

        return wuxianMapper.updateByPrimaryKeySelective(record);
    }

    public List<Wuxian> selectAll() {

        return wuxianMapper.selectAll();
    }

}
