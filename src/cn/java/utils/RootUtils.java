/**
 * Project Name:dt41_root
 * File Name:RootUtils.java
 * Package Name:cn.java.utils
 * Date:2017年10月11日下午11:03:40
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.utils;

import java.util.ArrayList;
import java.util.List;

import cn.java.model.Wuxian;

/**
 * Description: <br/>
 * Date: 2017年10月11日 下午11:03:40 <br/>
 * 
 * @author guoD
 * @version
 * @see
 */
public class RootUtils {
    static int times = 0;

    static List<Wuxian> data = new ArrayList<Wuxian>();

    // 获取父id下的子集合
    public static List<Wuxian> getChildList(List<Wuxian> list, int pId, List<Wuxian> reList) {
        for (Wuxian wuxian : list) {
            times++;
            if (wuxian.getParentid() == pId) {// 查询下级菜单
                reList.add(wuxian);
                if (ifChilds(list, wuxian.getId())) {
                    getChildList(list, wuxian.getId(), reList);
                }
            }
        }
        return reList;
    }

    // 判断是否存在子集
    private static boolean ifChilds(List<Wuxian> list, int pId) {
        boolean flag = false;
        for (Wuxian wuxian : list) {
            times++;
            if (wuxian.getParentid() == pId) {
                // 如果数据库中含有id和父节点id值相同，则存在子节点
                flag = true;
                break;
            }
        }
        return flag;
    }

}
