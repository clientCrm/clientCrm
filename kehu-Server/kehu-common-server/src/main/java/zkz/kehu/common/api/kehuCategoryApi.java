package zkz.kehu.common.api;

import org.springframework.web.bind.annotation.*;
import zkz.kehu.common.pojo.kehuCategory;

import java.util.List;

@RequestMapping("kehuCategory")
public interface kehuCategoryApi {
    @GetMapping("list")
    List<kehuCategory> queryCategoriesByid(@RequestParam("pid") Long pid);

    @GetMapping("hello")
    String test(@RequestParam("id") long id);

    @PostMapping("test_update")
    Integer test_update(@RequestBody kehuCategory category);

    @PostMapping("test_update_with_duo")
    Integer test_update_with_duo(@RequestBody kehuCategory category, @RequestParam("test") String test, @RequestParam("testId") Integer testId);
}