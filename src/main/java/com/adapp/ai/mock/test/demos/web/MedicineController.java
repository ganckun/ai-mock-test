package com.adapp.ai.mock.test.demos.web;

import com.adapp.ai.mock.test.demos.common.PageDTO;
import com.adapp.ai.mock.test.demos.common.PageResult;
import com.adapp.ai.mock.test.demos.common.Result;
import com.dbapp.ai.mock.annotation.AIMock;
import com.dbapp.ai.mock.enums.Scene;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/medicine")
@AIMock(enabled = true)
public class MedicineController {
    @AIMock(scene = Scene.ERROR, description = "药品添加")
    @PostMapping("/add")
    public Result<Medicine> add(@RequestBody Medicine medicine) {
        return null;
    }

    @AIMock(description = "药品更新")
    @PostMapping("/update")
    public Result<Medicine> update(@RequestBody Medicine medicine) {
        return null;
    }

    @AIMock(description = "药品删除")
    @PostMapping("/delete")
    public Result<Void> delete(@RequestParam("id") Long id) {
        return null;
    }

    @AIMock(description = "药品详情")
    @GetMapping("/detail/{id}")
    public Result<Medicine> detail(@PathVariable("id") Long id) {
        return null;
    }

    @AIMock(description = "药品分页查询")
    @GetMapping("/page")
    public PageResult<Medicine> page(@RequestBody PageDTO pageDTO) {
        return null;
    }


    @Data
    public static class Medicine {
        @AIMock(description = "药品名称")
        private String name;
        @AIMock(description = "药品禁忌症")
        private List<String> contraindications;
        @AIMock(description = "药品相互作用")
        private List<String> interactions;
        @AIMock(description = "药品价格")
        private Price price;

        @Data
        public static class Price {
            @AIMock(description = "药品基础价")
            private BigDecimal base;
            @AIMock(description = "药品医保价")
            private BigDecimal insurance;
        }
    }
}
