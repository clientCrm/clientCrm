package zkz.example.client.clientFallBack;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import zkz.example.client.bangong.CategoryClient;
import zkz.example.common.pojo.Category;

import java.util.ArrayList;
import java.util.List;

@Component
@RequestMapping("/fallback/ddd")
public class categoryClientFallBack implements CategoryClient{


            /**
             * create by: zkz
             * description: queryCategoriesByPid的容错处理方法 返回值类型需要一致跟参数列表需要一致
             * create time: 15:24 2019/10/13
             * param :
             */
            @Override
            public List<Category> queryCategoriesByid(Long pid) {
                Category category=new Category();
                category.setName("获取Category列表的请求失败!");
                List<Category> categories=new ArrayList<>();
                categories.add(category);
                return categories;
            }

            @Override
            public String test(long id) {
                return "服务维护当中.....";
            }

            @Override
            public Integer test_update(Category category) {
                return null;
            }

            @Override
            public Integer test_update_with_duo(Category category, String test, Integer testId) {
                return null;
            }
        }

