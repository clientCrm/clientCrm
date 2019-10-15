package zkz.example.service;

import cn.hutool.core.util.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class UploadService {

    private static final List<String> CONTENT_TYPES = Arrays.asList("image/jpeg", "image/gif","image/png","image/fax","image/ico");

    private static final Logger LOGGER = LoggerFactory.getLogger(UploadService.class);

/**
 * create by: zkz
 * description: 单图片上传
 * create time: 16:58 2019/10/11
 * param :
 */
    public String upload(MultipartFile file) {

        String originalFilename = file.getOriginalFilename();
        // 校验文件的类型
        String contentType = file.getContentType();
        if (!CONTENT_TYPES.contains(contentType)){
            // 文件类型不合法，直接返回null
            LOGGER.info("文件类型不合法：{}", originalFilename);
            return null;
        }

        try {
            // 校验文件的内容
            BufferedImage bufferedImage = ImageIO.read(file.getInputStream());
            if (bufferedImage == null){
                LOGGER.info("文件内容不合法：{}", originalFilename);
                return null;
            }

            // 保存到服务器
            RandomUtil randomUtil=new RandomUtil();
           String suffix=originalFilename.substring(originalFilename.lastIndexOf(".")+1);
                String imgName=randomUtil.randomString(11);
            file.transferTo(new File("C:\\images\\" + imgName+"."+suffix));

            // 生成url地址，返回
            return "http://crm.image.com/images/" +imgName+"."+suffix;

        } catch (IOException e) {
            LOGGER.info("服务器内部错误：{}", originalFilename);
            e.printStackTrace();
        }
        return null;
    }

/**
 * create by: zkz
 * description: 单附件上传
 * create time: 16:58 2019/10/11
 * param :
 */
    public String uploadBatch(MultipartFile file) {
            String originalFilename = file.getOriginalFilename();
            // 校验文件的类型
            String contentType = file.getContentType();
            try {
                /*// 校验文件的内容
                BufferedImage bufferedImage = ImageIO.read(file.getInputStream());
                if (bufferedImage == null){
                    LOGGER.info("文件内容不合法：{}", originalFilename);
                    return null;
                }*/

                // 保存到服务器
                String suffix=originalFilename.substring(originalFilename.lastIndexOf(".")+1);
                String batchName=RandomUtil.randomUUID();
                file.transferTo(new File("C:\\batchs\\" + batchName+"."+suffix));

                // 生成url地址，返回
                return "http://crm.image.com/batchs/" +batchName+"."+suffix;
            } catch (IOException e) {
                LOGGER.info("服务器内部错误：{}", originalFilename);
                e.printStackTrace();
            }
            return null;

    }
}