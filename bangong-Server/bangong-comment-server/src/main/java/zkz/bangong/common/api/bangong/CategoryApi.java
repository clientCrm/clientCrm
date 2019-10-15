package zkz.bangong.common.api.bangong;

import org.springframework.web.bind.annotation.*;
import zkz.bangong.common.pojo.Category;

import java.util.List;

@RequestMapping("category")
public interface CategoryApi {
    @GetMapping("list")
    List<Category> queryCategoriesByid(@RequestParam("pid") Long pid);

    @GetMapping("hello")
    String test(@RequestParam("id") long id);

    @PostMapping("test_update")
    Integer test_update(@RequestBody Category category);

    @PostMapping("test_update_with_duo")
    Integer test_update_with_duo(@RequestBody Category category, @RequestParam("test") String test, @RequestParam("testId") Integer testId);
}