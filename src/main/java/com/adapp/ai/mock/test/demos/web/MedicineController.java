package com.adapp.ai.mock.test.demos.web;

import com.adapp.ai.mock.test.demos.common.PageDTO;
import com.adapp.ai.mock.test.demos.common.PageResult;
import com.adapp.ai.mock.test.demos.common.Result;
import com.dbapp.ai.mock.annotation.AIMock;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/medicine")
public class MedicineController {
    @AIMock("药品添加")
    @PostMapping("/add")
    public Result<Medicine> add(@RequestBody Medicine medicine) {
        return null;
    }

    @AIMock("药品更新")
    @PostMapping("/update")
    public Result<Medicine> update(@RequestBody Medicine medicine) {
        return null;
    }

    @AIMock("药品删除")
    @PostMapping("/delete")
    public Result<Void> delete(@RequestParam("id") Long id) {
        return null;
    }

    @AIMock("药品详情")
    @GetMapping("/detail/{id}")
    public Result<Medicine> detail(@PathVariable("id") Long id) {
        return null;
    }

    @AIMock("药品分页查询")
    @GetMapping("/page")
    public PageResult<Medicine> page(@RequestBody PageDTO pageDTO) {
        return null;
    }


    @Data
    public static class Medicine {
        @AIMock("药品名称")
        private String name;
        @AIMock("药品禁忌症")
        private List<String> contraindications;
        @AIMock("药品相互作用")
        private List<String> interactions;
        @AIMock("药品价格")
        private Price price;

        @Data
        public static class Price {
            @AIMock("药品基础价")
            private BigDecimal base;
            @AIMock("药品医保价")
            private BigDecimal insurance;
        }
    }
}
