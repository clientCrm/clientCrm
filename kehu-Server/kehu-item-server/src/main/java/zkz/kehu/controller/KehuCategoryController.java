package zkz.kehu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zkz.kehu.pojo.Category;
import zkz.kehu.service.CategoryService;

import java.util.List;

@Controller
@RequestMapping("kehuCategory")
public class KehuCategoryController {

    @Autowired
    private CategoryService categoryService;


    /**
     * 根据父id查询子节点
     * @param pid
     * @return
     */
    @GetMapping("list")
    @ResponseBody
    public List<Category> queryCategoriesByPid(@RequestParam("pid") Long pid) {

        if (pid == null || pid.longValue() < 0) {
            // 响应400，相当于ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            return null;
        }
        List<Category> categories = this.categoryService.queryCategoriesByPid(pid);

        return categories;

    }


    /**
     * create by: zkz
     * description:
     * create time: 12:00 2019/10/13
     * param :
     */


    @PostMapping("test_update")
    public Integer test_update(@RequestBody Category category){
         categoryService.test_update(category);
         return 1;
    }
/**
 * create by: zkz
 * description: 单个参数传参测试
 * create time: 15:14 2019/10/13
 * param :
 */
    @GetMapping("hello")
    @ResponseBody
    public String hello(@RequestParam("id") long id){
        return "hello";
    }
/**
 * create by: zkz
 * description: 多个参数传参测试
 * create time: 15:14 2019/10/13
 * param :
 */
    @PostMapping("test_update_with_duo")
    @ResponseBody
    Integer test_update_with_duo(@RequestBody Category category, @RequestParam("test") String test, @RequestParam("testId") Integer testId){
        System.out.println(category.toString());
        System.out.println(test);
        System.out.println(testId);
        return 1;
    }

}