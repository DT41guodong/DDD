/**
 * Project Name:dt41_root
 * File Name:WuxianController.java
 * Package Name:cn.java.cotroller
 * Date:2017年10月12日上午12:25:53
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.cotroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.java.model.Wuxian;
import cn.java.service.WuxianService;
import cn.java.utils.RootUtils;

/**
 * Description: <br/>
 * Date: 2017年10月12日 上午12:25:53 <br/>
 * 
 * @author guoD
 * @version
 * @see
 */
@Controller
public class WuxianController {

    @Autowired
    private WuxianService wuxianService;

    @RequestMapping("/select")
    public String select() {
        System.out.println("=============");
        Integer id = 1;
        List<Wuxian> list = wuxianService.selectAll();
        List<Wuxian> list2 = new ArrayList<Wuxian>();
        list2 = RootUtils.getChildList(list, id, list2);
        for (Wuxian wuxian : list2) {
            System.out.println(wuxian);
        }
        return "/index";
    }
}
