package me.ezerror.controller;

import me.ezerror.controller.annotation.BaseClass;
import me.ezerror.controller.annotation.GSController;
import me.ezerror.controller.basic.BaseController;
import me.ezerror.domain.App;
import me.ezerror.domain.result.Result;
import me.ezerror.domain.result.ResultFactory;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@GSController
@BaseClass(App.class)
public class AppController extends BaseController<App> {

    /**
     * 查询所有应用
     *
     * @return
     */
    @RequestMapping("/app")
    public Result getMenu() {
        List<App> apps = findList();
        return ResultFactory.buildSuccessResult(apps, "查询成功");
    }
}
