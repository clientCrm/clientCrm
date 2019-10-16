package zkz.manager.client.uploadBatch;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import zkz.bangong.common.api.bangong.CategoryApi;

@Service
@FeignClient(value = "bangong-server")    //声明该接口是一个伪装feign接口,声明调用的微服务名
@RequestMapping("upload")
public interface upload_CategoryClient extends CategoryApi {
   /* *
     * create by: zkz
     * description: 声明调用服务的具体请求接口
     * create time: 11:11 2019/10/13
     * param :
     *//*
    @GetMapping("category/list")
    List<kehuCategory> queryCategoriesByid(@RequestParam("pid") Long pid);

    @GetMapping("category/hello")
    String test(@RequestParam("id") long id);
        @PostMapping("category/test_update")
    Integer test_update(@RequestBody kehuCategory category);
@PostMapping("category/test_update_with_duo")
    Integer test_update_with_duo(@RequestBody kehuCategory category,@RequestParam("test") String test,@RequestParam("testId") Integer testId);

*/

}
