package zkz.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import zkz.kehu.common.pojo.kehuCategory;
import zkz.manager.client.kehu.kehu_CategoryClient;

import java.util.List;


@Controller
@RequestMapping("kehu")
public class kehuController {


        @Autowired
        private kehu_CategoryClient kehu_categoryClient;

        /**
         * create by: zkz
         * description: 测试返回值为多个参数
         * create time: 15:15 2019/10/13
         * param :
         */

        @ResponseBody
        @GetMapping("getCategorys")
        // @HystrixCommand(fallbackMethod = "queryFallBack")  /*自定义处理机制*/
        public List<kehuCategory> queryCategoriesByPid(@RequestParam("pid") Long pid) {
//           try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

            System.out.println(pid);
            return kehu_categoryClient.queryCategoriesByid(pid);
        }


        /**
         * create by: zkz
         * description: 测试传递单个基本类型的参数
         * create time: 15:15 2019/10/13
         * param :
         */

        @GetMapping("test")
        @ResponseBody
        //@HystrixCommand(fallbackMethod ="defaultFallBack" )
        public String test(@RequestParam("id") long id) {
            /*try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(id);
            return kehu_categoryClient.test(id);


        }
        /**
         * create by: zkz
         * description: 测试传递单个实体类
         * create time: 15:15 2019/10/13
         * param :
         */
        @GetMapping("test_update")
        @ResponseBody
        //@HystrixCommand
        public int test_update() {

            kehuCategory category = new kehuCategory();
            category.setId(1L);    //图书、音像、电子书刊
            category.setParentId(0L);
            category.setIsParent(true);
            category.setSort(1);
            category.setName("你是谁5");

            return kehu_categoryClient.test_update(category);

        }

        /**
         * create by: zkz
         * description: 测试传递多个参数
         * create time: 12:17 2019/10/13
         * param :
         */


        @GetMapping("test_update_with_duo")
        @ResponseBody
        //@HystrixCommand
        public int test_update_with_duo() {

            kehuCategory category = new kehuCategory();
            category.setId(1L);    //图书、音像、电子书刊
            category.setParentId(0L);
            category.setIsParent(true);
            category.setSort(1);
            category.setName("你是谁6");

            String test="娃哈哈";
            Integer testId=9;
            return kehu_categoryClient.test_update_with_duo(category,test,testId);

        }


        /**
         * create by: zkz
         * description: 测试熔断器请求超时是否触发返回信息
         * create time: 10:45 2019/10/13
         * param :
         */
   /* @GetMapping("{id}")
    @HystrixCommand
    @ResponseBody
    public String queryCategoriesFallBack(@PathVariable("id") Long id) {
        //测试熔断时间
      *//*  try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*//*
         *//*精准控制熔断的时机*//*
        if (id == 1) {
            throw new RuntimeException("太忙了");
        }
        return "你好";
    }*/




    }
