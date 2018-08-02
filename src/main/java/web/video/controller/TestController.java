package web.video.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {


    /**
     * mybatis 分页插件设置
     * page 分页接口 当前第几页，默认是第一页
     * size 每页显示几条
     * @return
     */
 /*   @GetMapping("page")
    public Object pageVideo(@RequestParam(value = "page", defaultValue = "1") int page,
                            @RequestParam(value = "size", defaultValue = "10") int size) {
        PageHelper.startPage(page,size);
        List<Video> listVideo=videoServiceImpl.findAll();
        //获得一些信息
        PageInfo<Video> pageInfo= new PageInfo<>(listVideo);
        Map<String,Object> data = new HashMap<>();
        data.put("total_size",pageInfo.getTotal());//总条数
        data.put("total_page",pageInfo.getPages());//总页数
        data.put("current_page",page);//当前页
        data.put("data",pageInfo.getList());//数据
        return data;
    }*/


}
