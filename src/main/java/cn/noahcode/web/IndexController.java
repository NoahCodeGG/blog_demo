package cn.noahcode.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author NoahCode
 * @date 2020/8/7
 * @description
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(@PathVariable Integer id, @PathVariable String name) {
//        int i = 9 / 0;
//        String blog = null;
//        if (blog == null){
//            throw new NotFoundException("博客没有找到");
//        }
        System.out.println("---------index-----------");
        return "index";
    }

}
